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

public class TelaResumoEstaticaCorpoExtenso extends Fragment
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
        rootView = inflater.inflate(R.layout.tela_resumo_estatica_corpo_extenso, container, false);
        return rootView;
    }

    private void configuraTextView()
    {
        TextView tvTelaResumoCorpoExtenso01 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_estatica_corpo_extenso_01);
        TextView tvTelaResumoCorpoExtenso02 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_estatica_corpo_extenso_02);

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumoCorpoExtenso01.setTypeface(font);
        tvTelaResumoCorpoExtenso02.setTypeface(font);

        tvTelaResumoCorpoExtenso01.setText(Html.fromHtml(
                "<p>Centro de massa: Um único ponto que representa a massa de um corpo localiza-se" +
                        " em um ponto onde a distribuição das massas fica equilibrada. </p>" +
                "<p>Centro de gravidade: Um único ponto onde se concentra todo o peso de um corpo. " +
                        "Para corpos homogêneos, o centro de gravidade coincide com o centro de " +
                        "massa, sobre o eixo de simetria.</p>" +
                "<p>Para corpos planos e/ou sólidos, o centro de massa está no encontro dos eixos " +
                        "de simetria.</p>"));
   tvTelaResumoCorpoExtenso02.setText(Html.fromHtml("<p><b>Ex.<sub>1</sub>:</b> Em provas de " +
           "atletismos, como salto com vara e salta a distância, quanto mais o competidor " +
           "conseguir elevar seu centro de massa, melhor será seu salto. Para o homem o centro" +
           " de massa se localiza aproximadamente no seu umbigo</p>" +
           "<p><b>Ex.<sub>2</sub>:</b> Um corpo no espaço sideral, longe de qualquer influência" +
           "gravitacional, possui centro de massa, mas não possui centro gravitacional.</p>"));
    }
}
