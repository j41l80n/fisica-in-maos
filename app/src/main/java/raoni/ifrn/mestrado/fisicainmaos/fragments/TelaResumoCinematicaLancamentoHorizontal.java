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

public class TelaResumoCinematicaLancamentoHorizontal extends Fragment
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
        rootView = inflater.inflate(R.layout.tela_resumo_cinematica_lancamento_horizontal, container, false);
        return rootView;
    }

    private void configuraTextView()
    {
        TextView tvTelaResumoCinematica1201 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_12_01);

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumoCinematica1201.setTypeface(font);

        tvTelaResumoCinematica1201.setText(Html.fromHtml("<p>Dois movimento simultâneos e independentes, um de queda livre na vertical e um de M.R.U na horizontal. A trajetória do movimento descrito é um arco de parábola.</p>" +
                "<p>Usa-se as mesmas equações de M.R.U e de queda livre.</p>" +
                "<p>Consideremos ΔS como sendo o alcance A.</p>"));
    }
}
