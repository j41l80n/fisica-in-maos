package raoni.ifrn.mestrado.fisicainmaos.fragments;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import raoni.ifrn.mestrado.fisicainmaos.R;

public class TelaResumoMHSPenduloSimples extends Fragment
{
    private View rootView;

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        configuraTextView();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        rootView = inflater.inflate(R.layout.tela_resumo_mhs_pendulo_simples, container, false);
        return rootView;
    }

    private void configuraTextView()
    {
        TextView tvTelaResumoPenduloSimples01 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_mhs_pendulo_simples_01);
        TextView tvTelaResumoPenduloSimples02 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_mhs_pendulo_simples_02);
        TextView tvTelaResumoPenduloSimples03 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_mhs_pendulo_simples_03);

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumoPenduloSimples01.setTypeface(font);
        tvTelaResumoPenduloSimples02.setTypeface(font);
        tvTelaResumoPenduloSimples03.setTypeface(font);

        tvTelaResumoPenduloSimples01.setText(Html.fromHtml(
                "<p>\tConsta de uma massa m presa na extremidade de um fio ideal, fixado em sua superfície por sua outra extremidade.</p>"));
        tvTelaResumoPenduloSimples02.setText(Html.fromHtml("<p>\tPeríodo de oscilação de um pêndulo:</p>"));
        tvTelaResumoPenduloSimples03.setText(Html.fromHtml("<p>\tObs.: A massa m do pêndulo não influi no período.</p>" +
                "<p>\tO período do pêndulo é inversamente proporcional à raiz quadrada da gravidade local.</p>" +
                "<p>\tSe um relógio de pêndulo é levado a um local mais quente sua batida tende a atrasar. </p>"));
    }
}
