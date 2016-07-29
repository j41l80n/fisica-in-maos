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

public class TelaResumoDinamicaQuantidadeMovimento extends Fragment
{
    private View rootView;
    private TextView tvExtra1;

    private EditText qMovimento;
    private EditText massa;
    private EditText velocidade;

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        configuraTextView();
        configuraEditText();

        qMovimentoPressed();
        massaPressed();
        velocidadePressed();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        rootView = inflater.inflate(R.layout.tela_resumo_dinamica_quantidade_movimento, container, false);
        return rootView;
    }

    private void configuraTextView()
    {
        TextView tvTelaResumoQuantidadeMovimento01 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_quantidade_movimento_01);
        TextView tvTelaResumoQuantidadeMovimento02 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_quantidade_movimento_02);
        TextView tvTelaResumoQuantidadeMovimento03 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_quantidade_movimento_03);
        TextView tvTelaResumoQuantidadeMovimento04 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_quantidade_movimento_04);
        TextView tvTelaResumoQuantidadeMovimento05 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_quantidade_movimento_05);

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumoQuantidadeMovimento01.setTypeface(font);
        tvTelaResumoQuantidadeMovimento02.setTypeface(font);
        tvTelaResumoQuantidadeMovimento03.setTypeface(font);
        tvTelaResumoQuantidadeMovimento04.setTypeface(font);
        tvTelaResumoQuantidadeMovimento05.setTypeface(font);

        tvExtra1 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_08_extra_01);

        tvTelaResumoQuantidadeMovimento01.setText(Html.fromHtml(
                "<p>Grandeza que nos permite estudar as transferências de movimento de um corpo " +
                "para outro.Quando nos perguntamos o que causa maior estrago, um carro a 20km/h " +
                "ou um ônibus com a mesma velocidade? É esperado que a resposta seja o ônibus. " +
                "Mas se pegarmos agora o mesmo carro com velocidade " +
                "de 80km/h e o ônibus a 20km/h? Agora esperamos que a resposta seja o carro.</p>" +
                "<p>É fácil observar que vamos ter duas dependências e o maior estrago será " +
                "causado por quem tiver o maior produto, ou seja, quem tiver a maior quantidade " +
                "de movimento.</p>"));
        tvTelaResumoQuantidadeMovimento02.setText(Html.fromHtml("Quantidade de movimento (Q) = "));
        tvTelaResumoQuantidadeMovimento03.setText(Html.fromHtml("Massa (m) = "));
        tvTelaResumoQuantidadeMovimento04.setText(Html.fromHtml("Velocidade (v) = "));
        tvTelaResumoQuantidadeMovimento05.setText(Html.fromHtml("<p>GRANDEZA VETORIAL</p>" +
                "<p>Unidade: Kg.m/s</p>" +
                "<p>Quando atribuímos um Impulso a um corpo qualquer, iremos variar o seu" +
                " movimento, mais precisamente sua velocidade. </p>"));
    }

    private void configuraEditText()
    {
        qMovimento = (EditText)  rootView.findViewById(R.id.et_tela_resumo_dinamica_potencia_01);
        massa = (EditText)  rootView.findViewById(R.id.et_tela_resumo_dinamica_potencia_02);
        velocidade = (EditText)  rootView.findViewById(R.id.et_tela_resumo_dinamica_potencia_03);
    }

    //1
    //Q = m * v
    private double qMovimento(double m, double v)
    {
        //
        return m * v;
    }

    //m = Q / v
    private double massa(double q, double v)
    {
        //
        return q / v;
    }

    //v = Q / m
    private double velocidade(double q, double m)
    {
        //
        return q / m;
    }

    private void qMovimentoPressed()
    {
        qMovimento.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (qMovimento.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.color.branco);
                    tvExtra1.setText("");
                    massa.setEnabled(true);
                    velocidade.setEnabled(true);
                }
                //calcula massa
                else if (!qMovimento.getText().toString().equals("") &&
                        !velocidade.getText().toString().equals(""))
                {
                    massa.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setText(massa(
                            Double.parseDouble(qMovimento.getText().toString()),
                            Double.parseDouble(velocidade.getText().toString())
                    ) + " s");
                }
                //calcula velocidade
                else if (!qMovimento.getText().toString().equals("") &&
                        !massa.getText().toString().equals(""))
                {
                    velocidade.setEnabled(false);tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setText(velocidade(
                            Double.parseDouble(qMovimento.getText().toString()),
                            Double.parseDouble(massa.getText().toString())
                    ) + " N");
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
                    qMovimento.setEnabled(true);
                    velocidade.setEnabled(true);
                }
                //calcula Quantidade de movimento
                else if (!massa.getText().toString().equals("") &&
                        !velocidade.getText().toString().equals(""))
                {
                    qMovimento.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setText(qMovimento(
                            Double.parseDouble(massa.getText().toString()),
                            Double.parseDouble(velocidade.getText().toString())
                    ) + " kg.m/s");
                }
                //calcula velocidade
                else if (!qMovimento.getText().toString().equals("") &&
                        !massa.getText().toString().equals(""))
                {
                    velocidade.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setText(velocidade(
                            Double.parseDouble(qMovimento.getText().toString()),
                            Double.parseDouble(massa.getText().toString())
                    ) + " m/s");
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
                    tvExtra1.setBackgroundResource(R.color.branco);
                    tvExtra1.setText("");
                    qMovimento.setEnabled(true);
                    massa.setEnabled(true);
                }
                //calcula Quantidade de movimento
                else if (!massa.getText().toString().equals("") &&
                        !velocidade.getText().toString().equals(""))
                {
                    massa.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setText(qMovimento(
                            Double.parseDouble(massa.getText().toString()),
                            Double.parseDouble(velocidade.getText().toString())
                    ) + " kg.m/s");
                }
                //calcula massa
                else if (!qMovimento.getText().toString().equals("") &&
                        !velocidade.getText().toString().equals(""))
                {
                    massa.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setText(massa(
                            Double.parseDouble(qMovimento.getText().toString()),
                            Double.parseDouble(velocidade.getText().toString())
                    ) + " kg");
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
