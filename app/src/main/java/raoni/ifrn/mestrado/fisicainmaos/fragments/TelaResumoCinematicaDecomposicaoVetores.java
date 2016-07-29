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

public class TelaResumoCinematicaDecomposicaoVetores extends Fragment
{
    private TextView tvTelaResumoCinematica0401;
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
        rootView = inflater.inflate(R.layout.tela_resumo_cinematica_decomposicao_vetores, container, false);
        return rootView;
    }

    private void configuraTextView()
    {
        tvTelaResumoCinematica0401 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_04_01);

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumoCinematica0401.setTypeface(font);

        tvTelaResumoCinematica0401.setText(Html.fromHtml("Podemos calcular <b>Ay</b> e <b>Ax</b>:"));
    }
}
