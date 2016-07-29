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

public class TelaResumoDinamicaDinamica extends Fragment
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
        rootView = inflater.inflate(R.layout.tela_resumo_dinamica_dinamica, container, false);
        return rootView;
    }

    private void configuraTextView()
    {
        TextView tvTelaResumoDinamica01 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_9901);

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumoDinamica01.setTypeface(font);

        tvTelaResumoDinamica01.setText(Html.fromHtml("<p>É a parte da física que se preocupa em estudar as causas dos movimentos e seus possíveis efeitos.</p>"));
    }
}
