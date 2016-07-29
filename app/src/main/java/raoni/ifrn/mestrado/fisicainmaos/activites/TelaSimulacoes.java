package raoni.ifrn.mestrado.fisicainmaos.activites;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.Button;

import raoni.ifrn.mestrado.fisicainmaos.R;

public class TelaSimulacoes extends Activity
{
    private WebView wvSimulacoes;
    private Intent intentTelaSimulacoes;
    private Button btMecanica;
    private Button btOndasOptica;
    private Button btEletricidade;
    private Button btMagnetismo;
    private Button btFisicaModerna;

    public void onCreate(Bundle savedInstanceState)
    {
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_simulacoes);

        configuraButtons();
        chamaTelaSimulacoesMecanica();
        chamaTelaSimulacoesOndasOptica();
        chamaTelaSimulacoesEletricidade();
        chamaTelaSimulacoesMagnetismo();
        chamaTelaSimulacoesFisicaModerna();
    }

    private void configuraButtons()
    {
        btMecanica = (Button) findViewById(R.id.bt_tela_simulacoes_mecanica);
        btOndasOptica = (Button) findViewById(R.id.bt_tela_simulacoes_ondas_optica);
        btEletricidade = (Button) findViewById(R.id.bt_tela_simulacoes_eletricidade);
        btMagnetismo = (Button) findViewById(R.id.bt_tela_simulacoes_magnetismo);
        btFisicaModerna = (Button) findViewById(R.id.bt_tela_simulacoes_fisica_moderna);
    }

    private void chamaTelaSimulacoesMecanica()
    {
        btMecanica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentTelaSimulacoes = new Intent(getApplicationContext(), TelaSimulacoesMecanica.class);
                startActivity(intentTelaSimulacoes);
            }
        });
    }

    private void chamaTelaSimulacoesOndasOptica()
    {
        btOndasOptica.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intentTelaSimulacoes = new Intent(getApplicationContext(), TelaSimulacoesOndasOptica.class);
                startActivity(intentTelaSimulacoes);
            }
        });
    }

    private void chamaTelaSimulacoesEletricidade()
    {
        btEletricidade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentTelaSimulacoes = new Intent(getApplicationContext(), TelaSimulacoesEletricidade.class);
                startActivity(intentTelaSimulacoes);
            }
        });
    }

    private void chamaTelaSimulacoesMagnetismo()
    {
        btMagnetismo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentTelaSimulacoes = new Intent(getApplicationContext(), TelaSimulacoesMagnetismo.class);
                startActivity(intentTelaSimulacoes);
            }
        });
    }

    private void chamaTelaSimulacoesFisicaModerna()
    {
        btFisicaModerna.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intentTelaSimulacoes = new Intent(getApplicationContext(), TelaSimulacoesFisicaModerna.class);
                startActivity(intentTelaSimulacoes);
            }
        });
    }
}
