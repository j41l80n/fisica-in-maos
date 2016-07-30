package raoni.ifrn.mestrado.fisicainmaos.activites;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import raoni.ifrn.mestrado.fisicainmaos.R;
import raoni.ifrn.mestrado.fisicainmaos.helpers.BancoDadosPerguntas;

public class QuizEscolheTemaAssuntoActivity extends Activity
{
    private Spinner spTema;
    private Spinner spAssunto;

    private static final String DATABASE_NAME = "banco_fisica_in_maos";
    //private static final String TB_PERGUNTAS = "tb_perguntas";
    //private static final String PERGUNTA = "pergunta";
    private BancoDadosPerguntas bancoDadosPerguntas = new BancoDadosPerguntas(this);
    private SQLiteDatabase bancoDadosFisicaInMaos;

    private static final String TB_TEMAS = "tb_temas";
    private static final String CODIGO_TEMA = "codigo_tema";
    private static final String TEMA = "tema";

    private static final String TB_ASSUNTOS = "tb_assuntos";
    private static final String ASSUNTO = "assunto";
    //private static final String CODIGO_ASSUNTO = "codigo_assunto";

    private Bundle bundle;
    private Intent intent;

    boolean entrarQuiz = false;
    boolean mudouTema = false;
    boolean mudouAssunto = false;

    TextView tvTema;
    TextView tvAssunto;

    Button btIniciaQuiz;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_quiz_seleciona_temas);

        setup();
    }

    private void setup()
    {
        int t = bancoDadosPerguntas.quantidadePerguntas();

        setupSpinner();
        setupButton();
        temaEscolhido();
        startQuiz();
        setupTextViews();
    }

    private void setupTextViews()
    {
        tvTema = (TextView) findViewById(R.id.tv_tema);
        tvAssunto = (TextView) findViewById(R.id.tv_assunto);

        Typeface font = Typeface.createFromAsset(getApplicationContext().getAssets(), "fonts/appleberry.ttf");
        tvTema.setTypeface(font);
        tvAssunto.setTypeface(font);
    }

    private void setupSpinner()
    {
        spTema = (Spinner) findViewById(R.id.sp_tema);
        spAssunto = (Spinner) findViewById(R.id.sp_assunto);

        preencheSpinnerTemas();
    }

    private void setupButton()
    {
        //
        btIniciaQuiz = (Button) findViewById(R.id.bt_iniciar_quiz);
    }

    private void startQuiz()
    {
        btIniciaQuiz.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                spAssunto.setAnimationCacheEnabled(true);
                bundle = new Bundle();
                bundle.putInt("tema", (spTema.getSelectedItemPosition() + 1));
                bundle.putInt("assunto", (spAssunto.getSelectedItemPosition() + 1));
                //bundleTelaQuiz.putInt("pulos", pulosUtilizados);
                intent = new Intent(getApplicationContext(), QuizActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }

    private void temaEscolhido()
    {
        spTema.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                spTema.setAnimationCacheEnabled(true);
                preencheSpinnerAssuntos();
                mudouTema = true;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });
    }

    private void preencheSpinnerAssuntos()
    {
        bancoDadosPerguntas.onOpen(bancoDadosFisicaInMaos);
        bancoDadosFisicaInMaos = openOrCreateDatabase(DATABASE_NAME, MODE_PRIVATE, null);
        String sql = "SELECT * FROM " + TB_ASSUNTOS + " WHERE " + CODIGO_TEMA + " = " +
                (spTema.getSelectedItemPosition() + 1) + ";";

        Cursor cursor = bancoDadosFisicaInMaos.rawQuery(sql, null);

        List<String> s = new ArrayList<>();
        cursor.moveToFirst();

        if (cursor.moveToFirst())
        {
            do
            {
                s.add(cursor.getString(cursor.getColumnIndex(ASSUNTO)));
            }
            while(cursor.moveToNext());

            ArrayAdapter<String> adp2 = new ArrayAdapter<>(this, R.layout.spinner_textview, s);
            adp2.setDropDownViewResource(R.layout.spinner_textview);
            spAssunto.setAdapter(adp2);
        }
    }

    private void preencheSpinnerTemas()
    {
        bancoDadosFisicaInMaos = openOrCreateDatabase(DATABASE_NAME, MODE_PRIVATE, null);

        List<String> s = new ArrayList<>();

        String sql = "SELECT * FROM " + TB_TEMAS;
        Cursor cursor = bancoDadosFisicaInMaos.rawQuery(sql, null);
        cursor.moveToFirst();

        if (cursor.moveToFirst())
        {
            do
            {
                s.add(cursor.getString(cursor.getColumnIndex(TEMA)));
            }
            while(cursor.moveToNext());
        }

        ArrayAdapter<String> adp = new ArrayAdapter<>(this, R.layout.spinner_textview, s);

        Typeface font = Typeface.createFromAsset(getApplicationContext().getAssets(), "fonts/footlight_mt_light.ttf");


        adp.setDropDownViewResource(R.layout.spinner_textview);
        spTema.setAdapter(adp);
        cursor.close();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent)
    {
        entrarQuiz = false;

        if (resultCode == RESULT_CANCELED)
        {
            //resetaAssertivas();
        }
        else if (resultCode == RESULT_OK)
        {
            try
            {
                bundle = intent.getExtras();

                if (bundle.getInt("finalizaJogo") == 356)
                {
                    finish();
                }
            }
            catch (Exception e)
            {
                //toast(e.toString());
            }
        }
    }
}
