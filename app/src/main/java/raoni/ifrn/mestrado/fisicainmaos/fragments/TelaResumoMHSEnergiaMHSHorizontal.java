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

public class TelaResumoMHSEnergiaMHSHorizontal extends Fragment
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
        rootView = inflater.inflate(R.layout.tela_resumo_mhs_energia_mhs_horizontal, container, false);
        return rootView;
    }

    private void configuraTextView()
    {
        TextView tvTelaResumoLesKepler01 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_mhs_energia_mhs_horizontal_01);
        TextView tvTelaResumoLesKepler02 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_mhs_energia_mhs_horizontal_02);

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumoLesKepler01.setTypeface(font);
        tvTelaResumoLesKepler02.setTypeface(font);

        tvTelaResumoLesKepler01.setText(Html.fromHtml(""));
        tvTelaResumoLesKepler02.setText(Html.fromHtml("<p>\t<b>Obs.:</b> A energia mecânica do sistema se conserva.</p>"));
    }
}
