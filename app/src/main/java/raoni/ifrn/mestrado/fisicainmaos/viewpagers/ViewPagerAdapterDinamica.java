package raoni.ifrn.mestrado.fisicainmaos.viewpagers;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoDinamicaColisoesMecanicas;
import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoDinamicaConservacaoQuantidadeMovimento;
import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoDinamicaDinamica;
import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoDinamicaEnergia;
import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoDinamicaImpulso;
import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoDinamicaLeisDeNewton;
import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoDinamicaPotencia;
import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoDinamicaQuantidadeMovimento;
import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoDinamicaTiposDeForca;
import raoni.ifrn.mestrado.fisicainmaos.fragments.TelaResumoDinamicaTrabalho;

public class ViewPagerAdapterDinamica extends FragmentPagerAdapter
{
    CharSequence Titles[];
    int NumbOfTabs;

    public ViewPagerAdapterDinamica(FragmentManager fm, CharSequence mTitles[], int mNumbOfTabsumb)
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
                return new TelaResumoDinamicaDinamica();
            case 1:
                return new TelaResumoDinamicaLeisDeNewton();
            case 2:
                return new TelaResumoDinamicaTiposDeForca();
            case 3:
                return new TelaResumoDinamicaTrabalho();
            case 4:
                return new TelaResumoDinamicaEnergia();
            case 5:
                return new TelaResumoDinamicaPotencia();
            case 6:
                return new TelaResumoDinamicaImpulso();
            case 7:
                return new TelaResumoDinamicaQuantidadeMovimento();
            case 8:
                return new TelaResumoDinamicaConservacaoQuantidadeMovimento();
            case 9:
                return new TelaResumoDinamicaColisoesMecanicas();
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