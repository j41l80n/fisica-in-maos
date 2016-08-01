package raoni.ifrn.mestrado.fisicainmaos.activities;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TabHost;

import raoni.ifrn.mestrado.fisicainmaos.R;

public class SimulacoesFisicaModernaActivity extends TabActivity
{
    private Bundle bundleTelaSimulacoesFisicaModerna;
    private Intent intentTelaSimulacoesFisicaModerna;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_simulacoes_fisica_moderna);

        final TabHost tabHost = (TabHost)findViewById(android.R.id.tabhost);
        TabHost.TabSpec spec;

        intentTelaSimulacoesFisicaModerna = new Intent().setClass(getApplicationContext(), SimulacaoFisicaModerna1Activity.class);
        spec = tabHost.newTabSpec("Molecules and Light").setIndicator("Molecules and Light").setContent(intentTelaSimulacoesFisicaModerna);
        tabHost.addTab(spec);
    }
}
