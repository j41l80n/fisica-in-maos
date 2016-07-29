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

public class TelaResumoDinamicaEnergia extends Fragment
{
    private View rootView;
    
    private TextView tvExtra1;
    private TextView tvExtra2;
    private TextView tvExtra3;

    private EditText energiaCinetica;
    private EditText massa;
    private EditText velocidade;
    
    private EditText energiaPGravitacional;
    private EditText massa2;
    private EditText gravidade;
    private EditText altura;
    
    private EditText energiaPElastica;
    private EditText constanteElastica;
    private EditText deformacao;

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        configuraTextView();
        configuraEditText();
        
        //1
        energiaCineticaPressed();
        massaPressed();
        velocidadePressed();
        //2
        energiaPGravitacionalPressed();
        massa2Pressed();
        gravidadePressed();
        alturaPressed();
        //3
        energiaPElasticaPressed();
        constanteElasticaPressed();
        deformacaoPressed();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState)
    {
        rootView = inflater.inflate(R.layout.tela_resumo_dinamica_energia, container, false);
        return rootView;
    }

    private void configuraTextView()
    {
        TextView tvTelaResumoEnergia01 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_energia_01);
        TextView tvTelaResumoEnergia02 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_energia_02);
        TextView tvTelaResumoEnergia03 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_energia_03);
        TextView tvTelaResumoEnergia04 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_energia_04);
        TextView tvTelaResumoEnergia05 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_energia_05);
        TextView tvTelaResumoEnergia06 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_energia_06);
        TextView tvTelaResumoEnergia07 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_energia_07);
        TextView tvTelaResumoEnergia08 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_energia_08);
        TextView tvTelaResumoEnergia09 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_energia_09);
        TextView tvTelaResumoEnergia10 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_energia_10);
        TextView tvTelaResumoEnergia11 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_energia_11);
        TextView tvTelaResumoEnergia12 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_energia_12);
        TextView tvTelaResumoEnergia13 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_energia_13);
        TextView tvTelaResumoEnergia14 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_energia_14);

        TextView unidade01 = (TextView) rootView.findViewById(R.id.unidade01);

        unidade01.setText(Html.fromHtml("m/s<sup>2</sup>"));

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumoEnergia01.setTypeface(font);
        tvTelaResumoEnergia02.setTypeface(font);
        tvTelaResumoEnergia03.setTypeface(font);
        tvTelaResumoEnergia04.setTypeface(font);
        tvTelaResumoEnergia05.setTypeface(font);
        tvTelaResumoEnergia06.setTypeface(font);
        tvTelaResumoEnergia07.setTypeface(font);
        tvTelaResumoEnergia08.setTypeface(font);
        tvTelaResumoEnergia09.setTypeface(font);
        tvTelaResumoEnergia10.setTypeface(font);
        tvTelaResumoEnergia11.setTypeface(font);
        tvTelaResumoEnergia12.setTypeface(font);
        tvTelaResumoEnergia13.setTypeface(font);
        tvTelaResumoEnergia14.setTypeface(font);

        tvExtra1 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_05_extra_01);
        tvExtra2 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_05_extra_02);
        tvExtra3 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_05_extra_03);

        tvTelaResumoEnergia01.setText(Html.fromHtml(
                "<p align=&ldquo;justify&rdquo;>Propriedade que determinado corpo ou sistema possui que lhe permite realizar trabalho.</p>" +
                "<p>PRINCÍPIO DE CONSERVAÇÃO DA ENERGIA:</p>" +
                "<p align=&ldquo;justify&rdquo;>&ldquo;A energia não pode ser criada nem destruída, apenas transformada&rdquo;.</p>" +
                "<p align=&ldquo;justify&rdquo;>São exemplos de energia: Química, sonora, luminosa, elétrica, mecânica, térmica, eólica...</p>" +
                "<p align=&ldquo;justify&rdquo;>Sistema dissipativo: Parte da energia mecânica é dissipada, devido a presença de forças dissipativas (resistência do ar, atrito, etc), sendo assim a energia mecânica não se coserva.</p>" +
                "<p align=&ldquo;justify&rdquo;>Sistema conservativo: Atuam apenas forças conservativas, que permitem a energia mecânica do sistema se conservar.</p>" +
                "" +
                "<p>ENERGIA MECÂNICA:</p>" +
                "<p>É composta pelas energias cinética e potencias (gravitacional e elástica).</p>" +
                "<p>CINÉTICA:</p>" +
                "<p>Energia associada a corpos em movimento</p>"));

        tvTelaResumoEnergia02.setText(Html.fromHtml("Energia cinética (E<sub>c</sub>) = "));
        tvTelaResumoEnergia03.setText(Html.fromHtml("Massa (m) = "));
        tvTelaResumoEnergia04.setText(Html.fromHtml("Velocidade (V) = "));
        tvTelaResumoEnergia05.setText(Html.fromHtml("<p>POTENCIAL:</p>" +
                "<p>Energia armazenada em um corpo que se encontra em determinada posição e que pode ser " +
                "liberada se transformando em outro tipo de energia.</p>" +
                "<p>Potencial gravitacional: Energia armazenada por um corpo quando se encontra em determinada altura</p>"  ));
        tvTelaResumoEnergia06.setText(Html.fromHtml("Energia potencial gravitacional (E<sub>g</sub>) = "));
        tvTelaResumoEnergia07.setText(Html.fromHtml("Massa (m ) = "));
        tvTelaResumoEnergia08.setText(Html.fromHtml("Gravidade (g) = "));
        tvTelaResumoEnergia09.setText(Html.fromHtml("Altura (h) = "));
        tvTelaResumoEnergia10.setText(Html.fromHtml("<p>Potencial elástica: Energia armazenada em um corpo elástico, ao ser esticado ou comprimido.</p>"));
        tvTelaResumoEnergia11.setText(Html.fromHtml("Energia potencial elástica (E<sub>el</sub>) = "));
        tvTelaResumoEnergia12.setText(Html.fromHtml("Constante elástica (K) = "));
        tvTelaResumoEnergia13.setText(Html.fromHtml("Deformação (x) = "));
        tvTelaResumoEnergia14.setText(Html.fromHtml("<p>Teorema da energia cinética:</p>" +
                "<p>&ldquo;O trabalho da força resultante é medido pela variação da energia cinética&rdquo;.</p>" +
                "<p>O mesmo também pode ser utilizado para variação da energia potencial.</p>"));
    }

    private void configuraEditText()
    {
        energiaCinetica = (EditText) rootView.findViewById(R.id.et_tela_resumo_dinamica_energia_01);
        massa = (EditText) rootView.findViewById(R.id.et_tela_resumo_dinamica_energia_02);
        velocidade = (EditText) rootView.findViewById(R.id.et_tela_resumo_dinamica_energia_03);

        energiaPGravitacional = (EditText) rootView.findViewById(R.id.et_tela_resumo_dinamica_energia_04);
        massa2 = (EditText) rootView.findViewById(R.id.et_tela_resumo_dinamica_energia_05);
        gravidade = (EditText) rootView.findViewById(R.id.et_tela_resumo_dinamica_energia_06);
        altura = (EditText) rootView.findViewById(R.id.et_tela_resumo_dinamica_energia_07);

        energiaPElastica = (EditText) rootView.findViewById(R.id.et_tela_resumo_dinamica_energia_08);
        constanteElastica = (EditText) rootView.findViewById(R.id.et_tela_resumo_dinamica_energia_09);
        deformacao = (EditText) rootView.findViewById(R.id.et_tela_resumo_dinamica_energia_10);
    }

    //1
    //ec = (m * v^2) / 2
    private double ec(double massa, double velocidade)
    {
        return (massa * Math.pow(velocidade, 2)) / 2;
    }

    //m = 2 * ec / v^2
    private double massa(double ec, double velocidade)
    {
        return  (2 * ec) / Math.pow(velocidade, 2);
    }

    //v = √(2 * ec / m)
    private double v(double ec, double massa)
    {
        //
        return Math.sqrt((2 * ec) / massa);
    }

    private void energiaCineticaPressed()
    {
        energiaCinetica.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (energiaCinetica.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.color.branco);
                    tvExtra1.setText("");
                    massa.setEnabled(true);
                    velocidade.setEnabled(true);
                }
                //calcula Massa (m)
                else if (!energiaCinetica.getText().toString().equals("") &&
                        !velocidade.getText().toString().equals(""))
                {
                    massa.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setText(Html.fromHtml(massa(
                            Double.parseDouble(energiaCinetica.getText().toString()),
                            Double.parseDouble(velocidade.getText().toString())
                    ) + " Kg"));
                }
                //calcula Velocidade (v)
                else if (!energiaCinetica.getText().toString().equals("") &&
                        !massa.getText().toString().equals(""))
                {
                    velocidade.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setText(v(
                            Double.parseDouble(energiaCinetica.getText().toString()),
                            Double.parseDouble(massa.getText().toString())
                    ) + " m/s");
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void massaPressed()
    {
        massa.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (massa.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.color.branco);
                    tvExtra1.setText("");
                    energiaCinetica.setEnabled(true);
                    velocidade.setEnabled(true);
                }
                //calcula energia Cinetica (epc)
                else if (!massa.getText().toString().equals("") &&
                        !velocidade.getText().toString().equals(""))
                {
                    energiaCinetica.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setText(ec(
                            Double.parseDouble(massa.getText().toString()),
                            Double.parseDouble(velocidade.getText().toString())
                    ) + " J");
                }
                //calcula Velocidade (v)
                else if (!energiaCinetica.getText().toString().equals("") &&
                        !massa.getText().toString().equals(""))
                {
                    velocidade.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setText(v(
                            Double.parseDouble(energiaCinetica.getText().toString()),
                            Double.parseDouble(massa.getText().toString())
                    ) + " m/s");
                }
            }

            @Override
            public void afterTextChanged(Editable s)
            {

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
                    tvExtra1.setBackgroundResource(R.color.branco);
                    tvExtra1.setText("");
                    energiaCinetica.setEnabled(true);
                    massa.setEnabled(true);
                }
                //calcula energia Cinetica (epc)
                else if (!massa.getText().toString().equals("") &&
                        !velocidade.getText().toString().equals(""))
                {
                    energiaCinetica.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setText(Html.fromHtml(ec(
                            Double.parseDouble(massa.getText().toString()),
                            Double.parseDouble(velocidade.getText().toString())
                    ) + " J"));
                }
                //calcula Massa (m)
                else if (!energiaCinetica.getText().toString().equals("") &&
                        !velocidade.getText().toString().equals(""))
                {
                    massa.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setText(Html.fromHtml(massa(
                            Double.parseDouble(energiaCinetica.getText().toString()),
                            Double.parseDouble(velocidade.getText().toString())
                    ) + " Kg"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
    
    //2
    //eg = m * g * h
    private double eg(double massa, double gravidade, double altura)
    {
        //
        return massa * gravidade * altura;
    }

    //m = eg / (g * h)
    private double massa2(double eg, double g, double h)
    {
        //
        return eg / (g * h);
    }

    //h = eg / (g * m)
    private double h(double eg, double g, double m)
    {
        //
        return eg / (g * m);
    }
    
    private void energiaPGravitacionalPressed()
    {
        energiaPGravitacional.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (energiaPGravitacional.getText().toString().equals(""))
                {
                    tvExtra2.setBackgroundResource(R.color.branco);
                    tvExtra2.setText("");
                    massa2.setEnabled(true);
                    gravidade.setEnabled(true);
                    altura.setEnabled(true);
                }
                //calcula Massa (m)
                else if (!energiaPGravitacional.getText().toString().equals("") &&
                        !gravidade.getText().toString().equals("")&&
                        !altura.getText().toString().equals(""))
                {
                    massa2.setEnabled(false);
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setText(Html.fromHtml(massa2(
                            Double.parseDouble(energiaPGravitacional.getText().toString()),
                            Double.parseDouble(gravidade.getText().toString()),
                            Double.parseDouble(altura.getText().toString())
                    ) + " Kg"));
                }
                //calcula Altura (h)
                else if (!energiaPGravitacional.getText().toString().equals("") &&
                        !gravidade.getText().toString().equals("") &&
                        !massa2.getText().toString().equals(""))
                {
                    altura.setEnabled(false);
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setText(Html.fromHtml(h(
                            Double.parseDouble(energiaPGravitacional.getText().toString()),
                            Double.parseDouble(gravidade.getText().toString()),
                            Double.parseDouble(massa2.getText().toString())
                    ) + " m"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void massa2Pressed()
    {
        massa2.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (massa2.getText().toString().equals(""))
                {
                    tvExtra2.setBackgroundResource(R.color.branco);
                    tvExtra2.setText("");
                    energiaPGravitacional.setEnabled(true);
                    gravidade.setEnabled(true);
                    altura.setEnabled(true);
                }
                //calcula Energial potencial grvitacional
                else if (!massa2.getText().toString().equals("") &&
                        !gravidade.getText().toString().equals("")&&
                        !altura.getText().toString().equals(""))
                {
                    energiaPGravitacional.setEnabled(false);
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setText(Html.fromHtml(eg(
                            Double.parseDouble(massa2.getText().toString()),
                            Double.parseDouble(gravidade.getText().toString()),
                            Double.parseDouble(altura.getText().toString())
                    ) + " J"));
                }
                //calcula Altura (h)
                else if (!energiaPGravitacional.getText().toString().equals("") &&
                        !gravidade.getText().toString().equals("") &&
                        !massa2.getText().toString().equals(""))
                {
                    altura.setEnabled(false);
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setText(Html.fromHtml(h(
                            Double.parseDouble(energiaPGravitacional.getText().toString()),
                            Double.parseDouble(gravidade.getText().toString()),
                            Double.parseDouble(massa2.getText().toString())
                    ) + " m"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

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
                    tvExtra2.setBackgroundResource(R.color.branco);
                    tvExtra2.setText("");
                    massa2.setEnabled(true);
                    gravidade.setEnabled(true);
                    altura.setEnabled(true);
                }
                //calcula Energial potencial grvitacional
                else if (!massa2.getText().toString().equals("") &&
                        !gravidade.getText().toString().equals("")&&
                        !altura.getText().toString().equals(""))
                {
                    energiaPGravitacional.setEnabled(false);
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setText(Html.fromHtml(eg(
                            Double.parseDouble(massa2.getText().toString()),
                            Double.parseDouble(gravidade.getText().toString()),
                            Double.parseDouble(altura.getText().toString())
                    ) + " J"));
                }
                //calcula Altura (h)
                else if (!energiaPGravitacional.getText().toString().equals("") &&
                        !gravidade.getText().toString().equals("") &&
                        !massa2.getText().toString().equals(""))
                {
                    altura.setEnabled(false);
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setText(Html.fromHtml(h(
                            Double.parseDouble(energiaPGravitacional.getText().toString()),
                            Double.parseDouble(gravidade.getText().toString()),
                            Double.parseDouble(massa2.getText().toString())
                    ) + " m"));
                }
                //calcula Massa (m)
                else if (!energiaPGravitacional.getText().toString().equals("") &&
                        !gravidade.getText().toString().equals("")&&
                        !altura.getText().toString().equals(""))
                {
                    massa2.setEnabled(false);
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setText(Html.fromHtml(massa2(
                            Double.parseDouble(energiaPGravitacional.getText().toString()),
                            Double.parseDouble(gravidade.getText().toString()),
                            Double.parseDouble(altura.getText().toString())
                    ) + " Kg"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

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
                    energiaPGravitacional.setEnabled(true);
                    gravidade.setEnabled(true);
                    massa2.setEnabled(true);
                }
                //calcula Energial potencial grvitacional
                else if (!massa2.getText().toString().equals("") &&
                        !gravidade.getText().toString().equals("")&&
                        !altura.getText().toString().equals(""))
                {
                    energiaPGravitacional.setEnabled(false);
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setText(Html.fromHtml(eg(
                            Double.parseDouble(massa2.getText().toString()),
                            Double.parseDouble(gravidade.getText().toString()),
                            Double.parseDouble(altura.getText().toString())
                    ) + " J"));
                }
                //calcula Massa (m)
                else if (!energiaPGravitacional.getText().toString().equals("") &&
                        !gravidade.getText().toString().equals("")&&
                        !altura.getText().toString().equals(""))
                {
                    massa2.setEnabled(false);
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setText(Html.fromHtml(massa2(
                            Double.parseDouble(energiaPGravitacional.getText().toString()),
                            Double.parseDouble(gravidade.getText().toString()),
                            Double.parseDouble(altura.getText().toString())
                    ) + " Kg"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    //3
    private double el(double k, double x)
    {
        //el = (K * x^2) / 2
        return (k * Math.pow(x, 2)) / 2;
    }

    private double x(double el, double k)
    {
        //x = √((2 * el) / k)
        return Math.sqrt(((2 * el) / k));
    }

    private double k(double el, double x)
    {
        //k = 2 * el  / x^2
        return (2 * el) / Math.pow(x, 2);
    }

    private void energiaPElasticaPressed()
    {
        energiaPElastica.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (energiaPElastica.getText().toString().equals(""))
                {
                    tvExtra3.setBackgroundResource(R.color.branco);
                    tvExtra3.setText("");
                    constanteElastica.setEnabled(true);
                    deformacao.setEnabled(true);
                }
                //calcula Deformacao (x)
                else if (!energiaPElastica.getText().toString().equals("") &&
                        !constanteElastica.getText().toString().equals(""))
                {
                    deformacao.setEnabled(false);
                    tvExtra3.setBackgroundResource(R.drawable.degrade2);
                    tvExtra3.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra3.setGravity(Gravity.CENTER);
                    tvExtra3.setText(Html.fromHtml(x(
                            Double.parseDouble(energiaPElastica.getText().toString()),
                            Double.parseDouble(constanteElastica.getText().toString())
                    ) + " m"));
                }
                //calcula Constante K (k)
                else if (!energiaPElastica.getText().toString().equals("") &&
                        !deformacao.getText().toString().equals(""))
                {
                    constanteElastica.setEnabled(false);
                    tvExtra3.setBackgroundResource(R.drawable.degrade2);
                    tvExtra3.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra3.setGravity(Gravity.CENTER);
                    tvExtra3.setText(Html.fromHtml(k(
                            Double.parseDouble(energiaPElastica.getText().toString()),
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
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (constanteElastica.getText().toString().equals(""))
                {
                    tvExtra3.setBackgroundResource(R.color.branco);
                    tvExtra3.setText("");
                    energiaPElastica.setEnabled(true);
                    deformacao.setEnabled(true);
                }
                //calcula Deformacao (x)
                else if (!energiaPElastica.getText().toString().equals("") &&
                        !constanteElastica.getText().toString().equals(""))
                {
                    deformacao.setEnabled(false);
                    tvExtra3.setBackgroundResource(R.drawable.degrade2);
                    tvExtra3.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra3.setGravity(Gravity.CENTER);
                    tvExtra3.setText(Html.fromHtml(x(
                            Double.parseDouble(energiaPElastica.getText().toString()),
                            Double.parseDouble(constanteElastica.getText().toString())
                    ) + " m"));
                }
                //calcula Energia Potencial Elastica (Eel)
                else if (!constanteElastica.getText().toString().equals("") &&
                        !deformacao.getText().toString().equals(""))
                {
                    energiaPElastica.setEnabled(false);
                    tvExtra3.setBackgroundResource(R.drawable.degrade2);
                    tvExtra3.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra3.setGravity(Gravity.CENTER);
                    tvExtra3.setText(Html.fromHtml(el(
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
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (deformacao.getText().toString().equals(""))
                {
                    tvExtra3.setBackgroundResource(R.color.branco);
                    tvExtra3.setText("");
                    energiaPElastica.setEnabled(true);
                    constanteElastica.setEnabled(true);
                }
                //calcula Constante K (k)
                else if (!energiaPElastica.getText().toString().equals("") &&
                        !deformacao.getText().toString().equals(""))
                {
                    constanteElastica.setEnabled(false);
                    tvExtra3.setBackgroundResource(R.drawable.degrade2);
                    tvExtra3.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra3.setGravity(Gravity.CENTER);
                    tvExtra3.setText(Html.fromHtml(k(
                            Double.parseDouble(energiaPElastica.getText().toString()),
                            Double.parseDouble(deformacao.getText().toString())
                    ) + " N/m"));
                }
                //calcula Energia Potencial Elastica (Eel)
                else if (!constanteElastica.getText().toString().equals("") &&
                        !deformacao.getText().toString().equals(""))
                {
                    energiaPElastica.setEnabled(false);
                    tvExtra3.setBackgroundResource(R.drawable.degrade2);
                    tvExtra3.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra3.setGravity(Gravity.CENTER);
                    tvExtra3.setText(Html.fromHtml(el(
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