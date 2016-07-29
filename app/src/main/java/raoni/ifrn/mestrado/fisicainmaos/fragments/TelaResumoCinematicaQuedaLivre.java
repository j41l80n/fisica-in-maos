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

public class TelaResumoCinematicaQuedaLivre extends Fragment
{
    private View rootView;

    private TextView tvExtra01;
    private TextView tvExtra02;
    private TextView tvExtra03;

    private EditText etV;
    private EditText etVZero;
    private EditText etG;
    private EditText etT;

    private EditText etH;
    private EditText etH0;
    private EditText etV0;
    private EditText etT02;
    private EditText etG02;

    private EditText velociddeFinal;
    private EditText velocidadeInicial;
    private EditText gravidade;
    private EditText altura;

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        configuraTextView();
        configuraEditText();
        etVPressed();
        etVZeroPressed();
        etGPressed();
        etTPressed();
        etHPressed();
        etH0Pressed();
        etV0Pressed();
        velocideFinalPressed();
        velocideInicialPressed();
        gravidadePressed();
        alturaPressed();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState)
    {
        rootView = inflater.inflate(R.layout.tela_resumo_cinematica_queda_livre, container, false);
        return rootView;
    }

    private void configuraTextView()
    {
        TextView tvTelaResumoCinematica1101 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_11_01);
        TextView tvTelaResumoCinematica1102 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_11_02);
        TextView tvTelaResumoCinematica1104 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_11_04);
        TextView tvTelaResumoCinematica1105 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_11_05);
        TextView tvTelaResumoCinematica1106 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_11_06);
        TextView tvTelaResumoCinematica1107 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_11_07);
        TextView tvTelaResumoCinematica1109 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_11_09);
        TextView tvTelaResumoCinematica1110 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_11_10);
        TextView tvTelaResumoCinematica1111 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_11_11);
        TextView tvTelaResumoCinematica1112 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_11_12);
        TextView tvTelaResumoCinematica1113 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_11_13);
        TextView tvTelaResumoCinematica1116 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_11_16);
        TextView tvTelaResumoCinematica1117 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_11_17);
        TextView tvTelaResumoCinematica1118 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_11_18);
        TextView tvTelaResumoCinematica1119 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_11_19);
        TextView tvTelaResumoCinematica1122 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_11_22);

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumoCinematica1101.setTypeface(font);
        tvTelaResumoCinematica1102.setTypeface(font);
        tvTelaResumoCinematica1104.setTypeface(font);
        tvTelaResumoCinematica1105.setTypeface(font);
        tvTelaResumoCinematica1106.setTypeface(font);
        tvTelaResumoCinematica1107.setTypeface(font);
        tvTelaResumoCinematica1109.setTypeface(font);
        tvTelaResumoCinematica1110.setTypeface(font);
        tvTelaResumoCinematica1111.setTypeface(font);
        tvTelaResumoCinematica1112.setTypeface(font);
        tvTelaResumoCinematica1113.setTypeface(font);
        tvTelaResumoCinematica1116.setTypeface(font);
        tvTelaResumoCinematica1117.setTypeface(font);
        tvTelaResumoCinematica1118.setTypeface(font);
        tvTelaResumoCinematica1119.setTypeface(font);
        tvTelaResumoCinematica1122.setTypeface(font);


        tvExtra01 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_extra_11_01);
        tvExtra02 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_extra_11_02);
        tvExtra03 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_extra_11_03);

        TextView tvExtraUnidades1 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_ql_unidades_001);
        TextView tvExtraUnidades2 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_ql_unidades_002);
        TextView tvExtraUnidades3 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_ql_unidades_003);
        TextView tvExtraUnidades4 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_ql_unidades_004);
        TextView tvExtraUnidades5 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_ql_unidades_005);
        TextView tvExtraUnidades6 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_ql_unidades_006);
        TextView tvExtraUnidades7 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_ql_unidades_007);
        TextView tvExtraUnidades8 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_ql_unidades_008);
        TextView tvExtraUnidades9 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_ql_unidades_009);
        TextView tvExtraUnidades10 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_ql_unidades_010);
        TextView tvExtraUnidades11 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_ql_unidades_011);
        TextView tvExtraUnidades12 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_ql_unidades_012);
        TextView tvExtraUnidades13 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_ql_unidades_013);

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

        tvTelaResumoCinematica1101.setText(Html.fromHtml("<p>Um corpo abandonado a partir do " +
                "repouso ou lançado com velocidade inicial Vo ≠ 0, descreve um M.R.U.V, com a = g.</p>" +
                                                         "<p>Dois corpos de massas diferentes," +
                " abandonados de uma mesma altura, chegam ao mesmo tempo ao chão.</p>"));
        tvTelaResumoCinematica1102.setText(Html.fromHtml("<p>O deslocamento de um corpo em movimento " +
                "acelerado obedece as proporções de Galileu, o produto dos números impares: d, 3d, 5d, 7d...</p>"));
        tvTelaResumoCinematica1104.setText(Html.fromHtml("<p>v</p>"));
        tvTelaResumoCinematica1105.setText(Html.fromHtml("<p>v<sub>0</sub></p>"));
        tvTelaResumoCinematica1106.setText(Html.fromHtml("<p>g</p>"));
        tvTelaResumoCinematica1107.setText(Html.fromHtml("<p>t</p>"));
        tvTelaResumoCinematica1109.setText(Html.fromHtml("<p>h</p>"));
        tvTelaResumoCinematica1110.setText(Html.fromHtml("<p>h<sub>0</sub></p>"));
        tvTelaResumoCinematica1111.setText(Html.fromHtml("<p>v<sub>0</sub></p>"));
        tvTelaResumoCinematica1112.setText(Html.fromHtml("<p>t</p>"));
        tvTelaResumoCinematica1113.setText(Html.fromHtml("<p>g</p>"));
        tvTelaResumoCinematica1116.setText(Html.fromHtml("<p>V</p>"));
        tvTelaResumoCinematica1117.setText(Html.fromHtml("<p>V<sub>0</sub></p>"));
        tvTelaResumoCinematica1118.setText(Html.fromHtml("<p>g</p>"));
        tvTelaResumoCinematica1119.setText(Html.fromHtml("<p>h</p>"));
        tvTelaResumoCinematica1122.setText(Html.fromHtml("<p>Para queda livre Vo = 0.</p>"));
    }

    private void configuraEditText()
    {
        etV = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_11_01);
        etVZero = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_11_02);
        etG = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_11_03);
        etT = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_11_04);

        etH = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_11_05);
        etH0 = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_11_06);
        etV0 = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_11_07);
        etT02 = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_11_08);
        etG02 = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_11_09);

        velociddeFinal = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_11_11);
        velocidadeInicial = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_11_12);
        gravidade = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_11_13);
        altura = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_11_15);
    }

    //1
    private double v(double v0, double g, double t)
    {
        //v = v0 + (g * t)
        return v0 + (g * t);
    }

    private double v0(double v, double g, double t)
    {
        //v0 = v - (g * t)
        return v -  (g * t);
    }

    private double t(double v, double v0, double g)
    {
        //t = (v - v0) / g
        return (v - v0) / g;
    }

    private double g(double v, double v0, double t)
    {
        //t = (v - v0) / t
        return (v - v0) / t;
    }

    private void etVPressed()
    {
        etV.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (etV.getText().toString().equals(""))
                {
                    tvExtra01.setBackgroundResource(R.color.branco);
                    tvExtra01.setText("");
                    etVZero.setEnabled(true);
                    etG.setEnabled(true);
                    etT.setEnabled(true);
                }
                //calcula V0
                else if (!etV.getText().toString().equals("") &&
                        !etG.getText().toString().equals("") &&
                        !etT.getText().toString().equals(""))
                {
                    etVZero.setEnabled(false);
                    tvExtra01.setGravity(Gravity.CENTER);
                    tvExtra01.setBackgroundResource(R.drawable.degrade2);
                    tvExtra01.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra01.setText(Html.fromHtml(v0(
                            Double.parseDouble(etV.getText().toString()),
                            Double.parseDouble(etG.getText().toString()),
                            Double.parseDouble(etT.getText().toString())
                    )+ " m/s"));
                }
                //calcula g
                else if (!etVZero.getText().toString().equals("") &&
                        !etV.getText().toString().equals("") &&
                        !etT.getText().toString().equals(""))
                {
                    etG.setEnabled(false);
                    tvExtra01.setGravity(Gravity.CENTER);
                    tvExtra01.setBackgroundResource(R.drawable.degrade2);
                    tvExtra01.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra01.setText(Html.fromHtml(g(
                            Double.parseDouble(etV.getText().toString()),
                            Double.parseDouble(etVZero.getText().toString()),
                            Double.parseDouble(etT.getText().toString())) + " m/s<sup>2</sup>"));
                }
                //calcula t
                else if (!etV.getText().toString().equals("") &&
                        !etVZero.getText().toString().equals("") &&
                        !etG.getText().toString().equals(""))
                {
                    etT.setEnabled(false);
                    tvExtra01.setGravity(Gravity.CENTER);
                    tvExtra01.setBackgroundResource(R.drawable.degrade2);
                    tvExtra01.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra01.setText(Html.fromHtml(t(
                            Double.parseDouble(etV.getText().toString()),
                            Double.parseDouble(etVZero.getText().toString()),
                            Double.parseDouble(etG.getText().toString())) + " s"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void etVZeroPressed()
    {
        etVZero.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (etVZero.getText().toString().equals(""))
                {
                    tvExtra01.setBackgroundResource(R.color.branco);
                    tvExtra01.setText("");
                    etV.setEnabled(true);
                    etG.setEnabled(true);
                    etT.setEnabled(true);
                }
                //calcula g
                else if (!etVZero.getText().toString().equals("") &&
                        !etV.getText().toString().equals("") &&
                        !etT.getText().toString().equals(""))
                {
                    etG.setEnabled(false);
                    tvExtra01.setGravity(Gravity.CENTER);
                    tvExtra01.setBackgroundResource(R.drawable.degrade2);
                    tvExtra01.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra01.setText(Html.fromHtml(g(
                            Double.parseDouble(etV.getText().toString()),
                            Double.parseDouble(etVZero.getText().toString()),
                            Double.parseDouble(etT.getText().toString())) + " m/s<sup>2</sup>"));
                }
                //calcula t
                else if (!etV.getText().toString().equals("") &&
                        !etVZero.getText().toString().equals("") &&
                        !etG.getText().toString().equals(""))
                {
                    etT.setEnabled(false);
                    tvExtra01.setGravity(Gravity.CENTER);
                    tvExtra01.setBackgroundResource(R.drawable.degrade2);
                    tvExtra01.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra01.setText(Html.fromHtml(t(
                            Double.parseDouble(etV.getText().toString()),
                            Double.parseDouble(etVZero.getText().toString()),
                            Double.parseDouble(etG.getText().toString())) + " s"));
                }
                //calcula v
                else if (!etVZero.getText().toString().equals("") &&
                        !etG.getText().toString().equals("") &&
                        !etT.getText().toString().equals(""))
                {
                    etV.setEnabled(false);
                    tvExtra01.setGravity(Gravity.CENTER);
                    etVZero.setBackgroundResource(R.drawable.degrade2);
                    tvExtra01.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra01.setText(Html.fromHtml(v(
                            Double.parseDouble(etVZero.getText().toString()),
                            Double.parseDouble(etG.getText().toString()),
                            Double.parseDouble(etT.getText().toString())) + " m/s"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void etGPressed()
    {
        etG.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (etG.getText().toString().equals(""))
                {
                    tvExtra01.setBackgroundResource(R.color.branco);
                    tvExtra01.setText("");
                    etV.setEnabled(true);
                    etVZero.setEnabled(true);
                    etT.setEnabled(true);
                }
                //calcula t
                else if (!etV.getText().toString().equals("") &&
                        !etVZero.getText().toString().equals("") &&
                        !etG.getText().toString().equals(""))
                {
                    etT.setEnabled(false);
                    tvExtra01.setGravity(Gravity.CENTER);
                    tvExtra01.setBackgroundResource(R.drawable.degrade2);
                    tvExtra01.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra01.setText(Html.fromHtml(t(
                            Double.parseDouble(etV.getText().toString()),
                            Double.parseDouble(etVZero.getText().toString()),
                            Double.parseDouble(etG.getText().toString())) + " s"));
                }
                //calcula v
                else if (!etVZero.getText().toString().equals("") &&
                        !etG.getText().toString().equals("") &&
                        !etT.getText().toString().equals(""))
                {
                    etV.setEnabled(false);
                    tvExtra01.setGravity(Gravity.CENTER);
                    tvExtra01.setBackgroundResource(R.drawable.degrade2);
                    tvExtra01.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra01.setText(Html.fromHtml(v(
                            Double.parseDouble(etVZero.getText().toString()),
                            Double.parseDouble(etG.getText().toString()),
                            Double.parseDouble(etT.getText().toString())) + " m/s"));
                }
                //calcula V0
                else if (!etV.getText().toString().equals("") &&
                        !etG.getText().toString().equals("") &&
                        !etT.getText().toString().equals("")) {
                    etVZero.setEnabled(false);
                    tvExtra01.setGravity(Gravity.CENTER);
                    tvExtra01.setBackgroundResource(R.drawable.degrade2);
                    tvExtra01.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra01.setText(Html.fromHtml(v0(
                            Double.parseDouble(etV.getText().toString()),
                            Double.parseDouble(etG.getText().toString()),
                            Double.parseDouble(etT.getText().toString())
                    ) + " m/s"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void etTPressed()
    {
        etT.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (etT.getText().toString().equals(""))
                {
                    tvExtra01.setBackgroundResource(R.color.branco);
                    tvExtra01.setText("");
                    etV.setEnabled(true);
                    etVZero.setEnabled(true);
                    etG.setEnabled(true);
                }
                //calcula g
                else if (!etVZero.getText().toString().equals("") &&
                        !etV.getText().toString().equals("") &&
                        !etT.getText().toString().equals(""))
                {
                    etG.setEnabled(false);
                    tvExtra01.setGravity(Gravity.CENTER);
                    tvExtra01.setBackgroundResource(R.drawable.degrade2);
                    tvExtra01.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra01.setText(Html.fromHtml(g(
                            Double.parseDouble(etV.getText().toString()),
                            Double.parseDouble(etVZero.getText().toString()),
                            Double.parseDouble(etT.getText().toString())) + " m/s<sup>2</sup>"));
                }
                //calcula v
                else if (!etVZero.getText().toString().equals("") &&
                        !etG.getText().toString().equals("") &&
                        !etT.getText().toString().equals(""))
                {
                    etV.setEnabled(false);
                    tvExtra01.setGravity(Gravity.CENTER);
                    tvExtra01.setBackgroundResource(R.drawable.degrade2);
                    tvExtra01.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra01.setText(Html.fromHtml(v(
                            Double.parseDouble(etVZero.getText().toString()),
                            Double.parseDouble(etG.getText().toString()),
                            Double.parseDouble(etT.getText().toString())) + " m/s"));
                }
                //calcula V0
                else if (!etV.getText().toString().equals("") &&
                        !etG.getText().toString().equals("") &&
                        !etT.getText().toString().equals("")) {
                    etVZero.setEnabled(false);
                    tvExtra01.setGravity(Gravity.CENTER);
                    tvExtra01.setBackgroundResource(R.drawable.degrade2);
                    tvExtra01.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra01.setText(Html.fromHtml(v0(
                            Double.parseDouble(etV.getText().toString()),
                            Double.parseDouble(etG.getText().toString()),
                            Double.parseDouble(etT.getText().toString())
                    ) + " m/s"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    //2
    //h =  (ho + ((Vo * t) + (g * (t^2 / 2))))
    private double calculaAlturaFinal(double alturaInicial, double velocidadeInicial, double tempo,
                                      double gravidade)
    {
        return alturaInicial + ((velocidadeInicial * tempo) + (gravidade *(Math.pow(tempo, 2) / 2)));
    }

    //h0 = (h - ((Vo * t) - (g * (t^2 / 2))))
    private double calculaAlturainicial(double alturaFinal, double velocidadeInicial, double tempo,
                                        double gravidade)
    {
        return alturaFinal - ((velocidadeInicial * tempo) - (gravidade *(Math.pow(tempo, 2) / 2)));
    }

    //g = (2 * (h - (Vo * t) - h0)) / (t^2)
    private double calculaGravidade02(double alturaInicial, double velocidadeInicial, double tempo,
                                      double alturaFinal)
    {
        return (2 * (alturaFinal - (velocidadeInicial * tempo) - alturaInicial)) / (Math.pow(tempo, 2));
    }

    //v0 = ((h / t) - (ho / t)) - (g * (t / 2))
    private double calculaVelocidadeInicial02(double h, double h0,
                                              double tempo, double gravidade)
    {
        return ((h / tempo) - (h0 / tempo)) - (gravidade * (tempo / 2));
    }

    private void etHPressed()
    {
        etH.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (etH.getText().toString().equals(""))
                {
                    tvExtra02.setBackgroundResource(R.color.branco);
                    tvExtra02.setText("");
                    etH0.setEnabled(true);
                    etV0.setEnabled(true);
                    etT02.setEnabled(true);
                    etG02.setEnabled(true);

                }
                //calcula h0
                else if (!etH.getText().toString().equals("") &&
                        !etV0.getText().toString().equals("") &&
                        !etT02.getText().toString().equals("")&&
                        !etG02.getText().toString().equals(""))
                {
                    etV0.setEnabled(false);
                    tvExtra02.setGravity(Gravity.CENTER);
                    tvExtra02.setBackgroundResource(R.drawable.degrade2);
                    tvExtra02.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra02.setText(Html.fromHtml(calculaAlturainicial(
                            Double.parseDouble(etH.getText().toString()),
                            Double.parseDouble(etV0.getText().toString()),
                            Double.parseDouble(etT02.getText().toString()),
                            Double.parseDouble(etG02.getText().toString())
                    )+ " m"));
                }
                //calcula V0
                else if (!etV.getText().toString().equals("") &&
                        !etG.getText().toString().equals("") &&
                        !etT.getText().toString().equals(""))
                {
                    etV0.setEnabled(false);
                    tvExtra02.setGravity(Gravity.CENTER);
                    tvExtra02.setBackgroundResource(R.drawable.degrade2);
                    tvExtra02.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra02.setText(Html.fromHtml(calculaVelocidadeInicial02(
                            Double.parseDouble(etH.getText().toString()),
                            Double.parseDouble(etH0.getText().toString()),
                            Double.parseDouble(etT.getText().toString()),
                            Double.parseDouble(etG02.getText().toString())
                    ) + " m"));
                }
                //calcula g
                else if (!etVZero.getText().toString().equals("") &&
                        !etV.getText().toString().equals("") &&
                        !etT.getText().toString().equals(""))
                {
                    etG.setEnabled(false);
                    tvExtra02.setGravity(Gravity.CENTER);
                    tvExtra02.setBackgroundResource(R.drawable.degrade2);
                    tvExtra02.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra02.setText(Html.fromHtml(calculaGravidade02(
                            Double.parseDouble(etH0.getText().toString()),
                            Double.parseDouble(etV.getText().toString()),
                            Double.parseDouble(etT.getText().toString()),
                            Double.parseDouble(etH.getText().toString())) + " m/s<sup>2</sup>"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void etH0Pressed()
    {
        etH0.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (etH0.getText().toString().equals(""))
                {
                    tvExtra02.setBackgroundResource(R.color.branco);
                    tvExtra02.setText("");
                    etH.setEnabled(true);
                    etV0.setEnabled(true);
                    etT02.setEnabled(true);
                    etG02.setEnabled(true);

                }
                //calcula h
                else if (!etH0.getText().toString().equals("") &&
                        !etV0.getText().toString().equals("") &&
                        !etT02.getText().toString().equals("")&&
                        !etG02.getText().toString().equals(""))
                {
                    etV0.setEnabled(false);
                    tvExtra02.setGravity(Gravity.CENTER);
                    tvExtra02.setBackgroundResource(R.drawable.degrade2);
                    tvExtra02.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra02.setText(Html.fromHtml(calculaAlturaFinal(
                            Double.parseDouble(etH0.getText().toString()),
                            Double.parseDouble(etV0.getText().toString()),
                            Double.parseDouble(etT02.getText().toString()),
                            Double.parseDouble(etG02.getText().toString())
                    )+ " m"));
                }
                //calcula V0
                else if (!etV.getText().toString().equals("") &&
                        !etG.getText().toString().equals("") &&
                        !etT.getText().toString().equals(""))
                {
                    etV0.setEnabled(false);
                    tvExtra02.setGravity(Gravity.CENTER);
                    tvExtra02.setBackgroundResource(R.drawable.degrade2);
                    tvExtra02.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra02.setText(Html.fromHtml(calculaVelocidadeInicial02(
                            Double.parseDouble(etH.getText().toString()),
                            Double.parseDouble(etH0.getText().toString()),
                            Double.parseDouble(etT.getText().toString()),
                            Double.parseDouble(etG02.getText().toString())
                    ) + " m"));
                }
                //calcula g
                else if (!etVZero.getText().toString().equals("") &&
                        !etV.getText().toString().equals("") &&
                        !etT.getText().toString().equals(""))
                {
                    etG.setEnabled(false);
                    tvExtra02.setGravity(Gravity.CENTER);
                    tvExtra02.setBackgroundResource(R.drawable.degrade2);
                    tvExtra02.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra02.setText(Html.fromHtml(calculaGravidade02(
                            Double.parseDouble(etH0.getText().toString()),
                            Double.parseDouble(etV.getText().toString()),
                            Double.parseDouble(etT.getText().toString()),
                            Double.parseDouble(etH.getText().toString())) + " m/s<sup>2</sup>"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void etV0Pressed()
    {
        etV0.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (etV0.getText().toString().equals(""))
                {
                    tvExtra02.setBackgroundResource(R.color.branco);
                    tvExtra02.setText("");
                    etH.setEnabled(true);
                    etH0.setEnabled(true);
                    etT02.setEnabled(true);
                    etG02.setEnabled(true);

                }
                //calcula h
                else if (!etH0.getText().toString().equals("") &&
                        !etV0.getText().toString().equals("") &&
                        !etT02.getText().toString().equals("")&&
                        !etG02.getText().toString().equals(""))
                {
                    etV0.setEnabled(false);
                    tvExtra02.setGravity(Gravity.CENTER);
                    tvExtra02.setBackgroundResource(R.drawable.degrade2);
                    tvExtra02.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra02.setText(Html.fromHtml(calculaAlturaFinal(
                            Double.parseDouble(etH0.getText().toString()),
                            Double.parseDouble(etV0.getText().toString()),
                            Double.parseDouble(etT02.getText().toString()),
                            Double.parseDouble(etG02.getText().toString())
                    )+ " m"));
                }
                //calcula V0
                else if (!etV.getText().toString().equals("") &&
                        !etG.getText().toString().equals("") &&
                        !etT.getText().toString().equals(""))
                {
                    etV0.setEnabled(false);
                    tvExtra02.setGravity(Gravity.CENTER);
                    tvExtra02.setBackgroundResource(R.drawable.degrade2);
                    tvExtra02.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra02.setText(Html.fromHtml(calculaVelocidadeInicial02(
                            Double.parseDouble(etH.getText().toString()),
                            Double.parseDouble(etH0.getText().toString()),
                            Double.parseDouble(etT.getText().toString()),
                            Double.parseDouble(etG02.getText().toString())
                    ) + " m"));
                }
                //calcula g
                else if (!etVZero.getText().toString().equals("") &&
                        !etV.getText().toString().equals("") &&
                        !etT.getText().toString().equals(""))
                {
                    etG.setEnabled(false);
                    tvExtra02.setGravity(Gravity.CENTER);
                    tvExtra02.setBackgroundResource(R.drawable.degrade2);
                    tvExtra02.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra02.setText(Html.fromHtml(calculaGravidade02(
                            Double.parseDouble(etH0.getText().toString()),
                            Double.parseDouble(etV.getText().toString()),
                            Double.parseDouble(etT.getText().toString()),
                            Double.parseDouble(etH.getText().toString())) + " m/s<sup>2</sup>"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    //3
    //v = √(Vo^2 + (2 * g * h))
    private double velocidadeFinal(double velocidadeInicial, double gravidade, double altura)
    {
        return  Math.sqrt((Math.pow(velocidadeInicial, 2) + (2 * gravidade * altura)));
    }

    //v0 = √(V^2 - (2 * g * h))
    private double calculaV0(double velocidadeFinal, double gravidade, double altura)
    {
        return Math.sqrt(Math.pow(velocidadeFinal, 2) - (2 * gravidade * altura));
    }

    //h = (v^2 - v0^2) / (2 * g)
    private double calculaAlturaFinal03(double velocidadeFinal, double velocidadeInicial, double gravidade)
    {
        return ((Math.pow(velocidadeFinal, 2) - Math.pow(velocidadeInicial, 2)) / (2 * gravidade));
    }

    //g = (v^2 - v0^2) / (2 * h)
    private double calculaGravidade03(double velocidadeInicial, double velocidadeFinal, double altura)
    {
        return ((Math.pow(velocidadeFinal, 2) - Math.pow(velocidadeInicial, 2)) / (2 * altura));
    }

    private void velocideFinalPressed()
    {
        velociddeFinal.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (velociddeFinal.getText().toString().equals(""))
                {
                    tvExtra03.setBackgroundResource(R.color.branco);
                    tvExtra03.setText("");
                    velocidadeInicial.setEnabled(true);
                    gravidade.setEnabled(true);
                    altura.setEnabled(true);
                }
                //calcula Velocidade inicial (V0)
                else if(!velociddeFinal.getText().toString().equals("") &&
                        !gravidade.getText().toString().equals("") &&
                        !altura.getText().toString().equals(""))
                {
                    velocidadeInicial.setEnabled(false);
                    tvExtra03.setGravity(Gravity.CENTER);
                    tvExtra03.setBackgroundResource(R.drawable.degrade2);
                    tvExtra03.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra03.setText(Html.fromHtml(calculaV0(
                            Double.parseDouble(velociddeFinal.getText().toString()),
                            Double.parseDouble(gravidade.getText().toString()),
                            Double.parseDouble(altura.getText().toString())) + " m/s"));
                }
                //calcula altura (H)
                else if (!velociddeFinal.getText().toString().equals("") &&
                        !velocidadeInicial.getText().toString().equals("") &&
                        !gravidade.getText().toString().equals(""))
                {
                    altura.setEnabled(false);
                    tvExtra03.setGravity(Gravity.CENTER);
                    tvExtra03.setBackgroundResource(R.drawable.degrade2);
                    tvExtra03.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra03.setText(Html.fromHtml(calculaAlturaFinal03(
                            Double.parseDouble(velociddeFinal.getText().toString()),
                            Double.parseDouble(velocidadeInicial.getText().toString()),
                            Double.parseDouble(gravidade.getText().toString())
                    ) + " m"));
                }
                //calcula Gravidade (G)
                else if (!velociddeFinal.getText().toString().equals("") &&
                        !velocidadeInicial.getText().toString().equals("") &&
                        !altura.getText().toString().equals(""))
                {
                    gravidade.setEnabled(false);
                    tvExtra03.setGravity(Gravity.CENTER);
                    tvExtra03.setBackgroundResource(R.drawable.degrade2);
                    tvExtra03.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra03.setText(Html.fromHtml(calculaGravidade03(
                            Double.parseDouble(velocidadeInicial.getText().toString()),
                            Double.parseDouble(velociddeFinal.getText().toString()),
                            Double.parseDouble(altura.getText().toString())) + " m/s<sup>2</sup>"));
                }
            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });
    }

    private void velocideInicialPressed()
    {
        velocidadeInicial.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (velocidadeInicial.getText().toString().equals(""))
                {
                    tvExtra03.setBackgroundResource(R.color.branco);
                    tvExtra03.setText("");
                    velociddeFinal.setEnabled(true);
                    gravidade.setEnabled(true);
                    altura.setEnabled(true);
                }
                //calcula Velocidade final (V)
                else if(!velocidadeInicial.getText().toString().equals("") &&
                        !gravidade.getText().toString().equals("") &&
                        !altura.getText().toString().equals(""))
                {
                    velociddeFinal.setEnabled(false);
                    tvExtra03.setGravity(Gravity.CENTER);
                    tvExtra03.setBackgroundResource(R.drawable.degrade2);
                    tvExtra03.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra03.setText(Html.fromHtml(velocidadeFinal(
                            Double.parseDouble(velocidadeInicial.getText().toString()),
                            Double.parseDouble(gravidade.getText().toString()),
                            Double.parseDouble(altura.getText().toString())) + " m/s"));
                }
                //calcula altura (H)
                else if (!velocidadeInicial.getText().toString().equals("") &&
                        !velociddeFinal.getText().toString().equals("") &&
                        !gravidade.getText().toString().equals(""))
                {
                    altura.setEnabled(false);
                    tvExtra03.setGravity(Gravity.CENTER);
                    tvExtra03.setBackgroundResource(R.drawable.degrade2);
                    tvExtra03.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra03.setText(Html.fromHtml(calculaAlturaFinal03(
                            Double.parseDouble(velociddeFinal.getText().toString()),
                            Double.parseDouble(velocidadeInicial.getText().toString()),
                            Double.parseDouble(gravidade.getText().toString())
                    ) + " m"));
                }
                //calcula Gravidade (G)
                else if (!velocidadeInicial.getText().toString().equals("") &&
                        !velocidadeInicial.getText().toString().equals("") &&
                        !altura.getText().toString().equals(""))
                {
                    gravidade.setEnabled(false);
                    tvExtra03.setGravity(Gravity.CENTER);
                    tvExtra03.setBackgroundResource(R.drawable.degrade2);
                    tvExtra03.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra03.setText(Html.fromHtml(calculaGravidade03(
                            Double.parseDouble(velocidadeInicial.getText().toString()),
                            Double.parseDouble(velociddeFinal.getText().toString()),
                            Double.parseDouble(altura.getText().toString())) + " m/s<sup>2</sup>"));
                }
            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });
    }

    private void gravidadePressed()
    {
        gravidade.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (gravidade.getText().toString().equals(""))
                {
                    tvExtra03.setBackgroundResource(R.color.branco);
                    tvExtra03.setText("");
                    velociddeFinal.setEnabled(true);
                    velocidadeInicial.setEnabled(true);
                    altura.setEnabled(true);
                }
                //calcula Velocidade final (V)
                else if(!velocidadeInicial.getText().toString().equals("") &&
                        !gravidade.getText().toString().equals("") &&
                        !altura.getText().toString().equals(""))
                {
                    velociddeFinal.setEnabled(false);
                    tvExtra03.setGravity(Gravity.CENTER);
                    tvExtra03.setBackgroundResource(R.drawable.degrade2);
                    tvExtra03.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra03.setText(Html.fromHtml(velocidadeFinal(
                            Double.parseDouble(velocidadeInicial.getText().toString()),
                            Double.parseDouble(gravidade.getText().toString()),
                            Double.parseDouble(altura.getText().toString())) + " m/s"));
                }
                //calcula altura (H)
                else if (!velocidadeInicial.getText().toString().equals("") &&
                        !velociddeFinal.getText().toString().equals("") &&
                        !gravidade.getText().toString().equals(""))
                {
                    altura.setEnabled(false);
                    tvExtra03.setGravity(Gravity.CENTER);
                    tvExtra03.setBackgroundResource(R.drawable.degrade2);
                    tvExtra03.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra03.setText(Html.fromHtml(calculaAlturaFinal03(
                            Double.parseDouble(velociddeFinal.getText().toString()),
                            Double.parseDouble(velocidadeInicial.getText().toString()),
                            Double.parseDouble(gravidade.getText().toString())
                    ) + " m"));
                }
                //calcula Velocidade inicial (V0)
                else if(!velociddeFinal.getText().toString().equals("") &&
                        !gravidade.getText().toString().equals("") &&
                        !altura.getText().toString().equals(""))
                {
                    velocidadeInicial.setEnabled(false);
                    tvExtra03.setGravity(Gravity.CENTER);
                    tvExtra03.setBackgroundResource(R.drawable.degrade2);
                    tvExtra03.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra03.setText(Html.fromHtml(calculaV0(
                            Double.parseDouble(velociddeFinal.getText().toString()),
                            Double.parseDouble(gravidade.getText().toString()),
                            Double.parseDouble(altura.getText().toString())) + " m/s"));
                }
            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });
    }

    private void alturaPressed()
    {
        altura.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (altura.getText().toString().equals(""))
                {
                    tvExtra03.setBackgroundResource(R.color.branco);
                    tvExtra03.setText("");
                    velociddeFinal.setEnabled(true);
                    velocidadeInicial.setEnabled(true);
                    gravidade.setEnabled(true);
                }
                //calcula Velocidade final (V)
                else if(!velocidadeInicial.getText().toString().equals("") &&
                        !gravidade.getText().toString().equals("") &&
                        !altura.getText().toString().equals(""))
                {
                    velociddeFinal.setEnabled(false);
                    tvExtra03.setGravity(Gravity.CENTER);
                    tvExtra03.setBackgroundResource(R.drawable.degrade2);
                    tvExtra03.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra03.setText(Html.fromHtml(velocidadeFinal(
                            Double.parseDouble(velocidadeInicial.getText().toString()),
                            Double.parseDouble(gravidade.getText().toString()),
                            Double.parseDouble(altura.getText().toString())) + " m/s"));
                }
                //calcula Gravidade (G)
                else if (!velocidadeInicial.getText().toString().equals("") &&
                        !velocidadeInicial.getText().toString().equals("") &&
                        !altura.getText().toString().equals(""))
                {
                    gravidade.setEnabled(false);
                    tvExtra03.setGravity(Gravity.CENTER);
                    tvExtra03.setBackgroundResource(R.drawable.degrade2);
                    tvExtra03.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra03.setText(Html.fromHtml(calculaGravidade03(
                            Double.parseDouble(velocidadeInicial.getText().toString()),
                            Double.parseDouble(velociddeFinal.getText().toString()),
                            Double.parseDouble(altura.getText().toString())) + " m/s<sup>2</sup>"));
                }
                //calcula Velocidade inicial (V0)
                else if(!velociddeFinal.getText().toString().equals("") &&
                        !gravidade.getText().toString().equals("") &&
                        !altura.getText().toString().equals(""))
                {
                    velocidadeInicial.setEnabled(false);
                    tvExtra03.setGravity(Gravity.CENTER);
                    tvExtra03.setBackgroundResource(R.drawable.degrade2);
                    tvExtra03.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra03.setText(Html.fromHtml(calculaV0(
                            Double.parseDouble(velociddeFinal.getText().toString()),
                            Double.parseDouble(gravidade.getText().toString()),
                            Double.parseDouble(altura.getText().toString())) + " m/s"));
                }
            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });
    }
}
