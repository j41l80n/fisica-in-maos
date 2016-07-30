package raoni.ifrn.mestrado.fisicainmaos.activites;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TabHost;

import raoni.ifrn.mestrado.fisicainmaos.R;

public class SimulacoesOndasOpticaActivity extends TabActivity
{
    private Bundle bundleTelaSimulacoesOndasOptica;
    private Intent intentTelaSimulacoesOndasOptica;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_simulacoes_ondas_optica);

        final TabHost tabHost = (TabHost)findViewById(android.R.id.tabhost);
        TabHost.TabSpec spec;

        intentTelaSimulacoesOndasOptica = new Intent().setClass(getApplicationContext(), SimulacaoOndasOptica1Activity.class);
        spec = tabHost.newTabSpec("Wave on a String").setIndicator("Wave on a String").setContent(intentTelaSimulacoesOndasOptica);
        tabHost.addTab(spec);

        intentTelaSimulacoesOndasOptica = new Intent().setClass(getApplicationContext(), SimulacaoOndasOptica2Activity.class);
        spec = tabHost.newTabSpec("Color Vision").setIndicator("Color Vision").setContent(intentTelaSimulacoesOndasOptica);
        tabHost.addTab(spec);

        intentTelaSimulacoesOndasOptica = new Intent().setClass(getApplicationContext(), SimulacaoOndasOptica3Activity.class);
        spec = tabHost.newTabSpec("Bending Light").setIndicator("Bending Light").setContent(intentTelaSimulacoesOndasOptica);
        tabHost.addTab(spec);
    }
}
