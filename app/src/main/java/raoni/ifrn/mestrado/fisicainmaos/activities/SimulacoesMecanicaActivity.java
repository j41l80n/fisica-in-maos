package raoni.ifrn.mestrado.fisicainmaos.activities;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TabHost;

import raoni.ifrn.mestrado.fisicainmaos.R;

public class SimulacoesMecanicaActivity extends TabActivity {
    private Bundle bundleTelaSimulacoesMecanica;
    private Intent intentTelaSimulacoesMecanica;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_simulacoes_mecanica);

        final TabHost tabHost = (TabHost) findViewById(android.R.id.tabhost);
        TabHost.TabSpec spec;

        intentTelaSimulacoesMecanica = new Intent().setClass(getApplicationContext(), SimulacaoMecanica1Activity.class);
        spec = tabHost.newTabSpec("Balancing Act").setIndicator("Balancing Act").setContent(intentTelaSimulacoesMecanica);
        tabHost.addTab(spec);

        intentTelaSimulacoesMecanica = new Intent().setClass(getApplicationContext(), SimulacaoMecanica4Activity.class);
        spec = tabHost.newTabSpec("Energy Skate Park").setIndicator("Energy Skate Park").setContent(intentTelaSimulacoesMecanica);
        tabHost.addTab(spec);

        intentTelaSimulacoesMecanica = new Intent().setClass(getApplicationContext(), SimulacaoMecanica3Activity.class);
        spec = tabHost.newTabSpec("Forces and Motion").setIndicator("Forces and Motion").setContent(intentTelaSimulacoesMecanica);
        tabHost.addTab(spec);

        intentTelaSimulacoesMecanica = new Intent().setClass(getApplicationContext(), SimulacaoMecanica5Activity.class);
        spec = tabHost.newTabSpec("Friction").setIndicator("Friction").setContent(intentTelaSimulacoesMecanica);
        tabHost.addTab(spec);

        intentTelaSimulacoesMecanica = new Intent().setClass(getApplicationContext(), SimulacaoMecanica2Activity.class);
        spec = tabHost.newTabSpec("Gravity Force").setIndicator("Gravity Force").setContent(intentTelaSimulacoesMecanica);
        tabHost.addTab(spec);

        intentTelaSimulacoesMecanica = new Intent().setClass(getApplicationContext(), SimulacaoMecanica6Activity.class);
        spec = tabHost.newTabSpec("Under Pressure").setIndicator("Under Pressure").setContent(intentTelaSimulacoesMecanica);
        tabHost.addTab(spec);

        intentTelaSimulacoesMecanica = new Intent().setClass(getApplicationContext(), SimulacaoMecanica7Activity.class);
        spec = tabHost.newTabSpec("Hookes Law").setIndicator("Hookes Law").setContent(intentTelaSimulacoesMecanica);
        tabHost.addTab(spec);
    }
}
