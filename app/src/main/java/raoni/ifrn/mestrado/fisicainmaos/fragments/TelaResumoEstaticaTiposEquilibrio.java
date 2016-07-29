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

public class TelaResumoEstaticaTiposEquilibrio extends Fragment
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
        rootView = inflater.inflate(R.layout.tela_resumo_estatica_tipos_de_equilibrio, container, false);
        return rootView;
    }

    private void configuraTextView()
    {
        TextView tvTelaResumoTiposEquilibrio01 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_estatica_tipos_equilibrio_01);
        TextView tvTelaResumoTiposEquilibrio02 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_estatica_tipos_equilibrio_02);
        TextView tvTelaResumoTiposEquilibrio03 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_estatica_tipos_equilibrio_03);

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumoTiposEquilibrio01.setTypeface(font);
        tvTelaResumoTiposEquilibrio02.setTypeface(font);
        tvTelaResumoTiposEquilibrio03.setTypeface(font);

        tvTelaResumoTiposEquilibrio01.setText(Html.fromHtml("<p>Estável:</p>"));
        tvTelaResumoTiposEquilibrio02.setText(Html.fromHtml("Instável:"));
        tvTelaResumoTiposEquilibrio03.setText(Html.fromHtml("Indiferente:"));
    }
}
