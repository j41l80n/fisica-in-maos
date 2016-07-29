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

public class TelaResumoCinematicaOperacoesVetores extends Fragment
{
    private TextView tvTelaResumoCinematica0301;
    private TextView tvTelaResumoCinematica0302;
    private TextView tvTelaResumoCinematica0303;
    private TextView tvTelaResumoCinematica0304;
    private TextView tvTelaResumoCinematica0305;
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
        rootView = inflater.inflate(R.layout.tela_resumo_cinematica_operacoes_vetores, container, false);
        return rootView;
    }

    private void configuraTextView()
    {
        tvTelaResumoCinematica0301 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_03_01);
        tvTelaResumoCinematica0302 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_03_02);
        tvTelaResumoCinematica0303 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_03_03);
        tvTelaResumoCinematica0304 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_03_04);
        tvTelaResumoCinematica0305 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_03_05);

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumoCinematica0301.setTypeface(font);
        tvTelaResumoCinematica0302.setTypeface(font);
        tvTelaResumoCinematica0303.setTypeface(font);
        tvTelaResumoCinematica0304.setTypeface(font);
        tvTelaResumoCinematica0305.setTypeface(font);

        tvTelaResumoCinematica0301.setText(Html.fromHtml("<p><b>Soma:</b> Vetores na mesma direção " +
                "e mesmo sentido.</p>"));
        tvTelaResumoCinematica0302.setText(Html.fromHtml("<p><b>Subtração:</b> Vetores na mesma " +
                "direção e sentidos contrários. </p>"));
        tvTelaResumoCinematica0303.setText(Html.fromHtml("<p>Vetores perpendiculares: </p>"));
        tvTelaResumoCinematica0304.setText(Html.fromHtml("<p>Regra do paralelogramo:</p>"));
        tvTelaResumoCinematica0305.setText(Html.fromHtml("<p><b>Para ângulos menores que 90&deg;</b> " +
                "(0° &lt; &theta; &lt; 90&deg;): R<sup>2</sup> = a<sup>2</sup> + b<sup>2</sup> + " +
                "2.a.b.cos&theta;<p>" +
                "<p><b>Para ângulos maiores que 90&deg;</b> (90&deg; &lt; &theta; &lt; 180&deg;):" +
                " R<sup>2</sup> = a<sup>2</sup> + b<sup>2</sup> - 2.a.b.|Cos&theta;|<p>"));

    }
}
