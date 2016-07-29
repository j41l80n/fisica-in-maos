package raoni.ifrn.mestrado.fisicainmaos.fragments;

import android.graphics.Typeface;
import android.os.Bundle;
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

public class TelaResumoHidrodinamicaVazao extends Fragment
{
    private View rootView;
    private TextView tvExtra1;
    private TextView tvExtra2;
    private TextView tvExtra3;

    private EditText vazao;
    private EditText variacaoVolume;
    private EditText variacaoTempo;

    private EditText vazao2;
    private EditText area;
    private EditText velocidade;

    private EditText areaPonto1;
    private EditText velocidadePonto1;
    private EditText areaPonto2;
    private EditText velocidadePonto2;

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        configuraTextView();
        configuraEditText();
        //1
        vazaoPressed();
        variacaoVolumePressed();
        variacaoTempoPressed();
        //2
        vazao2Pressed();
        areaPressed();
        velocidadePressed();
        //3
        areaPonto1Pressed();
        velocidadePonto1Pressed();
        areaPonto2Pressed();
        velocidadePonto2Pressed();
    }

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState)
    {
        super.onCreateView(inflater, container, savedInstanceState);
        rootView = inflater.inflate(R.layout.tela_resumo_hidrodinamica_vazao, container, false);
        return rootView;
    }

    private void configuraTextView()
    {
        TextView tvTelaResumovazao01 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrodinamica_vazao_01);
        TextView tvTelaResumovazao02 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrodinamica_vazao_02);
        TextView tvTelaResumovazao03 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrodinamica_vazao_03);
        TextView tvTelaResumovazao04 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrodinamica_vazao_04);
        TextView tvTelaResumovazao05 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrodinamica_vazao_05);
        TextView tvTelaResumovazao06 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrodinamica_vazao_06);
        TextView tvTelaResumovazao07 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrodinamica_vazao_07);
        TextView tvTelaResumovazao08 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrodinamica_vazao_08);
        TextView tvTelaResumovazao09 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrodinamica_vazao_09);
        TextView tvTelaResumovazao10 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrodinamica_vazao_10);
        TextView tvTelaResumovazao11 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrodinamica_vazao_11);
        TextView tvTelaResumovazao12 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrodinamica_vazao_12);
        TextView tvTelaResumovazao13 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrodinamica_vazao_13);
        TextView tvTelaResumovazao14 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrodinamica_vazao_14);
        TextView tvTelaResumovazao15 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrodinamica_vazao_15);
        TextView tvTelaResumovazao16 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrodinamica_vazao_16);

        TextView unidades001 = (TextView) rootView.findViewById(R.id.tv_unidades_0026);
        TextView unidades002 = (TextView) rootView.findViewById(R.id.tv_unidades_0027);
        TextView unidades003 = (TextView) rootView.findViewById(R.id.tv_unidades_0028);
        TextView unidades004 = (TextView) rootView.findViewById(R.id.tv_unidades_0029);
        TextView unidades005 = (TextView) rootView.findViewById(R.id.tv_unidades_0030);
        TextView unidades006 = (TextView) rootView.findViewById(R.id.tv_unidades_0031);
        TextView unidades007 = (TextView) rootView.findViewById(R.id.tv_unidades_0032);
        TextView unidades008 = (TextView) rootView.findViewById(R.id.tv_unidades_0033);
        TextView unidades009 = (TextView) rootView.findViewById(R.id.tv_unidades_0034);
        TextView unidades010 = (TextView) rootView.findViewById(R.id.tv_unidades_0035);

        unidades001.setText(Html.fromHtml("m<sup>3</sup>/s"));
        unidades002.setText(Html.fromHtml("m<sup>3</sup>"));
        unidades003.setText(Html.fromHtml("s"));
        unidades004.setText(Html.fromHtml("m<sup>3</sup>/s"));
        unidades005.setText(Html.fromHtml("m<sup>2</sup>"));
        unidades006.setText(Html.fromHtml("m/s"));
        unidades007.setText(Html.fromHtml("m<sup>2</sup>"));
        unidades008.setText(Html.fromHtml("m/s"));
        unidades009.setText(Html.fromHtml("m<sup>2</sup>"));
        unidades010.setText(Html.fromHtml("m/s"));

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumovazao01.setTypeface(font);
        tvTelaResumovazao02.setTypeface(font);
        tvTelaResumovazao03.setTypeface(font);
        tvTelaResumovazao04.setTypeface(font);
        tvTelaResumovazao05.setTypeface(font);
        tvTelaResumovazao06.setTypeface(font);
        tvTelaResumovazao07.setTypeface(font);
        tvTelaResumovazao08.setTypeface(font);
        tvTelaResumovazao09.setTypeface(font);
        tvTelaResumovazao10.setTypeface(font);
        tvTelaResumovazao11.setTypeface(font);
        tvTelaResumovazao12.setTypeface(font);
        tvTelaResumovazao13.setTypeface(font);
        tvTelaResumovazao14.setTypeface(font);
        tvTelaResumovazao15.setTypeface(font);
        tvTelaResumovazao16.setTypeface(font);

        tvExtra1 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrodinamica_02_extra_01);
        tvExtra2 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrodinamica_02_extra_02);
        tvExtra3 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrodinamica_02_extra_03);

        tvTelaResumovazao01.setText(Html.fromHtml(
                "<p>Mede o volume do fluido que atravessa uma seção transversal por unidade de tempo.</p>"));
        tvTelaResumovazao02.setText(Html.fromHtml("<p>Unidade: m<sup>3</sup>/s</p>"));
        tvTelaResumovazao03.setText(Html.fromHtml("Vazão (Z ou Q) = "));
        tvTelaResumovazao04.setText(Html.fromHtml("Variação de volume (ΔV) = "));
        tvTelaResumovazao05.setText(Html.fromHtml("Variação de tempo (Δt) = "));
        tvTelaResumovazao06.setText(Html.fromHtml("<p>O volume ocupado pelo fluido dentro do cilindro pode ser dado por:</p>" +
                "<p><i>V = A.h</i> \t=>\t Sendo h = Δx \t=>\t Z = (A.Δx)/Δt \t=>\t Sendo  v = Δx/Δt \t=>\t Z = A.v</p>"));
        tvTelaResumovazao07.setText(Html.fromHtml("Vazão (Z ou Q) = "));
        tvTelaResumovazao08.setText(Html.fromHtml("Área (A) = "));
        tvTelaResumovazao09.setText(Html.fromHtml("Velocidade (v) = "));
        tvTelaResumovazao10.setText(Html.fromHtml("<p>Equação da continuidade:</p><p>Como o fluido é incompressível,</p>"));
        tvTelaResumovazao11.setText(Html.fromHtml("<p>o volume V ao passar do ponto 1 para o ponto 2 deverá permanecer o mesmo.</p>" +
                "<p>Sendo assim a vazão no ponto 1 (Z<sub>1</sub>) tem que ser igual no ponto 2 (Z<sub>2</sub>),</p>" +
                "<p>Z = A.v \t=>\t Z<sub>1</sub> = Z<sub>2</sub></p>"));
        tvTelaResumovazao12.setText(Html.fromHtml("Área do ponto 1 (A<sub>1</sub>) = "));
        tvTelaResumovazao13.setText(Html.fromHtml("Velocidade no ponto 1 (v<sub>1</sub>) ="));
        tvTelaResumovazao14.setText(Html.fromHtml("Área do ponto 2 (A<sub>2</sub>) = "));
        tvTelaResumovazao15.setText(Html.fromHtml("Velocidade no ponto 2 (v<sub>2</sub>) = "));
        tvTelaResumovazao16.setText(Html.fromHtml("<p>, logo para se manter constante a vazão, já que diminuímos a área, devemos aumentar a velocidade.</p>" +
                "<p>v<sub>2</sub> &gt; v<sub>1</sub></p>" +
                "<p>isso acontece quando, por exemplo, apertamos a saída da água no bico de uma mangueira. </p>"));
    }

    private void configuraEditText()
    {
        vazao = (EditText) rootView.findViewById(R.id.et_tela_resumo_hidrodinamica_vazao_01);
        variacaoVolume = (EditText) rootView.findViewById(R.id.et_tela_resumo_hidrodinamica_vazao_02);
        variacaoTempo = (EditText) rootView.findViewById(R.id.et_tela_resumo_hidrodinamica_vazao_03);

        vazao2 = (EditText) rootView.findViewById(R.id.et_tela_resumo_hidrodinamica_vazao_04);
        area = (EditText) rootView.findViewById(R.id.et_tela_resumo_hidrodinamica_vazao_05);
        velocidade = (EditText) rootView.findViewById(R.id.et_tela_resumo_hidrodinamica_vazao_06);

        areaPonto1 = (EditText) rootView.findViewById(R.id.et_tela_resumo_hidrodinamica_vazao_07);
        velocidadePonto1 = (EditText) rootView.findViewById(R.id.et_tela_resumo_hidrodinamica_vazao_08);
        areaPonto2 = (EditText) rootView.findViewById(R.id.et_tela_resumo_hidrodinamica_vazao_09);
        velocidadePonto2 = (EditText) rootView.findViewById(R.id.et_tela_resumo_hidrodinamica_vazao_10);
    }

    //1
    private double vazao(double v, double t)
    {
        //Z = ΔV / Δt
        return v / t;
    }

    private double vVolume(double z, double t)
    {
        //ΔV = Z * Δt
        return z * t;
    }

    private double variacaoTempo(double v, double t)
    {
        //Δt = ΔV / Z
        return v / t;
    }

    private void vazaoPressed()
    {
        vazao.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (vazao.getText().toString().equals(""))
                {
                    tvExtra1.setText("");
                    tvExtra1.setBackgroundResource(R.color.branco);
                    variacaoVolume.setEnabled(true);
                    variacaoTempo.setEnabled(true);
                }
                //calcula variacao de tempo
                else if (!vazao.getText().toString().equals("") &&
                        !variacaoVolume.getText().toString().equals(""))
                {
                    variacaoTempo.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setText(Html.fromHtml(variacaoTempo(
                            Double.parseDouble(variacaoVolume.getText().toString()),
                            Double.parseDouble(vazao.getText().toString())
                    ) + " s"));
                }
                //calcula variacao de volume
                else if (!vazao.getText().toString().equals("") &&
                        !variacaoTempo.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    variacaoVolume.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(vVolume(
                            Double.parseDouble(vazao.getText().toString()),
                            Double.parseDouble(variacaoTempo.getText().toString())
                    ) + " m<sup>3</sup>"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void variacaoVolumePressed()
    {
        variacaoVolume.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (variacaoVolume.getText().toString().equals(""))
                {
                    tvExtra1.setText("");
                    tvExtra1.setBackgroundResource(R.color.branco);
                    vazao.setEnabled(true);
                    variacaoTempo.setEnabled(true);
                }
                //calcula variacao de tempo
                else if (!vazao.getText().toString().equals("") &&
                        !variacaoVolume.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    variacaoTempo.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(variacaoTempo(
                            Double.parseDouble(variacaoVolume.getText().toString()),
                            Double.parseDouble(vazao.getText().toString())
                    ) + " s"));
                }
                //calcula vazao
                else if (!variacaoVolume.getText().toString().equals("") &&
                        !variacaoTempo.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    vazao.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(vazao(
                            Double.parseDouble(variacaoVolume.getText().toString()),
                            Double.parseDouble(variacaoTempo.getText().toString())
                    ) + " m<sup>3</sup>/s"));
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
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (variacaoTempo.getText().toString().equals(""))
                {
                    tvExtra1.setText("");
                    tvExtra1.setBackgroundResource(R.color.branco);
                    vazao.setEnabled(true);
                    variacaoVolume.setEnabled(true);
                }
                //calcula variacao de volume
                else if (!vazao.getText().toString().equals("") &&
                        !variacaoTempo.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    variacaoVolume.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(vVolume(
                            Double.parseDouble(vazao.getText().toString()),
                            Double.parseDouble(variacaoTempo.getText().toString())
                    ) + " m<sup>3</sup>"));
                }
                //calcula vazao
                else if (!variacaoVolume.getText().toString().equals("") &&
                        !variacaoTempo.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    vazao.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(vazao(
                            Double.parseDouble(variacaoVolume.getText().toString()),
                            Double.parseDouble(variacaoTempo.getText().toString())
                    ) + " m<sup>3</sup>/s"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    //2
    private double vazaoZ(double a, double v)
    {
        //Z = A * v
        return a * v;
    }

    private double area(double z, double v)
    {
        //A = Z / v
        return z / v;
    }

    private double velocidade(double z, double a)
    {
        //v = Z / A
        return z / a;
    }

    private void vazao2Pressed()
    {
        vazao2.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (vazao2.getText().toString().equals(""))
                {
                    tvExtra2.setText("");
                    tvExtra2.setBackgroundResource(R.color.branco);
                    area.setEnabled(true);
                    velocidade.setEnabled(true);
                }
                //calcula area
                else if (!vazao2.getText().toString().equals("") &&
                        !velocidade.getText().toString().equals(""))
                {
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    area.setEnabled(false);
                    tvExtra2.setText(Html.fromHtml(area(
                            Double.parseDouble(vazao2.getText().toString()),
                            Double.parseDouble(velocidade.getText().toString())
                    ) + " m<sup>2</sup>"));
                }
                //calcula vazao
                else if (!vazao2.getText().toString().equals("") &&
                        !area.getText().toString().equals(""))
                {
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    velocidade.setEnabled(false);
                    tvExtra2.setText(Html.fromHtml(velocidade(
                            Double.parseDouble(vazao2.getText().toString()),
                            Double.parseDouble(area.getText().toString())
                    ) + " m/s"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void areaPressed()
    {
        area.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (area.getText().toString().equals(""))
                {
                    tvExtra2.setBackgroundResource(R.color.branco);

                    tvExtra2.setText("");
                    vazao2.setEnabled(true);
                    velocidade.setEnabled(true);
                }
                //calcula vazao
                else if (!area.getText().toString().equals("") &&
                        !velocidade.getText().toString().equals(""))
                {
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    vazao2.setEnabled(false);
                    tvExtra2.setText(Html.fromHtml(vazaoZ(
                            Double.parseDouble(area.getText().toString()),
                            Double.parseDouble(velocidade.getText().toString())
                    ) + " m<sup>3<sup>/s"));
                }
                //calcula velocidade
                else if (!vazao2.getText().toString().equals("") &&
                        !area.getText().toString().equals(""))
                {
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    velocidade.setEnabled(false);
                    tvExtra2.setText(Html.fromHtml(velocidade(
                            Double.parseDouble(vazao2.getText().toString()),
                            Double.parseDouble(area.getText().toString())
                    ) + " m/s"));
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
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (velocidade.getText().toString().equals(""))
                {
                    tvExtra2.setBackgroundResource(R.color.branco);

                    tvExtra2.setText("");
                    vazao2.setEnabled(true);
                    area.setEnabled(true);
                }
                //calcula vazao
                else if (!area.getText().toString().equals("") &&
                        !velocidade.getText().toString().equals(""))
                {
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    vazao2.setEnabled(false);
                    tvExtra2.setText(Html.fromHtml(vazaoZ(
                            Double.parseDouble(area.getText().toString()),
                            Double.parseDouble(velocidade.getText().toString())
                    ) + " m<sup>3</sup>/s"));
                }
                //calcula area
                else if (!vazao2.getText().toString().equals("") &&
                        !velocidade.getText().toString().equals(""))
                {
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    area.setEnabled(false);
                    tvExtra2.setText(Html.fromHtml(area(
                            Double.parseDouble(vazao2.getText().toString()),
                            Double.parseDouble(velocidade.getText().toString())
                    ) + " m<sup>2</sup>"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    //3
    private double a1(double a2, double v2, double v1)
    {
        //a1 = (a2 * v2) / v1
        return (a2 * v2) / v1 ;
    }

    private double v1(double a2, double v2, double a1)
    {
        //v1 = (a2 * v2) / a1
        return (a2 * v2) / a1 ;
    }

    private void areaPonto1Pressed()
    {
        areaPonto1.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (areaPonto1.getText().toString().equals(""))
                {
                    tvExtra3.setText("");
                    tvExtra3.setBackgroundResource(R.color.branco);

                    areaPonto1.setEnabled(true);
                    velocidadePonto1.setEnabled(true);
                    areaPonto2.setEnabled(true);
                    velocidadePonto2.setEnabled(true);
                }
                //v1
                else if (!areaPonto2.getText().toString().equals("") &&
                        !velocidadePonto2.getText().toString().equals("")&&
                        !areaPonto1.getText().toString().equals(""))
                {
                    tvExtra3.setBackgroundResource(R.drawable.degrade2);
                    tvExtra3.setGravity(Gravity.CENTER);
                    tvExtra3.setTextColor(getResources().getColor(R.color.branco));
                    velocidadePonto1.setEnabled(false);
                    tvExtra3.setText(Html.fromHtml(v1(
                            Double.parseDouble(areaPonto2.getText().toString()),
                            Double.parseDouble(velocidadePonto2.getText().toString()),
                            Double.parseDouble(areaPonto1.getText().toString())
                    ) + " m/s"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void velocidadePonto1Pressed()
    {
        velocidadePonto1.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (velocidadePonto1.getText().toString().equals(""))
                {
                    tvExtra3.setText("");
                    tvExtra3.setBackgroundResource(R.color.branco);

                    areaPonto1.setEnabled(true);
                    velocidadePonto1.setEnabled(true);
                    areaPonto2.setEnabled(true);
                    velocidadePonto2.setEnabled(true);
                }
                //a1
                else if (!areaPonto2.getText().toString().equals("") &&
                        !velocidadePonto2.getText().toString().equals("")&&
                        !velocidadePonto1.getText().toString().equals(""))
                {
                    tvExtra3.setBackgroundResource(R.drawable.degrade2);
                    tvExtra3.setGravity(Gravity.CENTER);
                    tvExtra3.setTextColor(getResources().getColor(R.color.branco));
                    areaPonto1.setEnabled(false);
                    tvExtra3.setText(Html.fromHtml(a1(
                            Double.parseDouble(areaPonto2.getText().toString()),
                            Double.parseDouble(velocidadePonto2.getText().toString()),
                            Double.parseDouble(velocidadePonto1.getText().toString())
                    ) + " m<sup>2</sup>"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void areaPonto2Pressed()
    {
        areaPonto2.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (areaPonto2.getText().toString().equals(""))
                {
                    tvExtra3.setText("");
                    tvExtra3.setBackgroundResource(R.color.branco);

                    areaPonto1.setEnabled(true);
                    velocidadePonto1.setEnabled(true);
                    areaPonto2.setEnabled(true);
                    velocidadePonto2.setEnabled(true);
                }
                //a1
                else if (!areaPonto2.getText().toString().equals("") &&
                        !velocidadePonto2.getText().toString().equals("")&&
                        !velocidadePonto1.getText().toString().equals(""))
                {
                    tvExtra3.setBackgroundResource(R.drawable.degrade2);
                    tvExtra3.setGravity(Gravity.CENTER);
                    tvExtra3.setTextColor(getResources().getColor(R.color.branco));
                    areaPonto1.setEnabled(false);
                    tvExtra3.setText(Html.fromHtml(a1(
                            Double.parseDouble(areaPonto2.getText().toString()),
                            Double.parseDouble(velocidadePonto2.getText().toString()),
                            Double.parseDouble(velocidadePonto1.getText().toString())
                    ) + " m<sup>2</sup>"));
                }
                //v1
                else if (!areaPonto2.getText().toString().equals("") &&
                        !velocidadePonto2.getText().toString().equals("")&&
                        !areaPonto1.getText().toString().equals(""))
                {
                    tvExtra3.setBackgroundResource(R.drawable.degrade2);
                    tvExtra3.setGravity(Gravity.CENTER);
                    tvExtra3.setTextColor(getResources().getColor(R.color.branco));
                    velocidadePonto1.setEnabled(false);
                    tvExtra3.setText(Html.fromHtml(v1(
                            Double.parseDouble(areaPonto2.getText().toString()),
                            Double.parseDouble(velocidadePonto2.getText().toString()),
                            Double.parseDouble(areaPonto1.getText().toString())
                    ) + " m/s"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void velocidadePonto2Pressed()
    {
        velocidadePonto2.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (velocidadePonto2.getText().toString().equals(""))
                {
                    tvExtra3.setText("");
                    tvExtra3.setBackgroundResource(R.color.branco);

                    areaPonto1.setEnabled(true);
                    velocidadePonto1.setEnabled(true);
                    areaPonto2.setEnabled(true);
                    velocidadePonto2.setEnabled(true);
                }
                //a1
                else if (!areaPonto2.getText().toString().equals("") &&
                        !velocidadePonto2.getText().toString().equals("")&&
                        !velocidadePonto1.getText().toString().equals(""))
                {
                    tvExtra3.setBackgroundResource(R.drawable.degrade2);
                    tvExtra3.setGravity(Gravity.CENTER);
                    tvExtra3.setTextColor(getResources().getColor(R.color.branco));
                    areaPonto1.setEnabled(false);
                    tvExtra3.setText(Html.fromHtml(a1(
                            Double.parseDouble(areaPonto2.getText().toString()),
                            Double.parseDouble(velocidadePonto2.getText().toString()),
                            Double.parseDouble(velocidadePonto1.getText().toString())
                    ) + " m<sup>2</sup>"));
                }
                //v1
                else if (!areaPonto2.getText().toString().equals("") &&
                        !velocidadePonto2.getText().toString().equals("")&&
                        !areaPonto1.getText().toString().equals(""))
                {
                    tvExtra3.setBackgroundResource(R.drawable.degrade2);
                    tvExtra3.setGravity(Gravity.CENTER);
                    tvExtra3.setTextColor(getResources().getColor(R.color.branco));
                    velocidadePonto1.setEnabled(false);
                    tvExtra3.setText(Html.fromHtml(v1(
                            Double.parseDouble(areaPonto2.getText().toString()),
                            Double.parseDouble(velocidadePonto2.getText().toString()),
                            Double.parseDouble(areaPonto1.getText().toString())
                    ) + " m/s"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
