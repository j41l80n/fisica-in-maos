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

public class TelaResumoSISI extends Fragment
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
        rootView = inflater.inflate(R.layout.tela_resumo_si_si, container, false);
        return rootView;
    }

    private void configuraTextView()
    {
        TextView tvTelaResumoLesKepler01 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_si_si_01);
        TextView tvTelaResumoLesKepler02 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_si_si_02);
        TextView tvTelaResumoLesKepler03 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_si_si_03);

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumoLesKepler01.setTypeface(font);
        tvTelaResumoLesKepler02.setTypeface(font);
        tvTelaResumoLesKepler03.setTypeface(font);

        tvTelaResumoLesKepler01.setText(Html.fromHtml("<p>Desde antigamente os reinos possuíam " +
                "suas formas de medição, porém com" +
                " o passar dos tempos e com a união dos povos apresentaram-se problemas na " +
                "utilização das diversas medidas. Para corrigir isso em 1971, a conferência " +
                "geral dos pesos e medidas(CGPM) criou o sistema internacional de unidades(SI). " +
                "Nessa conferência(14°), foram selecionadas as unidades básicas do SI: " +
                "Comprimento(m), massa(kg), tempo(s), corrente elétrica(A), temperatura(K)," +
                " quantidade de matéria(mol) e intensidade luminosa(cd). Assim foram" +
                " estabelecidos os símbolos, unidades e prefixos.</p>"));

        tvTelaResumoLesKepler02.setText(Html.fromHtml("<p>Prefixos de unidades</p>"));

        TextView tvUnidades01 = (TextView) rootView.findViewById(R.id.si_01);
        TextView tvUnidades02 = (TextView) rootView.findViewById(R.id.si_02);
        TextView tvUnidades03 = (TextView) rootView.findViewById(R.id.si_03);
        TextView tvUnidades04 = (TextView) rootView.findViewById(R.id.si_04);
        TextView tvUnidades05 = (TextView) rootView.findViewById(R.id.si_05);
        TextView tvUnidades06 = (TextView) rootView.findViewById(R.id.si_06);
        TextView tvUnidades07 = (TextView) rootView.findViewById(R.id.si_07);
        TextView tvUnidades08 = (TextView) rootView.findViewById(R.id.si_08);
        TextView tvUnidades09 = (TextView) rootView.findViewById(R.id.si_09);
        TextView tvUnidades10 = (TextView) rootView.findViewById(R.id.si_10);
        TextView tvUnidades11 = (TextView) rootView.findViewById(R.id.si_11);
        TextView tvUnidades12 = (TextView) rootView.findViewById(R.id.si_12);
        TextView tvUnidades13 = (TextView) rootView.findViewById(R.id.si_13);
        TextView tvUnidades14 = (TextView) rootView.findViewById(R.id.si_14);
        TextView tvUnidades15 = (TextView) rootView.findViewById(R.id.si_15);
        TextView tvUnidades16 = (TextView) rootView.findViewById(R.id.si_16);
        TextView tvUnidades17 = (TextView) rootView.findViewById(R.id.si_17);
        TextView tvUnidades18 = (TextView) rootView.findViewById(R.id.si_18);
        TextView tvUnidades19 = (TextView) rootView.findViewById(R.id.si_19);
        TextView tvUnidades20 = (TextView) rootView.findViewById(R.id.si_20);
        TextView tvUnidades21 = (TextView) rootView.findViewById(R.id.si_21);
        TextView tvUnidades22 = (TextView) rootView.findViewById(R.id.si_22);
        TextView tvUnidades23 = (TextView) rootView.findViewById(R.id.si_23);
        TextView tvUnidades24 = (TextView) rootView.findViewById(R.id.si_24);
        TextView tvUnidades25 = (TextView) rootView.findViewById(R.id.si_25);
        TextView tvUnidades26 = (TextView) rootView.findViewById(R.id.si_26);
        TextView tvUnidades27 = (TextView) rootView.findViewById(R.id.si_27);
        TextView tvUnidades28 = (TextView) rootView.findViewById(R.id.si_28);
        TextView tvUnidades29 = (TextView) rootView.findViewById(R.id.si_29);
        TextView tvUnidades30 = (TextView) rootView.findViewById(R.id.si_30);
        TextView tvUnidades31 = (TextView) rootView.findViewById(R.id.si_31);
        TextView tvUnidades32 = (TextView) rootView.findViewById(R.id.si_32);
        TextView tvUnidades33 = (TextView) rootView.findViewById(R.id.si_33);
        TextView tvUnidades34 = (TextView) rootView.findViewById(R.id.si_34);
        TextView tvUnidades35 = (TextView) rootView.findViewById(R.id.si_35);
        TextView tvUnidades36 = (TextView) rootView.findViewById(R.id.si_36);
        TextView tvUnidades37 = (TextView) rootView.findViewById(R.id.si_37);
        TextView tvUnidades38 = (TextView) rootView.findViewById(R.id.si_38);
        TextView tvUnidades39 = (TextView) rootView.findViewById(R.id.si_39);
        TextView tvUnidades40 = (TextView) rootView.findViewById(R.id.si_40);
        TextView tvUnidades41 = (TextView) rootView.findViewById(R.id.si_41);
        TextView tvUnidades42 = (TextView) rootView.findViewById(R.id.si_42);

        tvUnidades01.setText(Html.fromHtml(" Metro (m)"));
        tvUnidades02.setText(Html.fromHtml(" Metro quadrado (m<sup>2</sup>)"));
        tvUnidades03.setText(Html.fromHtml(" Metro cúbico (m<sup>3</sup>)"));
        tvUnidades04.setText(Html.fromHtml(" Segundo (s)"));
        tvUnidades05.setText(Html.fromHtml(" Hertz (Hz)"));
        tvUnidades06.setText(Html.fromHtml(" Metros/segundo (m/s)"));
        tvUnidades07.setText(Html.fromHtml(" Metros/segundo<sup>2</sup> (m/s<sup>2</sup>)"));
        tvUnidades08.setText(Html.fromHtml(" Quilograma (kg)"));
        tvUnidades09.setText(Html.fromHtml(" Coulomb (C)"));
        tvUnidades10.setText(Html.fromHtml(" Volts (V)"));
        tvUnidades11.setText(Html.fromHtml(" Ohm (&Omega;)"));
        tvUnidades12.setText(Html.fromHtml(" Quilograma/metro<sup>3</sup> (kg/m<sup>3</sup>)"));
        tvUnidades13.setText(Html.fromHtml(" Metros<sup>3</sup>/segundo (m<sup>3</sup>/s)"));
        tvUnidades14.setText(Html.fromHtml(" Mols (mol)"));
        tvUnidades15.setText(Html.fromHtml(" Newton (N)"));
        tvUnidades16.setText(Html.fromHtml(" Pascal (Pa)"));
        tvUnidades17.setText(Html.fromHtml(" Joule (J)"));
        tvUnidades18.setText(Html.fromHtml(" Watt (W)"));
        tvUnidades19.setText(Html.fromHtml(" Ampère (A)"));
        tvUnidades20.setText(Html.fromHtml(" Farad (F)"));
        tvUnidades21.setText(Html.fromHtml(" Kelvin (K)"));
        tvUnidades22.setText(Html.fromHtml(" Candela (cd)"));

        tvUnidades23.setText(Html.fromHtml(" 10<sup>-1</sup>"));
        tvUnidades24.setText(Html.fromHtml(" 10<sup>-2</sup>"));
        tvUnidades25.setText(Html.fromHtml(" 10<sup>-3</sup>"));
        tvUnidades26.setText(Html.fromHtml(" 10<sup>-6</sup>"));
        tvUnidades27.setText(Html.fromHtml(" 10<sup>-9</sup>"));
        tvUnidades28.setText(Html.fromHtml(" 10<sup>-12</sup>"));
        tvUnidades29.setText(Html.fromHtml(" 10<sup>-15</sup>"));
        tvUnidades30.setText(Html.fromHtml(" 10<sup>-18</sup>"));
        tvUnidades31.setText(Html.fromHtml(" 10<sup>-21</sup>"));
        tvUnidades32.setText(Html.fromHtml(" 10<sup>-42</sup>"));

        tvUnidades33.setText(Html.fromHtml(" 10<sup>1</sup>"));
        tvUnidades34.setText(Html.fromHtml(" 10<sup>2</sup>"));
        tvUnidades35.setText(Html.fromHtml(" 10<sup>3</sup>"));
        tvUnidades36.setText(Html.fromHtml(" 10<sup>6</sup>"));
        tvUnidades37.setText(Html.fromHtml(" 10<sup>9</sup>"));
        tvUnidades38.setText(Html.fromHtml(" 10<sup>12</sup>"));
        tvUnidades39.setText(Html.fromHtml(" 10<sup>15</sup>"));
        tvUnidades40.setText(Html.fromHtml(" 10<sup>18</sup>"));
        tvUnidades41.setText(Html.fromHtml(" 10<sup>21</sup>"));
        tvUnidades42.setText(Html.fromHtml(" 10<sup>24</sup>"));

    }
}
