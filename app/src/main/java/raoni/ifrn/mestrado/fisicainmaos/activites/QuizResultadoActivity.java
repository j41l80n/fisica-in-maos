package raoni.ifrn.mestrado.fisicainmaos.activites;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.facebook.CallbackManager;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.widget.ShareButton;

import raoni.ifrn.mestrado.fisicainmaos.R;

public class QuizResultadoActivity extends Activity
{
    private Bundle bundleTelaQuizResultado;
    private Intent intentTelaQuizResultado;
    private Button btTerminarJogo;
    private TextView tvAcertos;
    private TextView tvErros;
    private TextView tvPulos;
    private int erros;
    private int acertos;
    private CallbackManager callbackManager;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        //FacebookSdk.sdkInitialize(getApplicationContext());
        callbackManager = CallbackManager.Factory.create();
        setContentView(R.layout.tela_quiz_resultado);

        intentTelaQuizResultado = getIntent();
        bundleTelaQuizResultado = getIntent().getExtras();

        configurarJanela();
        configuraButton();
        btTerminarjogo();
        configuraTextView();
        comentarApp();
    }

    @Override
    protected void onActivityResult(final int requestCode, final int resultCode, final Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        //callbackManager.onActivityResult(requestCode, resultCode, data);
    }

    private void comentarApp()
    {
        String string = "Fiz  pontos no Física in Mãos!";
        ShareLinkContent content = new ShareLinkContent.Builder()
                .setContentUrl(Uri.parse("https://www.facebook.com/F%C3%ADsica-in-M%C3%A3os-468740279999022/"))
                .setContentTitle("Física in Mãos - Questões")
                .setContentDescription(string)
                .build();

        ShareButton shareButton = (ShareButton)findViewById(R.id.fb_share_button);
        shareButton.setShareContent(content);

        /*ShareLinkContent content2 = new ShareLinkContent.Builder()
                .setImageUrl(Uri.parse("https://lh3.googleusercontent.com/WUFCb_" +
                        "eqyHiEg6Scx0dd4wrBR3y9w3ZcNETgKkBJCc5GFGKg7WWpa9nuy0tGdsemsVQ=w300-rw"))
                .setContentTitle("Consegui" + (bundleTelaQuizResultado.getInt("acertos") * 1.89) + " ponto nas questões!")
                .setContentUrl(Uri.parse("https://play.google.com/store/apps/details?id=" +
                        "raoni.ifrn.mestrado.fisicainmaos"))
                .setContentDescription("Baixe o aplicativo na Google Play.")
                .build();
        ShareDialog shareDialog = new ShareDialog(this);
        shareDialog.show(content2);*/
    }

    private void configuraTextView()
    {
        tvAcertos = (TextView) findViewById(R.id.tv_tela_quiz_resultado_acertos);
        tvErros = (TextView) findViewById(R.id.tv_tela_quiz_resultado_erros);
        //tvPulos = (TextView) findViewById(R.id.tv_tela_quiz_resultado_pulos);

        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/days_lattes_28.ttf");
        tvAcertos.setTypeface(font);
        tvErros.setTypeface(font);
        //tvPulos.setTypeface(font);

        tvAcertos.setText("Acertos: " + bundleTelaQuizResultado.getInt("acertos"));
        tvErros.setText("Erros: " + bundleTelaQuizResultado.getInt("erros"));
        //tvPulos.setText("Pulos utilizados: " + bundleTelaQuizResultado.getInt("pulos"));
    }

    private void configuraButton()
    {
        btTerminarJogo = (Button) findViewById(R.id.bt_tela_quiz_resultado_terminar_jogo);
    }

    private void configurarJanela()
    {
        WindowManager.LayoutParams params = getWindow().getAttributes();
        params.width = LinearLayout.LayoutParams.MATCH_PARENT;
        params.height = LinearLayout.LayoutParams.WRAP_CONTENT;
        this.getWindow().setAttributes(params);
    }

    @Override
    public void onBackPressed()
    {
        //
    }

    private void btTerminarjogo()
    {
        btTerminarJogo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                bundleTelaQuizResultado = new Bundle();
                bundleTelaQuizResultado.putInt("chave", 1);
                bundleTelaQuizResultado.putInt("finalizaJogo", 343);
                intentTelaQuizResultado = new Intent();
                intentTelaQuizResultado.putExtras(bundleTelaQuizResultado);
                setResult(RESULT_OK, intentTelaQuizResultado);
                finish();
            }
        });
    }
}