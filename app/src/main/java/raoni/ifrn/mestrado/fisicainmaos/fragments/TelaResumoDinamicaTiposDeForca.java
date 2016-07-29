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

public class TelaResumoDinamicaTiposDeForca extends Fragment
{
    private View rootView;
    private TextView tvExtra1;
    private TextView tvExtra2;
    private TextView tvExtra3;
    private TextView tvExtra4;
    //1
    private EditText forcaAtrito;
    private EditText coeficienteAtrito;
    private EditText forcaNormal;
    //2
    private EditText forcaAplicada;
    private EditText pesoObjeto;
    private EditText numeroPolias;
    //3
    private EditText forcaElastica;
    private EditText constanteElastica;
    private EditText deformacao;
    //4
    private EditText periodo;
    private EditText pi;
    private EditText massa;
    private EditText constanteElastica2;

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        configuraTextView();
        configuraEditText();
        forcaAtritoPressed();
        coeficienteAtritoPressed();
        forcaNormalPressed();
        forcaAplicadaPressed();
        pesoObjetoPressed();
        forcaElasticaPressed();
        constanteElasticaPressed();
        deformacaoPressed();
        piPressed();
        massaPressed();
        constanteElastica2Pressed();
        numeroPoliasPressed();
        periodoPressed();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState)
    {
        rootView = inflater.inflate(R.layout.tela_resumo_dinamica_tipos_forca, container, false);
        return rootView;
    }

    private void configuraTextView()
    {
        TextView tvTelaResumoDinamica03_01 = (TextView) getActivity().findViewById(R.id.tv_tela_resumo_dinamica_03_01);
        TextView tvTelaResumoDinamica03_02 = (TextView) getActivity().findViewById(R.id.tv_tela_resumo_dinamica_03_02);
        TextView tvTelaResumoDinamica03_03 = (TextView) getActivity().findViewById(R.id.tv_tela_resumo_dinamica_03_03);
        TextView tvTelaResumoDinamica03_04 = (TextView) getActivity().findViewById(R.id.tv_tela_resumo_dinamica_03_04);
        TextView tvTelaResumoDinamica03_05 = (TextView) getActivity().findViewById(R.id.tv_tela_resumo_dinamica_03_05);
        TextView tvTelaResumoDinamica03_06 = (TextView) getActivity().findViewById(R.id.tv_tela_resumo_dinamica_03_06);
        TextView tvTelaResumoDinamica03_07 = (TextView) getActivity().findViewById(R.id.tv_tela_resumo_dinamica_03_07);
        TextView tvTelaResumoDinamica03_08 = (TextView) getActivity().findViewById(R.id.tv_tela_resumo_dinamica_03_08);
        TextView tvTelaResumoDinamica03_09 = (TextView) getActivity().findViewById(R.id.tv_tela_resumo_dinamica_03_09);
        TextView tvTelaResumoDinamica03_10 = (TextView) getActivity().findViewById(R.id.tv_tela_resumo_dinamica_03_10);
        TextView tvTelaResumoDinamica03_11 = (TextView) getActivity().findViewById(R.id.tv_tela_resumo_dinamica_03_11);
        TextView tvTelaResumoDinamica03_12 = (TextView) getActivity().findViewById(R.id.tv_tela_resumo_dinamica_03_12);
        TextView tvTelaResumoDinamica03_13 = (TextView) getActivity().findViewById(R.id.tv_tela_resumo_dinamica_03_13);
        TextView tvTelaResumoDinamica03_14 = (TextView) getActivity().findViewById(R.id.tv_tela_resumo_dinamica_03_14);
        TextView tvTelaResumoDinamica03_15 = (TextView) getActivity().findViewById(R.id.tv_tela_resumo_dinamica_03_15);
        TextView tvTelaResumoDinamica03_16 = (TextView) getActivity().findViewById(R.id.tv_tela_resumo_dinamica_03_16);
        TextView tvTelaResumoDinamica03_17 = (TextView) getActivity().findViewById(R.id.tv_tela_resumo_dinamica_03_17);
        TextView tvTelaResumoDinamica03_18 = (TextView) getActivity().findViewById(R.id.tv_tela_resumo_dinamica_03_18);
        TextView tvTelaResumoDinamica03_19 = (TextView) getActivity().findViewById(R.id.tv_tela_resumo_dinamica_03_19);
        TextView tvTelaResumoDinamica03_20 = (TextView) getActivity().findViewById(R.id.tv_tela_resumo_dinamica_03_20);

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumoDinamica03_01.setTypeface(font);
        tvTelaResumoDinamica03_02.setTypeface(font);
        tvTelaResumoDinamica03_03.setTypeface(font);
        tvTelaResumoDinamica03_04.setTypeface(font);
        tvTelaResumoDinamica03_05.setTypeface(font);
        tvTelaResumoDinamica03_06.setTypeface(font);
        tvTelaResumoDinamica03_07.setTypeface(font);
        tvTelaResumoDinamica03_08.setTypeface(font);
        tvTelaResumoDinamica03_09.setTypeface(font);
        tvTelaResumoDinamica03_10.setTypeface(font);
        tvTelaResumoDinamica03_11.setTypeface(font);
        tvTelaResumoDinamica03_12.setTypeface(font);
        tvTelaResumoDinamica03_13.setTypeface(font);
        tvTelaResumoDinamica03_14.setTypeface(font);
        tvTelaResumoDinamica03_15.setTypeface(font);
        tvTelaResumoDinamica03_16.setTypeface(font);
        tvTelaResumoDinamica03_17.setTypeface(font);
        tvTelaResumoDinamica03_18.setTypeface(font);
        tvTelaResumoDinamica03_19.setTypeface(font);
        tvTelaResumoDinamica03_20.setTypeface(font);

        tvExtra1 = (TextView) getActivity().findViewById(R.id.tv_tela_resumo_dinamica_03_extra_01);
        tvExtra2 = (TextView) getActivity().findViewById(R.id.tv_tela_resumo_dinamica_03_extra_02);
        tvExtra3 = (TextView) getActivity().findViewById(R.id.tv_tela_resumo_dinamica_03_extra_03);
        tvExtra4 = (TextView) getActivity().findViewById(R.id.tv_tela_resumo_dinamica_03_extra_04);

        tvTelaResumoDinamica03_01.setText(Html.fromHtml("<p><b>Força de atrito (F<sub>at</sub>):</b></p>" +
                "<p>Surge entre superfícies de contato direto, seu sentido é sempre contrário " +
                "ao movimento do corpo. É uma força de contato.</p>"));
        tvTelaResumoDinamica03_02.setText(Html.fromHtml("Força de atrito (Fat) = "));
        tvTelaResumoDinamica03_03.setText(Html.fromHtml("Coeficiente de atrito (&micro;) = "));
        tvTelaResumoDinamica03_04.setText(Html.fromHtml("Normal (N) = "));
        tvTelaResumoDinamica03_05.setText(Html.fromHtml("<p><b>Atrito cinético:</b> Quando o" +
                " corpo está escorregando.</p>" +
                "<p><b>Atrito estático:</b> Quando o corpo não escorrega.</p>" +
                "<p><b>Atrito estático máximo:</b> A força de atrito estático é variável e" +
                " atinge um valor máximo, que ocorre no limiar do corpo começar a escorregar.</p>" +
                "<p><b>Obs.:</b> A força de atrito estático é sempre maior que a força de" +
                " atrito cinético.</p>" +
                "<p><b>Ex.:</b> O freio ABS tem uma eficiência muito superior que o freio " +
                "comum, pois se utiliza do atrito estático e não do cinético. É muito comum os " +
                "motoristas frearem os carros até que suas rodas travem, quando isso ocorre" +
                " o atrito que passa " +
                "a atuar é o cinético, proporcionando uma frenagem menor. O freio ABS evita " +
                "que as rodas travem quando acionados os freios.</p>" +
                "<p><b>Força Normal(N):</b></p>" +
                "<p>É uma força de contato trocada entre duas superfícies com direção " +
                "perpendicular.</p>" +
                "<p>A força normal <b>não</b> é uma reação do peso. </p>" +
                "<p><b>N(normal) = P(peso) = m.g</b></p>"));
        tvTelaResumoDinamica03_06.setText(Html.fromHtml("<p><b>Força de tração ou tensão " +
                "(T):</b></p>" +
                "<p>Força transmitida a cordas, fios ou cabos.</p>"));
        tvTelaResumoDinamica03_07.setText(Html.fromHtml("<p><b>Polias ou roldanas:</b> São " +
                "utilizadas para mudar a direção e sentido da força aplicada. " +
                "Para cada polia móvel que se acrescenta em um sistema, reduz-se a " +
                "força mínima necessária para erguer um" +
                " corpo na metade. </p>"));
        tvTelaResumoDinamica03_08.setText(Html.fromHtml("Força aplicada (F) = "));
        tvTelaResumoDinamica03_09.setText(Html.fromHtml("Peso do objeto (P) = "));
        tvTelaResumoDinamica03_10.setText(Html.fromHtml("Número de polias (N) = "));
        tvTelaResumoDinamica03_11.setText(Html.fromHtml("<p><b>Exemplo:</b> Supondo que na " +
                "figura acima o bloco P tenha uma massa de 50kg, determine a força mínima " +
                "aplicada pelo" +
                " homem para manter o bloco em equilíbrio.</p>" +
                "<p><b>Força elástica – Lei de Hooke:</b></p>" +
                "<p>Atua em uma mola ou corpo elástico, de constante elástica K, sujeito a " +
                "uma deformação x, devido a atuação de uma força F. </p>"));
        tvTelaResumoDinamica03_12.setText(Html.fromHtml("Força elástica (F) ="));
        tvTelaResumoDinamica03_13.setText(Html.fromHtml("Constante elástica (K) = "));
        tvTelaResumoDinamica03_14.setText(Html.fromHtml("Deformação (x) = "));
        tvTelaResumoDinamica03_15.setText(Html.fromHtml("<p>Uma deformação é elástica quando" +
                " o corpo obedece à lei de Hooke, " +
                "retornando a sua posição inicial.</p>" +
                "<p>A constante K indica a força mínima necessária para deformar o comprimento" +
                " daquela mola.</p>" +
                "<p><b>Associação de molas em paralelo:</b></p>" +
                "<p><b>F<sub>R</sub> = F<sub>1</sub> + F<sub>2</sub></b> onde <b>K<sub>R</sub>.x" +
                " = K<sub>1</sub>.x + K<sub>2</sub>.x</b> assim <b>K<sub>R</sub> = K<sub>1</sub>" +
                " + K<sub>2</sub></b></p>" +
                "<p><b>Associação de molas em série:</b></p>"));
        tvTelaResumoDinamica03_16.setText(Html.fromHtml("<p>Para um sistema em movimento " +
                "oscilatório, temos seu período e sua frequência:</p>"));
        tvTelaResumoDinamica03_17.setText(Html.fromHtml("Período (T) ="));
        tvTelaResumoDinamica03_18.setText(Html.fromHtml("Pi radianos (&pi;) = "));
        tvTelaResumoDinamica03_19.setText(Html.fromHtml("Massa (m) = "));
        tvTelaResumoDinamica03_20.setText(Html.fromHtml("Constante elástica (K) = "));
    }

    private void configuraEditText()
    {
        forcaAtrito = (EditText) getActivity().findViewById(R.id.et_tela_resumo_dinamica_03_01);
        coeficienteAtrito = (EditText) getActivity().findViewById(R.id.et_tela_resumo_dinamica_03_02);
        forcaNormal = (EditText) getActivity().findViewById(R.id.et_tela_resumo_dinamica_03_03);

        forcaAplicada = (EditText) getActivity().findViewById(R.id.et_tela_resumo_dinamica_03_04);
        pesoObjeto = (EditText) getActivity().findViewById(R.id.et_tela_resumo_dinamica_03_05);
        numeroPolias = (EditText) getActivity().findViewById(R.id.et_tela_resumo_dinamica_03_06);

        forcaElastica = (EditText) getActivity().findViewById(R.id.et_tela_resumo_dinamica_03_07);
        constanteElastica = (EditText) getActivity().findViewById(R.id.et_tela_resumo_dinamica_03_08);
        deformacao = (EditText) getActivity().findViewById(R.id.et_tela_resumo_dinamica_03_09);

        periodo = (EditText) getActivity().findViewById(R.id.et_tela_resumo_dinamica_03_10);
        pi = (EditText) getActivity().findViewById(R.id.et_tela_resumo_dinamica_03_11);
        massa = (EditText) getActivity().findViewById(R.id.et_tela_resumo_dinamica_03_12);
        constanteElastica2 = (EditText) getActivity().findViewById(R.id.et_tela_resumo_dinamica_03_13);
    }

    //1
    private double fat(double m, double n)
    {
        //fat = μ * n
        return m * n;
    }

    private double normal(double fat, double micro)
    {
        //n = Fat / m
        return fat / micro;
    }

    private double mi(double fat, double n)
    {
        //μ = fat / n
        return fat / n;
    }

    private void forcaAtritoPressed()
    {
        forcaAtrito.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (forcaAtrito.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.color.branco);
                    tvExtra1.setText("");
                    coeficienteAtrito.setEnabled(true);
                    forcaNormal.setEnabled(true);
                }
                //calcula Normal (n)
                else if (!forcaAtrito.getText().toString().equals("") &&
                        !coeficienteAtrito.getText().toString().equals(""))
                {
                    forcaNormal.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setText(Html.fromHtml(normal(
                            Double.parseDouble(forcaAtrito.getText().toString()),
                            Double.parseDouble(coeficienteAtrito.getText().toString())
                    ) + " N"));
                }
                //calcula Coeficiente de atrito (μ)
                else if (!forcaAtrito.getText().toString().equals("") &&
                        !forcaNormal.getText().toString().equals(""))
                {
                    coeficienteAtrito.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setText(Html.fromHtml(mi(
                            Double.parseDouble(forcaAtrito.getText().toString()),
                            Double.parseDouble(forcaNormal.getText().toString())
                    ) + ""));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void coeficienteAtritoPressed()
    {
        coeficienteAtrito.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (coeficienteAtrito.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.color.branco);
                    tvExtra1.setText("");
                    forcaAtrito.setEnabled(true);
                    forcaNormal.setEnabled(true);
                }
                //calcula Normal (n)
                else if (!forcaAtrito.getText().toString().equals("") &&
                        !coeficienteAtrito.getText().toString().equals(""))
                {
                    forcaNormal.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setText(Html.fromHtml(normal(
                            Double.parseDouble(forcaAtrito.getText().toString()),
                            Double.parseDouble(coeficienteAtrito.getText().toString())
                    ) + " N"));
                }
                //calcula Forca de atrito (fat)
                else if (!coeficienteAtrito.getText().toString().equals("") &&
                        !forcaNormal.getText().toString().equals(""))
                {
                    forcaAtrito.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setText(Html.fromHtml(fat(
                            Double.parseDouble(coeficienteAtrito.getText().toString()),
                            Double.parseDouble(forcaNormal.getText().toString())
                    ) + " N"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void forcaNormalPressed()
    {
        forcaNormal.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (forcaNormal.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.color.branco);
                    tvExtra1.setText("");
                    forcaAtrito.setEnabled(true);
                    coeficienteAtrito.setEnabled(true);
                }
                //calcula Normal (n)
                else if (!forcaNormal.getText().toString().equals("") &&
                        !coeficienteAtrito.getText().toString().equals(""))
                {
                    forcaAtrito.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setText(Html.fromHtml(fat(
                            Double.parseDouble(coeficienteAtrito.getText().toString()),
                            Double.parseDouble(forcaNormal.getText().toString())
                    ) + " N"));
                }
                //calcula Coeficiente de atrito (μ)
                else if (!forcaAtrito.getText().toString().equals("") &&
                        !forcaNormal.getText().toString().equals(""))
                {
                    coeficienteAtrito.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setText(Html.fromHtml(mi(
                            Double.parseDouble(forcaAtrito.getText().toString()),
                            Double.parseDouble(forcaNormal.getText().toString())
                    ) + ""));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    //2
    private double fAplicada(double peso, double n)
    {
        //
        return peso / Math.pow(2, n);
    }

    private double pesoBloco(double fAplicada, double n)
    {
        //
        return fAplicada * Math.pow(2, n);
    }

    private void forcaAplicadaPressed()
    {
        forcaAplicada.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (forcaAplicada.getText().toString().equals(""))
                {
                    tvExtra2.setBackgroundResource(R.color.branco);
                    tvExtra2.setText("");
                    pesoObjeto.setEnabled(true);
                    numeroPolias.setEnabled(true);
                }
                //calcula peso do objeto (p)
                else if (!forcaAplicada.getText().toString().equals("") &&
                        !numeroPolias.getText().toString().equals(""))
                {
                    pesoObjeto.setEnabled(false);
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setText(Html.fromHtml(pesoBloco(
                            Double.parseDouble(forcaAplicada.getText().toString()),
                            Double.parseDouble(numeroPolias.getText().toString())
                    ) + " N"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void pesoObjetoPressed()
    {
        pesoObjeto.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (pesoObjeto.getText().toString().equals(""))
                {
                    tvExtra2.setBackgroundResource(R.color.branco);
                    tvExtra2.setText("");
                    forcaAplicada.setEnabled(true);
                    numeroPolias.setEnabled(true);
                }
                //calcula peso do objeto (p)
                else if (!pesoObjeto.getText().toString().equals("") &&
                        !numeroPolias.getText().toString().equals(""))
                {
                    forcaAplicada.setEnabled(false);
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setText(Html.fromHtml(fAplicada(
                            Double.parseDouble(pesoObjeto.getText().toString()),
                            Double.parseDouble(numeroPolias.getText().toString())
                    ) + " N"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void numeroPoliasPressed()
    {
        numeroPolias.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (numeroPolias.getText().toString().equals(""))
                {
                    tvExtra2.setBackgroundResource(R.color.branco);
                    tvExtra2.setText("");
                    forcaAplicada.setEnabled(true);
                    pesoObjeto.setEnabled(true);
                }
                //calcula peso do objeto (p)
                else if (!pesoObjeto.getText().toString().equals("") &&
                        !numeroPolias.getText().toString().equals(""))
                {
                    forcaAplicada.setEnabled(false);
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setText(Html.fromHtml(fAplicada(
                            Double.parseDouble(pesoObjeto.getText().toString()),
                            Double.parseDouble(numeroPolias.getText().toString())
                    ) + " N"));
                }
                //calcula peso do objeto (p)
                else if (!forcaAplicada.getText().toString().equals("") &&
                        !numeroPolias.getText().toString().equals(""))
                {
                    pesoObjeto.setEnabled(false);
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setText(Html.fromHtml(pesoBloco(
                            Double.parseDouble(forcaAplicada.getText().toString()),
                            Double.parseDouble(numeroPolias.getText().toString())
                    ) + " N"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    //3
    private double forcaElastica(double k, double x)
    {
        //f = k * x
        return k * x;
    }

    private double constanteK(double f, double x)
    {
        //k = f / x
        return f / x;
    }

    private double deformacaoX(double f, double k)
    {
        //x = f / k
        return f / k;
    }

    private void forcaElasticaPressed()
    {
        forcaElastica.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (forcaElastica.getText().toString().equals(""))
                {
                    tvExtra3.setBackgroundResource(R.color.branco);
                    tvExtra3.setText("");
                    constanteElastica.setEnabled(true);
                    deformacao.setEnabled(true);
                }
                //calcula Constante K (k)
                else if (!forcaElastica.getText().toString().equals("") &&
                        !deformacao.getText().toString().equals(""))
                {
                    constanteElastica.setEnabled(false);
                    tvExtra3.setBackgroundResource(R.drawable.degrade2);
                    tvExtra3.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra3.setGravity(Gravity.CENTER);
                    tvExtra3.setText(Html.fromHtml(constanteK(
                            Double.parseDouble(forcaElastica.getText().toString()),
                            Double.parseDouble(deformacao.getText().toString())
                    ) + " N/m"));
                }
                //calcula Deformacao (x)
                else if (!forcaElastica.getText().toString().equals("") &&
                        !constanteElastica.getText().toString().equals(""))
                {
                    deformacao.setEnabled(false);
                    tvExtra3.setBackgroundResource(R.drawable.degrade2);
                    tvExtra3.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra3.setGravity(Gravity.CENTER);
                    tvExtra3.setText(Html.fromHtml(deformacaoX(
                            Double.parseDouble(forcaElastica.getText().toString()),
                            Double.parseDouble(constanteElastica.getText().toString())
                    ) + " m"));
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
                    forcaElastica.setEnabled(true);
                    deformacao.setEnabled(true);
                }
                //calcula Forca elastica (f)
                else if (!constanteElastica.getText().toString().equals("") &&
                        !deformacao.getText().toString().equals(""))
                {
                    forcaElastica.setEnabled(false);
                    tvExtra3.setBackgroundResource(R.drawable.degrade2);
                    tvExtra3.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra3.setGravity(Gravity.CENTER);
                    tvExtra3.setText(Html.fromHtml(forcaElastica(
                            Double.parseDouble(constanteElastica.getText().toString()),
                            Double.parseDouble(deformacao.getText().toString())
                    ) + " N"));
                }
                //calcula Deformacao (x)
                else if (!forcaElastica.getText().toString().equals("") &&
                        !constanteElastica.getText().toString().equals(""))
                {
                    deformacao.setEnabled(false);
                    tvExtra3.setBackgroundResource(R.drawable.degrade2);
                    tvExtra3.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra3.setGravity(Gravity.CENTER);
                    tvExtra3.setText(Html.fromHtml(deformacaoX(
                            Double.parseDouble(forcaElastica.getText().toString()),
                            Double.parseDouble(constanteElastica.getText().toString())
                    ) + " m"));
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
                    constanteElastica.setEnabled(true);
                    forcaElastica.setEnabled(true);
                }
                //calcula Constante K (k)
                else if (!forcaElastica.getText().toString().equals("") &&
                        !deformacao.getText().toString().equals(""))
                {
                    constanteElastica.setEnabled(false);
                    tvExtra3.setBackgroundResource(R.drawable.degrade2);
                    tvExtra3.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra3.setGravity(Gravity.CENTER);
                    tvExtra3.setText(Html.fromHtml(constanteK(
                            Double.parseDouble(forcaElastica.getText().toString()),
                            Double.parseDouble(deformacao.getText().toString())
                    ) + " N/m"));
                }
                //calcula Forca elastica (f)
                else if (!constanteElastica.getText().toString().equals("") &&
                        !deformacao.getText().toString().equals(""))
                {
                    forcaElastica.setEnabled(false);
                    tvExtra3.setBackgroundResource(R.drawable.degrade2);
                    tvExtra3.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra3.setGravity(Gravity.CENTER);
                    tvExtra3.setText(Html.fromHtml(forcaElastica(
                            Double.parseDouble(constanteElastica.getText().toString()),
                            Double.parseDouble(deformacao.getText().toString())
                    ) + " N"));
                }
            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });
    }

    //4
    private double periodoT(double pi, double m, double k)
    {
        //t = 2pi √(m / K)
        return (2 * pi) * Math.sqrt((m / k));
    }

    private double massa(double t, double k, double pi)
    {
        //m = (t^2 * k) / 4 * (pi ^ 2)
        return (Math.pow(t, 2) * k) / (4 * (Math.pow(pi, 2)));
    }

    private double k(double pi, double m, double t)
    {
        //k = 4 * pi^2 * m / t^2
        return (4 * Math.pow(pi, 2)) * m / Math.pow(t, 2);
    }

    private void piPressed()
    {
        pi.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (pi.getText().toString().equals(""))
                {
                    tvExtra4.setBackgroundResource(R.color.branco);
                    tvExtra4.setText("");
                    periodo.setEnabled(true);
                    massa.setEnabled(true);
                    constanteElastica2.setEnabled(true);
                }
                //calcula Periodo (t)
                else if (!pi.getText().toString().equals("") &&
                        !massa.getText().toString().equals("") &&
                        !constanteElastica2.getText().toString().equals(""))
                {
                    periodo.setEnabled(false);
                    tvExtra4.setText(Html.fromHtml(periodoT(
                            Double.parseDouble(pi.getText().toString()),
                            Double.parseDouble(massa.getText().toString()),
                            Double.parseDouble(constanteElastica2.getText().toString())
                    ) + " s"));
                }
                //calcula k
                else if (!pi.getText().toString().equals("") &&
                        !massa.getText().toString().equals("") &&
                        !periodo.getText().toString().equals(""))
                {
                    constanteElastica2.setEnabled(false);
                    tvExtra4.setBackgroundResource(R.drawable.degrade2);
                    tvExtra4.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra4.setGravity(Gravity.CENTER);
                    tvExtra4.setText(Html.fromHtml(k(
                            Double.parseDouble(pi.getText().toString()),
                            Double.parseDouble(massa.getText().toString()),
                            Double.parseDouble(periodo.getText().toString())
                    ) + " N/m"));
                }
                //calcula massa (m)
                else if (!pi.getText().toString().equals("") &&
                        !constanteElastica2.getText().toString().equals("") &&
                        !periodo.getText().toString().equals(""))
                {
                    massa.setEnabled(false);
                    tvExtra4.setBackgroundResource(R.drawable.degrade2);
                    tvExtra4.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra4.setGravity(Gravity.CENTER);
                    tvExtra4.setText(Html.fromHtml(massa(
                            Double.parseDouble(periodo.getText().toString()),
                            Double.parseDouble(constanteElastica2.getText().toString()),
                            Double.parseDouble(pi.getText().toString())
                    ) + " Kg"));
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
                    tvExtra4.setBackgroundResource(R.color.branco);
                    tvExtra4.setText("");
                    periodo.setEnabled(true);
                    pi.setEnabled(true);
                    constanteElastica2.setEnabled(true);
                }
                //calcula Periodo (T)
                else if (!pi.getText().toString().equals("") &&
                        !massa.getText().toString().equals("") &&
                        !constanteElastica2.getText().toString().equals(""))
                {
                    periodo.setEnabled(false);
                    tvExtra4.setBackgroundResource(R.drawable.degrade2);
                    tvExtra4.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra4.setGravity(Gravity.CENTER);
                    tvExtra4.setText(Html.fromHtml(periodoT(
                            Double.parseDouble(pi.getText().toString()),
                            Double.parseDouble(massa.getText().toString()),
                            Double.parseDouble(constanteElastica2.getText().toString())
                    ) + " s"));
                }
                //calcula k
                else if (!pi.getText().toString().equals("") &&
                        !massa.getText().toString().equals("") &&
                        !periodo.getText().toString().equals(""))
                {
                    constanteElastica2.setEnabled(false);
                    tvExtra4.setBackgroundResource(R.drawable.degrade2);
                    tvExtra4.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra4.setGravity(Gravity.CENTER);
                    tvExtra4.setText(Html.fromHtml(k(
                            Double.parseDouble(pi.getText().toString()),
                            Double.parseDouble(massa.getText().toString()),
                            Double.parseDouble(periodo.getText().toString())
                    ) + " N/m"));
                }
            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });
    }

    private void periodoPressed()
    {
        periodo.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (periodo.getText().toString().equals(""))
                {
                    tvExtra4.setBackgroundResource(R.color.branco);
                    tvExtra4.setText("");
                    massa.setEnabled(true);
                    pi.setEnabled(true);
                    constanteElastica2.setEnabled(true);
                }
                //calcula k
                else if (!pi.getText().toString().equals("") &&
                        !massa.getText().toString().equals("") &&
                        !periodo.getText().toString().equals(""))
                {
                    constanteElastica2.setEnabled(false);
                    tvExtra4.setBackgroundResource(R.drawable.degrade2);
                    tvExtra4.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra4.setGravity(Gravity.CENTER);
                    tvExtra4.setText(Html.fromHtml(k(
                            Double.parseDouble(pi.getText().toString()),
                            Double.parseDouble(massa.getText().toString()),
                            Double.parseDouble(periodo.getText().toString())
                    ) + " N/m"));
                }
                //calcula massa (m)
                else if (!pi.getText().toString().equals("") &&
                        !constanteElastica2.getText().toString().equals("") &&
                        !periodo.getText().toString().equals(""))
                {
                    massa.setEnabled(false);
                    tvExtra4.setBackgroundResource(R.drawable.degrade2);
                    tvExtra4.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra4.setGravity(Gravity.CENTER);
                    tvExtra4.setText(Html.fromHtml(massa(
                            Double.parseDouble(periodo.getText().toString()),
                            Double.parseDouble(constanteElastica2.getText().toString()),
                            Double.parseDouble(pi.getText().toString())
                    ) + " Kg"));
                }
            }


            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });
    }

    private void constanteElastica2Pressed()
    {
        constanteElastica2.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (constanteElastica2.getText().toString().equals(""))
                {
                    tvExtra4.setBackgroundResource(R.color.branco);
                    tvExtra4.setText("");
                    periodo.setEnabled(true);
                    pi.setEnabled(true);
                    massa.setEnabled(true);
                }
                //calcula massa (m)
                else if (!pi.getText().toString().equals("") &&
                        !constanteElastica2.getText().toString().equals("") &&
                        !periodo.getText().toString().equals(""))
                {
                    massa.setEnabled(false);
                    tvExtra4.setBackgroundResource(R.drawable.degrade2);
                    tvExtra4.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra4.setGravity(Gravity.CENTER);
                    tvExtra4.setText(Html.fromHtml(massa(
                            Double.parseDouble(periodo.getText().toString()),
                            Double.parseDouble(constanteElastica2.getText().toString()),
                            Double.parseDouble(pi.getText().toString())
                    ) + " Kg"));
                }
                //calcula Periodo (t)
                else if (!pi.getText().toString().equals("") &&
                        !massa.getText().toString().equals("") &&
                        !constanteElastica2.getText().toString().equals(""))
                {
                    periodo.setEnabled(false);
                    tvExtra4.setBackgroundResource(R.drawable.degrade2);
                    tvExtra4.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra4.setGravity(Gravity.CENTER);
                    tvExtra4.setText(Html.fromHtml(periodoT(
                            Double.parseDouble(pi.getText().toString()),
                            Double.parseDouble(massa.getText().toString()),
                            Double.parseDouble(constanteElastica2.getText().toString())
                    ) + " s"));
                }
            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });
    }
}
