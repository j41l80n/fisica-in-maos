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


public class TelaResumoCinematicaLancamentoVertical extends Fragment
{
    private View rootView;

    private EditText velocidadeFinal01;
    private EditText velocidadeInicial01;
    private EditText gravidade01;
    private EditText tempoFinal01;

    private EditText alturaFinal01;
    private EditText alturaInicial;
    private EditText velocidadeInicial02;
    private EditText tempoFinal02;
    private EditText gravidade02;

    private EditText velocidadeFinal03;
    private EditText velocidadeInicial03;
    private EditText gravidade03;
    private EditText altura03;

    private TextView tvExtra01;
    private TextView tvExtra02;
    private TextView tvExtra03;

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

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        configuraTextView();
        configuraEditText();

        //1
        velocidadeFinal01Pressed();
        velocidadeInicial01Pressed();
        gravidade01Pressed();
        tempoFinal01Pressed();
        //2
        alturaFinal01Pressed();
        alturaInicialPressed();
        velocidadeInicial02Pressed();
        tempoFinal02Pressed();
        gravidade02Pressed();
        //3
        velocidadeFinal03Pressed();
        velocidadeInicial03Pressed();
        gravidade03Pressed();
        altura03Pressed();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState)
    {
        rootView = inflater.inflate(R.layout.tela_resumo_cinematica_lancamento_vertical, container, false);
        return rootView;
    }

    private void configuraTextView()
    {
        TextView tvTelaResumoCinematica1001 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_10_01);
        TextView tvTelaResumoCinematica1002 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_10_02);
        TextView tvTelaResumoCinematica1003 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_10_03);
        TextView tvTelaResumoCinematica1004 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_10_04);
        TextView tvTelaResumoCinematica1005 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_10_05);
        TextView tvTelaResumoCinematica1006 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_10_06);
        TextView tvTelaResumoCinematica1007 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_10_07);
        TextView tvTelaResumoCinematica1008 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_10_08);
        TextView tvTelaResumoCinematica1009 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_10_09);
        TextView tvTelaResumoCinematica1010 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_10_10);
        TextView tvTelaResumoCinematica1011 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_10_11);
        TextView tvTelaResumoCinematica1012 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_10_12);
        TextView tvTelaResumoCinematica1015 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_10_15);
        TextView tvTelaResumoCinematica1016 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_10_16);
        TextView tvTelaResumoCinematica1017 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_10_17);
        TextView tvTelaResumoCinematica1018 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_10_18);
        TextView tvTelaResumoCinematica1019 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_10_19);

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumoCinematica1001.setTypeface(font);
        tvTelaResumoCinematica1002.setTypeface(font);
        tvTelaResumoCinematica1003.setTypeface(font);
        tvTelaResumoCinematica1004.setTypeface(font);
        tvTelaResumoCinematica1005.setTypeface(font);
        tvTelaResumoCinematica1006.setTypeface(font);
        tvTelaResumoCinematica1007.setTypeface(font);
        tvTelaResumoCinematica1008.setTypeface(font);
        tvTelaResumoCinematica1009.setTypeface(font);
        tvTelaResumoCinematica1010.setTypeface(font);
        tvTelaResumoCinematica1011.setTypeface(font);
        tvTelaResumoCinematica1012.setTypeface(font);
        tvTelaResumoCinematica1015.setTypeface(font);
        tvTelaResumoCinematica1016.setTypeface(font);
        tvTelaResumoCinematica1017.setTypeface(font);
        tvTelaResumoCinematica1018.setTypeface(font);
        tvTelaResumoCinematica1019.setTypeface(font);

        tvExtra01 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_10_01_extra);
        tvExtra02 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_10_02_extra);
        tvExtra03 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_10_03_extra);

        tvExtraUnidades1 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_lv_unidades_001);
        tvExtraUnidades2 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_lv_unidades_002);
        tvExtraUnidades3 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_lv_unidades_003);
        tvExtraUnidades4 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_lv_unidades_004);
        tvExtraUnidades5 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_lv_unidades_005);
        tvExtraUnidades6 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_lv_unidades_006);
        tvExtraUnidades7 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_lv_unidades_007);
        tvExtraUnidades8 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_lv_unidades_008);
        tvExtraUnidades9 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_lv_unidades_009);
        tvExtraUnidades10 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_lv_unidades_010);
        tvExtraUnidades11 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_lv_unidades_011);
        tvExtraUnidades12 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_lv_unidades_012);
        tvExtraUnidades13 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_lv_unidades_013);

        tvExtraUnidades1.setText(Html.fromHtml(" m/s"));
        tvExtraUnidades2.setText(Html.fromHtml(" m/s"));
        tvExtraUnidades3.setText(Html.fromHtml(" m/s<sup>2</sup>"));
        tvExtraUnidades4.setText(Html.fromHtml(" s"));

        tvExtraUnidades5.setText(Html.fromHtml(" m"));
        tvExtraUnidades6.setText(Html.fromHtml(" m"));
        tvExtraUnidades7.setText(Html.fromHtml(" m/s"));
        tvExtraUnidades8.setText(Html.fromHtml(" s"));
        tvExtraUnidades9.setText(Html.fromHtml(" m/s<sup>2</sup>"));

        tvExtraUnidades10.setText(Html.fromHtml(" m/s"));
        tvExtraUnidades11.setText(Html.fromHtml(" m/s"));
        tvExtraUnidades12.setText(Html.fromHtml(" m/s<sup>2</sup>"));
        tvExtraUnidades13.setText(Html.fromHtml(" m"));

        tvTelaResumoCinematica1001.setText(Html.fromHtml("<p>Um corpo lançado para cima com uma " +
                "velocidade inicial V0 fica submetido apenas à aceleração da gravidade(g).</p>" +
                "<p><b>Na subida</b>: movimento progressivo (<b>+v</b>) e retardado (<b>-g</b>).</p>" +
                "<p><b>Na descida</b>: movimento retrógrado (<b>-v</b>) e acelerado (<b>-g</b>).</p>"));
        tvTelaResumoCinematica1002.setText(Html.fromHtml("<p>No ponto mais alto da trajetória a " +
                "velocidade final é 0.</p>" +
                "<p>O tempo de subida é igual o de descida</p>" +
                "<p>A velocidade do objeto em um determinado ponto é a mesma na subida e na descida.</p>" +
                "<p><b>V = Vo - g.t</b><p>"));
        tvTelaResumoCinematica1003.setText(Html.fromHtml("V ="));
        tvTelaResumoCinematica1004.setText(Html.fromHtml("V<sub>0</sub> ="));
        tvTelaResumoCinematica1005.setText(Html.fromHtml("g ="));
        tvTelaResumoCinematica1006.setText(Html.fromHtml("t ="));
        tvTelaResumoCinematica1008.setText(Html.fromHtml("h ="));
        tvTelaResumoCinematica1009.setText(Html.fromHtml("h<sub>0</sub> ="));
        tvTelaResumoCinematica1010.setText(Html.fromHtml("v<sub>0</sub> ="));
        tvTelaResumoCinematica1011.setText(Html.fromHtml("t ="));
        tvTelaResumoCinematica1012.setText(Html.fromHtml("g ="));
        tvTelaResumoCinematica1015.setText(Html.fromHtml("V"));
        tvTelaResumoCinematica1016.setText(Html.fromHtml("v<sub>0</sub>"));
        tvTelaResumoCinematica1017.setText(Html.fromHtml("g"));
        tvTelaResumoCinematica1018.setText(Html.fromHtml("h"));
        tvTelaResumoCinematica1019.setText(Html.fromHtml("<p>Onde, v = 0, s = h e a = g</p>" +
                "<p>g = 9,8 m/s<sup>2</sup><p>"));
    }

    private void configuraEditText()
    {
        velocidadeFinal01 = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_10_01);
        velocidadeInicial01 = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_10_02);
        gravidade01 = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_10_03);
        tempoFinal01 = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_10_04);

        alturaFinal01 = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_10_05);
        alturaInicial = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_10_06);
        velocidadeInicial02 = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_10_07);
        tempoFinal02 = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_10_08);
        gravidade02 = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_10_09);

        velocidadeFinal03 = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_10_11);
        velocidadeInicial03 = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_10_12);
        gravidade03 = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_10_13);
        altura03 = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_10_14);
    }

    //funcoes 01
    private double v0(double velocidadeFinal, double gravidade, double tempo)
    {
        //Vo = (V + (g.t))
        return (velocidadeFinal + (gravidade * tempo));
    }

    private double t(double velocidadeInicial, double velocidadeFinal, double gravidade)
    {
        //t = ((Vo - V) / g)
        return (velocidadeInicial - velocidadeFinal) / gravidade;
    }

    private double g(double velocidadeInicial, double velocidadeFinal, double tempo)
    {
        //t = ((Vo - V) / t)
        return (velocidadeInicial - velocidadeFinal) / tempo;
    }

    private double v(double velocidadeInicial, double gravidade, double tempo)
    {
        //v = (v0 + (g.t))
        return (velocidadeInicial + (gravidade * tempo));
    }

    //aplicacao das funcoes 01
    private void velocidadeFinal01Pressed()
    {
        velocidadeFinal01.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (velocidadeFinal01.getText().toString().equals(""))
                {
                    tvExtra01.setText("");
                    tvExtra01.setBackgroundResource(R.color.branco);
                    velocidadeInicial01.setEnabled(true);;
                    gravidade01.setEnabled(true);;
                    tempoFinal01.setEnabled(true);
                }
                //calcula v0
                else if (!velocidadeFinal01.getText().toString().equals("") &&
                        !gravidade01.getText().toString().equals("") &&
                        !tempoFinal01.getText().toString().equals(""))
                {
                    velocidadeInicial01.setEnabled(false);
                    tvExtra01.setGravity(Gravity.CENTER);
                    tvExtra01.setBackgroundResource(R.drawable.degrade2);
                    tvExtra01.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra01.setText(Html.fromHtml(v0(
                            Double.parseDouble(velocidadeFinal01.getText().toString()),
                            Double.parseDouble(gravidade01.getText().toString()),
                            Double.parseDouble(tempoFinal01.getText().toString())
                    ) + " m/s"));
                }
                //calcula t
                else if (!velocidadeFinal01.getText().toString().equals("") &&
                        !velocidadeInicial01.getText().toString().equals("") &&
                        !gravidade01.getText().toString().equals(""))
                {
                    tempoFinal01.setEnabled(false);
                    tvExtra01.setGravity(Gravity.CENTER);
                    tvExtra01.setBackgroundResource(R.drawable.degrade2);
                    tvExtra01.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra01.setText(Html.fromHtml(t(
                            Double.parseDouble(velocidadeInicial01.getText().toString()),
                            Double.parseDouble(velocidadeFinal01.getText().toString()),
                            Double.parseDouble(gravidade01.getText().toString())
                    )+ " s"));
                }
                //calcula g
                else if (!velocidadeInicial01.getText().toString().equals("") &&
                        !velocidadeFinal01.getText().toString().equals("") &&
                        !tempoFinal01.getText().toString().equals(""))
                {
                    gravidade01.setEnabled(false);
                    tvExtra01.setGravity(Gravity.CENTER);
                    tvExtra01.setBackgroundResource(R.drawable.degrade2);
                    tvExtra01.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra01.setText(Html.fromHtml(g(
                            Double.parseDouble(velocidadeInicial01.getText().toString()),
                            Double.parseDouble(velocidadeFinal01.getText().toString()),
                            Double.parseDouble(tempoFinal01.getText().toString())
                    ) + " m/s<sup>2</sup>"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void velocidadeInicial01Pressed()
    {
        velocidadeInicial01.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (velocidadeInicial01.getText().toString().equals(""))
                {
                    tvExtra01.setBackgroundResource(R.color.branco);
                    tvExtra01.setText("");
                    velocidadeFinal01.setEnabled(true);;
                    gravidade01.setEnabled(true);;
                    tempoFinal01.setEnabled(true);
                }
                //calcula  V
                else if (!velocidadeInicial01.getText().toString().equals("") &&
                        !gravidade01.getText().toString().equals("") &&
                        !tempoFinal01.getText().toString().equals(""))
                {
                    velocidadeFinal01.setEnabled(false);
                    tvExtra01.setGravity(Gravity.CENTER);
                    tvExtra01.setBackgroundResource(R.drawable.degrade2);
                    tvExtra01.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra01.setText(v(
                            Double.parseDouble(velocidadeInicial01.getText().toString()),
                            Double.parseDouble(gravidade01.getText().toString()),
                            Double.parseDouble(tempoFinal01.getText().toString())
                    ) + " m/s");
                }
                //calcula t
                else if (!velocidadeFinal01.getText().toString().equals("") &&
                        !velocidadeInicial01.getText().toString().equals("") &&
                        !gravidade01.getText().toString().equals(""))
                {
                    tempoFinal01.setEnabled(false);
                    tvExtra01.setGravity(Gravity.CENTER);
                    tvExtra01.setBackgroundResource(R.drawable.degrade2);
                    tvExtra01.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra01.setText(Html.fromHtml(t(
                            Double.parseDouble(velocidadeInicial01.getText().toString()),
                            Double.parseDouble(velocidadeFinal01.getText().toString()),
                            Double.parseDouble(gravidade01.getText().toString())
                    )+ " s"));
                }
                //calcula g
                else if (!velocidadeInicial01.getText().toString().equals("") &&
                        !velocidadeFinal01.getText().toString().equals("") &&
                        !tempoFinal01.getText().toString().equals(""))
                {
                    gravidade01.setEnabled(false);
                    tvExtra01.setGravity(Gravity.CENTER);
                    tvExtra01.setBackgroundResource(R.drawable.degrade2);
                    tvExtra01.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra01.setText(Html.fromHtml(g(
                            Double.parseDouble(velocidadeInicial01.getText().toString()),
                            Double.parseDouble(velocidadeFinal01.getText().toString()),
                            Double.parseDouble(tempoFinal01.getText().toString())
                    ) + " m/s<sup>2</sup>"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void gravidade01Pressed()
    {
        gravidade01.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (gravidade01.getText().toString().equals(""))
                {
                    tvExtra01.setBackgroundResource(R.color.branco);
                    tvExtra01.setText("");
                    velocidadeFinal01.setEnabled(true);
                    velocidadeInicial01.setEnabled(true);
                    tempoFinal01.setEnabled(true);
                }
                //calcula V
                else if (!velocidadeInicial01.getText().toString().equals("") &&
                        !gravidade01.getText().toString().equals("") &&
                        !tempoFinal01.getText().toString().equals(""))
                {
                    velocidadeFinal01.setEnabled(false);
                    tvExtra01.setGravity(Gravity.CENTER);
                    tvExtra01.setBackgroundResource(R.drawable.degrade2);
                    tvExtra01.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra01.setText(v(
                            Double.parseDouble(velocidadeInicial01.getText().toString()),
                            Double.parseDouble(gravidade01.getText().toString()),
                            Double.parseDouble(tempoFinal01.getText().toString())
                    ) + " m/s");
                }
                //calcula t
                else if (!velocidadeFinal01.getText().toString().equals("") &&
                        !velocidadeInicial01.getText().toString().equals("") &&
                        !gravidade01.getText().toString().equals(""))
                {
                    tempoFinal01.setEnabled(false);
                    tvExtra01.setGravity(Gravity.CENTER);
                    tvExtra01.setBackgroundResource(R.drawable.degrade2);
                    tvExtra01.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra01.setText(Html.fromHtml(t(
                            Double.parseDouble(velocidadeInicial01.getText().toString()),
                            Double.parseDouble(velocidadeFinal01.getText().toString()),
                            Double.parseDouble(gravidade01.getText().toString())
                    )+ " s"));
                }
                //calcula v0
                else if (!velocidadeFinal01.getText().toString().equals("") &&
                        !gravidade01.getText().toString().equals("") &&
                        !tempoFinal01.getText().toString().equals(""))
                {
                    velocidadeInicial01.setEnabled(false);
                    tvExtra01.setGravity(Gravity.CENTER);
                    tvExtra01.setBackgroundResource(R.drawable.degrade2);
                    tvExtra01.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra01.setText(Html.fromHtml(v0(
                            Double.parseDouble(velocidadeFinal01.getText().toString()),
                            Double.parseDouble(gravidade01.getText().toString()),
                            Double.parseDouble(tempoFinal01.getText().toString())
                    ) + " m/s"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void tempoFinal01Pressed()
    {
        tempoFinal01.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (tempoFinal01.getText().toString().equals(""))
                {
                    tvExtra01.setBackgroundResource(R.color.branco);
                    tvExtra01.setText("");
                    velocidadeFinal01.setEnabled(true);
                    velocidadeInicial01.setEnabled(true);
                    gravidade01.setEnabled(true);
                }
                //calcula v
                else if (!velocidadeInicial01.getText().toString().equals("") &&
                        !gravidade01.getText().toString().equals("") &&
                        !tempoFinal01.getText().toString().equals(""))
                {
                    velocidadeFinal01.setEnabled(false);
                    tvExtra01.setGravity(Gravity.CENTER);
                    tvExtra01.setBackgroundResource(R.drawable.degrade2);
                    tvExtra01.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra01.setText(v(
                            Double.parseDouble(velocidadeInicial01.getText().toString()),
                            Double.parseDouble(gravidade01.getText().toString()),
                            Double.parseDouble(tempoFinal01.getText().toString())
                    ) + " m/s");
                }
                //calcula g
                else if (!velocidadeInicial01.getText().toString().equals("") &&
                        !velocidadeFinal01.getText().toString().equals("") &&
                        !tempoFinal01.getText().toString().equals(""))
                {
                    gravidade01.setEnabled(false);
                    tvExtra01.setGravity(Gravity.CENTER);
                    tvExtra01.setBackgroundResource(R.drawable.degrade2);
                    tvExtra01.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra01.setText(Html.fromHtml(g(
                            Double.parseDouble(velocidadeInicial01.getText().toString()),
                            Double.parseDouble(velocidadeFinal01.getText().toString()),
                            Double.parseDouble(tempoFinal01.getText().toString())
                    ) + " m/s<sup>2</sup>"));
                }
                //calcula v0
                else if (!velocidadeFinal01.getText().toString().equals("") &&
                        !gravidade01.getText().toString().equals("") &&
                        !tempoFinal01.getText().toString().equals(""))
                {
                    velocidadeInicial01.setEnabled(false);
                    tvExtra01.setGravity(Gravity.CENTER);
                    tvExtra01.setBackgroundResource(R.drawable.degrade2);
                    tvExtra01.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra01.setText(Html.fromHtml(v0(
                            Double.parseDouble(velocidadeFinal01.getText().toString()),
                            Double.parseDouble(gravidade01.getText().toString()),
                            Double.parseDouble(tempoFinal01.getText().toString())
                    ) + " m/s"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    //funcoes 02
    private double h(double alturaInicial, double velocidadeInicial, double tempo,
                     double gravidade)
    {
        //h =  (ho + ((Vo * t) - (g * (t^2 / 2))))
        return alturaInicial + ((velocidadeInicial * tempo) - (gravidade *(Math.pow(tempo, 2) / 2)));
    }

    private double h0(double alturaFinal, double velocidadeInicial, double tempo,
                      double gravidade)
    {
        //h0 = (h - ((Vo * t) + (g * (t^2 / 2))))
        return alturaFinal - ((velocidadeInicial * tempo) + (gravidade *(Math.pow(tempo, 2) / 2)));
    }

    private double g(double alturaInicial, double velocidadeInicial, double tempo,
                     double alturaFinal)
    {
        //g = (2 * (ho + (Vo * t) - h)) / (t^2)
        return (2 * (alturaInicial + (velocidadeInicial * tempo) - alturaFinal)) / (Math.pow(tempo, 2));
    }

    private double v0(double alturaFinal, double alturaInicial,
                      double tempo, double gravidade)
    {
        // ((h / t) - (ho / t)) + (g * (t / 2))
        return ((alturaFinal / tempo) - (alturaInicial / tempo)) + (gravidade * (tempo / 2));
    }

    //aplicacao das funcoes 02
    private void alturaFinal01Pressed()
    {
        alturaFinal01.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (alturaFinal01.getText().toString().equals(""))
                {
                    tvExtra02.setBackgroundResource(R.color.branco);
                    tvExtra02.setText("");
                    alturaInicial.setEnabled(true);
                    velocidadeInicial02.setEnabled(true);
                    tempoFinal02.setEnabled(true);
                    gravidade02.setEnabled(true);
                }
                //calcula h0
                else if (!alturaFinal01.getText().toString().equals("") &&
                        !velocidadeInicial02.getText().toString().equals("") &&
                        !tempoFinal02.getText().toString().equals("")&&
                        !gravidade02.getText().toString().equals(""))
                {
                    alturaInicial.setEnabled(false);
                    tvExtra02.setGravity(Gravity.CENTER);
                    tvExtra02.setBackgroundResource(R.drawable.degrade2);
                    tvExtra02.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra02.setText(Html.fromHtml(h0(
                            Double.parseDouble(alturaFinal01.getText().toString()),
                            Double.parseDouble(velocidadeInicial02.getText().toString()),
                            Double.parseDouble(tempoFinal02.getText().toString()),
                            Double.parseDouble(gravidade02.getText().toString())) + " m/s"));
                }
                //calcula v0
                else if (!alturaFinal01.getText().toString().equals("") &&
                        !alturaInicial.getText().toString().equals("") &&
                        !tempoFinal02.getText().toString().equals("") &&
                        !gravidade02.getText().toString().equals(""))
                {
                    velocidadeInicial02.setEnabled(false);
                    tvExtra02.setGravity(Gravity.CENTER);
                    tvExtra02.setBackgroundResource(R.drawable.degrade2);
                    tvExtra02.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra02.setText(Html.fromHtml(v0(
                            Double.parseDouble(alturaFinal01.getText().toString()),
                            Double.parseDouble(alturaInicial.getText().toString()),
                            Double.parseDouble(tempoFinal02.getText().toString()),
                            Double.parseDouble(gravidade02.getText().toString())) + " m/s<sup>2</sup>"));
                }
                //calcula g
                else if (!alturaFinal01.getText().toString().equals("") &&
                        !alturaInicial.getText().toString().equals("") &&
                        !velocidadeInicial02.getText().toString().equals("") &&
                        !tempoFinal02.getText().toString().equals(""))
                {
                    gravidade02.setEnabled(false);
                    tvExtra02.setGravity(Gravity.CENTER);
                    tvExtra02.setBackgroundResource(R.drawable.degrade2);
                    tvExtra02.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra02.setText(Html.fromHtml(g(
                            Double.parseDouble(alturaInicial.getText().toString()),
                            Double.parseDouble(velocidadeInicial02.getText().toString()),
                            Double.parseDouble(tempoFinal02.getText().toString()),
                            Double.parseDouble(alturaFinal01.getText().toString())) + " m/s<sup>2</sup>"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void alturaInicialPressed()
    {
        alturaInicial.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (alturaInicial.getText().toString().equals(""))
                {
                    tvExtra02.setBackgroundResource(R.color.branco);
                    tvExtra02.setText("");
                    alturaFinal01.setEnabled(true);
                    velocidadeInicial02.setEnabled(true);
                    tempoFinal02.setEnabled(true);
                    gravidade02.setEnabled(true);
                }
                //calcula h
                else if (!alturaInicial.getText().toString().equals("") &&
                        !velocidadeInicial02.getText().toString().equals("") &&
                        !tempoFinal02.getText().toString().equals("")&&
                        !gravidade02.getText().toString().equals(""))
                {
                    alturaFinal01.setEnabled(false);
                    tvExtra02.setGravity(Gravity.CENTER);
                    tvExtra02.setBackgroundResource(R.drawable.degrade2);
                    tvExtra02.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra02.setText(Html.fromHtml(h(
                            Double.parseDouble(alturaInicial.getText().toString()),
                            Double.parseDouble(velocidadeInicial02.getText().toString()),
                            Double.parseDouble(tempoFinal02.getText().toString()),
                            Double.parseDouble(gravidade02.getText().toString())) + " m"));
                }
                //calcula v0
                else if (!alturaFinal01.getText().toString().equals("") &&
                        !alturaInicial.getText().toString().equals("") &&
                        !tempoFinal02.getText().toString().equals("") &&
                        !gravidade02.getText().toString().equals(""))
                {
                    velocidadeInicial02.setEnabled(false);
                    tvExtra02.setGravity(Gravity.CENTER);
                    tvExtra02.setBackgroundResource(R.drawable.degrade2);
                    tvExtra02.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra02.setText(Html.fromHtml(v0(
                            Double.parseDouble(alturaFinal01.getText().toString()),
                            Double.parseDouble(alturaInicial.getText().toString()),
                            Double.parseDouble(tempoFinal02.getText().toString()),
                            Double.parseDouble(gravidade02.getText().toString())) + " m/s<sup>2</sup>"));
                }
                //calcula g
                else if (!alturaFinal01.getText().toString().equals("") &&
                        !alturaInicial.getText().toString().equals("") &&
                        !velocidadeInicial02.getText().toString().equals("") &&
                        !tempoFinal02.getText().toString().equals(""))
                {
                    gravidade02.setEnabled(false);
                    tvExtra02.setGravity(Gravity.CENTER);
                    tvExtra02.setBackgroundResource(R.drawable.degrade2);
                    tvExtra02.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra02.setText(Html.fromHtml(g(
                            Double.parseDouble(alturaInicial.getText().toString()),
                            Double.parseDouble(velocidadeInicial02.getText().toString()),
                            Double.parseDouble(tempoFinal02.getText().toString()),
                            Double.parseDouble(alturaFinal01.getText().toString())) + " m/s<sup>2</sup>"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void velocidadeInicial02Pressed()
    {
        velocidadeInicial02.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (velocidadeInicial02.getText().toString().equals(""))
                {
                    tvExtra02.setBackgroundResource(R.color.branco);
                    tvExtra02.setText("");
                    alturaFinal01.setEnabled(true);
                    alturaInicial.setEnabled(true);
                    tempoFinal02.setEnabled(true);
                    gravidade02.setEnabled(true);
                }
                //calcula h
                else if (!alturaInicial.getText().toString().equals("") &&
                        !velocidadeInicial02.getText().toString().equals("") &&
                        !tempoFinal02.getText().toString().equals("")&&
                        !gravidade02.getText().toString().equals(""))
                {
                    alturaFinal01.setEnabled(false);
                    tvExtra02.setGravity(Gravity.CENTER);
                    tvExtra02.setBackgroundResource(R.drawable.degrade2);
                    tvExtra02.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra02.setText(Html.fromHtml(h(
                            Double.parseDouble(alturaInicial.getText().toString()),
                            Double.parseDouble(velocidadeInicial02.getText().toString()),
                            Double.parseDouble(tempoFinal02.getText().toString()),
                            Double.parseDouble(gravidade02.getText().toString())) + " m"));
                }
                //calcula h0
                else if (!alturaFinal01.getText().toString().equals("") &&
                        !velocidadeInicial02.getText().toString().equals("") &&
                        !tempoFinal02.getText().toString().equals("")&&
                        !gravidade02.getText().toString().equals(""))
                {
                    alturaInicial.setEnabled(false);
                    tvExtra02.setGravity(Gravity.CENTER);
                    tvExtra02.setBackgroundResource(R.drawable.degrade2);
                    tvExtra02.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra02.setText(Html.fromHtml(h0(
                            Double.parseDouble(alturaFinal01.getText().toString()),
                            Double.parseDouble(velocidadeInicial02.getText().toString()),
                            Double.parseDouble(tempoFinal02.getText().toString()),
                            Double.parseDouble(gravidade02.getText().toString())) + " m/s"));
                }
                //calcula g
                else if (!alturaFinal01.getText().toString().equals("") &&
                        !alturaInicial.getText().toString().equals("") &&
                        !velocidadeInicial02.getText().toString().equals("") &&
                        !tempoFinal02.getText().toString().equals(""))
                {
                    gravidade02.setEnabled(false);
                    tvExtra02.setGravity(Gravity.CENTER);
                    tvExtra02.setBackgroundResource(R.drawable.degrade2);
                    tvExtra02.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra02.setText(Html.fromHtml(g(
                            Double.parseDouble(alturaInicial.getText().toString()),
                            Double.parseDouble(velocidadeInicial02.getText().toString()),
                            Double.parseDouble(tempoFinal02.getText().toString()),
                            Double.parseDouble(alturaFinal01.getText().toString())) + " m/s<sup>2</sup>"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void tempoFinal02Pressed()
    {
        tempoFinal02.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (tempoFinal02.getText().toString().equals(""))
                {
                    tvExtra02.setBackgroundResource(R.color.branco);
                    tvExtra02.setText("");
                    alturaFinal01.setEnabled(true);
                    alturaInicial.setEnabled(true);
                    velocidadeInicial02.setEnabled(true);
                    gravidade02.setEnabled(true);
                }
                //calcula h
                else if (!alturaInicial.getText().toString().equals("") &&
                        !velocidadeInicial02.getText().toString().equals("") &&
                        !tempoFinal02.getText().toString().equals("")&&
                        !gravidade02.getText().toString().equals(""))
                {
                    alturaFinal01.setEnabled(false);
                    tvExtra02.setGravity(Gravity.CENTER);
                    tvExtra02.setBackgroundResource(R.drawable.degrade2);
                    tvExtra02.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra02.setText(Html.fromHtml(h(
                            Double.parseDouble(alturaInicial.getText().toString()),
                            Double.parseDouble(velocidadeInicial02.getText().toString()),
                            Double.parseDouble(tempoFinal02.getText().toString()),
                            Double.parseDouble(gravidade02.getText().toString())) + " m"));
                }
                //calcula h0
                else if (!alturaFinal01.getText().toString().equals("") &&
                        !velocidadeInicial02.getText().toString().equals("") &&
                        !tempoFinal02.getText().toString().equals("")&&
                        !gravidade02.getText().toString().equals(""))
                {
                    alturaInicial.setEnabled(false);
                    tvExtra02.setGravity(Gravity.CENTER);
                    tvExtra02.setBackgroundResource(R.drawable.degrade2);
                    tvExtra02.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra02.setText(Html.fromHtml(h0(
                            Double.parseDouble(alturaFinal01.getText().toString()),
                            Double.parseDouble(velocidadeInicial02.getText().toString()),
                            Double.parseDouble(tempoFinal02.getText().toString()),
                            Double.parseDouble(gravidade02.getText().toString())) + " m/s"));
                }
                //calcula v0
                else if (!alturaFinal01.getText().toString().equals("") &&
                        !alturaInicial.getText().toString().equals("") &&
                        !tempoFinal02.getText().toString().equals("") &&
                        !gravidade02.getText().toString().equals(""))
                {
                    velocidadeInicial02.setEnabled(false);
                    tvExtra02.setGravity(Gravity.CENTER);
                    tvExtra02.setBackgroundResource(R.drawable.degrade2);
                    tvExtra02.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra02.setText(Html.fromHtml(v0(
                            Double.parseDouble(alturaFinal01.getText().toString()),
                            Double.parseDouble(alturaInicial.getText().toString()),
                            Double.parseDouble(tempoFinal02.getText().toString()),
                            Double.parseDouble(gravidade02.getText().toString())) + " m/s<sup>2</sup>"));
                }
                //calcula g
                else if (!alturaFinal01.getText().toString().equals("") &&
                        !alturaInicial.getText().toString().equals("") &&
                        !velocidadeInicial02.getText().toString().equals("") &&
                        !tempoFinal02.getText().toString().equals(""))
                {
                    gravidade02.setEnabled(false);
                    tvExtra02.setGravity(Gravity.CENTER);
                    tvExtra02.setBackgroundResource(R.drawable.degrade2);
                    tvExtra02.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra02.setText(Html.fromHtml(g(
                            Double.parseDouble(alturaInicial.getText().toString()),
                            Double.parseDouble(velocidadeInicial02.getText().toString()),
                            Double.parseDouble(tempoFinal02.getText().toString()),
                            Double.parseDouble(alturaFinal01.getText().toString())) + " m/s<sup>2</sup>"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void gravidade02Pressed()
    {
        gravidade02.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (gravidade02.getText().toString().equals(""))
                {
                    tvExtra02.setBackgroundResource(R.color.branco);
                    tvExtra02.setText("");
                    alturaFinal01.setEnabled(true);
                    alturaInicial.setEnabled(true);
                    velocidadeInicial02.setEnabled(true);
                    tempoFinal02.setEnabled(true);
                }
                //calcula h
                else if (!alturaInicial.getText().toString().equals("") &&
                        !velocidadeInicial02.getText().toString().equals("") &&
                        !tempoFinal02.getText().toString().equals("")&&
                        !gravidade02.getText().toString().equals(""))
                {
                    alturaFinal01.setEnabled(false);
                    tvExtra02.setGravity(Gravity.CENTER);
                    tvExtra02.setBackgroundResource(R.drawable.degrade2);
                    tvExtra02.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra02.setText(Html.fromHtml(h(
                            Double.parseDouble(alturaInicial.getText().toString()),
                            Double.parseDouble(velocidadeInicial02.getText().toString()),
                            Double.parseDouble(tempoFinal02.getText().toString()),
                            Double.parseDouble(gravidade02.getText().toString())) + " m"));
                }
                //calcula h0
                else if (!alturaFinal01.getText().toString().equals("") &&
                        !velocidadeInicial02.getText().toString().equals("") &&
                        !tempoFinal02.getText().toString().equals("")&&
                        !gravidade02.getText().toString().equals(""))
                {
                    alturaInicial.setEnabled(false);
                    tvExtra02.setGravity(Gravity.CENTER);
                    tvExtra02.setBackgroundResource(R.drawable.degrade2);
                    tvExtra02.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra02.setText(Html.fromHtml(h0(
                            Double.parseDouble(alturaFinal01.getText().toString()),
                            Double.parseDouble(velocidadeInicial02.getText().toString()),
                            Double.parseDouble(tempoFinal02.getText().toString()),
                            Double.parseDouble(gravidade02.getText().toString())) + " m/s"));
                }
                //calcula v0
                else if (!alturaFinal01.getText().toString().equals("") &&
                        !alturaInicial.getText().toString().equals("") &&
                        !tempoFinal02.getText().toString().equals("") &&
                        !gravidade02.getText().toString().equals(""))
                {
                    velocidadeInicial02.setEnabled(false);
                    tvExtra02.setGravity(Gravity.CENTER);
                    tvExtra02.setBackgroundResource(R.drawable.degrade2);
                    tvExtra02.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra02.setText(Html.fromHtml(v0(
                            Double.parseDouble(alturaFinal01.getText().toString()),
                            Double.parseDouble(alturaInicial.getText().toString()),
                            Double.parseDouble(tempoFinal02.getText().toString()),
                            Double.parseDouble(gravidade02.getText().toString())) + " m/s<sup>2</sup>"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    //funcoes 03
    private double calculavelocidadeQuadrado03(double velocidadeInicial, double gravidade, double altura)
    {
        // V^2 = (Vo^2 - (2 * g * h))
        return Math.sqrt((Math.pow(velocidadeInicial, 2) - (2 * gravidade * altura)));
    }

    private double calculaVelocidadeInicial03(double velocidadeFinal, double gravidade, double altura)
    {
        //v0 = √(V^2 + (2 * g * h))
        return Math.sqrt(Math.pow(velocidadeFinal, 2) + (2 * gravidade * altura));
    }

    private double calculaAlturaFinal03(double velocidadeInicial, double velocidadeFinal, double gravidade)
    {
        //h = (Vo^2 - V^2) / (2 * g)
        return ((Math.pow(velocidadeInicial, 2) - Math.pow(velocidadeFinal, 2)) / (2 * gravidade));
    }

    private double calculaGravidade03(double velocidadeInicial, double velocidadeFinal, double altura)
    {
        //h = (Vo^2 - V^2) / (2 * h)
        return ((Math.pow(velocidadeInicial, 2) - Math.pow(velocidadeFinal, 2)) / (2 * altura));
    }

    //aplicacao das funcoes 03
    private void velocidadeFinal03Pressed()
    {
        velocidadeFinal03.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (velocidadeFinal03.getText().toString().equals(""))
                {
                    tvExtra03.setBackgroundResource(R.color.branco);
                    tvExtra03.setText("");
                    velocidadeInicial03.setEnabled(true);
                    gravidade03.setEnabled(true);
                    altura03.setEnabled(true);
                }
                //calcula V0
                else if (!velocidadeFinal03.getText().toString().equals("") &&
                        !gravidade03.getText().toString().equals("") &&
                        !altura03.getText().toString().equals(""))
                {
                    velocidadeInicial03.setEnabled(false);
                    tvExtra03.setGravity(Gravity.CENTER);
                    tvExtra03.setBackgroundResource(R.drawable.degrade2);
                    tvExtra03.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra03.setText(Html.fromHtml(calculaVelocidadeInicial03(
                            Double.parseDouble(velocidadeFinal03.getText().toString()),
                            Double.parseDouble(gravidade03.getText().toString()),
                            Double.parseDouble(altura03.getText().toString())
                    )+ " m"));
                }
                //calcula g
                else if (!velocidadeInicial03.getText().toString().equals("") &&
                        !velocidadeFinal03.getText().toString().equals("") &&
                        !altura03.getText().toString().equals(""))
                {
                    gravidade03.setEnabled(false);
                    tvExtra03.setGravity(Gravity.CENTER);
                    tvExtra03.setBackgroundResource(R.drawable.degrade2);
                    tvExtra03.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra03.setText(Html.fromHtml(calculaGravidade03(
                            Double.parseDouble(velocidadeInicial03.getText().toString()),
                            Double.parseDouble(velocidadeFinal03.getText().toString()),
                            Double.parseDouble(altura03.getText().toString())) + " m/s<sup>2</sup>"));
                }
                //calcula h
                else if (!velocidadeInicial03.getText().toString().equals("") &&
                        !velocidadeFinal03.getText().toString().equals("") &&
                        !gravidade03.getText().toString().equals(""))
                {
                    altura03.setEnabled(false);
                    tvExtra03.setGravity(Gravity.CENTER);
                    tvExtra03.setBackgroundResource(R.drawable.degrade2);
                    tvExtra03.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra03.setText(Html.fromHtml(calculaAlturaFinal03(
                            Double.parseDouble(velocidadeInicial03.getText().toString()),
                            Double.parseDouble(velocidadeFinal03.getText().toString()),
                            Double.parseDouble(gravidade03.getText().toString())) + " m"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void velocidadeInicial03Pressed()
    {
        velocidadeInicial03.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (velocidadeInicial03.getText().toString().equals(""))
                {
                    tvExtra03.setBackgroundResource(R.color.branco);
                    tvExtra03.setText("");
                    velocidadeFinal03.setEnabled(true);
                    gravidade03.setEnabled(true);
                    altura03.setEnabled(true);
                }
                //calcula V
                else if (!velocidadeInicial03.getText().toString().equals("") &&
                        !gravidade03.getText().toString().equals("") &&
                        !altura03.getText().toString().equals(""))
                {
                    velocidadeFinal03.setEnabled(false);
                    tvExtra03.setGravity(Gravity.CENTER);
                    tvExtra03.setBackgroundResource(R.drawable.degrade2);
                    tvExtra03.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra03.setText(Html.fromHtml(calculavelocidadeQuadrado03(
                            Double.parseDouble(velocidadeInicial03.getText().toString()),
                            Double.parseDouble(gravidade03.getText().toString()),
                            Double.parseDouble(altura03.getText().toString())
                    )+ " m/s"));
                }
                //calcula h
                else if (!velocidadeInicial03.getText().toString().equals("") &&
                        !velocidadeFinal03.getText().toString().equals("") &&
                        !gravidade03.getText().toString().equals(""))
                {
                    altura03.setEnabled(false);
                    tvExtra03.setGravity(Gravity.CENTER);
                    tvExtra03.setBackgroundResource(R.drawable.degrade2);
                    tvExtra03.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra03.setText(Html.fromHtml(calculaAlturaFinal03(
                            Double.parseDouble(velocidadeInicial03.getText().toString()),
                            Double.parseDouble(velocidadeFinal03.getText().toString()),
                            Double.parseDouble(gravidade03.getText().toString())) + " m"));
                }
                //calcula g
                else if (!velocidadeInicial03.getText().toString().equals("") &&
                        !velocidadeFinal03.getText().toString().equals("") &&
                        !altura03.getText().toString().equals(""))
                {
                    gravidade03.setEnabled(false);
                    tvExtra03.setGravity(Gravity.CENTER);
                    tvExtra03.setBackgroundResource(R.drawable.degrade2);
                    tvExtra03.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra03.setText(Html.fromHtml(calculaGravidade03(
                            Double.parseDouble(velocidadeInicial03.getText().toString()),
                            Double.parseDouble(velocidadeFinal03.getText().toString()),
                            Double.parseDouble(altura03.getText().toString())) + "m/s<sup>2</sup>"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void gravidade03Pressed()
    {
        gravidade03.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (gravidade03.getText().toString().equals(""))
                {
                    tvExtra03.setBackgroundResource(R.color.branco);
                    tvExtra03.setText("");
                    velocidadeFinal03.setEnabled(true);
                    velocidadeInicial03.setEnabled(true);
                    altura03.setEnabled(true);
                }
                //calcula V
                else if (!velocidadeInicial03.getText().toString().equals("") &&
                        !gravidade03.getText().toString().equals("") &&
                        !altura03.getText().toString().equals(""))
                {
                    velocidadeFinal03.setEnabled(false);
                    tvExtra03.setGravity(Gravity.CENTER);
                    tvExtra03.setBackgroundResource(R.drawable.degrade2);
                    tvExtra03.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra03.setText(Html.fromHtml(calculavelocidadeQuadrado03(
                            Double.parseDouble(velocidadeInicial03.getText().toString()),
                            Double.parseDouble(gravidade03.getText().toString()),
                            Double.parseDouble(altura03.getText().toString())
                    )+ " m/s"));
                }
                //calcula h
                else if (!velocidadeInicial03.getText().toString().equals("") &&
                        !velocidadeFinal03.getText().toString().equals("") &&
                        !gravidade03.getText().toString().equals(""))
                {
                    altura03.setEnabled(false);
                    tvExtra03.setGravity(Gravity.CENTER);
                    tvExtra03.setBackgroundResource(R.drawable.degrade2);
                    tvExtra03.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra03.setText(Html.fromHtml(calculaAlturaFinal03(
                            Double.parseDouble(velocidadeInicial03.getText().toString()),
                            Double.parseDouble(velocidadeFinal03.getText().toString()),
                            Double.parseDouble(gravidade03.getText().toString())) + " m"));
                }
                //calcula V0
                else if (!velocidadeFinal03.getText().toString().equals("") &&
                        !gravidade03.getText().toString().equals("") &&
                        !altura03.getText().toString().equals(""))
                {
                    velocidadeInicial03.setEnabled(false);
                    tvExtra03.setGravity(Gravity.CENTER);
                    tvExtra03.setBackgroundResource(R.drawable.degrade2);
                    tvExtra03.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra03.setText(Html.fromHtml(calculaVelocidadeInicial03(
                            Double.parseDouble(velocidadeFinal03.getText().toString()),
                            Double.parseDouble(gravidade03.getText().toString()),
                            Double.parseDouble(altura03.getText().toString())
                    )+ " m"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void altura03Pressed()
    {
        altura03.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (altura03.getText().toString().equals(""))
                {
                    tvExtra03.setBackgroundResource(R.color.branco);
                    tvExtra03.setText("");
                    velocidadeFinal03.setEnabled(true);
                    velocidadeInicial03.setEnabled(true);
                    gravidade03.setEnabled(true);
                }
                //calcula V
                else if (!velocidadeInicial03.getText().toString().equals("") &&
                        !gravidade03.getText().toString().equals("") &&
                        !altura03.getText().toString().equals(""))
                {
                    velocidadeFinal03.setEnabled(false);
                    tvExtra03.setGravity(Gravity.CENTER);
                    tvExtra03.setBackgroundResource(R.drawable.degrade2);
                    tvExtra03.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra03.setText(Html.fromHtml(calculavelocidadeQuadrado03(
                            Double.parseDouble(velocidadeInicial03.getText().toString()),
                            Double.parseDouble(gravidade03.getText().toString()),
                            Double.parseDouble(altura03.getText().toString())
                    )+ " m/s"));
                }
                //calcula V0
                else if (!velocidadeFinal03.getText().toString().equals("") &&
                        !gravidade03.getText().toString().equals("") &&
                        !altura03.getText().toString().equals(""))
                {
                    velocidadeInicial03.setEnabled(false);
                    tvExtra03.setGravity(Gravity.CENTER);
                    tvExtra03.setBackgroundResource(R.drawable.degrade2);
                    tvExtra03.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra03.setText(Html.fromHtml(calculaVelocidadeInicial03(
                            Double.parseDouble(velocidadeFinal03.getText().toString()),
                            Double.parseDouble(gravidade03.getText().toString()),
                            Double.parseDouble(altura03.getText().toString())
                    )+ " m"));
                }
                //calcula g
                else if (!velocidadeInicial03.getText().toString().equals("") &&
                        !velocidadeFinal03.getText().toString().equals("") &&
                        !altura03.getText().toString().equals(""))
                {
                    gravidade03.setEnabled(false);
                    tvExtra03.setGravity(Gravity.CENTER);
                    tvExtra03.setBackgroundResource(R.drawable.degrade2);
                    tvExtra03.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra03.setText(Html.fromHtml(calculaGravidade03(
                            Double.parseDouble(velocidadeInicial03.getText().toString()),
                            Double.parseDouble(velocidadeFinal03.getText().toString()),
                            Double.parseDouble(altura03.getText().toString())) + "m/s<sup>2</sup>"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}