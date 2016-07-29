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

public class TelaResumoGravitacaoMares extends Fragment
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
        rootView = inflater.inflate(R.layout.tela_resumo_gravitacao_mares, container, false);
        return rootView;
    }

    private void configuraTextView()
    {
        TextView tvTelaResumoMares01 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_gravitacao_mares_01);

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumoMares01.setTypeface(font);

        tvTelaResumoMares01.setText(Html.fromHtml("<p>As marés são fluxo e refluxo da água e" +
                " ocorrem devido a força de atração gravitacional da Lua e secundariamente do Sol " +
                "sobre a Terra.</p> <p>Durante 24h ocorrem 4 marés, duas altas e duas baixas, " +
                "intercaladas em um intervalo de tempo de 6h.</p><p>As maiores marés ocorrem " +
                "quando estão alinhados a Terra, o Sol e a Lua (Lua cheia e Lua nova).</p>"));
    }
}
