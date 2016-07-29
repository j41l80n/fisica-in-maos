package raoni.ifrn.mestrado.fisicainmaos.viewpagers;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoEstaticaAlavanca;
import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoEstaticaCorpoExtenso;
import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoEstaticaMaquinasSimples;
import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoEstaticaTiposEquilibrio;

public class ViewPagerAdapterEstatica extends FragmentStatePagerAdapter
{
    CharSequence Titles[];
    int NumbOfTabs;

    public ViewPagerAdapterEstatica(FragmentManager fm, CharSequence mTitles[], int mNumbOfTabsumb)
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
                return new TelaResumoEstaticaCorpoExtenso();
            case 1:
                return new TelaResumoEstaticaTiposEquilibrio();
            case 2:
                return new TelaResumoEstaticaMaquinasSimples();
            case 3:
                return new TelaResumoEstaticaAlavanca();
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