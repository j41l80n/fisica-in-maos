package raoni.ifrn.mestrado.fisicainmaos.viewpagers;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoGravitacaoEstacoesAno;
import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoGravitacaoGravidade;
import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoGravitacaoLeiGravitacaoUniversal;
import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoGravitacaoLeisKepler;
import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoGravitacaoMares;
import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoGravitacaoSOC;
import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoGravitacaoVelocidadeEscape;

public class ViewPagerAdapterGravitacao extends FragmentStatePagerAdapter
{
    CharSequence Titles[];
    int NumbOfTabs;

    public ViewPagerAdapterGravitacao(FragmentManager fm, CharSequence mTitles[], int mNumbOfTabsumb)
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
                return new TelaResumoGravitacaoLeisKepler();
            case 1:
                return new TelaResumoGravitacaoLeiGravitacaoUniversal();
            case 2:
                return new TelaResumoGravitacaoGravidade();
            case 3:
                return new TelaResumoGravitacaoEstacoesAno();
            case 4:
                return new TelaResumoGravitacaoMares();
            case 5:
                return new TelaResumoGravitacaoVelocidadeEscape();
            case 6:
                return new TelaResumoGravitacaoSOC();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position)
    {
        //
        return Titles[position];
    }

    @Override
    public int getCount()
    {
    //
        return NumbOfTabs;
    }
}