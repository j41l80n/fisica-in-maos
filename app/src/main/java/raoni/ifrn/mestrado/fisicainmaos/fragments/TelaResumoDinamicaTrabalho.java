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

public class TelaResumoDinamicaTrabalho extends Fragment
{
    private View rootView;

    private TextView tvExtra1;
    private TextView tvExtra2;
    private TextView tvExtra3;

    private EditText trabalho;
    private EditText forca;
    private EditText deslocamento;
    private EditText cosT;

    private EditText trabalho2;
    private EditText peso;
    private EditText altura;

    private EditText trabalho3;
    private EditText constanteElastica;
    private EditText deformacao;

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        configuraTextView();
        configuraEditText();
        //1
        trabalhoPressed();
        forcaPressed();
        deslocamentoPressed();
        cosTPressed();
        //2
        trabalho2Pressed();
        pesoPressed();
        alturaPressed();
        //3
        trabalho3Pressed();
        constanteElasticaPressed();
        deformacaoPressed();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState)
    {
        rootView = inflater.inflate(R.layout.tela_resumo_dinamica_trabalho, container, false);
        return rootView;
    }

    private void configuraTextView()
    {
        TextView tvTelaResumoDinamicaTrabalho01 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_trabalho_01);
        TextView tvTelaResumoDinamicaTrabalho02 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_trabalho_02);
        TextView tvTelaResumoDinamicaTrabalho03 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_trabalho_03);
        TextView tvTelaResumoDinamicaTrabalho04 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_trabalho_04);
        TextView tvTelaResumoDinamicaTrabalho05 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_trabalho_05);
        TextView tvTelaResumoDinamicaTrabalho06 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_trabalho_06);
        TextView tvTelaResumoDinamicaTrabalho07 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_trabalho_07);
        TextView tvTelaResumoDinamicaTrabalho08 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_trabalho_08);
        TextView tvTelaResumoDinamicaTrabalho09 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_trabalho_09);
        TextView tvTelaResumoDinamicaTrabalho10 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_trabalho_10);
        TextView tvTelaResumoDinamicaTrabalho11 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_trabalho_11);
        TextView tvTelaResumoDinamicaTrabalho12 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_trabalho_12);
        TextView tvTelaResumoDinamicaTrabalho13 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_trabalho_13);
        TextView tvTelaResumoDinamicaTrabalho14 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_trabalho_14);
        TextView tvTelaResumoDinamicaTrabalho15 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_trabalho_15);
        TextView tvTelaResumoDinamicaTrabalho16 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_trabalho_16);
        TextView tvTelaResumoDinamicaTrabalho17 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_trabalho_17);
        TextView tvTelaResumoDinamicaTrabalho18 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_trabalho_18);
        TextView tvTelaResumoDinamicaTrabalho19 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_trabalho_19);
        TextView tvTelaResumoDinamicaTrabalho20 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_trabalho_20);

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumoDinamicaTrabalho01.setTypeface(font);
        tvTelaResumoDinamicaTrabalho02.setTypeface(font);
        tvTelaResumoDinamicaTrabalho03.setTypeface(font);
        tvTelaResumoDinamicaTrabalho04.setTypeface(font);
        tvTelaResumoDinamicaTrabalho05.setTypeface(font);
        tvTelaResumoDinamicaTrabalho06.setTypeface(font);
        tvTelaResumoDinamicaTrabalho07.setTypeface(font);
        tvTelaResumoDinamicaTrabalho08.setTypeface(font);
        tvTelaResumoDinamicaTrabalho09.setTypeface(font);
        tvTelaResumoDinamicaTrabalho10.setTypeface(font);
        tvTelaResumoDinamicaTrabalho11.setTypeface(font);
        tvTelaResumoDinamicaTrabalho12.setTypeface(font);
        tvTelaResumoDinamicaTrabalho13.setTypeface(font);
        tvTelaResumoDinamicaTrabalho14.setTypeface(font);
        tvTelaResumoDinamicaTrabalho15.setTypeface(font);
        tvTelaResumoDinamicaTrabalho16.setTypeface(font);
        tvTelaResumoDinamicaTrabalho17.setTypeface(font);
        tvTelaResumoDinamicaTrabalho18.setTypeface(font);
        tvTelaResumoDinamicaTrabalho19.setTypeface(font);
        tvTelaResumoDinamicaTrabalho20.setTypeface(font);

        tvExtra1 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_04_extra_01);
        tvExtra2 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_04_extra_02);
        tvExtra3 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_04_extra_03);

         tvTelaResumoDinamicaTrabalho01.setText(Html.fromHtml("<p>Quantidade de energia retirada" +
                 " ou fornecida a um corpo, para que o mesmo realize um deslocamento.</p>" +
                "<p><b>Unidade: Joule (J = N.m)</b></p>"));
        tvTelaResumoDinamicaTrabalho02.setText(Html.fromHtml("Trabalho (τ ou w) = "));
        tvTelaResumoDinamicaTrabalho03.setText(Html.fromHtml("Força (F) = "));
        tvTelaResumoDinamicaTrabalho04.setText(Html.fromHtml("Deslocamento (d) = "));
        tvTelaResumoDinamicaTrabalho05.setText(Html.fromHtml("Cos&theta; = "));
        tvTelaResumoDinamicaTrabalho06.setText(Html.fromHtml("<p>É importante lembrar que " +
                "o trabalho realizado não depende da distância percorrida e sim do " +
                "deslocamento.</p>"));
        tvTelaResumoDinamicaTrabalho07.setText(Html.fromHtml("<p>Na situação acima o trabalho é o mesmo para as três bolinhas, pois a altura (deslocamento) é o mesmo, independente da trajetória.</p>" +
                "<p><b>Trabalho motor (+):</b></p>" +
                "<p>Ocorre quando o ângulo aplicado está entre 0&deg; e 90&deg;. A força F aplicada favorece o deslocamento fornecendo energia ao corpo.</p>"));
        tvTelaResumoDinamicaTrabalho08.setText(Html.fromHtml("<p><b>Trabalho resistente (-):</b></p>" +
                "<p>Ocorre quando o ângulo aplicado está entre 90&deg; e 180&deg;. A força F aplicada é contrária ao deslocamento, retirando energia do corpo.</p>"));
        tvTelaResumoDinamicaTrabalho09.setText(Html.fromHtml("<p><b>Trabalho nulo:</b></p>" +
                "<p>Para forças aplicadas perpendicularmente ao deslocamento do corpo (W = 90&deg; ou 270&deg;)</p>"));
        tvTelaResumoDinamicaTrabalho10.setText(Html.fromHtml("<p>O trabalho realizado pela força centrípeta é sempre nulo.</p>" +
                "<p>O trabalho realizado pela força de atrito é sempre negativa.</p>" +
                "<p>A área de um gráfico Fxd representa o trabalho realizado por um corpo.</p>"));
        tvTelaResumoDinamicaTrabalho11.setText(Html.fromHtml("<p>Determine o trabalho representado pelo gráfico acima.</p>" +
                "<p>Trabalho da força Peso:</p>" +
                "<p>Trabalho realizado para elevar ou baixar um corpo de certa altura.</p>" ));
        tvTelaResumoDinamicaTrabalho12.setText(Html.fromHtml("Trabalho (W) = "));
        tvTelaResumoDinamicaTrabalho13.setText(Html.fromHtml("Peso (P) = "));
        tvTelaResumoDinamicaTrabalho14.setText(Html.fromHtml("Altura (h) = "));
        tvTelaResumoDinamicaTrabalho15.setText(Html.fromHtml("<p>Onde: <b>+W</b> durante a descida</p>" +
                "<p><b>-W</b> durante a subida</p>"));
        tvTelaResumoDinamicaTrabalho16.setText(Html.fromHtml("<p><b>Trabalho da força elástica:</b></p>" +
                "<p>Trabalho realizado para deformar uma mola, distendendo ou comprimindo-a.</p>"));
        tvTelaResumoDinamicaTrabalho17.setText(Html.fromHtml("Trabalho (τ ou w) = "));
        tvTelaResumoDinamicaTrabalho18.setText(Html.fromHtml("Constante elástica (K) = "));
        tvTelaResumoDinamicaTrabalho19.setText(Html.fromHtml("Deformação (x) = "));
        tvTelaResumoDinamicaTrabalho20.setText(Html.fromHtml("<p>Onde: <b>-W</b> quando a deformação da mola for forçada</p>" +
                "<p><b>+W</b> quando a mola tende a voltar naturalmente a sua posição inicial</p>"));
    }

    private void configuraEditText()
    {
        trabalho = (EditText) rootView.findViewById(R.id.et_tela_resumo_dinamica_trabalho_01);
        forca = (EditText) rootView.findViewById(R.id.et_tela_resumo_dinamica_trabalho_02);
        deslocamento = (EditText) rootView.findViewById(R.id.et_tela_resumo_dinamica_trabalho_03);
        cosT = (EditText) rootView.findViewById(R.id.et_tela_resumo_dinamica_trabalho_04);

        trabalho2 = (EditText) rootView.findViewById(R.id.et_tela_resumo_dinamica_trabalho_05);
        peso = (EditText) rootView.findViewById(R.id.et_tela_resumo_dinamica_trabalho_06);
        altura = (EditText) rootView.findViewById(R.id.et_tela_resumo_dinamica_trabalho_07);

        trabalho3 = (EditText) rootView.findViewById(R.id.et_tela_resumo_dinamica_trabalho_08);
        constanteElastica = (EditText) rootView.findViewById(R.id.et_tela_resumo_dinamica_trabalho_09);
        deformacao = (EditText) rootView.findViewById(R.id.et_tela_resumo_dinamica_trabalho_10);
    }

    //1
    //w = f * d * cosϴ
    private double trabalho(double f, double d, double cos)
    {
        //
        return f * d * cos;
    }

    //f = w / d
    private double forca(double w, double d)
    {
        //
        return w / d;
    }

    //d = w / f
    private double deslocamento(double w, double f)
    {
        //
        return w / f;
    }

    private void trabalhoPressed()
    {
        trabalho.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (trabalho.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.color.branco);
                    tvExtra1.setText("");
                    forca.setEnabled(true);
                    deslocamento.setEnabled(true);
                    cosT.setEnabled(true);
                }
                //calcula Forca (F)
                else if (!trabalho.getText().toString().equals("") &&
                        !deslocamento.getText().toString().equals(""))
                {
                    forca.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setText(Html.fromHtml(forca(
                            Double.parseDouble(trabalho.getText().toString()),
                            Double.parseDouble(deslocamento.getText().toString())
                    ) + " N"));
                }
                //calcula Deslocamento (d)
                else if (!trabalho.getText().toString().equals("") &&
                        !forca.getText().toString().equals(""))
                {
                    deslocamento.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setText(Html.fromHtml(deslocamento(
                            Double.parseDouble(trabalho.getText().toString()),
                            Double.parseDouble(forca.getText().toString())
                    ) + " m"));
                }
            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });
    }

    private void forcaPressed()
    {
        forca.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (forca.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.color.branco);
                    tvExtra1.setText("");
                    trabalho.setEnabled(true);
                    deslocamento.setEnabled(true);
                    cosT.setEnabled(true);
                }
                //calcula Trabalho (w)
                else if (!forca.getText().toString().equals("") &&
                        !deslocamento.getText().toString().equals("")&&
                        !cosT.getText().toString().equals(""))
                {
                    trabalho.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setText(Html.fromHtml(trabalho(
                            Double.parseDouble(forca.getText().toString()),
                            Double.parseDouble(deslocamento.getText().toString()),
                            Double.parseDouble(cosT.getText().toString())
                    ) + " J"));
                }
                //calcula Deslocamento (d)
                else if (!trabalho.getText().toString().equals("") &&
                        !forca.getText().toString().equals(""))
                {
                    deslocamento.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setText(Html.fromHtml(deslocamento(
                            Double.parseDouble(trabalho.getText().toString()),
                            Double.parseDouble(forca.getText().toString())
                    ) + " m"));
                }
            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });
    }

    private void deslocamentoPressed()
    {
        deslocamento.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (deslocamento.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.color.branco);
                    tvExtra1.setText("");
                    trabalho.setEnabled(true);
                    forca.setEnabled(true);
                    cosT.setEnabled(true);
                }
                //calcula Trabalho (w)
                else if (!forca.getText().toString().equals("") &&
                        !deslocamento.getText().toString().equals("")&&
                        !cosT.getText().toString().equals(""))
                {
                    trabalho.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setText(Html.fromHtml(trabalho(
                            Double.parseDouble(forca.getText().toString()),
                            Double.parseDouble(deslocamento.getText().toString()),
                            Double.parseDouble(cosT.getText().toString())
                    ) + " J"));
                }
                //calcula Forca (f)
                else if (!trabalho.getText().toString().equals("") &&
                        !deslocamento.getText().toString().equals(""))
                {
                    forca.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setText(forca(
                            Double.parseDouble(trabalho.getText().toString()),
                            Double.parseDouble(deslocamento.getText().toString())
                    ) + " N");
                }
            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });
    }

    private void cosTPressed()
    {
        cosT.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (cosT.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.color.branco);
                    tvExtra1.setText("");
                    trabalho.setEnabled(true);
                    forca.setEnabled(true);
                    deslocamento.setEnabled(true);
                }
                //calcula Trabalho (w)
                else if (!forca.getText().toString().equals("") &&
                        !deslocamento.getText().toString().equals("")&&
                        !cosT.getText().toString().equals(""))
                {
                    trabalho.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setText(Html.fromHtml(trabalho(
                            Double.parseDouble(forca.getText().toString()),
                            Double.parseDouble(deslocamento.getText().toString()),
                            Double.parseDouble(cosT.getText().toString())
                    ) + " J"));
                }
            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });
    }

    //2
    //w = P * h
    private double w(double p, double h)
    {
        //
        return  p * h;
    }

    //p = w / h
    private double p(double w, double h)
    {
        //
        return  w / h;
    }

    //h = w / p
    private double h(double w, double p)
    {
        //
        return  w / p;
    }

    private void trabalho2Pressed()
    {
        trabalho2.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (trabalho2.getText().toString().equals(""))
                {
                    tvExtra2.setBackgroundResource(R.color.branco);
                    tvExtra2.setText("");
                    peso.setEnabled(true);
                    altura.setEnabled(true);
                }
                //calcula Peso (p)
                else if (!trabalho2.getText().toString().equals("") &&
                        !altura.getText().toString().equals(""))
                {
                    peso.setEnabled(false);
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setText(Html.fromHtml(p(
                            Double.parseDouble(trabalho2.getText().toString()),
                            Double.parseDouble(altura.getText().toString())
                    ) + " N"));
                }
                //calcula Altura (h)
                else if (!trabalho2.getText().toString().equals("") &&
                        !peso.getText().toString().equals(""))
                {
                    altura.setEnabled(false);
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setText(Html.fromHtml(h(
                            Double.parseDouble(trabalho2.getText().toString()),
                            Double.parseDouble(peso.getText().toString())
                    ) + " m"));
                }
            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });
    }

    private void pesoPressed()
    {
        peso.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (peso.getText().toString().equals(""))
                {
                    tvExtra2.setText("");
                    trabalho2.setEnabled(true);
                    altura.setEnabled(true);
                    tvExtra2.setBackgroundResource(R.color.branco);
                }
                //calcula Trabalho (w)
                else if (!peso.getText().toString().equals("") &&
                        !altura.getText().toString().equals(""))
                {
                    trabalho2.setEnabled(false);
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setText(Html.fromHtml(w(
                            Double.parseDouble(peso.getText().toString()),
                            Double.parseDouble(altura.getText().toString())
                    ) + " J"));
                }
                //calcula Altura (h)
                else if (!trabalho2.getText().toString().equals("") &&
                        !peso.getText().toString().equals(""))
                {
                    altura.setEnabled(false);
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setText(Html.fromHtml(h(
                            Double.parseDouble(trabalho2.getText().toString()),
                            Double.parseDouble(peso.getText().toString())
                    ) + " m"));
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
                    tvExtra2.setBackgroundResource(R.color.branco);
                    tvExtra2.setText("");
                    trabalho2.setEnabled(true);
                    peso.setEnabled(true);
                }
                //calcula Trabalho (w)
                else if (!peso.getText().toString().equals("") &&
                        !altura.getText().toString().equals(""))
                {
                    trabalho2.setEnabled(false);
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setText(Html.fromHtml(w(
                            Double.parseDouble(peso.getText().toString()),
                            Double.parseDouble(altura.getText().toString())
                    ) + " J"));
                }
                //calcula Peso (p)
                else if (!trabalho2.getText().toString().equals("") &&
                        !altura.getText().toString().equals(""))
                {
                    peso.setEnabled(false);
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setText(Html.fromHtml(p(
                            Double.parseDouble(trabalho2.getText().toString()),
                            Double.parseDouble(altura.getText().toString())
                    ) + " N"));
                }
            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });
    }

    //3
    //w = (K * x^2) / 2
    private double trabalhoElastico(double k, double x)
    {
        //
        return  (k * Math.pow(x, 2)) / 2;
    }

    //x = √(2 w / k)
    private double deformacaox(double k, double w)
    {
        //
        return Math.sqrt((2 * w) / k);
    }

    //k = 2 * w / x^2
    private double constElastica(double w, double x)
    {
        //
        return (2 * w) / Math.pow(x, 2);
    }

    private void trabalho3Pressed()
    {
        trabalho3.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (trabalho3.getText().toString().equals(""))
                {
                    tvExtra3.setBackgroundResource(R.color.branco);
                    tvExtra3.setText("");
                    constanteElastica.setEnabled(true);
                    deformacao.setEnabled(true);
                }
                //calcula Deformacao (x)
                else if (!trabalho3.getText().toString().equals("") &&
                        !constanteElastica.getText().toString().equals(""))
                {
                    deformacao.setEnabled(false);
                    tvExtra3.setBackgroundResource(R.drawable.degrade2);
                    tvExtra3.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra3.setGravity(Gravity.CENTER);
                    tvExtra3.setText(Html.fromHtml(deformacaox(
                            Double.parseDouble(constanteElastica.getText().toString()),
                            Double.parseDouble(trabalho3.getText().toString())
                    ) + " m"));
                }
                //calcula Constante K (K)
                else if (!trabalho3.getText().toString().equals("") &&
                        !deformacao.getText().toString().equals(""))
                {
                    constanteElastica.setEnabled(false);
                    tvExtra3.setBackgroundResource(R.drawable.degrade2);
                    tvExtra3.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra3.setGravity(Gravity.CENTER);
                    tvExtra3.setText(Html.fromHtml(constElastica(
                            Double.parseDouble(trabalho3.getText().toString()),
                            Double.parseDouble(deformacao.getText().toString())
                    ) + " N/m"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void constanteElasticaPressed()
    {
        constanteElastica.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (constanteElastica.getText().toString().equals(""))
                {
                    tvExtra3.setBackgroundResource(R.color.branco);
                    tvExtra3.setText("");
                    trabalho3.setEnabled(true);
                    deformacao.setEnabled(true);
                }
                //calcula Deformacao (x)
                else if (!trabalho3.getText().toString().equals("") &&
                        !constanteElastica.getText().toString().equals(""))
                {
                    deformacao.setEnabled(false);
                    tvExtra3.setBackgroundResource(R.drawable.degrade2);
                    tvExtra3.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra3.setGravity(Gravity.CENTER);
                    tvExtra3.setText(Html.fromHtml(deformacaox(
                            Double.parseDouble(constanteElastica.getText().toString()),
                            Double.parseDouble(trabalho3.getText().toString())
                    ) + " m"));
                }
                //calcula Trabalho (w)
                else if (!constanteElastica.getText().toString().equals("") &&
                        !deformacao.getText().toString().equals(""))
                {
                    trabalho3.setEnabled(false);
                    tvExtra3.setBackgroundResource(R.drawable.degrade2);
                    tvExtra3.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra3.setGravity(Gravity.CENTER);
                    tvExtra3.setText(Html.fromHtml(trabalhoElastico(
                            Double.parseDouble(constanteElastica.getText().toString()),
                            Double.parseDouble(deformacao.getText().toString())
                    ) + " J"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void deformacaoPressed()
    {
        deformacao.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (deformacao.getText().toString().equals(""))
                {
                    tvExtra3.setBackgroundResource(R.color.branco);
                    tvExtra3.setText("");
                    trabalho3.setEnabled(true);
                    constanteElastica.setEnabled(true);
                }
                //calcula Constante K (K)
                else if (!trabalho3.getText().toString().equals("") &&
                        !deformacao.getText().toString().equals(""))
                {
                    constanteElastica.setEnabled(false);
                    tvExtra3.setBackgroundResource(R.drawable.degrade2);
                    tvExtra3.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra3.setGravity(Gravity.CENTER);
                    tvExtra3.setText(Html.fromHtml(constElastica(
                            Double.parseDouble(trabalho3.getText().toString()),
                            Double.parseDouble(deformacao.getText().toString())
                    ) + " N/m"));
                }
                //calcula Trabalho (w)
                else if (!constanteElastica.getText().toString().equals("") &&
                        !deformacao.getText().toString().equals(""))
                {
                    trabalho3.setEnabled(false);
                    tvExtra3.setBackgroundResource(R.drawable.degrade2);
                    tvExtra3.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra3.setGravity(Gravity.CENTER);
                    tvExtra3.setText(Html.fromHtml(trabalhoElastico(
                            Double.parseDouble(constanteElastica.getText().toString()),
                            Double.parseDouble(deformacao.getText().toString())
                    ) + " J"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
