package raoni.ifrn.mestrado.fisicainmaos.viewpagers;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoHidrostaticaDensidade;
import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoHidrostaticaEmpuxo;
import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoHidrostaticaHidrostatica;
import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoHidrostaticaPressao;
import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoHidrostaticaTeoremaStevin;
import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoHidrostaticaVasosComunicantes;

public class ViewPagerAdapterHidrostatica extends FragmentPagerAdapter
{
    CharSequence Titles[];
    int NumbOfTabs;

    public ViewPagerAdapterHidrostatica(FragmentManager fm, CharSequence mTitles[], int mNumbOfTabsumb)
    {
        super(fm);
        this.Titles = mTitles;
        this.NumbOfTabs = mNumbOfTabsumb;
    }

    @Override
    public Fragment getItem(int position)
    {
        switch (position)
        {
            case 0:
                return new TelaResumoHidrostaticaHidrostatica();
            case 1:
                return new TelaResumoHidrostaticaDensidade();
            case 2:
                return new TelaResumoHidrostaticaPressao();
            case 3:
                return new TelaResumoHidrostaticaTeoremaStevin();
            case 4:
                return new TelaResumoHidrostaticaVasosComunicantes();
            case 5:
                return new TelaResumoHidrostaticaEmpuxo();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position)
    {
        return Titles[position];
    }

    @Override
    public int getCount() {
        return NumbOfTabs;
    }
}