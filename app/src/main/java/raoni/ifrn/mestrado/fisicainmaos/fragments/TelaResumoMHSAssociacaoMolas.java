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

public class TelaResumoMHSAssociacaoMolas extends Fragment
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
        rootView = inflater.inflate(R.layout.tela_resumo_mhs_associacao_molas, container, false);
        return rootView;
    }

    private void configuraTextView()
    {
        TextView tvTelaResumoAssociacaoMolas01 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_mhs_associacao_molas_01);
        TextView tvTelaResumoAssociacaoMolas02 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_mhs_associacao_molas_02);
        TextView tvTelaResumoAssociacaoMolas03 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_mhs_associacao_molas_03);

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumoAssociacaoMolas01.setTypeface(font);
        tvTelaResumoAssociacaoMolas02.setTypeface(font);
        tvTelaResumoAssociacaoMolas03.setTypeface(font);

        tvTelaResumoAssociacaoMolas01.setText(Html.fromHtml(
                "<p>\tParalelo: A deformação x sofrida por cada mola é a mesma.</p>"));
        tvTelaResumoAssociacaoMolas02.setText(Html.fromHtml("<p>\tF<sub>eq</sub> = F<sub>1</sub> + F<sub>2</sub>, onde K<sub>eq</sub> = K<sub>1</sub> + K<sub>2</sub></p>" +
                "<p>\tSérie: As molas ficam submetidas a uma mesma força F, portanto sofrem deformações diferentes.</p>"));
        tvTelaResumoAssociacaoMolas03.setText(Html.fromHtml("<p>\tComo  a deformação x = x<sub>1</sub> + x<sub>2</sub></p>"));
    }
}