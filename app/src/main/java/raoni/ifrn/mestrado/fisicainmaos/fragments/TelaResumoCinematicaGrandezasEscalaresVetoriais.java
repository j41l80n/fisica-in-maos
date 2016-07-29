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

public class TelaResumoCinematicaGrandezasEscalaresVetoriais extends Fragment
{
    private TextView tvTelaResumoCinematica0201;
    private TextView tvTelaResumoCinematica0202;
    private TextView tvTelaResumoCinematica0203;
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
        rootView = inflater.inflate(R.layout.tela_resumo_cinematica_02, container, false);
        return rootView;
    }

    private void configuraTextView()
    {
        tvTelaResumoCinematica0201 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_02_01);
        tvTelaResumoCinematica0202 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_02_02);
        tvTelaResumoCinematica0203 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_02_03);

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumoCinematica0201.setTypeface(font);
        tvTelaResumoCinematica0202.setTypeface(font);
        tvTelaResumoCinematica0203.setTypeface(font);

        tvTelaResumoCinematica0201.setText(Html.fromHtml("<p><b>Escalares:</b> São aquelas que ficam perfeitamente caracterizadas com um número seguido de uma unidade. Ex.: Tempo, temperatura, área, volume, distância, etc.</p>\n" +
                "<p><b>Vetoriais:</b> São aquelas que, para compreendê-las, além do módulo, é necessário que o valor acompanhe uma direção e um sentido. Ex.: Deslocamento, velocidade, aceleração, força, impulso, etc.</p>\n" +
                "<p>Muito importante saber diferenciar distância e deslocamento</p>\n"));
        tvTelaResumoCinematica0202.setText(Html.fromHtml("<p><b>Vetor:</b> Segmento de reta utilizado para representar uma grandeza vetorial, onde o corpo da seta representa a direção e a ponta da seta o sentido.</p>"));
        tvTelaResumoCinematica0203.setText(Html.fromHtml("<p>No exemplo acima o módulo vale A, a direção é horizontal e o sentido para direita.</p>\n" +
                "<p>Para o vetor aceleração da gravidade temos:</p>\n" +
                "<p><b>Módulo:</b> 10m/s²</p>\n" +
                "<p><b>Direção:</b> Vertical</p>" +
                "<p><b>Sentido:</b> Para baixo</p>\n"));
    }
}
