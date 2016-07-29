package raoni.ifrn.mestrado.fisicainmaos.viewpagers;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoSIRegras;
import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoSISI;

public class ViewPagerAdapterSI extends FragmentStatePagerAdapter
{
    CharSequence Titles[];
    int NumbOfTabs;

    public ViewPagerAdapterSI(FragmentManager fm, CharSequence mTitles[], int mNumbOfTabsumb)
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
                return new TelaResumoSISI();
            case 1:
                return new TelaResumoSIRegras();
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