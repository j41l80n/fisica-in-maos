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

public class TelaResumoCinematicaGraficosMRUV extends Fragment
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
        rootView = inflater.inflate(R.layout.tela_resumo_cinematica_16, container, false);
        return rootView;
    }

    private void configuraTextView()
    {
        TextView tvTelaResumoCinematica1601 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_16_01);
        TextView tvTelaResumoCinematica1602 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_16_02);

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumoCinematica1601.setTypeface(font);
        tvTelaResumoCinematica1602.setTypeface(font);

        tvTelaResumoCinematica1601.setText(Html.fromHtml("<p>Análise de gráficos:</p>" +
                "<p>Em um gráfico Sxt, para um movimento uniforme, o gráfico é uma reta e representa a velocidade, podendo ser crescente (+V) ou decrescente (-V)</p>" +
                "<p>Em um gráfico Vxt a área do gráfico representa o espaço percorrido.</p>" +
                "<p>Para se analisar um gráfico devemos primeiramente observar as variáveis.</p>" +
                "<p>Gráfico Sxt</p>"));
        tvTelaResumoCinematica1602.setText(Html.fromHtml("<p>Gráfico vxt</p>"));
    }
}
