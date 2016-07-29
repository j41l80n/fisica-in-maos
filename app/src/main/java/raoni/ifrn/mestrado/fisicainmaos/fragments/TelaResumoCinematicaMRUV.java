package raoni.ifrn.mestrado.fisicainmaos.fragments;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.Html;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import raoni.ifrn.mestrado.fisicainmaos.R;

public class TelaResumoCinematicaMRUV extends Fragment
{

    private View rootView;

    //1
    private EditText aceleracao;
    private EditText variacaoVelocidade;
    private EditText variacaoTempo;
    //2
    private EditText velocidade;
    private EditText velocidadeInicial;
    private EditText aceleracao02;
    private EditText tempo;
    //3
    private EditText espacoFinal;
    private EditText espacoIinicial;
    private EditText velocidadeinicial02;
    private EditText tempo02;
    private EditText aceleracao03;
    //4
    private EditText velocidadeFinal;
    private EditText velocidadeInicial03;
    private EditText aceleracao04;
    private EditText variacaoEspaco;

    private TextView tvExtra1;
    private TextView tvExtra2;
    private TextView tvExtra3;
    private TextView tvExtra4;

    private TextView tvExtraUnidades1;
    private TextView tvExtraUnidades2;
    private TextView tvExtraUnidades3;
    private TextView tvExtraUnidades4;
    private TextView tvExtraUnidades5;
    private TextView tvExtraUnidades6;
    private TextView tvExtraUnidades7;
    private TextView tvExtraUnidades8;
    private TextView tvExtraUnidades9;
    private TextView tvExtraUnidades10;
    private TextView tvExtraUnidades11;
    private TextView tvExtraUnidades12;
    private TextView tvExtraUnidades13;
    private TextView tvExtraUnidades14;
    private TextView tvExtraUnidades15;
    private TextView tvExtraUnidades16;

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        configuraTextView();
        configuraEditText();
        //1
        variacaoVelocidadePressed();
        variacaoTempoPressed();
        aceleracaoPressed();
        //2
        velocidadeInicialPressed();
        velocidadePressed();
        aceleracao02Pressed();
        tempoPressed();
        //3
        espacoFinalPressed();
        espacoIinicialPressed();
        velocidadeinicial02Pressed();
        aceleracao03Pressed();
        //4
        velocidadeFinalPressed();
        velocidadeInicial03Pressed();
        aceleracao04Pressed();
        variacaoEspacoPressed();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        rootView = inflater.inflate(R.layout.tela_resumo_cinematica_mruv, container, false);
        return rootView;
    }

    private void configuraTextView()
    {
        TextView tvTelaResumoCinematica0901 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_09_01);
        TextView tvTelaResumoCinematica0902 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_09_02);
        TextView tvTelaResumoCinematica0903 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_09_03);
        TextView tvTelaResumoCinematica0904 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_09_04);
        TextView tvTelaResumoCinematica0905 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_09_05);
        TextView tvTelaResumoCinematica0907 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_09_07);
        TextView tvTelaResumoCinematica0908 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_09_08);
        TextView tvTelaResumoCinematica0909 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_09_09);
        TextView tvTelaResumoCinematica0910 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_09_10);
        TextView tvTelaResumoCinematica0911 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_09_11);
        TextView tvTelaResumoCinematica0912 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_09_12);
        TextView tvTelaResumoCinematica0913 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_09_13);
        TextView tvTelaResumoCinematica0914 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_09_14);
        TextView tvTelaResumoCinematica0915 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_09_15);
        TextView tvTelaResumoCinematica0916 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_09_16);
        TextView tvTelaResumoCinematica0917 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_09_17);
        TextView tvTelaResumoCinematica0918 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_09_18);
        TextView tvTelaResumoCinematica0919 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_09_19);
        TextView tvTelaResumoCinematica0921 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_09_21);
        TextView tvTelaResumoCinematica0922 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_09_22);
        TextView tvTelaResumoCinematica0923 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_09_23);
        TextView tvTelaResumoCinematica0924 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_09_24);
        TextView tvTelaResumoCinematica0925 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_09_25);

        tvExtra1 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_09_01_extra);
        tvExtra2 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_09_02_extra);
        tvExtra3 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_09_03_extra);
        tvExtra4 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_09_04_extra);

        tvExtraUnidades1 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_09_unidades_001);
        tvExtraUnidades2 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_09_unidades_002);
        tvExtraUnidades3 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_09_unidades_003);
        tvExtraUnidades4 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_09_unidades_004);
        tvExtraUnidades5 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_09_unidades_005);
        tvExtraUnidades6 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_09_unidades_006);
        tvExtraUnidades7 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_09_unidades_007);
        tvExtraUnidades8 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_09_unidades_008);
        tvExtraUnidades9 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_09_unidades_009);
        tvExtraUnidades10 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_09_unidades_010);
        tvExtraUnidades11 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_09_unidades_011);
        tvExtraUnidades12 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_09_unidades_012);
        tvExtraUnidades13 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_09_unidades_013);
        tvExtraUnidades14 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_09_unidades_014);
        tvExtraUnidades15 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_09_unidades_015);
        tvExtraUnidades16 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_09_unidades_016);

        tvExtraUnidades1.setText(Html.fromHtml(" m/s<sup>2</sup>"));
        tvExtraUnidades2.setText(Html.fromHtml(" m/s"));
        tvExtraUnidades3.setText(Html.fromHtml(" s"));
        tvExtraUnidades4.setText(Html.fromHtml(" m/s"));
        tvExtraUnidades5.setText(Html.fromHtml(" m/s"));
        tvExtraUnidades6.setText(Html.fromHtml(" m/s<sup>2</sup>"));
        tvExtraUnidades7.setText(Html.fromHtml(" s"));
        tvExtraUnidades8.setText(Html.fromHtml(" m"));
        tvExtraUnidades9.setText(Html.fromHtml(" m"));
        tvExtraUnidades10.setText(Html.fromHtml(" m/s"));
        tvExtraUnidades11.setText(Html.fromHtml(" s"));
        tvExtraUnidades12.setText(Html.fromHtml(" m/s<sup>2</sup>"));
        tvExtraUnidades13.setText(Html.fromHtml(" m/s"));
        tvExtraUnidades14.setText(Html.fromHtml(" m/s"));
        tvExtraUnidades15.setText(Html.fromHtml(" m/s<sup>2</sup>"));
        tvExtraUnidades16.setText(Html.fromHtml(" m"));

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumoCinematica0901.setTypeface(font);
        tvTelaResumoCinematica0902.setTypeface(font);
        tvTelaResumoCinematica0903.setTypeface(font);
        tvTelaResumoCinematica0904.setTypeface(font);
        tvTelaResumoCinematica0905.setTypeface(font);
        tvTelaResumoCinematica0907.setTypeface(font);
        tvTelaResumoCinematica0908.setTypeface(font);
        tvTelaResumoCinematica0909.setTypeface(font);
        tvTelaResumoCinematica0910.setTypeface(font);
        tvTelaResumoCinematica0911.setTypeface(font);
        tvTelaResumoCinematica0912.setTypeface(font);
        tvTelaResumoCinematica0913.setTypeface(font);
        tvTelaResumoCinematica0914.setTypeface(font);
        tvTelaResumoCinematica0915.setTypeface(font);
        tvTelaResumoCinematica0916.setTypeface(font);
        tvTelaResumoCinematica0917.setTypeface(font);
        tvTelaResumoCinematica0918.setTypeface(font);
        tvTelaResumoCinematica0919.setTypeface(font);
        tvTelaResumoCinematica0921.setTypeface(font);
        tvTelaResumoCinematica0922.setTypeface(font);
        tvTelaResumoCinematica0923.setTypeface(font);
        tvTelaResumoCinematica0924.setTypeface(font);
        tvTelaResumoCinematica0925.setTypeface(font);

        tvTelaResumoCinematica0901.setText(Html.fromHtml("<p>Movimento em linha reta no qual a " +
                "velocidade do corpo varia uniformemente (aceleração constante).</p>"));

        tvTelaResumoCinematica0902.setText(Html.fromHtml("<p><b>Aceleração:</b> Rapidez com que" +
                " a velocidade de um corpo varia.</p>"));
        tvTelaResumoCinematica0903.setText(Html.fromHtml("Aceleração (<i>a</i>)"));
        tvTelaResumoCinematica0904.setText(Html.fromHtml("Variação de velocidade (∆<i>V</i>) "));
        tvTelaResumoCinematica0905.setText(Html.fromHtml("Variação de tempo (∆<i>t</i>) "));
        tvTelaResumoCinematica0907.setText(Html.fromHtml("<p>Movimento acelerado " +
                "(velocidade aumenta): Quando os sinais da velocidade e aceleração são iguais =>" +
                " -a e –v ou +a e +v</p><p>Movimento retardado (velocidade diminui): Quando os" +
                " sinais da velocidade e aceleração são diferentes => -a e +v ou +a e –v</p>"));
        tvTelaResumoCinematica0908.setText(Html.fromHtml("<p>-a = movimento retardado " +
                "(velocidade diminui)</p>"));
        tvTelaResumoCinematica0909.setText(Html.fromHtml("Equação horária da velocidade: "));
        tvTelaResumoCinematica0910.setText(Html.fromHtml("Velocidade (<i>V</i>) "));
        tvTelaResumoCinematica0911.setText(Html.fromHtml("Velocidade inicial (<i>V</i><sub>0</sub>)"));
        tvTelaResumoCinematica0912.setText(Html.fromHtml("Aceleração (<i>a</i>)"));
        tvTelaResumoCinematica0913.setText(Html.fromHtml("Tempo (<i>t</i>)"));
        tvTelaResumoCinematica0914.setText(Html.fromHtml("<b>Função horária do espaço: "));
        tvTelaResumoCinematica0915.setText(Html.fromHtml("Espaço final (S) "));
        tvTelaResumoCinematica0916.setText(Html.fromHtml("Espaço inicial (S<sub>0</sub>)"));
        tvTelaResumoCinematica0917.setText(Html.fromHtml("Velocidade inicial (V<sub>0</sub>) "));
        tvTelaResumoCinematica0918.setText(Html.fromHtml("Tempo (t) "));
        tvTelaResumoCinematica0919.setText(Html.fromHtml("Aceleração (a) "));
        tvTelaResumoCinematica0921.setText(Html.fromHtml("<b>Equação de Torricelli: "));
        tvTelaResumoCinematica0922.setText(Html.fromHtml("V = "));
        tvTelaResumoCinematica0923.setText(Html.fromHtml("V<sub>0</sub> = "));
        tvTelaResumoCinematica0924.setText(Html.fromHtml("a = "));
        tvTelaResumoCinematica0925.setText(Html.fromHtml("&Delta;S = "));
    }

    private void configuraEditText()
    {
        aceleracao = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_09_01);
        variacaoVelocidade = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_09_02);
        variacaoTempo = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_09_03);

        velocidade = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_09_05);
        velocidadeInicial = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_09_06);
        aceleracao02 = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_09_07);
        tempo = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_09_08);

        espacoFinal = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_09_09);
        espacoIinicial = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_09_10);
        velocidadeinicial02 = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_09_11);
        tempo02 = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_09_12);
        aceleracao03 = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_09_13);

        velocidadeFinal = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_09_15);
        velocidadeInicial03 = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_09_16);
        aceleracao04 = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_09_17);
        variacaoEspaco = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_09_18);
    }

    //1
    private double a(double delV, double delT)
    {
        //a = delV / delT
        return delV / delT;
    }

    private double delV(double a, double delT)
    {
        //a = a * delT
        return a * delT;
    }

    private double delT(double delV, double a)
    {
        //a = delV / a
        return delV / a;
    }

    private void variacaoVelocidadePressed()
    {
        variacaoVelocidade.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (variacaoVelocidade.getText().toString().equals(""))
                {
                    tvExtra1.setText("");
                    tvExtra1.setBackgroundResource(R.color.branco);
                    aceleracao.setEnabled(true);
                    variacaoTempo.setEnabled(true);
                }
                //calcula a
                else if(!variacaoVelocidade.getText().toString().equals("") &&
                        !variacaoTempo.getText().toString().equals(""))
                {
                    aceleracao.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setText(Html.fromHtml(a(
                            Double.parseDouble(variacaoVelocidade.getText().toString()),
                            Double.parseDouble(variacaoTempo.getText().toString()))
                            + " m/s<sup>2</sup>"));
                }
                //calcula delT
                else if(!variacaoVelocidade.getText().toString().equals("") &&
                        !aceleracao.getText().toString().equals(""))
                {
                    variacaoTempo.setEnabled(false);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setText(Html.fromHtml(delT(
                            Double.parseDouble(variacaoVelocidade.getText().toString()),
                            Double.parseDouble(aceleracao.getText().toString()))
                            + " s"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void variacaoTempoPressed()
    {
        variacaoTempo.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (variacaoTempo.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.color.branco);
                    tvExtra1.setText("");
                    aceleracao.setEnabled(true);
                    variacaoVelocidade.setEnabled(true);
                }
                //calcula a
                else if(!variacaoVelocidade.getText().toString().equals("") &&
                        !variacaoTempo.getText().toString().equals(""))
                {
                    aceleracao.setEnabled(false);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setText(Html.fromHtml(a(
                            Double.parseDouble(variacaoVelocidade.getText().toString()),
                            Double.parseDouble(variacaoTempo.getText().toString()))
                            + " m/s<sup>2</sup>"));
                }
                //calcula delV
                else if(!aceleracao.getText().toString().equals("") &&
                        !variacaoTempo.getText().toString().equals(""))
                {
                    variacaoVelocidade.setEnabled(false);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setText(Html.fromHtml(delV(
                            Double.parseDouble(aceleracao.getText().toString()),
                            Double.parseDouble(variacaoTempo.getText().toString()))
                            + " m/s"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void aceleracaoPressed()
    {
        aceleracao.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (aceleracao.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.color.branco);
                    tvExtra1.setText("");
                    variacaoTempo.setEnabled(true);
                    variacaoVelocidade.setEnabled(true);
                }
                //calcula delV
                else if(!aceleracao.getText().toString().equals("") &&
                        !variacaoTempo.getText().toString().equals(""))
                {
                    variacaoVelocidade.setEnabled(false);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setText(Html.fromHtml(delV(
                            Double.parseDouble(aceleracao.getText().toString()),
                            Double.parseDouble(variacaoTempo.getText().toString()))
                            + " m/s"));
                }//calcula delT
                else if(!variacaoVelocidade.getText().toString().equals("") &&
                        !aceleracao.getText().toString().equals(""))
                {
                    variacaoTempo.setEnabled(false);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setText(Html.fromHtml(delT(
                            Double.parseDouble(variacaoVelocidade.getText().toString()),
                            Double.parseDouble(aceleracao.getText().toString()))
                            + " s"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    //2
    private double v(double v0, double a, double t)
    {
        //v = v0 + (a * t)
        return v0 + (a * t);
    }

    private double v0(double v, double a, double t)
    {
        //v0 = v - (a * t)
        return v - (a * t);
    }

    private double a(double v, double v0, double t)
    {
        //a = (v - v0) / t
        return (v - v0) / t;
    }

    private double t(double v, double v0, double a)
    {
        //t = (v - v0) / a
        return (v - v0) / a;
    }

    private void velocidadeInicialPressed()
    {
        velocidadeInicial.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (velocidadeInicial.getText().toString().equals(""))
                {
                    tvExtra2.setBackgroundResource(R.color.branco);
                    tvExtra2.setText("");
                    velocidade.setEnabled(true);
                    aceleracao02.setEnabled(true);
                    tempo.setEnabled(true);
                }
                //calcula v
                else if(!velocidadeInicial.getText().toString().equals("") &&
                        !aceleracao02.getText().toString().equals("") &&
                        !tempo.getText().toString().equals(""))
                {
                    velocidade.setEnabled(false);
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra2.setText(Html.fromHtml(v(
                            Double.parseDouble(velocidadeInicial.getText().toString()),
                            Double.parseDouble(aceleracao02.getText().toString()),
                            Double.parseDouble(tempo.getText().toString())) + " m/s"));
                }
                //calcula a
                else if(!velocidade.getText().toString().equals("") &&
                        !velocidadeInicial.getText().toString().equals("") &&
                        !tempo.getText().toString().equals(""))
                {
                    aceleracao02.setEnabled(false);
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra2.setText(Html.fromHtml(a(
                            Double.parseDouble(velocidade.getText().toString()),
                            Double.parseDouble(velocidadeInicial.getText().toString()),
                            Double.parseDouble(tempo.getText().toString())) + " m/s<sup>2</sup>"));
                }
                //calcula t
                else if(!velocidade.getText().toString().equals("") &&
                        !velocidadeInicial.getText().toString().equals("") &&
                        !aceleracao02.getText().toString().equals(""))
                {
                    tempo.setEnabled(false);
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra2.setText(Html.fromHtml(t(
                            Double.parseDouble(velocidade.getText().toString()),
                            Double.parseDouble(velocidadeInicial.getText().toString()),
                            Double.parseDouble(aceleracao02.getText().toString())) + " s"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void velocidadePressed()
    {
        velocidade.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (velocidade.getText().toString().equals(""))
                {
                    tvExtra2.setBackgroundResource(R.color.branco);
                    tvExtra2.setText("");
                    velocidadeInicial.setEnabled(true);
                    aceleracao02.setEnabled(true);
                    tempo.setEnabled(true);
                }
                //calcula a
                else if(!velocidade.getText().toString().equals("") &&
                        !velocidadeInicial.getText().toString().equals("") &&
                        !tempo.getText().toString().equals(""))
                {
                    aceleracao02.setEnabled(false);
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra2.setText(Html.fromHtml(a(
                            Double.parseDouble(velocidade.getText().toString()),
                            Double.parseDouble(velocidadeInicial.getText().toString()),
                            Double.parseDouble(tempo.getText().toString())) + " m/s<sup>2</sup>"));
                }
                //calcula t
                else if(!velocidade.getText().toString().equals("") &&
                        !velocidadeInicial.getText().toString().equals("") &&
                        !aceleracao02.getText().toString().equals(""))
                {
                    tempo.setEnabled(false);
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra2.setText(Html.fromHtml(t(
                            Double.parseDouble(velocidade.getText().toString()),
                            Double.parseDouble(velocidadeInicial.getText().toString()),
                            Double.parseDouble(aceleracao02.getText().toString())) + " s"));
                }
                //calcula v0
                else if(!velocidade.getText().toString().equals("") &&
                        !aceleracao02.getText().toString().equals("") &&
                        !tempo.getText().toString().equals(""))
                {
                    velocidadeInicial.setEnabled(false);
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra2.setText(Html.fromHtml(v0(
                            Double.parseDouble(velocidade.getText().toString()),
                            Double.parseDouble(aceleracao02.getText().toString()),
                            Double.parseDouble(tempo.getText().toString())) + " m/s"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void aceleracao02Pressed()
    {
        aceleracao02.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (aceleracao02.getText().toString().equals(""))
                {
                    tvExtra2.setBackgroundResource(R.color.branco);
                    tvExtra2.setText("");
                    velocidadeInicial.setEnabled(true);
                    velocidade.setEnabled(true);
                    tempo.setEnabled(true);
                }
                //calcula t
                else if(!velocidade.getText().toString().equals("") &&
                        !velocidadeInicial.getText().toString().equals("") &&
                        !aceleracao02.getText().toString().equals(""))
                {
                    tempo.setEnabled(false);
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra2.setText(Html.fromHtml(t(
                            Double.parseDouble(velocidade.getText().toString()),
                            Double.parseDouble(velocidadeInicial.getText().toString()),
                            Double.parseDouble(aceleracao02.getText().toString())) + " s"));
                }
                //calcula v
                else if(!velocidadeInicial.getText().toString().equals("") &&
                        !aceleracao02.getText().toString().equals("") &&
                        !tempo.getText().toString().equals(""))
                {
                    velocidade.setEnabled(false);
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra2.setText(Html.fromHtml(v(
                            Double.parseDouble(velocidadeInicial.getText().toString()),
                            Double.parseDouble(aceleracao02.getText().toString()),
                            Double.parseDouble(tempo.getText().toString())) + " m/s"));
                }
                //calcula v0
                else if(!velocidade.getText().toString().equals("") &&
                        !aceleracao02.getText().toString().equals("") &&
                        !tempo.getText().toString().equals(""))
                {
                    velocidadeInicial.setEnabled(false);
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra2.setText(Html.fromHtml(v0(
                            Double.parseDouble(velocidade.getText().toString()),
                            Double.parseDouble(aceleracao02.getText().toString()),
                            Double.parseDouble(tempo.getText().toString())) + " m/s"));
                }
            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });
    }

    private void tempoPressed()
    {
        tempo.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (tempo.getText().toString().equals(""))
                {
                    tvExtra2.setBackgroundResource(R.color.branco);
                    tvExtra2.setText("");
                    velocidadeInicial.setEnabled(true);
                    velocidade.setEnabled(true);
                    aceleracao02.setEnabled(true);
                }
                //calcula a
                else if(!velocidade.getText().toString().equals("") &&
                        !velocidadeInicial.getText().toString().equals("") &&
                        !tempo.getText().toString().equals(""))
                {
                    aceleracao02.setEnabled(false);
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra2.setText(Html.fromHtml(a(
                            Double.parseDouble(velocidade.getText().toString()),
                            Double.parseDouble(velocidadeInicial.getText().toString()),
                            Double.parseDouble(tempo.getText().toString())) + " m/s<sup>2</sup>"));
                }
                //calcula v
                else if(!velocidadeInicial.getText().toString().equals("") &&
                        !aceleracao02.getText().toString().equals("") &&
                        !tempo.getText().toString().equals(""))
                {
                    velocidade.setEnabled(false);
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra2.setText(Html.fromHtml(v(
                            Double.parseDouble(velocidadeInicial.getText().toString()),
                            Double.parseDouble(aceleracao02.getText().toString()),
                            Double.parseDouble(tempo.getText().toString())) + " m/s"));
                }
                //calcula v0
                else if(!velocidade.getText().toString().equals("") &&
                        !aceleracao02.getText().toString().equals("") &&
                        !tempo.getText().toString().equals(""))
                {
                    velocidadeInicial.setEnabled(false);
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra2.setText(Html.fromHtml(v0(
                            Double.parseDouble(velocidade.getText().toString()),
                            Double.parseDouble(aceleracao02.getText().toString()),
                            Double.parseDouble(tempo.getText().toString())) + " m/s"));
                }
            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });
    }

    //3
    private double s(double s0, double v0, double t, double a)
    {
        //s = s0 + (v0 * t) + (a * (t^2 / 2))
        return s0 + (v0 * t) + (a * (Math.pow(t, 2) / 2));
    }

    private double s0(double s, double v0, double t, double a)
    {
        //s0 = s - (v0 * t) - (a * (t^2 / 2))
        return s - (v0 * t) - (a * (Math.pow(t, 2) / 2));
    }

    private double v0(double s, double t, double s0, double a)
    {
        //v0 = (s / t) - (s0 / t) - (a * (t / 2))
        return (s / t) - (s0 / t) - (a * (t / 2));
    }

    private double a(double s, double s0, double v0, double t)
    {
        //a = (2 * (s - s0 - (v0 * t))) / t^2
        return (2 * (s - s0 - (v0 * t))) / Math.pow(t, 2);
    }

    private void espacoFinalPressed()
    {
        espacoFinal.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (espacoFinal.getText().toString().equals(""))
                {
                    tvExtra3.setBackgroundResource(R.color.branco);
                    tvExtra3.setText("");
                    espacoIinicial.setEnabled(true);
                    velocidadeinicial02.setEnabled(true);
                    tempo02.setEnabled(true);
                    aceleracao03.setEnabled(true);
                }
                //calcula s0
                else if(!espacoFinal.getText().toString().equals("") &&
                        !velocidadeinicial02.getText().toString().equals("") &&
                        !tempo02.getText().toString().equals("")&&
                        !aceleracao03.getText().toString().equals(""))
                {
                    espacoIinicial.setEnabled(false);
                    tvExtra3.setGravity(Gravity.CENTER);
                    tvExtra3.setBackgroundResource(R.drawable.degrade2);
                    tvExtra3.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra3.setText(Html.fromHtml(s0(
                            Double.parseDouble(espacoFinal.getText().toString()),
                            Double.parseDouble(velocidadeinicial02.getText().toString()),
                            Double.parseDouble(tempo02.getText().toString()),
                            Double.parseDouble(aceleracao03.getText().toString())) + " m"));
                }
                //calcula v0
                else if(!espacoFinal.getText().toString().equals("") &&
                        !tempo02.getText().toString().equals("") &&
                        !espacoIinicial.getText().toString().equals("")&&
                        !aceleracao03.getText().toString().equals(""))
                {
                    tvExtra3.setGravity(Gravity.CENTER);
                    velocidadeinicial02.setEnabled(false);
                    tvExtra3.setBackgroundResource(R.drawable.degrade2);
                    tvExtra3.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra3.setText(Html.fromHtml(v0(
                            Double.parseDouble(espacoFinal.getText().toString()),
                            Double.parseDouble(tempo02.getText().toString()),
                            Double.parseDouble(espacoIinicial.getText().toString()),
                            Double.parseDouble(aceleracao03.getText().toString())) + " m/s"));
                }
                //calcula a
                else if(!espacoFinal.getText().toString().equals("") &&
                        !espacoIinicial.getText().toString().equals("") &&
                        !velocidadeinicial02.getText().toString().equals("")&&
                        !tempo02.getText().toString().equals(""))
                {
                    aceleracao03.setEnabled(false);
                    tvExtra3.setGravity(Gravity.CENTER);
                    tvExtra3.setBackgroundResource(R.drawable.degrade2);
                    tvExtra3.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra3.setText(Html.fromHtml(a(
                            Double.parseDouble(espacoFinal.getText().toString()),
                            Double.parseDouble(espacoIinicial.getText().toString()),
                            Double.parseDouble(velocidadeinicial02.getText().toString()),
                            Double.parseDouble(tempo02.getText().toString())) + " m/s<sup>2</sup>"));
                }

            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });
    }

    private void espacoIinicialPressed()
    {
        espacoIinicial.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (espacoIinicial.getText().toString().equals(""))
                {
                    tvExtra3.setBackgroundResource(R.color.branco);
                    tvExtra3.setText("");
                    espacoFinal.setEnabled(true);
                    velocidadeinicial02.setEnabled(true);
                    tempo02.setEnabled(true);
                    aceleracao03.setEnabled(true);
                }
                //calcula s
                else if(!espacoIinicial.getText().toString().equals("") &&
                        !velocidadeinicial02.getText().toString().equals("") &&
                        !tempo02.getText().toString().equals("")&&
                        !aceleracao03.getText().toString().equals(""))
                {
                    espacoFinal.setEnabled(false);
                    tvExtra3.setGravity(Gravity.CENTER);
                    tvExtra3.setBackgroundResource(R.drawable.degrade2);
                    tvExtra3.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra3.setText(Html.fromHtml(s(
                            Double.parseDouble(espacoIinicial.getText().toString()),
                            Double.parseDouble(velocidadeinicial02.getText().toString()),
                            Double.parseDouble(tempo02.getText().toString()),
                            Double.parseDouble(aceleracao03.getText().toString())) + " m"));
                }
                //calcula v0
                else if(!espacoFinal.getText().toString().equals("") &&
                        !tempo02.getText().toString().equals("") &&
                        !espacoIinicial.getText().toString().equals("")&&
                        !aceleracao03.getText().toString().equals(""))
                {
                    tvExtra3.setGravity(Gravity.CENTER);
                    velocidadeinicial02.setEnabled(false);
                    tvExtra3.setBackgroundResource(R.drawable.degrade2);
                    tvExtra3.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra3.setText(Html.fromHtml(v0(
                            Double.parseDouble(espacoFinal.getText().toString()),
                            Double.parseDouble(tempo02.getText().toString()),
                            Double.parseDouble(espacoIinicial.getText().toString()),
                            Double.parseDouble(aceleracao03.getText().toString())) + " m/s"));
                }
                //calcula a
                else if(!espacoFinal.getText().toString().equals("") &&
                        !espacoIinicial.getText().toString().equals("") &&
                        !velocidadeinicial02.getText().toString().equals("")&&
                        !tempo02.getText().toString().equals(""))
                {
                    aceleracao03.setEnabled(false);
                    tvExtra3.setGravity(Gravity.CENTER);
                    tvExtra3.setBackgroundResource(R.drawable.degrade2);
                    tvExtra3.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra3.setText(Html.fromHtml(a(
                            Double.parseDouble(espacoFinal.getText().toString()),
                            Double.parseDouble(espacoIinicial.getText().toString()),
                            Double.parseDouble(velocidadeinicial02.getText().toString()),
                            Double.parseDouble(tempo02.getText().toString())) + " m/s<sup>2</sup>"));
                }

            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });
    }

    private void velocidadeinicial02Pressed()
    {
        velocidadeinicial02.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (velocidadeinicial02.getText().toString().equals(""))
                {
                    tvExtra3.setBackgroundResource(R.color.branco);
                    tvExtra3.setText("");
                    espacoFinal.setEnabled(true);
                    espacoIinicial.setEnabled(true);
                    tempo02.setEnabled(true);
                    aceleracao03.setEnabled(true);
                }
                //calcula s
                else if(!espacoIinicial.getText().toString().equals("") &&
                        !velocidadeinicial02.getText().toString().equals("") &&
                        !tempo02.getText().toString().equals("")&&
                        !aceleracao03.getText().toString().equals(""))
                {
                    espacoFinal.setEnabled(false);
                    tvExtra3.setGravity(Gravity.CENTER);
                    tvExtra3.setBackgroundResource(R.drawable.degrade2);
                    tvExtra3.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra3.setText(Html.fromHtml(s(
                            Double.parseDouble(espacoIinicial.getText().toString()),
                            Double.parseDouble(velocidadeinicial02.getText().toString()),
                            Double.parseDouble(tempo02.getText().toString()),
                            Double.parseDouble(aceleracao03.getText().toString())) + " m"));
                }
                //calcula s0
                else if(!espacoFinal.getText().toString().equals("") &&
                        !velocidadeinicial02.getText().toString().equals("") &&
                        !tempo02.getText().toString().equals("")&&
                        !aceleracao03.getText().toString().equals(""))
                {
                    espacoIinicial.setEnabled(false);
                    tvExtra3.setGravity(Gravity.CENTER);
                    tvExtra3.setBackgroundResource(R.drawable.degrade2);
                    tvExtra3.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra3.setText(Html.fromHtml(s0(
                            Double.parseDouble(espacoFinal.getText().toString()),
                            Double.parseDouble(velocidadeinicial02.getText().toString()),
                            Double.parseDouble(tempo02.getText().toString()),
                            Double.parseDouble(aceleracao03.getText().toString())) + " m"));
                }
                //calcula a
                else if(!espacoFinal.getText().toString().equals("") &&
                        !espacoIinicial.getText().toString().equals("") &&
                        !velocidadeinicial02.getText().toString().equals("")&&
                        !tempo02.getText().toString().equals(""))
                {
                    aceleracao03.setEnabled(false);
                    tvExtra3.setGravity(Gravity.CENTER);
                    tvExtra3.setBackgroundResource(R.drawable.degrade2);
                    tvExtra3.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra3.setText(Html.fromHtml(a(
                            Double.parseDouble(espacoFinal.getText().toString()),
                            Double.parseDouble(espacoIinicial.getText().toString()),
                            Double.parseDouble(velocidadeinicial02.getText().toString()),
                            Double.parseDouble(tempo02.getText().toString())) + " m/s<sup>2</sup>"));
                }

            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });
    }

    private void aceleracao03Pressed()
    {
        aceleracao03.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (aceleracao03.getText().toString().equals(""))
                {
                    tvExtra3.setBackgroundResource(R.color.branco);
                    tvExtra3.setText("");
                    espacoFinal.setEnabled(true);
                    espacoIinicial.setEnabled(true);
                    tempo02.setEnabled(true);
                    velocidadeinicial02.setEnabled(true);
                }
                //calcula s
                else if(!espacoIinicial.getText().toString().equals("") &&
                        !velocidadeinicial02.getText().toString().equals("") &&
                        !tempo02.getText().toString().equals("")&&
                        !aceleracao03.getText().toString().equals(""))
                {
                    espacoFinal.setEnabled(false);
                    tvExtra3.setGravity(Gravity.CENTER);
                    tvExtra3.setBackgroundResource(R.drawable.degrade2);
                    tvExtra3.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra3.setText(Html.fromHtml(s(
                            Double.parseDouble(espacoIinicial.getText().toString()),
                            Double.parseDouble(velocidadeinicial02.getText().toString()),
                            Double.parseDouble(tempo02.getText().toString()),
                            Double.parseDouble(aceleracao03.getText().toString())) + " m"));
                }
                //calcula s0
                else if(!espacoFinal.getText().toString().equals("") &&
                        !velocidadeinicial02.getText().toString().equals("") &&
                        !tempo02.getText().toString().equals("")&&
                        !aceleracao03.getText().toString().equals(""))
                {
                    espacoIinicial.setEnabled(false);
                    tvExtra3.setGravity(Gravity.CENTER);
                    tvExtra3.setBackgroundResource(R.drawable.degrade2);
                    tvExtra3.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra3.setText(Html.fromHtml(s0(
                            Double.parseDouble(espacoFinal.getText().toString()),
                            Double.parseDouble(velocidadeinicial02.getText().toString()),
                            Double.parseDouble(tempo02.getText().toString()),
                            Double.parseDouble(aceleracao03.getText().toString())) + " m"));
                }
                //calcula v0
                else if(!espacoFinal.getText().toString().equals("") &&
                        !tempo02.getText().toString().equals("") &&
                        !espacoIinicial.getText().toString().equals("")&&
                        !aceleracao03.getText().toString().equals(""))
                {
                    velocidadeinicial02.setEnabled(false);
                    tvExtra3.setGravity(Gravity.CENTER);
                    tvExtra3.setBackgroundResource(R.drawable.degrade2);
                    tvExtra3.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra3.setText(Html.fromHtml(v0(
                            Double.parseDouble(espacoFinal.getText().toString()),
                            Double.parseDouble(tempo02.getText().toString()),
                            Double.parseDouble(espacoIinicial.getText().toString()),
                            Double.parseDouble(aceleracao03.getText().toString())) + " m/s"));
                }
            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });
    }

    //4
    private double v2(double v0, double a, double delS)
    {
        //v = v0^2 + (2 * a * delS)
        return Math.sqrt(Math.pow(v0, 2) + (2 * a * delS));
    }

    private double v02(double v, double a, double delS)
    {
        //v = √( v^2 - (2 * a * delS))
        double x = Math.pow(v, 2);
        double y = (2 * a * delS);
        double z = x - y;
        return Math.sqrt(z);
    }

    private double delS(double v, double v0, double a)
    {
        //delS = (v^2 - v0^2) / (2 * a)
        return (Math.pow(v, 2) - Math.pow(v0, 2)) / (2 * a);
    }

    private double a2(double v, double v0, double delS)
    {
        //a = (v^2 - v0^2) / 2 * delS
        return (Math.pow(v, 2) - Math.pow(v0, 2)) / (2 * delS);
    }

    private void velocidadeFinalPressed()
    {
        velocidadeFinal.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (velocidadeFinal.getText().toString().equals(""))
                {
                    tvExtra4.setBackgroundResource(R.color.branco);
                    tvExtra4.setText("");
                    velocidadeInicial03.setEnabled(true);
                    aceleracao04.setEnabled(true);
                    variacaoEspaco.setEnabled(true);
                }
                //calcula v0
                else if(!velocidadeFinal.getText().toString().equals("") &&
                        !aceleracao04.getText().toString().equals("") &&
                        !variacaoEspaco.getText().toString().equals(""))
                {
                    velocidadeInicial03.setEnabled(false);
                    tvExtra4.setGravity(Gravity.CENTER);
                    tvExtra4.setBackgroundResource(R.drawable.degrade2);
                    tvExtra4.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra4.setText(Html.fromHtml(v02(
                            Double.parseDouble(velocidadeFinal.getText().toString()),
                            Double.parseDouble(aceleracao04.getText().toString()),
                            Double.parseDouble(variacaoEspaco.getText().toString())) + " m/s"));
                }
                //calcula delS
                else if(!velocidadeFinal.getText().toString().equals("") &&
                        !velocidadeInicial03.getText().toString().equals("") &&
                        !aceleracao04.getText().toString().equals(""))
                {
                    variacaoEspaco.setEnabled(false);
                    tvExtra4.setGravity(Gravity.CENTER);
                    tvExtra4.setBackgroundResource(R.drawable.degrade2);
                    tvExtra4.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra4.setText(Html.fromHtml(delS(
                            Double.parseDouble(velocidadeFinal.getText().toString()),
                            Double.parseDouble(velocidadeInicial03.getText().toString()),
                            Double.parseDouble(aceleracao04.getText().toString())) + " m"));
                }
                //calcula a
                else if(!velocidadeFinal.getText().toString().equals("") &&
                        !velocidadeInicial03.getText().toString().equals("") &&
                        !variacaoEspaco.getText().toString().equals(""))
                {
                    aceleracao04.setEnabled(false);
                    tvExtra4.setGravity(Gravity.CENTER);
                    tvExtra4.setBackgroundResource(R.drawable.degrade2);
                    tvExtra4.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra4.setText(Html.fromHtml(a2(
                            Double.parseDouble(velocidadeFinal.getText().toString()),
                            Double.parseDouble(velocidadeInicial03.getText().toString()),
                            Double.parseDouble(variacaoEspaco.getText().toString())) + " m/s<sup>2</sup>"));
                }
            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });
    }

    private void velocidadeInicial03Pressed()
    {
        velocidadeInicial03.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (velocidadeInicial03.getText().toString().equals(""))
                {
                    tvExtra4.setBackgroundResource(R.color.branco);
                    tvExtra4.setText("");
                    velocidadeFinal.setEnabled(true);
                    aceleracao04.setEnabled(true);
                    variacaoEspaco.setEnabled(true);
                }
                //calcula delS
                else if(!velocidadeFinal.getText().toString().equals("") &&
                        !velocidadeInicial03.getText().toString().equals("") &&
                        !aceleracao04.getText().toString().equals(""))
                {
                    variacaoEspaco.setEnabled(false);
                    tvExtra4.setGravity(Gravity.CENTER);
                    tvExtra4.setBackgroundResource(R.drawable.degrade2);
                    tvExtra4.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra4.setText(Html.fromHtml(delS(
                            Double.parseDouble(velocidadeFinal.getText().toString()),
                            Double.parseDouble(velocidadeInicial03.getText().toString()),
                            Double.parseDouble(aceleracao04.getText().toString())) + " m"));
                }
                //calcula a
                else if(!velocidadeFinal.getText().toString().equals("") &&
                        !velocidadeInicial03.getText().toString().equals("") &&
                        !variacaoEspaco.getText().toString().equals(""))
                {
                    aceleracao04.setEnabled(false);
                    tvExtra4.setGravity(Gravity.CENTER);
                    tvExtra4.setBackgroundResource(R.drawable.degrade2);
                    tvExtra4.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra4.setText(Html.fromHtml(a2(
                            Double.parseDouble(velocidadeFinal.getText().toString()),
                            Double.parseDouble(velocidadeInicial03.getText().toString()),
                            Double.parseDouble(variacaoEspaco.getText().toString())) + " m/s<sup>2</sup>"));
                }
                //calcula v
                else if(!velocidadeInicial03.getText().toString().equals("") &&
                        !aceleracao04.getText().toString().equals("") &&
                        !variacaoEspaco.getText().toString().equals(""))
                {
                    velocidadeFinal.setEnabled(false);
                    tvExtra4.setGravity(Gravity.CENTER);
                    tvExtra4.setBackgroundResource(R.drawable.degrade2);
                    tvExtra4.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra4.setText(Html.fromHtml(v2(
                            Double.parseDouble(velocidadeInicial03.getText().toString()),
                            Double.parseDouble(aceleracao04.getText().toString()),
                            Double.parseDouble(variacaoEspaco.getText().toString())) + " m/s"));
                }
            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });
    }

    private void aceleracao04Pressed()
    {
        aceleracao04.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (aceleracao04.getText().toString().equals(""))
                {
                    tvExtra4.setBackgroundResource(R.color.branco);
                    tvExtra4.setText("");
                    velocidadeFinal.setEnabled(true);
                    velocidadeInicial03.setEnabled(true);
                    variacaoEspaco.setEnabled(true);
                }
                //calcula delS
                else if(!velocidadeFinal.getText().toString().equals("") &&
                        !velocidadeInicial03.getText().toString().equals("") &&
                        !aceleracao04.getText().toString().equals(""))
                {
                    variacaoEspaco.setEnabled(false);
                    tvExtra4.setGravity(Gravity.CENTER);
                    tvExtra4.setBackgroundResource(R.drawable.degrade2);
                    tvExtra4.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra4.setText(Html.fromHtml(delS(
                            Double.parseDouble(velocidadeFinal.getText().toString()),
                            Double.parseDouble(velocidadeInicial03.getText().toString()),
                            Double.parseDouble(aceleracao04.getText().toString())) + " m"));
                }
                //calcula v
                else if(!velocidadeInicial03.getText().toString().equals("") &&
                        !aceleracao04.getText().toString().equals("") &&
                        !variacaoEspaco.getText().toString().equals(""))
                {
                    velocidadeFinal.setEnabled(false);
                    tvExtra4.setGravity(Gravity.CENTER);
                    tvExtra4.setBackgroundResource(R.drawable.degrade2);
                    tvExtra4.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra4.setText(Html.fromHtml(v2(
                            Double.parseDouble(velocidadeInicial03.getText().toString()),
                            Double.parseDouble(aceleracao04.getText().toString()),
                            Double.parseDouble(variacaoEspaco.getText().toString())) + " m/s"));
                }
                //calcula v0
                else if(!velocidadeFinal.getText().toString().equals("") &&
                        !aceleracao04.getText().toString().equals("") &&
                        !variacaoEspaco.getText().toString().equals(""))
                {
                    velocidadeInicial03.setEnabled(false);
                    tvExtra4.setGravity(Gravity.CENTER);
                    tvExtra4.setBackgroundResource(R.drawable.degrade2);
                    tvExtra4.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra4.setText(Html.fromHtml(v02(
                            Double.parseDouble(velocidadeFinal.getText().toString()),
                            Double.parseDouble(aceleracao04.getText().toString()),
                            Double.parseDouble(variacaoEspaco.getText().toString())) + " m/s"));
                }
            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });
    }

    private void variacaoEspacoPressed()
    {
        variacaoEspaco.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (variacaoEspaco.getText().toString().equals(""))
                {
                    tvExtra4.setBackgroundResource(R.color.branco);
                    tvExtra4.setText("");
                    velocidadeFinal.setEnabled(true);
                    velocidadeInicial03.setEnabled(true);
                    aceleracao04.setEnabled(true);
                }
                //calcula v
                else if(!velocidadeInicial03.getText().toString().equals("") &&
                        !aceleracao04.getText().toString().equals("") &&
                        !variacaoEspaco.getText().toString().equals(""))
                {
                    velocidadeFinal.setEnabled(false);
                    tvExtra4.setGravity(Gravity.CENTER);
                    tvExtra4.setBackgroundResource(R.drawable.degrade2);
                    tvExtra4.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra4.setText(Html.fromHtml(v2(
                            Double.parseDouble(velocidadeInicial03.getText().toString()),
                            Double.parseDouble(aceleracao04.getText().toString()),
                            Double.parseDouble(variacaoEspaco.getText().toString())) + " m/s"));
                }
                //calcula v0
                else if(!velocidadeFinal.getText().toString().equals("") &&
                        !aceleracao04.getText().toString().equals("") &&
                        !variacaoEspaco.getText().toString().equals(""))
                {
                    velocidadeInicial03.setEnabled(false);
                    tvExtra4.setGravity(Gravity.CENTER);
                    tvExtra4.setBackgroundResource(R.drawable.degrade2);
                    tvExtra4.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra4.setText(Html.fromHtml(v02(
                            Double.parseDouble(velocidadeFinal.getText().toString()),
                            Double.parseDouble(aceleracao04.getText().toString()),
                            Double.parseDouble(variacaoEspaco.getText().toString())) + " m/s"));
                }
                //calcula a
                else if(!velocidadeFinal.getText().toString().equals("") &&
                        !velocidadeInicial03.getText().toString().equals("") &&
                        !variacaoEspaco.getText().toString().equals(""))
                {
                    aceleracao04.setEnabled(false);
                    tvExtra4.setGravity(Gravity.CENTER);
                    tvExtra4.setBackgroundResource(R.drawable.degrade2);
                    tvExtra4.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra4.setText(Html.fromHtml(a2(
                            Double.parseDouble(velocidadeFinal.getText().toString()),
                            Double.parseDouble(velocidadeInicial03.getText().toString()),
                            Double.parseDouble(variacaoEspaco.getText().toString())) + " m/s<sup>2</sup>"));
                }
            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });
    }
}
