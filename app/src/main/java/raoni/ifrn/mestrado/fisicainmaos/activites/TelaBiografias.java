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
        setupButtons();
        arquimedes();
        bernoulli();
        blaisePascal();
        galileuGalilei();
        isaacNewton();
        johannesKepler();
        steven();
        torricelli();
    }

    private void setupButtons()
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

    private void arquimedes()
    {
        fisicoArquimedes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentTelaBiografias = new Intent(getApplicationContext(), BiografiaArquimedesActivity.class);
                startActivity(intentTelaBiografias);
            }
        });
    }

    private void bernoulli()
    {
        fisicoBernoulli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentTelaBiografias = new Intent(getApplicationContext(), BiografiaBernoulliActivity.class);
                startActivity(intentTelaBiografias);
            }
        });
    }

    private void blaisePascal()
    {
        fisicoBlaisePascal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentTelaBiografias = new Intent(getApplicationContext(), BiografiaBlaisePascalActivity.class);
                startActivity(intentTelaBiografias);
            }
        });
    }

    private void galileuGalilei()
    {
        fisicoGalileuGalilei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentTelaBiografias = new Intent(getApplicationContext(), BiografiaGalileuGalileiActivity.class);
                startActivity(intentTelaBiografias);
            }
        });
    }

    private void isaacNewton()
    {
        fisicoIsaacNewton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentTelaBiografias = new Intent(getApplicationContext(), BiografiaIsaacNewtonActivity.class);
                startActivity(intentTelaBiografias);
            }
        });
    }

    private void johannesKepler()
    {
        fisicoJohannesKepler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentTelaBiografias = new Intent(getApplicationContext(), BiografiaJohannesKeplerActivity.class);
                startActivity(intentTelaBiografias);
            }
        });
    }

    private void steven()
    {
        fisicoSteven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentTelaBiografias = new Intent(getApplicationContext(), TelaBiografiaSteven.class);
                startActivity(intentTelaBiografias);
            }
        });
    }

    private void torricelli()
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
