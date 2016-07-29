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

public class TelaResumoHidrostaticaTeoremaStevin extends Fragment
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
        rootView = inflater.inflate(R.layout.tela_resumo_hidrostatica_teorema_stevin, container, false);
        return rootView;
    }

    private void configuraTextView()
    {
        TextView tvTelaResumopressao01 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrostatica_teorema_stevin_01);

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumopressao01.setTypeface(font);

        tvTelaResumopressao01.setText(Html.fromHtml("<h4>Teorema de Stevin</h4>" +
                "<p><b>&ldquo;A diferença de pressão entre dois pontos no interior de um líquido é diretamente proporcional ao desnível vertical " +
                "entre eles, em relação à superfície livre de um líquido&rdquo;.</b></p>"));
    }
}
