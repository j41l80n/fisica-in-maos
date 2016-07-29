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

public class TelaResumoGravitacaoEstacoesAno extends Fragment
{
    View rootView;

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        configuraTextView();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        rootView = inflater.inflate(R.layout.tela_resumo_gravitacao_estacoes_ano, container, false);
        return rootView;
    }

    private void configuraTextView()
    {
        TextView tvTelaResumoEstacoesAno01 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_gravitacao_estacoes_ano_01);

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumoEstacoesAno01.setTypeface(font);

        tvTelaResumoEstacoesAno01.setText(Html.fromHtml(
                "<p>As estações do ano ocorrem devido a inclinação do eixo de rotação da Terra em seu movimento de translação.</p>" +
                "<p>Cada estação dura aproximadamente 3 meses, seguindo como ordem: Primavera, Verão, Outono e Inverno. </p>" +
                "<p>As estações ocorrem aos pares e opostas nos hemisférios Norte e Sul. Quando é verão no hemisfério Sul é inverno no hemisfério Norte.</p>" +
                "<p>O Periélio e o Afélio <b>não</b> determinam as estações do ano.</p>"));

    }
}
