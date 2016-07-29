package raoni.ifrn.mestrado.fisicainmaos.activites;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TabHost;

import raoni.ifrn.mestrado.fisicainmaos.R;

public class TelaSimulacoesEletricidade extends TabActivity
{
    private Bundle bundleTelaSimulacoesEletricidade;
    private Intent intentTelaSimulacoesEletricidade;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_simulacoes_eletricidade);

        final TabHost tabHost = (TabHost)findViewById(android.R.id.tabhost);
        TabHost.TabSpec spec;

        intentTelaSimulacoesEletricidade = new Intent().setClass(getApplicationContext(), TelaSimulacaoEletricidade1.class);
        spec = tabHost.newTabSpec("Balloons and Static").setIndicator("Balloons and Static").setContent(intentTelaSimulacoesEletricidade);
        tabHost.addTab(spec);

        intentTelaSimulacoesEletricidade = new Intent().setClass(getApplicationContext(), TelaSimulacaoEletricidade2.class);
        spec = tabHost.newTabSpec("John Travoltage").setIndicator("John Travoltage").setContent(intentTelaSimulacoesEletricidade);
        tabHost.addTab(spec);

        intentTelaSimulacoesEletricidade = new Intent().setClass(getApplicationContext(), TelaSimulacaoEletricidade3.class);
        spec = tabHost.newTabSpec("Ohm's Law").setIndicator("Ohm's Law").setContent(intentTelaSimulacoesEletricidade);
        tabHost.addTab(spec);

        intentTelaSimulacoesEletricidade = new Intent().setClass(getApplicationContext(), TelaSimulacaoEletricidade4.class);
        spec = tabHost.newTabSpec("Resistance in a Wire").setIndicator("Resistance in a Wire").setContent(intentTelaSimulacoesEletricidade);
        tabHost.addTab(spec);
    }
}
