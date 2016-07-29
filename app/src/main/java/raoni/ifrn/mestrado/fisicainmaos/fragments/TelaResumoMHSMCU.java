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

public class TelaResumoMHSMCU extends Fragment
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
        rootView = inflater.inflate(R.layout.tela_resumo_mhs_mcu, container, false);
        return rootView;
    }

    private void configuraTextView()
    {
        TextView tvTelaResumoLesKepler01 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_mhs_mcu_01);
        TextView tvTelaResumoLesKepler02 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_mhs_mcu_02);
        TextView tvTelaResumoLesKepler03 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_mhs_mcu_03);
        TextView tvTelaResumoLesKepler04 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_mhs_mcu_04);

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumoLesKepler01.setTypeface(font);
        tvTelaResumoLesKepler02.setTypeface(font);
        tvTelaResumoLesKepler03.setTypeface(font);
        tvTelaResumoLesKepler04.setTypeface(font);

        tvTelaResumoLesKepler01.setText(Html.fromHtml(
                "<p>\tPodemos generalizar o MHS como sendo uma projeção ortogonal do MCU sobre uma reta.</p>"));
        tvTelaResumoLesKepler02.setText(Html.fromHtml("<p>\tObserve na figura acima que quando o objeto se mover no " +
                "sentido anti-horário, entre t<sub>0</sub> e t<sub>4</sub>, sua posição sobre o eixo x se desloca" +
                " para esquerda em movimento retrógrado e quando se move do ponto t<sub>4</sub> para o t<sub>8</sub>," +
                " sua projeção se move para direita, em movimento progressivo. Um período completo se dá em t<sub>8</sub>.</p>" +
                "<p>\tO mesmo é válido em relação ao eixo y, na vertical.</p>" +
                "<p>\t<b>Definições:</b></p>" +
                "<p>\tElongação (x) = Posição da partícula em MHS sobre o eixo x.</p>" +
                "<p>\tAmplitude (A) = Elongação máxima. Corresponde ao raio da circunferência.</p>" +
                "<p>\tPeríodo (T): É o tempo necessário para uma oscilação completa.</p>" +
                "<p>\tFrequência (f): É o número de oscilações por unidade de tempo.</p>" +
                "<p>\tÂngulo de fase (ϕ): Indica a posição angular do corpo em MCU, medido em radianos.</p>" +
                "<p>\tVelocidade angular ou pulsação (ω): Mede o ângulo varrido por unidade de tempo.</p>"));
        tvTelaResumoLesKepler03.setText(Html.fromHtml("<p>\tFunção horária de elongação:</p>" +
                "<p>\tNo triângulo abaixo OPQ a elongação x é dada por:</p>"));
        tvTelaResumoLesKepler04.setText(Html.fromHtml("<p>\tSendo &phi; = &phi;<sub>0</sub> + &omega;t</p>" +
                "<p>\tTemos: <i>x</i> = A.cos(&phi;<sub>0</sub> + &omega;t)</p>" +
                "<p>\tO mesmo é válido se x for colocado na vertical:</p>"));
    }
}
