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

public class TelaResumoCinematicaMovimentoCircular extends Fragment
{
    private View rootView;

    private TextView tvExtra01;
    private TextView tvExtra02;
    private TextView tvExtra03;
    private TextView tvExtra04;

    private TextView unidade;

    //1
    private EditText etFrequencia;
    private EditText etPeriodo;

    //2
    private EditText etVelocidade;
    private EditText etPiRadianos;
    private EditText etRaio;
    private EditText etPeriodo02;

    //3
    private EditText etVelociddeAngular;
    private EditText etPiRadianos02;
    private EditText etPeriodo03;

    //4
    private EditText etAceleracaoCentripeta;
    private EditText etVelocidadeEscalar;
    private EditText etRaio02;

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        configuraTextView();
        configuraEditText();

        //1
        etFrequenciaPressed();
        etPeriodoPressed();

        //2
        etVelocidadePressed();
        etRaioPressed();
        etPeriodo02Pressed();

        //3
        etVelociddeAngularPressed();
        etPeriodo03Pressed();

        //4
        etAceleracaoCentripetaPressed();
        etVelocidadeEscalarPressed();
        etRaio02Pressed();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        rootView = inflater.inflate(R.layout.tela_resumo_cinematica_movimento_circular, container, false);
        return rootView;
    }

    private void configuraTextView()
    {
        TextView tvTelaResumoCinematica1401 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_14_01);
        TextView tvTelaResumoCinematica1402 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_14_02);
        TextView tvTelaResumoCinematica1403 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_14_03);
        TextView tvTelaResumoCinematica1404 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_14_04);
        TextView tvTelaResumoCinematica1405 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_14_05);
        TextView tvTelaResumoCinematica1406 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_14_06);
        TextView tvTelaResumoCinematica1407 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_14_07);
        TextView tvTelaResumoCinematica1408 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_14_08);
        TextView tvTelaResumoCinematica1409 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_14_09);
        TextView tvTelaResumoCinematica1410 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_14_10);
        TextView tvTelaResumoCinematica1411 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_14_11);
        TextView tvTelaResumoCinematica1412 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_14_12);
        TextView tvTelaResumoCinematica1413 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_14_13);
        TextView tvTelaResumoCinematica1414 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_14_14);
        TextView tvTelaResumoCinematica1415 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_14_15);
        TextView tvTelaResumoCinematica1416 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_14_16);
        TextView tvTelaResumoCinematica1417 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_14_17);
        TextView tvTelaResumoCinematica1418 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_14_18);
        TextView tvTelaResumoCinematica1419 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_14_19);

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumoCinematica1401.setTypeface(font);
        tvTelaResumoCinematica1402.setTypeface(font);
        tvTelaResumoCinematica1403.setTypeface(font);
        tvTelaResumoCinematica1404.setTypeface(font);
        tvTelaResumoCinematica1405.setTypeface(font);
        tvTelaResumoCinematica1406.setTypeface(font);
        tvTelaResumoCinematica1407.setTypeface(font);
        tvTelaResumoCinematica1408.setTypeface(font);
        tvTelaResumoCinematica1409.setTypeface(font);
        tvTelaResumoCinematica1410.setTypeface(font);
        tvTelaResumoCinematica1411.setTypeface(font);
        tvTelaResumoCinematica1412.setTypeface(font);
        tvTelaResumoCinematica1413.setTypeface(font);
        tvTelaResumoCinematica1414.setTypeface(font);
        tvTelaResumoCinematica1415.setTypeface(font);
        tvTelaResumoCinematica1416.setTypeface(font);
        tvTelaResumoCinematica1417.setTypeface(font);
        tvTelaResumoCinematica1418.setTypeface(font);
        tvTelaResumoCinematica1419.setTypeface(font);

        tvExtra01 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_14_extra_01);
        tvExtra02 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_14_extra_02);
        tvExtra03 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_14_extra_03);
        tvExtra04 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_14_extra_04);

        unidade = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_mc_unidades_010);

        unidade.setText(Html.fromHtml(" m/s<sup>2</sup>"));

        tvTelaResumoCinematica1401.setText(Html.fromHtml("<p>Um corpo executa um movimento circular quando a trajetória descrita é uma circunferência ou um arco de circunferência.</p>" +
                "<p>Para um movimento circular uniforme o corpo descreve uma volta completa em intervalos de tempos iguais, chamados períodos(T).</p>" +
                "<p>Frequência é o número de ciclos efetuados por unidade de tempo (unidade = Hz).</p>"));
        tvTelaResumoCinematica1402.setText(Html.fromHtml("<p>Frequência (f)</p>"));
        tvTelaResumoCinematica1403.setText(Html.fromHtml("<p>Período (T)</p>"));
        tvTelaResumoCinematica1404.setText(Html.fromHtml("<p>Velocidade escalar: Velocidade com que se executa uma volta completa.</p>"));
        tvTelaResumoCinematica1405.setText(Html.fromHtml("<p>Velocidade (V)</p>"));
        tvTelaResumoCinematica1406.setText(Html.fromHtml("<p>Pi radianos (&pi;)</p>"));
        tvTelaResumoCinematica1407.setText(Html.fromHtml("<p>Raio (R)</p>"));
        tvTelaResumoCinematica1408.setText(Html.fromHtml("<p>Período (T)</p>"));
        tvTelaResumoCinematica1409.setText(Html.fromHtml("<p>Velocidade angular: rapidez com que um móvel descreve um certo ângulo.</p>"));
        tvTelaResumoCinematica1410.setText(Html.fromHtml("<p>Velocidade angular (&omega;)</p>"));
        tvTelaResumoCinematica1411.setText(Html.fromHtml("<p>Pi radianos (&pi;)</p>"));
        tvTelaResumoCinematica1412.setText(Html.fromHtml("<p>Período (T)</p>"));
        tvTelaResumoCinematica1413.setText(Html.fromHtml("<p>Um corpo em movimento circular fica submetido a uma aceleração centrípeta, responsável por mudar a direção do vetor velocidade. " +
                                                        "a<sub>c</sub> = V<sup>2</sup>/R </p>"));
        tvTelaResumoCinematica1414.setText(Html.fromHtml("<p>Aceleração centrípeta (ac)</p>"));
        tvTelaResumoCinematica1415.setText(Html.fromHtml("<p>Velocidade escalar (V)</p>"));
        tvTelaResumoCinematica1416.setText(Html.fromHtml("<p>Raio (R)</p>"));
        tvTelaResumoCinematica1417.setText(Html.fromHtml("<p>Transmissão de movimento circular:</p>" +
                "<p><ul style=\"list-style-type:circle\"><li>Disco girando em torno de seu centro</li></ul>.</p>"));
        tvTelaResumoCinematica1418.setText(Html.fromHtml("<p><ul><li>Disco girando em conjunto</li></ul>.</p>"));
        tvTelaResumoCinematica1419.setText(Html.fromHtml("<p>Como, v<sub>A</sub> = v<sub>B</sub> => &omega;<sub>A</sub>.R/sub>A</sub> = &omega;<sub>B</sub>.R<sub>B</sub></p>"));
    }

    private void configuraEditText()
    {
        etFrequencia = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_14_01);
        etPeriodo = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_14_02);

        etVelocidade = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_14_03);
        etPiRadianos = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_14_04);
        etRaio = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_14_05);
        etPeriodo02 = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_14_06);

        etVelociddeAngular = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_14_07);
        etPiRadianos02 = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_14_08);
        etPeriodo03 = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_14_09);

        etAceleracaoCentripeta = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_14_10);
        etVelocidadeEscalar = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_14_11);
        etRaio02 = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_14_12);
    }

    //1
    //f = 1 / T
    private double f(double tempo)
    {
        //
        return 1 / tempo;
    }

    //t = 1 / f
    private double t(double frequencia)
    {
        //
        return 1 / frequencia;
    }

    private void etFrequenciaPressed()
    {
        etFrequencia.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (etFrequencia.getText().toString().equals(""))
                {
                    tvExtra01.setBackgroundResource(R.color.branco);
                    tvExtra01.setText("");
                    etPeriodo.setEnabled(true);
                }
                else if (!etFrequencia.getText().toString().equals(""))
                {
                    etPeriodo.setEnabled(false);
                    tvExtra01.setGravity(Gravity.CENTER);
                    tvExtra01.setBackgroundResource(R.drawable.degrade2);
                    tvExtra01.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra01.setText(t(Double.parseDouble(etFrequencia.getText().toString())) + " s");
                }
            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });
    }

    private void etPeriodoPressed()
    {
        etPeriodo.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (etPeriodo.getText().toString().equals(""))
                {
                    tvExtra01.setBackgroundResource(R.color.branco);
                    tvExtra01.setText("");
                    etFrequencia.setEnabled(true);
                }
                else if (!etPeriodo.getText().toString().equals(""))
                {
                    etFrequencia.setEnabled(false);
                    tvExtra01.setGravity(Gravity.CENTER);
                    tvExtra01.setBackgroundResource(R.drawable.degrade2);
                    tvExtra01.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra01.setText(t(Double.parseDouble(etPeriodo.getText().toString())) + " hz");
                }
            }
            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });
    }

    //2
    private double v(double pi, double r, double t)
    {
        //v = 2 * π *  R / T
        return (2 * pi * r) / t;
    }

    //t = 2 * π *  r / v
    private double t(double pi, double r, double v)
    {
        //
        return (2 * pi * r) / v;
    }

    //r = (t * v) / (2 * pi)
    private double r(double t, double v, double pi)
    {
        //
        return (t * v) / (2 * pi);
    }

    private void etVelocidadePressed()
    {
        etVelocidade.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (etVelocidade.getText().toString().equals(""))
                {
                    tvExtra02.setBackgroundResource(R.color.branco);
                    tvExtra02.setText("");
                    etPiRadianos.setEnabled(true);
                    etRaio.setEnabled(true);
                    etPeriodo02.setEnabled(true);
                    etVelocidade.setEnabled(true);
                }
                //calcula t
                else if (!etVelocidade.getText().toString().equals("") &&
                        !etRaio.getText().toString().equals("")&&
                        !etPiRadianos.getText().toString().equals(""))
                {
                    etPeriodo02.setEnabled(false);
                    tvExtra02.setGravity(Gravity.CENTER);
                    tvExtra02.setBackgroundResource(R.drawable.degrade2);
                    tvExtra02.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra02.setText(t(
                            Double.parseDouble(etPiRadianos.getText().toString()),
                            Double.parseDouble(etRaio.getText().toString()),
                            Double.parseDouble(etVelocidade.getText().toString())) + " s");
                }
                //calcula r
                else if (!etVelocidade.getText().toString().equals("") &&
                        !etPeriodo02.getText().toString().equals("")&&
                        !etPiRadianos.getText().toString().equals(""))
                {
                    etRaio.setEnabled(false);
                    tvExtra02.setGravity(Gravity.CENTER);
                    tvExtra02.setBackgroundResource(R.drawable.degrade2);
                    tvExtra02.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra02.setText(r(
                            Double.parseDouble(etPeriodo02.getText().toString()),
                            Double.parseDouble(etVelocidade.getText().toString()),
                            Double.parseDouble(etPiRadianos.getText().toString())) + " m");
                }
            }
            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });
    }

    private void etPeriodo02Pressed()
    {
        etPeriodo02.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (etPeriodo02.getText().toString().equals(""))
                {
                    tvExtra02.setBackgroundResource(R.color.branco);
                    tvExtra02.setText("");
                    etPiRadianos.setEnabled(true);
                    etRaio.setEnabled(true);
                    etPeriodo02.setEnabled(true);
                    etVelocidade.setEnabled(true);
                }
                //calcula r
                else if (!etPeriodo02.getText().toString().equals("") &&
                        !etPiRadianos.getText().toString().equals("")&&
                        !etVelocidade.getText().toString().equals(""))
                {
                    etRaio.setEnabled(false);
                    tvExtra02.setGravity(Gravity.CENTER);
                    tvExtra02.setBackgroundResource(R.drawable.degrade2);
                    tvExtra02.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra02.setText(r(
                            Double.parseDouble(etPeriodo02.getText().toString()),
                            Double.parseDouble(etVelocidade.getText().toString()),
                            Double.parseDouble(etPiRadianos.getText().toString())) + " m");
                }
                //calcula v
                else if (!etPiRadianos.getText().toString().equals("") &&
                        !etRaio.getText().toString().equals("")&&
                        !etPeriodo02.getText().toString().equals(""))
                {
                    etVelocidade.setEnabled(false);
                    tvExtra02.setGravity(Gravity.CENTER);
                    tvExtra02.setBackgroundResource(R.drawable.degrade2);
                    tvExtra02.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra02.setText(v(
                            Double.parseDouble(etPiRadianos.getText().toString()),
                            Double.parseDouble(etRaio.getText().toString()),
                            Double.parseDouble(etPeriodo02.getText().toString())) + " m/s");
                }
            }
            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });
    }

    private void etRaioPressed()
    {
        etRaio.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (etRaio.getText().toString().equals(""))
                {
                    tvExtra02.setBackgroundResource(R.color.branco);
                    tvExtra02.setText("");
                    etPiRadianos.setEnabled(true);
                    etRaio.setEnabled(true);
                    etPeriodo02.setEnabled(true);
                    etVelocidade.setEnabled(true);
                }
                //calcula t
                else if (!etVelocidade.getText().toString().equals("") &&
                        !etRaio.getText().toString().equals("")&&
                        !etPiRadianos.getText().toString().equals(""))
                {
                    etPeriodo02.setEnabled(false);
                    tvExtra02.setGravity(Gravity.CENTER);
                    tvExtra02.setBackgroundResource(R.drawable.degrade2);
                    tvExtra02.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra02.setText(t(
                            Double.parseDouble(etPiRadianos.getText().toString()),
                            Double.parseDouble(etRaio.getText().toString()),
                            Double.parseDouble(etVelocidade.getText().toString())) + " s");
                }
                //calcula v
                else if (!etPiRadianos.getText().toString().equals("") &&
                        !etRaio.getText().toString().equals("")&&
                        !etPeriodo02.getText().toString().equals(""))
                {
                    etVelocidade.setEnabled(false);
                    tvExtra02.setGravity(Gravity.CENTER);
                    tvExtra02.setBackgroundResource(R.drawable.degrade2);
                    tvExtra02.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra02.setText(v(
                            Double.parseDouble(etPiRadianos.getText().toString()),
                            Double.parseDouble(etRaio.getText().toString()),
                            Double.parseDouble(etPeriodo02.getText().toString())) + " m/s");
                }
            }
            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });
    }

    //3
    private double w(double pi, double t)
    {
        //ω = (2 * π) / t
        return (2 * pi) / t;
    }

    private double t(double pi, double w)
    {
        //t = (2 * π) / w
        return (2 * pi) / w;
    }

    private void etVelociddeAngularPressed()
    {
        etVelociddeAngular.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (etVelociddeAngular.getText().toString().equals(""))
                {

                    tvExtra03.setBackgroundResource(R.color.branco);
                    tvExtra03.setText("");
                    etPiRadianos02.setEnabled(true);
                    etPeriodo03.setEnabled(true);
                }
                //calcula t
                else if (!etVelociddeAngular.getText().toString().equals("") &&
                        !etPiRadianos02.getText().toString().equals(""))
                {
                    etPeriodo03.setEnabled(false);
                    tvExtra03.setGravity(Gravity.CENTER);
                    tvExtra03.setBackgroundResource(R.drawable.degrade2);
                    tvExtra03.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra03.setText(t(
                            Double.parseDouble(etPiRadianos02.getText().toString()),
                            Double.parseDouble(etVelociddeAngular.getText().toString())) + " s");
                }
            }
            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });
    }

    private void etPeriodo03Pressed()
    {
        etPeriodo03.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (etPeriodo03.getText().toString().equals(""))
                {
                    tvExtra03.setBackgroundResource(R.color.branco);
                    tvExtra03.setText("");
                    etPiRadianos02.setEnabled(true);
                    etVelociddeAngular.setEnabled(true);
                }
                //calcula v
                else if (!etPeriodo03.getText().toString().equals("") &&
                        !etPiRadianos02.getText().toString().equals(""))
                {
                    etVelociddeAngular.setEnabled(false);
                    tvExtra03.setGravity(Gravity.CENTER);
                    tvExtra03.setBackgroundResource(R.drawable.degrade2);
                    tvExtra03.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra03.setText(t(
                            Double.parseDouble(etPiRadianos02.getText().toString()),
                            Double.parseDouble(etPeriodo03.getText().toString())) + " rad/s");
                }
            }
            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });
    }

    //4
    //ac = v^2 / R
    private double ac(double v, double r)
    {
        //
        return Math.pow(v, 2) / r;
    }

    //r = v^2 / ac
    private double r(double v2, double ac)
    {
        //
        return Math.pow(v2, 2) / ac;
    }

    //v = v^2 / ac
    private double v(double r, double ac)
    {
        //
        return Math.sqrt((r * ac));
    }

    private void etAceleracaoCentripetaPressed()
    {
        etAceleracaoCentripeta.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (etAceleracaoCentripeta.getText().toString().equals(""))
                {
                    tvExtra04.setBackgroundResource(R.color.branco);
                    tvExtra04.setText("");
                    etVelocidadeEscalar.setEnabled(true);
                    etRaio02.setEnabled(true);
                }
                //calcula r
                else if (!etVelocidadeEscalar.getText().toString().equals("") &&
                        !etAceleracaoCentripeta.getText().toString().equals(""))
                {
                    etRaio02.setEnabled(false);
                    tvExtra04.setGravity(Gravity.CENTER);
                    tvExtra04.setBackgroundResource(R.drawable.degrade2);
                    tvExtra04.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra04.setText(r(
                            Double.parseDouble(etVelocidadeEscalar.getText().toString()),
                            Double.parseDouble(etAceleracaoCentripeta.getText().toString())) + " m");
                }
                //calcula v
                else if (!etRaio02.getText().toString().equals("") &&
                        !etAceleracaoCentripeta.getText().toString().equals(""))
                {
                    etVelocidadeEscalar.setEnabled(false);
                    tvExtra04.setGravity(Gravity.CENTER);
                    tvExtra04.setBackgroundResource(R.drawable.degrade2);
                    tvExtra04.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra04.setText(v(
                            Double.parseDouble(etRaio02.getText().toString()),
                            Double.parseDouble(etAceleracaoCentripeta.getText().toString())) + " m/s");
                }
            }
            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });
    }

    private void etVelocidadeEscalarPressed()
    {
        etVelocidadeEscalar.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (etVelocidadeEscalar.getText().toString().equals(""))
                {
                    tvExtra04.setBackgroundResource(R.color.branco);
                    tvExtra04.setText("");
                    etAceleracaoCentripeta.setEnabled(true);
                    etRaio02.setEnabled(true);
                }
                //calcula r
                else if (!etVelocidadeEscalar.getText().toString().equals("") &&
                        !etAceleracaoCentripeta.getText().toString().equals(""))
                {
                    etRaio02.setEnabled(false);
                    tvExtra04.setGravity(Gravity.CENTER);
                    tvExtra04.setBackgroundResource(R.drawable.degrade2);
                    tvExtra04.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra04.setText(r(
                            Double.parseDouble(etVelocidadeEscalar.getText().toString()),
                            Double.parseDouble(etAceleracaoCentripeta.getText().toString())) + " m");
                }
                //calcula ac
                else if (!etVelocidadeEscalar.getText().toString().equals("") &&
                        !etRaio02.getText().toString().equals(""))
                {
                    etAceleracaoCentripeta.setEnabled(false);
                    tvExtra04.setGravity(Gravity.CENTER);
                    tvExtra04.setBackgroundResource(R.drawable.degrade2);
                    tvExtra04.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra04.setText(ac(
                            Double.parseDouble(etVelocidadeEscalar.getText().toString()),
                            Double.parseDouble(etRaio02.getText().toString())) + " m/s<sup>2</sup>");
                }
            }
            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });
    }

    private void etRaio02Pressed()
    {
        etRaio02.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (etRaio02.getText().toString().equals(""))
                {
                    tvExtra04.setBackgroundResource(R.color.branco);
                    tvExtra04.setText("");
                    etAceleracaoCentripeta.setEnabled(true);
                    etVelocidadeEscalar.setEnabled(true);
                }
                //calcula v
                else if (!etRaio02.getText().toString().equals("") &&
                        !etAceleracaoCentripeta.getText().toString().equals(""))
                {
                    etVelocidadeEscalar.setEnabled(false);
                    tvExtra04.setGravity(Gravity.CENTER);
                    tvExtra04.setBackgroundResource(R.drawable.degrade2);
                    tvExtra04.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra04.setText(v(
                            Double.parseDouble(etRaio02.getText().toString()),
                            Double.parseDouble(etAceleracaoCentripeta.getText().toString())) + " m/s");
                }
                //calcula ac
                else if (!etVelocidadeEscalar.getText().toString().equals("") &&
                        !etRaio02.getText().toString().equals(""))
                {
                    etAceleracaoCentripeta.setEnabled(false);
                    tvExtra04.setGravity(Gravity.CENTER);
                    tvExtra04.setBackgroundResource(R.drawable.degrade2);
                    tvExtra04.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra04.setText(Html.fromHtml(ac(
                            Double.parseDouble(etVelocidadeEscalar.getText().toString()),
                            Double.parseDouble(etRaio02.getText().toString())) + " m/s<sup>2</sup>"));
                }
            }
            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });
    }
}
