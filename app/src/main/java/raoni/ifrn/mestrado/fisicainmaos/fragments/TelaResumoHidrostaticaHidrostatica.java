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

public class TelaResumoHidrostaticaHidrostatica extends Fragment
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
        rootView = inflater.inflate(R.layout.tela_resumo_hidrostatica_hidrostatica, container, false);
        return rootView;
    }

    private void configuraTextView()
    {
        TextView tvTelaResumoHidrostatica01 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrostatica_hidrostatica_01);

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumoHidrostatica01.setTypeface(font);

        tvTelaResumoHidrostatica01.setText(Html.fromHtml("<p>Estuda os flúidos em equilíbrio. </p>"));
    }
}
