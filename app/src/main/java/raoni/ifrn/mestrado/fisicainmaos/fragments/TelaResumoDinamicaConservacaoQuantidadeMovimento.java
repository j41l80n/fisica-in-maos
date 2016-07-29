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

public class TelaResumoDinamicaConservacaoQuantidadeMovimento extends Fragment
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
        rootView = inflater.inflate(R.layout.tela_resumo_dinamica_consercvacao_quantidade_movimento, container, false);
        return rootView;
    }

    private void configuraTextView()
    {
        TextView tvTelaResumoDinamicaConservacaoQuantidadeMovimento = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_conservacao_quantidade_movimento_01);

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumoDinamicaConservacaoQuantidadeMovimento.setTypeface(font);

        tvTelaResumoDinamicaConservacaoQuantidadeMovimento.setText(Html.fromHtml(
                "<p>Para sistemas isolados de forças externas, ou seja, com força resultante nula, a quantidade de movimento é sempre constante.</p>" +
                "<p>Exemplo: Pêndulo de Newton</p>"));
    }
}
