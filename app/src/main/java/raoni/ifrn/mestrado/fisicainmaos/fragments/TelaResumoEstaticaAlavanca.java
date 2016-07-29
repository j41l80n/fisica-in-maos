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

public class TelaResumoEstaticaAlavanca extends Fragment
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
        rootView = inflater.inflate(R.layout.tela_resumo_estatica_alavanca, container, false);
        return rootView;
    }

    private void configuraTextView()
    {
        TextView tvTelaResumoAlavanca01 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_estatica_alavanca_01);
        TextView tvTelaResumoAlavanca02 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_estatica_alavanca_02);
        TextView tvTelaResumoAlavanca03 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_estatica_alavanca_03);
        TextView tvTelaResumoAlavanca04 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_estatica_alavanca_04);
        TextView tvTelaResumoAlavanca05 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_estatica_alavanca_05);
        TextView tvTelaResumoAlavanca06 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_estatica_alavanca_06);
        TextView tvTelaResumoAlavanca07 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_estatica_alavanca_07);
        TextView tvTelaResumoAlavanca08 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_estatica_alavanca_08);

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumoAlavanca01.setTypeface(font);
        tvTelaResumoAlavanca02.setTypeface(font);
        tvTelaResumoAlavanca03.setTypeface(font);
        tvTelaResumoAlavanca04.setTypeface(font);
        tvTelaResumoAlavanca05.setTypeface(font);
        tvTelaResumoAlavanca06.setTypeface(font);
        tvTelaResumoAlavanca07.setTypeface(font);
        tvTelaResumoAlavanca08.setTypeface(font);

        tvTelaResumoAlavanca01.setText(Html.fromHtml(
                "<p>Poder de multiplicação ou vantagem mecânica(η): É a relação entre a força transmitida e a força aplicada ou a relação entre a distância de ação e a distância de resistência.</p>"));
        tvTelaResumoAlavanca02.setText(Html.fromHtml("<p><b>Tipos de alavancas:</b></p>" +
                "<p><i>Interfixa:</i></p>"));
        tvTelaResumoAlavanca03.setText(Html.fromHtml("<p>Exemplos de aplicação: </p>"));
        tvTelaResumoAlavanca04.setText(Html.fromHtml("<p><i>Inter-resistentes:</i></p>"));
        tvTelaResumoAlavanca05.setText(Html.fromHtml("<p>Exemplos de aplicação:</p>"));
        tvTelaResumoAlavanca06.setText(Html.fromHtml("<p><i>Interpotente:</i></p>"));
        tvTelaResumoAlavanca07.setText(Html.fromHtml("<p>Exemplos de aplicação:</p>"));
        tvTelaResumoAlavanca08.setText(Html.fromHtml("<p>Onde: </p>" +
                "<p><b>PF</b> – ponto fixo, em torno do qual a alavanca pode girar;</p>" +
                "<p><b>F<sub>P</sub></b> – força potente, exercida com o objetivo de levantar, sustentar, equilibrar, etc</p>" +
                "<p><b>F<sub>R</sub></b> – força resistente, exercida pelo objeto que se quer levantar, sustentar, equilibrar, etc.</p>"));

    }
}
