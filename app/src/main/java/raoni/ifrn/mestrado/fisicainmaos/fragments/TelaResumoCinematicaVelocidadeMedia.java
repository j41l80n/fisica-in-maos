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

public class TelaResumoCinematicaVelocidadeMedia extends Fragment
{


    private EditText deslocamento;
    private EditText intervaloTempo;
    private EditText velocidadeMedia;
    private EditText etMetrosSegundos;
    private EditText etKilometroHora;
    private EditText etEextra1;
    private EditText etExtra2;
    private View rootView;
    private TextView tvExtra;

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        configuraTextView();
        configuraEditText();
        deslocamentoPressed();
        intervaloTempoPressed();
        etKilometroHoraPressed();
        etMetrosSegundosPressed();
        velocidadeMediaPressed();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        rootView = inflater.inflate(R.layout.tela_resumo_cinematica_velocidade_media, container, false);
        return rootView;
    }

    private void configuraTextView()
    {
        TextView tvTelaResumoCinematica0701 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_07_01);
        TextView tvTelaResumoCinematica0702 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_07_02);
        TextView tvTelaResumoCinematica0703 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_07_03);
        TextView tvTelaResumoCinematica0704 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_07_04);
        TextView tvTelaResumoCinematica0705 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_07_05);
        TextView tvTelaResumoCinematica0706 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_07_06);
        tvExtra = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_07_00_extra);

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumoCinematica0701.setTypeface(font);
        tvTelaResumoCinematica0702.setTypeface(font);
        tvTelaResumoCinematica0703.setTypeface(font);
        tvTelaResumoCinematica0704.setTypeface(font);
        tvTelaResumoCinematica0705.setTypeface(font);
        tvTelaResumoCinematica0706.setTypeface(font);

        tvTelaResumoCinematica0701.setText(Html.fromHtml("Unidade no <b>SI</b>: m/s"));
        tvTelaResumoCinematica0702.setText(Html.fromHtml("<p>Deslocamento (<i>&Delta;S</i>):</p>"));
        tvTelaResumoCinematica0703.setText(Html.fromHtml("<p>Intervalo de tempo (<i>&Delta;t</i>):</p>"));
        tvTelaResumoCinematica0704.setText(Html.fromHtml("<p>Velocidade Média (<i>V</i>):</p>"));
        tvTelaResumoCinematica0705.setText(Html.fromHtml("<p> V &gt; 0 = movimento progressivo (sentido da trajetória).</p> " +
                "<p>V &lt; 0 = movimento retrógrado (sentido contrário a trajetória)</p>"));
        tvTelaResumoCinematica0706.setText(Html.fromHtml("<p>Conversão de unidades:</p>"));
    }

    private void configuraEditText()
    {
        deslocamento = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_07_01);
        intervaloTempo = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_07_02);
        velocidadeMedia = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_07_03);
        etMetrosSegundos = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_07_04);
        etKilometroHora = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_07_05);
        etEextra1 = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_07_extra1);
        etExtra2 = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_07_extra2);
    }

    //1
    private void etMetrosSegundosPressed()
    {
        etMetrosSegundos.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (etMetrosSegundos.getText().toString().equals(""))
                {
                    etExtra2.setText("");
                    etExtra2.setVisibility(View.GONE);
                    etExtra2.setEnabled(true);
                    etKilometroHora.setVisibility(View.VISIBLE);
                }
                else if (!etMetrosSegundos.getText().toString().equals(""))
                {
                    etExtra2.setVisibility(View.VISIBLE);
                    etExtra2.setEnabled(false);
                    etKilometroHora.setVisibility(View.GONE);

                    double x;
                    x = Double.parseDouble(etMetrosSegundos.getText().toString());

                    etExtra2.setText("" + (x * 3.6));
                }
            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });
    }

    private void etKilometroHoraPressed()
    {
        etKilometroHora.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (etKilometroHora.getText().toString().equals(""))
                {
                    etEextra1.setText("");
                    etEextra1.setVisibility(View.GONE);
                    etEextra1.setEnabled(true);
                    etMetrosSegundos.setVisibility(View.VISIBLE);
                }
                else if (!etKilometroHora.getText().toString().equals(""))
                {
                    etEextra1.setVisibility(View.VISIBLE);
                    etMetrosSegundos.setVisibility(View.GONE);
                    etEextra1.setEnabled(false);
                    double x;
                    x = Double.parseDouble(etKilometroHora.getText().toString());

                    etEextra1.setText("" + (x / 3.6));
                }
            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });
    }

    //
    private void deslocamentoPressed()
    {
        deslocamento.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (deslocamento.getText().toString().equals(""))
                {
                    tvExtra.setText("");
                    tvExtra.setBackgroundResource(R.color.branco);
                    intervaloTempo.setEnabled(true);
                    velocidadeMedia.setEnabled(true);
                }
                else if (!deslocamento.getText().toString().equals("") &&
                        !intervaloTempo.getText().toString().equals(""))
                {
                    velocidadeMedia.setEnabled(false);
                    tvExtra.setGravity(Gravity.CENTER);
                    tvExtra.setBackgroundResource(R.drawable.degrade2);
                    tvExtra.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra.setText(Html.fromHtml(calculaVelocidade(
                            Double.parseDouble(deslocamento.getText().toString()),
                            Double.parseDouble(intervaloTempo.getText().toString())) + " m/s"));
                }
                else if (!deslocamento.getText().toString().equals("") &&
                        !velocidadeMedia.getText().toString().equals(""))
                {
                    intervaloTempo.setEnabled(false);
                    tvExtra.setGravity(Gravity.CENTER);
                    tvExtra.setBackgroundResource(R.drawable.degrade2);
                    tvExtra.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra.setText(Html.fromHtml(calculaIntervaloTempo(
                            Double.parseDouble(deslocamento.getText().toString()),
                            Double.parseDouble(velocidadeMedia.getText().toString())
                    ) + " s"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void intervaloTempoPressed()
    {
        intervaloTempo.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (intervaloTempo.getText().toString().equals(""))
                {
                    tvExtra.setText("");
                    deslocamento.setEnabled(true);
                    velocidadeMedia.setEnabled(true);
                }
                else if (!intervaloTempo.getText().toString().equals("") &&
                        !deslocamento.getText().toString().equals(""))
                {
                    velocidadeMedia.setEnabled(false);
                    tvExtra.setGravity(Gravity.CENTER);
                    tvExtra.setBackgroundResource(R.drawable.degrade2);
                    tvExtra.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra.setText(Html.fromHtml(calculaVelocidade(
                            Double.parseDouble(deslocamento.getText().toString()),
                            Double.parseDouble(intervaloTempo.getText().toString())
                    ) + " m/s"));
                }
                else if (!intervaloTempo.getText().toString().equals("") &&
                        !velocidadeMedia.getText().toString().equals(""))
                {
                    deslocamento.setEnabled(false);
                    tvExtra.setGravity(Gravity.CENTER);
                    tvExtra.setBackgroundResource(R.drawable.degrade2);
                    tvExtra.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra.setText(Html.fromHtml(calculaDeslocamento(
                            Double.parseDouble(velocidadeMedia.getText().toString()),
                            Double.parseDouble(intervaloTempo.getText().toString())
                    ) + " s"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void velocidadeMediaPressed()
    {
        velocidadeMedia.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (velocidadeMedia.getText().toString().equals(""))
                {
                    tvExtra.setText("");
                    deslocamento.setEnabled(true);
                    velocidadeMedia.setEnabled(true);
                }
                else if (!velocidadeMedia.getText().toString().equals("") &&
                        !intervaloTempo.getText().toString().equals(""))
                {
                    deslocamento.setEnabled(false);
                    tvExtra.setGravity(Gravity.CENTER);
                    tvExtra.setBackgroundResource(R.drawable.degrade2);
                    tvExtra.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra.setText(Html.fromHtml(calculaDeslocamento(
                            Double.parseDouble(velocidadeMedia.getText().toString()),
                            Double.parseDouble(intervaloTempo.getText().toString())
                    ) + " m"));
                }
                else if (!velocidadeMedia.getText().toString().equals("") &&
                        !deslocamento.getText().toString().equals(""))
                {
                    intervaloTempo.setEnabled(false);
                    tvExtra.setGravity(Gravity.CENTER);
                    tvExtra.setBackgroundResource(R.drawable.degrade2);
                    tvExtra.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra.setText(Html.fromHtml(calculaIntervaloTempo(
                            Double.parseDouble(deslocamento.getText().toString()),
                            Double.parseDouble(velocidadeMedia.getText().toString())
                    ) + " s"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private double calculaVelocidade(double variacaoEspaco, double variacaoTempo)
    {
        // V = (∆S / ∆t)
        return (variacaoEspaco / variacaoTempo);
    }

    private double calculaIntervaloTempo(double variacaoEspaco, double velocidade)
    {
        // ∆t = (∆S / V)
        return (variacaoEspaco / velocidade);
    }

    private double calculaDeslocamento(double velocidade, double variacaoTempo)
    {
        // ∆S = (V.∆t)
        return velocidade * variacaoTempo;
    }
}