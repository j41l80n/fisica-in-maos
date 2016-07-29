package raoni.ifrn.mestrado.fisicainmaos.viewpagers;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoMHSAssociacaoMolas;
import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoMHSEnergiaMHSHorizontal;
import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoMHSEnergiaMecanica;
import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoMHSMCU;
import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoMHSMHS;
import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoMHSPenduloSimples;
import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoMHSSistemaMassaMola;

public class ViewPagerAdapterMHS extends FragmentPagerAdapter
{
    CharSequence Titles[];
    int NumbOfTabs;

    public ViewPagerAdapterMHS(FragmentManager fm, CharSequence mTitles[], int mNumbOfTabsumb)
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
                return new TelaResumoMHSMHS();
            case 1:
                return new TelaResumoMHSMCU();
            case 2:
                return new TelaResumoMHSSistemaMassaMola();
            case 3:
                return new TelaResumoMHSEnergiaMHSHorizontal();
            case 4:
                return new TelaResumoMHSPenduloSimples();
            case 5:
                return new TelaResumoMHSEnergiaMecanica();
            case 6:
                return new TelaResumoMHSAssociacaoMolas();
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