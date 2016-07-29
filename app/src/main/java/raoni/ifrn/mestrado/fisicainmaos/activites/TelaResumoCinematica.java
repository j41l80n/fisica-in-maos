package raoni.ifrn.mestrado.fisicainmaos.activites;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Window;
import android.view.WindowManager;

import raoni.ifrn.mestrado.fisicainmaos.R;
import raoni.ifrn.mestrado.fisicainmaos.helpers.SlidingTabLayout;
import raoni.ifrn.mestrado.fisicainmaos.viewpagers.ViewPagerAdapterCinematica;

public class TelaResumoCinematica extends AppCompatActivity
{
    private Toolbar toolbar;
    ViewPager pager;
    ViewPagerAdapterCinematica adapter;
    SlidingTabLayout tabs;

    CharSequence Titles[]=
            {
                "Cinemática","Grandezas escalares e vetoriais", "Operações com Vetores",
                "Decomposição de Vetores", "Intervalo de tempo", "Deslocamento", "Velocidade média", "MRU",
                "MRUV", "Lançamento Vertical", "Queda livre", "Lançamento horizontal", "Lançamento oblíquo",
                "Movimento circular", "Gráficos do MRU", "Gráficos do MRUV"
            };

    int Numboftabs = 16;

    public void onCreate(Bundle savedInstanceState)
    {
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_resumo_adaptador);

        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("CINEMÁTICA");

        adapter =  new ViewPagerAdapterCinematica(getSupportFragmentManager(), Titles, Numboftabs);

        pager = (ViewPager) findViewById(R.id.pager);
        pager.setAdapter(adapter);

        tabs = (SlidingTabLayout) findViewById(R.id.tabs);
        tabs.setDistributeEvenly(true);
        tabs.setCustomTabColorizer(new SlidingTabLayout.TabColorizer()
        {
            @Override
            public int getIndicatorColor(int position)
            {
                return getResources().getColor(R.color.tabsScrollColor);
            }
        });

        tabs.setViewPager(pager);
    }
}
