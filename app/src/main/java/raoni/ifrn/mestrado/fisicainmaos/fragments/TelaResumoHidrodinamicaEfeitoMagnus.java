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

public class TelaResumoHidrodinamicaEfeitoMagnus extends Fragment
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
        rootView = inflater.inflate(R.layout.tela_resumo_hidrodinamica_efeito_magnus, container, false);
        return rootView;
    }

    private void configuraTextView()
    {
        TextView tvTelaResumoequacaoBernoulli01 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrodinamica_efeito_magnus_01);
        TextView tvTelaResumoequacaoBernoulli02 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrodinamica_efeito_magnus_02);

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumoequacaoBernoulli01.setTypeface(font);
        tvTelaResumoequacaoBernoulli02.setTypeface(font);

        tvTelaResumoequacaoBernoulli01.setText(Html.fromHtml(
                "<p>É o fenômeno pelo qual a rotação de um objeto altera sua trajetória em um fluido.</p>" +
                "<p>Aplicação: Quando um jogador de futebol chuta uma bola, com efeito, e esta faz uma curva.</p>" +
                "<p>Enquanto a bola se move ela arrasta consigo um pouco de ar durante os giros. Onde a bola e o ar se movimentam na mesma direção a velocidade é maior, portanto a " +
                "pressão é menor. Agora no outro extremo, aonde o ar se move contrário à bola a velocidade é menor, portanto a pressão é maior. Isso faz com que a bola desvie seu " +
                "caminho normal, produzindo então o Efeito Magnus.</p>"));
        tvTelaResumoequacaoBernoulli02.setText(Html.fromHtml("<p>As cortinas das janelas de um ônibus que se projetam para fora quando o ônibus está em movimento.</p>" +
                "<p>Uma porta que se fecha sozinha.</p>"));
    }
}