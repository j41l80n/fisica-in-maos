package raoni.ifrn.mestrado.fisicainmaos.fragments;

import android.app.Activity;
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

public class TelaResumoHidrodinamicaHidrodinamica extends Fragment
{
    private View rootView;

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        rootView = inflater.inflate(R.layout.tela_resumo_hidrodinamica_hidrodinamica, container, false);
        configuraTextView();
        return rootView;
    }

    private void configuraTextView()
    {
        TextView tvTelaResumoHidrodinamica01 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrodinamica_hidrodinamica_01);

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumoHidrodinamica01.setTypeface(font);

        tvTelaResumoHidrodinamica01.setText(Html.fromHtml(
                "<p>Estudo dos fluidos em movimento.</p>" +
                "<p>Nesse movimento o fluido pode apresentar velocidade diferente, em diferentes pontos, ou constante.</p>" +
                "<p>Para facilitar nosso estudo consideraremos o fluido como sendo:</p>" +
                "<p>- Ideal (incompressível) ;</p>" +
                "<p>- Não viscoso (atrito interno nulo);</p>" +
                "<p>- Estacionário (velocidade constante em cada ponto);</p>" +
                "<p>- Irrotacional (não há movimento de rotação no fluido).</p>"));
    }

    @Override
    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        //
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        //
    }

    @Override
    public void onStart()
    {
        super.onStart();
        //
    }

    @Override
    public void onResume()
    {
        super.onResume();
        //
    }
}
