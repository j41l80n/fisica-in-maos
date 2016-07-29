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

public class TelaResumoCinematicaGraficosMRU extends Fragment
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
        rootView = inflater.inflate(R.layout.tela_resumo_cinematica_graficos_mru, container, false);
        return rootView;
    }

    private void configuraTextView()
    {
        TextView tvTelaResumoCinematica1501 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_15_01);
        TextView tvTelaResumoCinematica1502 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_15_02);

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumoCinematica1501.setTypeface(font);
        tvTelaResumoCinematica1502.setTypeface(font);

        tvTelaResumoCinematica1501.setText(Html.fromHtml("<p>Para se analisar gráficos devemos primeiramente olhar quais são as variáveis.</p>"));
        tvTelaResumoCinematica1502.setText(Html.fromHtml("<p>Análise de gráficos:</p>" +
                "<p>Em um gráfico Sxt, para um movimento uniforme, o gráfico é uma reta e representa a velocidade, podendo ser crescente (+V) ou decrescente (-V)</p>" +
                "<p>Em um gráfico Vxt a área do gráfico representa o espaço percorrido.</p>"));
    }
}
