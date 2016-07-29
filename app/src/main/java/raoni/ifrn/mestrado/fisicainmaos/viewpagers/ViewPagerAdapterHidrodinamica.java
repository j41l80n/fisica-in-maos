package raoni.ifrn.mestrado.fisicainmaos.viewpagers;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoHidrodinamicaEfeitoMagnus;
import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoHidrodinamicaEquacaoBernoulli;
import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoHidrodinamicaEquacaoTorricelli;
import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoHidrodinamicaHidrodinamica;
import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoHidrodinamicaVazao;

public class ViewPagerAdapterHidrodinamica extends FragmentStatePagerAdapter
{
    CharSequence Titles[];
    int NumbOfTabs;

    public ViewPagerAdapterHidrodinamica(FragmentManager fm, CharSequence mTitles[], int mNumbOfTabsumb)
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
                return new TelaResumoHidrodinamicaHidrodinamica();
            case 1:
                return new TelaResumoHidrodinamicaVazao();
            case 2:
                return new TelaResumoHidrodinamicaEquacaoBernoulli();
            case 3:
                return new TelaResumoHidrodinamicaEfeitoMagnus();
            case 4:
                return new TelaResumoHidrodinamicaEquacaoTorricelli();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position)
    {
        return Titles[position];
        //
    }

    @Override
    public int getCount()
    {
        return NumbOfTabs;
        //
    }
}