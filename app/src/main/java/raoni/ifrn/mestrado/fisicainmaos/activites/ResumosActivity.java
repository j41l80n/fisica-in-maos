package raoni.ifrn.mestrado.fisicainmaos.activites;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import raoni.ifrn.mestrado.fisicainmaos.R;

public class ResumosActivity extends Activity
{
    private Button btTelaResumosCinematica;
    private Button btTelaResumosDinamica;
    private Button btTelaResumosEstatica;
    private Button btTelaResumosGravitacao;
    private Button btTelaResumosHidrodinamica;
    private Button btTelaResumosHidrostatica;
    private Button btTelaResumosMHS;
    private Button btTelaResumosSI;
    private Intent intentTelaResumos;

    public void onCreate(Bundle savedInstanceState)
    {
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_resumos);

        configuraButtons();
        chamaTelaResumoCinematica();
        chamaTelaResumoDinamica();
        chamaTelaResumoEstatica();
        chamaTelaResumoGravitacao();
        chamaTelaResumoHidrodinamica();
        chamaTelaResumoHidrostatica();
        chamaTelaResumoMHS();
        chamaTelaResumoSI();
    }

    private void configuraButtons()
    {
        btTelaResumosCinematica = (Button) findViewById(R.id.tela_resumos_bt_cinematiaca);
        btTelaResumosDinamica = (Button) findViewById(R.id.tela_resumos_bt_dinamica);
        btTelaResumosEstatica = (Button) findViewById(R.id.tela_resumos_bt_estatica);
        btTelaResumosGravitacao = (Button) findViewById(R.id.tela_resumos_bt_gravitacao);
        btTelaResumosHidrodinamica = (Button) findViewById(R.id.tela_resumos_bt_hidrodinamica);
        btTelaResumosMHS= (Button) findViewById(R.id.tela_resumos_bt_mhs);
        btTelaResumosSI = (Button) findViewById(R.id.tela_resumos_bt_si);
        btTelaResumosHidrostatica = (Button) findViewById(R.id.tela_resumos_bt_hidrostatica);
    }

    private void chamaTelaResumoCinematica()
    {
    btTelaResumosCinematica.setOnClickListener(new View.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            intentTelaResumos = new Intent(getApplicationContext(), ResumoCinematicaActivity.class);
            startActivity(intentTelaResumos);
        }
    });
}

    private void chamaTelaResumoDinamica()
    {
        btTelaResumosDinamica.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intentTelaResumos = new Intent(getApplicationContext(), ResumoDinamicaActivity.class);
                startActivity(intentTelaResumos);
            }
        });
    }

    private void chamaTelaResumoEstatica()
    {
        btTelaResumosEstatica.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intentTelaResumos = new Intent(getApplicationContext(), ResumoEstaticaActivity.class);
                startActivity(intentTelaResumos);
            }
        });
    }

    private void chamaTelaResumoGravitacao()
    {
        btTelaResumosGravitacao.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intentTelaResumos = new Intent(getApplicationContext(), ResumoGravitacaoActivity.class);
                startActivity(intentTelaResumos);
            }
        });
    }

    private void chamaTelaResumoHidrodinamica()
    {
        btTelaResumosHidrodinamica.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intentTelaResumos = new Intent(getApplicationContext(), ResumoHidrodinamicaActivity.class);
                startActivity(intentTelaResumos);
            }
        });
    }

    private void chamaTelaResumoHidrostatica()
    {
        btTelaResumosHidrostatica.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intentTelaResumos = new Intent(getApplicationContext(), ResumoHidrostaticaActivity.class);
                startActivity(intentTelaResumos);
            }
        });
    }

    private void chamaTelaResumoMHS()
    {
        btTelaResumosMHS.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intentTelaResumos = new Intent(getApplicationContext(), ResumoMHSActivity.class);
                startActivity(intentTelaResumos);
            }
        });
    }

    private void chamaTelaResumoSI()
    {
        btTelaResumosSI.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intentTelaResumos = new Intent(getApplicationContext(), ResumoSIActivity.class);
                startActivity(intentTelaResumos);
            }
        });
    }
}
