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

public class TelaResumoDinamicaColisoesMecanicas extends Fragment
{
    private View rootView;
    private TextView tvExtra1;

    private EditText cRestituicao;
    private EditText vAfastamento;
    private EditText vAproximacao;

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        configuraTextView();
        configuraEditText();

        cRestituicaoPressed();
        vAfastamentoPressed();
        vAproximacaoPressed();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        rootView = inflater.inflate(R.layout.tela_resumo_dinamica_colisoes_mecanicas, container, false);
        return rootView;
    }

    private void configuraTextView()
    {
        TextView tvTelaResumoDinamicaColisoesMecanicas01 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_quantidade_colisoes_mecanicas_01);
        TextView tvTelaResumoDinamicaColisoesMecanicas02 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_quantidade_colisoes_mecanicas_02);
        TextView tvTelaResumoDinamicaColisoesMecanicas03 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_quantidade_colisoes_mecanicas_03);
        TextView tvTelaResumoDinamicaColisoesMecanicas04 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_quantidade_colisoes_mecanicas_04);
        TextView tvTelaResumoDinamicaColisoesMecanicas05 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_quantidade_colisoes_mecanicas_05);
        TextView tvTelaResumoDinamicaColisoesMecanicas06 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_quantidade_colisoes_mecanicas_06);
        TextView tvTelaResumoDinamicaColisoesMecanicas07 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_quantidade_colisoes_mecanicas_07);
        tvExtra1 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_10_extra_01);

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumoDinamicaColisoesMecanicas01.setTypeface(font);
        tvTelaResumoDinamicaColisoesMecanicas02.setTypeface(font);
        tvTelaResumoDinamicaColisoesMecanicas03.setTypeface(font);
        tvTelaResumoDinamicaColisoesMecanicas04.setTypeface(font);
        tvTelaResumoDinamicaColisoesMecanicas05.setTypeface(font);
        tvTelaResumoDinamicaColisoesMecanicas06.setTypeface(font);
        tvTelaResumoDinamicaColisoesMecanicas07.setTypeface(font);

        tvTelaResumoDinamicaColisoesMecanicas01.setText(Html.fromHtml(
                "<p>São choques que ocorrem entre corpos, que podem ser classificados em: Elástico, parcialmente inelástico e inelástico.</p>" +
                "<p>Velocidade relativa:</p>" +
                "<p>Em sentidos contrários: V<sub>R</sub> = V<sub>1</sub> + V<sub>2</sub></p>" +
                "<p>No mesmo sentido: V<sub>R</sub> = V<sub>1</sub> - V<sub>2</sub></p>" +
                "<p>Coeficiente de restituição: Representa o quanto um corpo consegue se restituir, ou o quanto a velocidade de aproximação e afastamento se conserva.</p>"));

        tvTelaResumoDinamicaColisoesMecanicas02.setText(Html.fromHtml("Coeficiente de restituição (e) = "));
        tvTelaResumoDinamicaColisoesMecanicas03.setText(Html.fromHtml("V<sub>afastamento</sub> = "));
        tvTelaResumoDinamicaColisoesMecanicas04.setText(Html.fromHtml("V<sub>aproximação</sub> = "));
        tvTelaResumoDinamicaColisoesMecanicas05.setText(Html.fromHtml("<p>Choque elástico:</p>" +
                "<p>Ocorre quando os corpos seguem separados após a colisão, sem perda de energia mecânica.</p>" +
                "<p>E<sub>i</sub> = E<sub>f</sub>\te = 1\tQ<sub>i</sub> = Q<sub>f</sub></p>"));
        tvTelaResumoDinamicaColisoesMecanicas06.setText(Html.fromHtml("<p>CHOQUE PARCIALMENTE INELÁSTICO:</p>" +
                "<p>Ocorre quando após a colisão os corpos seguem separados, porém há perda de energia cinética.</p>" +
                "<p>E<sub>i</sub> ≠ E<sub>f</sub>\t0 < e < 1\tQ<sub>i</sub> = Q<sub>f</sub></p>" +
                "<p>CHOQUE INELÁSTICO:</p>" +
                "<p>Ocorre quando após o choque os corpos seguem juntos e com a mesma velocidade.</p>" +
                "<p>E<sub>i</sub> ≠ E<sub>f</sub>\te = 0\tQ<sub>i</sub> = Q<sub>f</sub></p>"));
        tvTelaResumoDinamicaColisoesMecanicas07.setText(Html.fromHtml("<p>Em uma colisão elástica se os corpos tiverem a mesma massa trocaram suas velocidades após o choque.</p>"));
    }

    private void configuraEditText()
    {
        cRestituicao = (EditText) rootView.findViewById(R.id.et_tela_resumo_dinamica_quantidade_movimento_01);
        vAfastamento = (EditText) rootView.findViewById(R.id.et_tela_resumo_dinamica_quantidade_movimento_02);
        vAproximacao = (EditText) rootView.findViewById(R.id.et_tela_resumo_dinamica_quantidade_movimento_03);
    }

    //1
    private double coeficienteRestituicao(double vAfastamento, double vAproximacao)
    {
        //e = vAfastamento / vAproximacao
        return vAfastamento / vAproximacao;
    }

    private double vAfastamento(double vAproximacao, double e)
    {
        //vAfastamento = vAproximacao * e
        return vAproximacao * e;
    }

    private double vAproximacao(double vAfastamento, double e)
    {
        //vAproximacao = vAfastamento / e
        return vAfastamento / e;
    }

    private void cRestituicaoPressed()
    {
        cRestituicao.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (cRestituicao.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.color.branco);
                    tvExtra1.setText("");
                    vAfastamento.setEnabled(true);
                    vAproximacao.setEnabled(true);
                }
                //calcula Coeficiente de afastamento
                else if (!cRestituicao.getText().toString().equals("") &&
                        !vAproximacao.getText().toString().equals(""))
                {
                    vAfastamento.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setText(Html.fromHtml(vAfastamento(
                            Double.parseDouble(vAproximacao.getText().toString()),
                            Double.parseDouble(cRestituicao.getText().toString())
                    ) + " m/s"));
                }
                //calcula Coeficiente de aproximacao
                else if (!cRestituicao.getText().toString().equals("") &&
                        !vAfastamento.getText().toString().equals(""))
                {
                    vAproximacao.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setText(Html.fromHtml(vAproximacao(
                            Double.parseDouble(vAfastamento.getText().toString()),
                            Double.parseDouble(cRestituicao.getText().toString())
                    ) + " m/s"));
                }
            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });
    }

    private void vAfastamentoPressed()
    {
        vAfastamento.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (vAfastamento.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.color.branco);
                    tvExtra1.setText("");
                    cRestituicao.setEnabled(true);
                    vAproximacao.setEnabled(true);
                }
                //calcula Coeficiente de restituicao
                else if (!vAfastamento.getText().toString().equals("") &&
                        !vAproximacao.getText().toString().equals(""))
                {
                    cRestituicao.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setText(Html.fromHtml(coeficienteRestituicao(
                            Double.parseDouble(vAfastamento.getText().toString()),
                            Double.parseDouble(vAproximacao.getText().toString())
                    ) + ""));
                }
                //calcula Coeficiente de aproximacao
                else if (!cRestituicao.getText().toString().equals("") &&
                        !vAfastamento.getText().toString().equals(""))
                {
                    vAproximacao.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setText(Html.fromHtml(vAproximacao(
                            Double.parseDouble(vAfastamento.getText().toString()),
                            Double.parseDouble(cRestituicao.getText().toString())
                    ) + " m/s"));
                }
            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });
    }

    private void vAproximacaoPressed()
    {
        vAproximacao.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (vAproximacao.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.color.branco);
                    tvExtra1.setText("");
                    cRestituicao.setEnabled(true);
                    vAfastamento.setEnabled(true);
                }
                //calcula Coeficiente de restituicao
                else if (!vAfastamento.getText().toString().equals("") &&
                        !vAproximacao.getText().toString().equals(""))
                {
                    cRestituicao.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setText(Html.fromHtml(coeficienteRestituicao(
                            Double.parseDouble(vAfastamento.getText().toString()),
                            Double.parseDouble(vAproximacao.getText().toString())
                    ) + ""));
                }
                //calcula Coeficiente de afastamento
                else if (!cRestituicao.getText().toString().equals("") &&
                        !vAproximacao.getText().toString().equals(""))
                {
                    vAfastamento.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setText(Html.fromHtml(vAfastamento(
                            Double.parseDouble(vAproximacao.getText().toString()),
                            Double.parseDouble(cRestituicao.getText().toString())
                    ) + " m/s"));
                }
            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });
    }
}