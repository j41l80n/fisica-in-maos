package raoni.ifrn.mestrado.fisicainmaos.activites;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TabHost;

import raoni.ifrn.mestrado.fisicainmaos.R;

public class TelaSimulacoesMagnetismo extends TabActivity
{
    private Bundle bundleTelaSimulacoesMagnetismo;
    private Intent intentTelaSimulacoesMagnetismo;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_simulacoes_magnetismo);

        final TabHost tabHost = (TabHost)findViewById(android.R.id.tabhost);
        TabHost.TabSpec spec;

        intentTelaSimulacoesMagnetismo = new Intent().setClass(getApplicationContext(), TelaSimulacaoMagnetismo1.class);
        spec = tabHost.newTabSpec("Faradays Law").setIndicator("Faradays Law").setContent(intentTelaSimulacoesMagnetismo);
        tabHost.addTab(spec);

        intentTelaSimulacoesMagnetismo = new Intent().setClass(getApplicationContext(), TelaSimulacaoMagnetismo2.class);
        spec = tabHost.newTabSpec("Faradays Law 2").setIndicator("Faradays Law 2").setContent(intentTelaSimulacoesMagnetismo);
        tabHost.addTab(spec);
    }
}
