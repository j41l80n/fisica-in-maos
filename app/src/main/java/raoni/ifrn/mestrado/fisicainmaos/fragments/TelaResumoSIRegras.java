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

public class TelaResumoSIRegras extends Fragment
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
        rootView = inflater.inflate(R.layout.tela_resumo_si_regras, container, false);
        return rootView;
    }

    private void configuraTextView()
    {
        TextView tvTelaResumoLesKepler01 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_si_regras_01);

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumoLesKepler01.setTypeface(font);

        tvTelaResumoLesKepler01.setText(Html.fromHtml("<h4>Regras para se escrever unidades</h4>" +
                "<p>As unidades não são abreviações, são símbolos.</p>" +
                "<p>Ex.: ltrs (l)</p>" +
                "<p>Não deve seguir o símbolo de ponto.</p>" +
                "<p>Ex.: min.</p>" +
                "<p>Os símbolos são invariáveis e não devem ser seguidos de s, quando no plural.</p>" +
                "<p>Ex.: hs</p>" +
                "<p>Grama é uma grandeza masculina.</p>" +
                "<p>Ex.: Duzentos gramas de queijo</p>" +
                "<p>Só se escreve símbolo de unidade com letra maiúscula se a mesma faz menção a nome próprio.</p>" +
                "<p>Ex.: °C, K, A...</p>"));
    }
}
