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

public class TelaResumoCinematicaCinemtatica extends Fragment
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
        rootView = inflater.inflate(R.layout.tela_resumo_cinematica_01, container, false);
        return rootView;
    }

    private void configuraTextView()
    {
        TextView tvTelaResumoCinematica01 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica1_01);
        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumoCinematica01.setTypeface(font);

        tvTelaResumoCinematica01.setText(Html.fromHtml(
                "<p>Estuda os vários tipos de movimentos, sem se preocupar com as causas.</p>" +
                        "<p><b>Partícula:</b> Representa um objeto com dimensões desprezíveis em relação as dimensões envolvidas no movimento estudado.</p>\n" +
                        "<p><b>Corpo extenso:</b> As dimensões do corpo devem ser levadas em consideração. Ou seja, O tamanho do corpo é comparável com as dimensões envolvidas no movimento.</p>\n" +
                        "<p><b>Repouso:</b> Um corpo está em repouso quando a distância entre ele e o referencial não varia com o passar do tempo.</p>\n" +
                        "<p><b>Movimento:</b> Um corpo está em movimento quando a distância entre ele e o referencial está variando com o tempo.</p>\n"));
    }
}
