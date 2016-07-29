package raoni.ifrn.mestrado.fisicainmaos.viewpagers;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoCinematicaCinemtatica;
import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoCinematicaDecomposicaoVetores;
import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoCinematicaDeslocamento;
import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoCinematicaGraficosMRU;
import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoCinematicaGraficosMRUV;
import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoCinematicaGrandezasEscalaresVetoriais;
import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoCinematicaIntervaloTempo;
import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoCinematicaLancamentoHorizontal;
import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoCinematicaLancamentoObliquuo;
import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoCinematicaLancamentoVertical;
import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoCinematicaMRU;
import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoCinematicaMRUV;
import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoCinematicaMovimentoCircular;
import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoCinematicaOperacoesVetores;
import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoCinematicaQuedaLivre;
import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoCinematicaVelocidadeMedia;

public class ViewPagerAdapterCinematica extends FragmentStatePagerAdapter
{
    CharSequence Titles[];
    int NumbOfTabs;

    public ViewPagerAdapterCinematica(FragmentManager fm, CharSequence mTitles[], int mNumbOfTabsumb)
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
                return new TelaResumoCinematicaCinemtatica();
            case 1:
                return new TelaResumoCinematicaGrandezasEscalaresVetoriais();
            case 2:
                return new TelaResumoCinematicaOperacoesVetores();
            case 3:
                return new TelaResumoCinematicaDecomposicaoVetores();
            case 4:
                return new TelaResumoCinematicaIntervaloTempo();
            case 5:
                return new TelaResumoCinematicaDeslocamento();
            case 6:
                return new TelaResumoCinematicaVelocidadeMedia();
            case 7:
                return new TelaResumoCinematicaMRU();
            case 8:
                return new TelaResumoCinematicaMRUV();
            case 9:
                return new TelaResumoCinematicaLancamentoVertical();
            case 10:
                return new TelaResumoCinematicaQuedaLivre();
            case 11:
                return new TelaResumoCinematicaLancamentoHorizontal();
            case 12:
                return new TelaResumoCinematicaLancamentoObliquuo();
            case 13:
                return new TelaResumoCinematicaMovimentoCircular();
            case 14:
                return new TelaResumoCinematicaGraficosMRU();
            case 15:
                return new TelaResumoCinematicaGraficosMRUV();
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
        return NumbOfTabs;
    }
}