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

public class TelaResumoMHSSistemaMassaMola extends Fragment
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
        rootView = inflater.inflate(R.layout.tela_resumo_mhs_sistema_massa_mola, container, false);
        return rootView;
    }

    private void configuraTextView()
    {
        TextView tvTelaResumoLesKepler01 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_mhs_sistema_massa_mola_01);
        TextView tvTelaResumoLesKepler02 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_mhs_sistema_massa_mola_02);
        TextView tvTelaResumoLesKepler03 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_mhs_sistema_massa_mola_03);

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumoLesKepler01.setTypeface(font);
        tvTelaResumoLesKepler02.setTypeface(font);
        tvTelaResumoLesKepler03.setTypeface(font);

        tvTelaResumoLesKepler01.setText(Html.fromHtml(
                "<p>\tUm corpo de massa m realiza um MHS quando oscila periodicamente em torno" +
                        " de uma posição de equilíbrio, sob ação de uma força restauradora (força " +
                        "elástica), que aponta para aposição x = 0 de equilíbrio.</p>" +
                "<p>\t<b>F<sub>el</sub> = Kx </b>(Lei de Hooke)</p>"));
        tvTelaResumoLesKepler02.setText(Html.fromHtml("<p>\tA mola possui uma força restauradora" +
                " máxima nos pontos x1 e x2, nesses pontos as deformações são iguais às amplitudes. </p>" +
                "<p>\tNas amplitudes +A e –A, ocorre inversão de sentido e as velocidades se anulam.</p>" +
                "<p>\tNa passagem do bloco pela posição de equilíbrio a velocidade é máxima, em módulo.</p>" +
                "<p>\tO período desse <b>MHS</b> é dado por:</p>"));
        tvTelaResumoLesKepler03.setText(Html.fromHtml("<p>\t<b>m</b> = massa</p>" +
                "<p>\t<b>k</b> = constante molar</p>" +
                "<p>\t<b>m</b> = massa</p>"));
    }
}
