package raoni.ifrn.mestrado.fisicainmaos.activities;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;

import raoni.ifrn.mestrado.fisicainmaos.R;

public class QuizConfirmaRespostaActivity extends Activity
{
    Bundle bundleTelaQuizConfirmaResposta;
    Intent intentTelaQuizConfirmaResposta;
    Button btCancelaResposta;
    Button btConfirmaResposta;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_quiz_confirma_resposta);

        setup();
    }

    private void setup()
    {
        setupButtons();
        confirmarResposta();
        cancelarResposta();
        setupWindow();
    }

    private void setupButtons()
    {
        btConfirmaResposta = (Button) findViewById(R.id.bt_confirma_resposta);
        btCancelaResposta = (Button) findViewById(R.id.bt_cancela_resposta);
    }

    private void confirmarResposta()
    {
        btConfirmaResposta.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                bundleTelaQuizConfirmaResposta = new Bundle();
                bundleTelaQuizConfirmaResposta.putInt("chave", 99);
                intentTelaQuizConfirmaResposta = new Intent();
                intentTelaQuizConfirmaResposta.putExtras(bundleTelaQuizConfirmaResposta);
                setResult(RESULT_OK, intentTelaQuizConfirmaResposta);
                finish();
            }
        });
    }

    private void cancelarResposta()
    {
        btCancelaResposta.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                setResult(RESULT_CANCELED);
                finish();
            }
        });
    }

    private void setupWindow()
    {
        WindowManager.LayoutParams parametros = getWindow().getAttributes();
        parametros.width = LinearLayout.LayoutParams.MATCH_PARENT;
        parametros.height = LinearLayout.LayoutParams.WRAP_CONTENT;
        this.getWindow().setAttributes(parametros);
    }
}