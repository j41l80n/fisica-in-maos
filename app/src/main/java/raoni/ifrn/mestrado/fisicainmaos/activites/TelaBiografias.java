package raoni.ifrn.mestrado.fisicainmaos.activites;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import raoni.ifrn.mestrado.fisicainmaos.R;

public class TelaBiografias extends FragmentActivity
{
    Button fisicoArquimedes;
    Button fisicoBernoulli;
    Button fisicoBlaisePascal;
    Button fisicoGalileuGalilei;
    Button fisicoIsaacNewton;
    Button fisicoJohannesKepler;
    Button fisicoSteven;
    Button fisicoTorricelli;
    Intent intentTelaBiografias;
    Bundle bundleTelaBiografias;

    public void onCreate(Bundle savedInstanceState)
    {
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_biografias);

        setup();
    }

    private void setup()
    {
        configuraButtons();
        chamaTelaBiografiaArquimedes();
        chamaTelaBiografiaBernoulli();
        chamaTelaBiografiaBlaisePascal();
        chamaTelaBiografiaGalileuGalilei();
        chamaTelaBiografiaIsaacNewton();
        chamaTelaBiografiaJohannesKepler();
        chamaTelaBiografiaSteven();
        chamaTelaBiografiaTorricelli();
    }

    private void configuraButtons()
    {
        fisicoArquimedes = (Button) findViewById(R.id.tela_biografias_bt_fisico_arquimedes);
        fisicoBernoulli = (Button) findViewById(R.id.tela_biografias_bt_fisico_bernoulli);
        fisicoBlaisePascal = (Button) findViewById(R.id.tela_biografias_bt_fisico_blaise_pascal);
        fisicoGalileuGalilei = (Button) findViewById(R.id.tela_biografias_bt_fisico_galileu_galilei);
        fisicoIsaacNewton = (Button) findViewById(R.id.tela_biografias_bt_fisico_isaac_newton);
        fisicoJohannesKepler = (Button) findViewById(R.id.tela_biografias_bt_fisico_johannes_kepler);
        fisicoSteven = (Button) findViewById(R.id.tela_biografias_bt_fisico_stevin);
        fisicoTorricelli = (Button) findViewById(R.id.tela_biografias_bt_fisico_torricelli);
    }

    private void chamaTelaBiografiaArquimedes()
    {
        fisicoArquimedes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentTelaBiografias = new Intent(getApplicationContext(), TelaBiografiaArquimedes.class);
                startActivity(intentTelaBiografias);
            }
        });
    }

    private void chamaTelaBiografiaBernoulli()
    {
        fisicoBernoulli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentTelaBiografias = new Intent(getApplicationContext(), TelaBiografiaBernoulli.class);
                startActivity(intentTelaBiografias);
            }
        });
    }

    private void chamaTelaBiografiaBlaisePascal()
    {
        fisicoBlaisePascal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentTelaBiografias = new Intent(getApplicationContext(), TelaBiografiaBlaisePascal.class);
                startActivity(intentTelaBiografias);
            }
        });
    }

    private void chamaTelaBiografiaGalileuGalilei()
    {
        fisicoGalileuGalilei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentTelaBiografias = new Intent(getApplicationContext(), TelaBiografiaGalileuGalilei.class);
                startActivity(intentTelaBiografias);
            }
        });
    }

    private void chamaTelaBiografiaIsaacNewton()
    {
        fisicoIsaacNewton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentTelaBiografias = new Intent(getApplicationContext(), TelaBiografiaIsaacNewton.class);
                startActivity(intentTelaBiografias);
            }
        });
    }

    private void chamaTelaBiografiaJohannesKepler ()
    {
        fisicoJohannesKepler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentTelaBiografias = new Intent(getApplicationContext(), TelaBiografiaJohannesKepler.class);
                startActivity(intentTelaBiografias);
            }
        });
    }

    private void chamaTelaBiografiaSteven ()
    {
        fisicoSteven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentTelaBiografias = new Intent(getApplicationContext(), TelaBiografiaSteven.class);
                startActivity(intentTelaBiografias);
            }
        });
    }

    private void chamaTelaBiografiaTorricelli()
    {
        fisicoTorricelli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentTelaBiografias = new Intent(getApplicationContext(), TelaBiografiaTorricelli.class);
                startActivity(intentTelaBiografias);
            }
        });
    }
}
