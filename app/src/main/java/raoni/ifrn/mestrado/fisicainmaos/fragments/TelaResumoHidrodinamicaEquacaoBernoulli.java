package raoni.ifrn.mestrado.fisicainmaos.fragments;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import raoni.ifrn.mestrado.fisicainmaos.R;

public class TelaResumoHidrodinamicaEquacaoBernoulli extends Fragment
{
    private View rootView;

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        configuraTextView();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        rootView = inflater.inflate(R.layout.tela_resumo_hidrodinamica_equacao_bernoulli, container, false);
        return rootView;
    }

    private void configuraTextView()
    {
        TextView tvTelaResumoequacaoBernoulli01 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrodinamica_equacao_bernoulli_01);
        TextView tvTelaResumoequacaoBernoulli02 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrodinamica_equacao_bernoulli_02);
        TextView tvTelaResumoequacaoBernoulli03 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrodinamica_equacao_bernoulli_03);
        TextView tvTelaResumoequacaoBernoulli04 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrodinamica_equacao_bernoulli_04);
        TextView tvTelaResumoequacaoBernoulli05 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrodinamica_equacao_bernoulli_05);
        TextView tvTelaResumoequacaoBernoulli06 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrodinamica_equacao_bernoulli_06);

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumoequacaoBernoulli01.setTypeface(font);
        tvTelaResumoequacaoBernoulli02.setTypeface(font);
        tvTelaResumoequacaoBernoulli03.setTypeface(font);
        tvTelaResumoequacaoBernoulli04.setTypeface(font);
        tvTelaResumoequacaoBernoulli05.setTypeface(font);
        tvTelaResumoequacaoBernoulli06.setTypeface(font);

        tvTelaResumoequacaoBernoulli01.setText(Html.fromHtml("<p>Considere um fluído escoando" +
                " através de uma tubulação. Existem três fatores que podem interferir no escoamento" +
                " do fluído em questão:</p>" +
                "<p>1) A pressão que age nas extremidades da tubulação podem ser diferentes uma da" +
                " outra.</p>" +
                "<p>2) Se houver variação na área de secção transversal reta da tubulação" +
                " acarretará variação na velocidade do fluído.</p>" +
                "<p>3) A altura da primeira extremidade pode ser diferente da altura da segunda" +
                " extremidade.</p>"));
        tvTelaResumoequacaoBernoulli02.setText(Html.fromHtml("<p>Supondo que o fluido esteja se" +
                " movendo para a direita, existe uma força F1 responsável por colocar esse líquido " +
                "em movimento e uma força F2 contrária a esse movimento, que " +
                "pode estar sendo aplicada pelo líquido que está logo à frente.</p>" +
                "<p>Uma quantidade de massa ‘m’ e volume ‘V’ se move com velocidade v1," +
                " deslocando-se Δx1. Essa massa de fluido se desloca até um altura h2, realizando " +
                "um trabalho. Na outra extremidade a força F2 realiza um trabalho resistente.</p>" +
                "<p>Sendo W = ΔE</p>" +
                "<p>Onde: F = p.A;\t m = d.V;\t V =  A.Δx</p>"));

        tvTelaResumoequacaoBernoulli03.setText(Html.fromHtml("<p><b>Equação de Bernoulli a uma mesma altura:</b></p>"));
        tvTelaResumoequacaoBernoulli04.setText(Html.fromHtml("<p>Para que esses termos se mantenham constantes, quando a velocidade 2 aumentar, a pressão 2 terá, obrigatoriamente, que diminuir. Portanto, quanto maior a velocidade, menor a pressão nesse ponto.</p>" +
                "<p>Aplicações:</p>"));
        tvTelaResumoequacaoBernoulli05.setText(Html.fromHtml("<p>Um ônibus ao passar próximo a um ciclista, em alta velocidade, produz o efeito Bernoulli, jogando o ciclista para cima do ônibus.</p>"));
        tvTelaResumoequacaoBernoulli06.setText(Html.fromHtml("<p>O ar que passa paralelo a uma janela, durante uma ventania, faz com que as cortinas sejam projetadas para fora.</p>"));
    }
}
