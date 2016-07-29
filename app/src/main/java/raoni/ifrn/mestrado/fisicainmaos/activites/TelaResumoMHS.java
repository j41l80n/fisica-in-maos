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
import raoni.ifrn.mestrado.fisicainmaos.viewpagers.ViewPagerAdapterMHS;

public class TelaResumoMHS extends AppCompatActivity
{
    private Toolbar toolbar;
    private ViewPager pager;
    private ViewPagerAdapterMHS adapter;
    private SlidingTabLayout tabs;

    CharSequence Titles[]=
            {
                    "Movimento harmônico simples", "MCU", "Sistema massa-mola", "Energia do MHS na horizontal", "Pêndulo simples", "Energia mecânica", "Associação de molas"
            };

    int Numboftabs = 7;

    public void onCreate(Bundle savedInstanceState)
    {
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_resumo_adaptador);

        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("MOVIMENTO HARMÔNICO SIMPLES");

        adapter =  new ViewPagerAdapterMHS(getSupportFragmentManager(), Titles, Numboftabs);

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
