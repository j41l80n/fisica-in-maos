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

public class TelaResumoCinematicaMRU extends Fragment
{
    private View rootView;
    private TextView tvExtra;
    private EditText espacoInicial;
    private EditText espacoFinal;
    private EditText velocidade;
    private EditText tempo;

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        configuraTextView();
        configuraEditText();
        espacoInicialPressed();
        espacoFinalPressed();
        velocidadePressed();
        tempoPressed();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        rootView = inflater.inflate(R.layout.tela_resumo_cinematica_mru, container, false);
        return rootView;
    }

    private void configuraEditText()
    {
        espacoInicial = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_08_01);
        espacoFinal = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_08_02);
        velocidade = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_08_03);
        tempo = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_08_04);
    }

    private void configuraTextView()
    {
        TextView tvTelaResumoCinematica0801 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_08_01);
        TextView tvTelaResumoCinematica0802 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_08_02);
        TextView tvTelaResumoCinematica0803 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_08_03);
        TextView tvTelaResumoCinematica0804 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_08_04);
        TextView tvTelaResumoCinematica0805 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_08_05);
        TextView tvTelaResumoCinematica0806 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_08_06);

        tvExtra = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_08_00_extra);

        tvTelaResumoCinematica0801.setText(Html.fromHtml("Movimento em trajetória retilínea onde o corpo mantém uma velocidade constante."));
        tvTelaResumoCinematica0802.setText(Html.fromHtml("Equação horária do movimento: "));
        tvTelaResumoCinematica0803.setText(Html.fromHtml("Espaço inicial (S<sub>0</sub>)"));
        tvTelaResumoCinematica0804.setText(Html.fromHtml("Espaço final (<i>S</i>)"));
        tvTelaResumoCinematica0805.setText(Html.fromHtml("Velocidade (<i>v</i>)"));
        tvTelaResumoCinematica0806.setText(Html.fromHtml("Tempo(<i>t</i>)"));

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumoCinematica0801.setTypeface(font);
        tvTelaResumoCinematica0802.setTypeface(font);
        tvTelaResumoCinematica0803.setTypeface(font);
        tvTelaResumoCinematica0804.setTypeface(font);
        tvTelaResumoCinematica0805.setTypeface(font);
        tvTelaResumoCinematica0806.setTypeface(font);

        Typeface fontex = Typeface.createFromAsset(getActivity().getAssets(), "fonts/caviar_negrito.ttf");
        tvExtra.setTypeface(fontex);
    }

    //1
    private double s(double s0, double v, double t)
    {
        //s = s0 + (v * t)
        return s0 + (v * t);
    }

    private double s0(double s, double v, double t)
    {
        //s = s - (v * t)
        return s - (v * t);
    }

    private double v(double s, double s0, double delT)
    {
        //v = (s - s0) / delT
        return (s - s0) / delT;
    }

    private double delT(double s, double s0, double v)
    {
        //delT = (s - s0) / v
        return (s - s0) / v;
    }

    private void espacoInicialPressed()
    {
        espacoInicial.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (espacoInicial.getText().toString().equals(""))
                {
                    tvExtra.setText("");
                    tvExtra.setBackgroundResource(R.color.branco);
                    espacoFinal.setEnabled(true);
                    velocidade.setEnabled(true);
                    tempo.setEnabled(true);
                }
                //calcula s
                else if (!espacoInicial.getText().toString().equals("") &&
                        !velocidade.getText().toString().equals("")&&
                        !tempo.getText().toString().equals(""))
                {
                    espacoFinal.setEnabled(false);
                    tvExtra.setGravity(Gravity.CENTER);
                    tvExtra.setBackgroundResource(R.drawable.degrade2);
                    tvExtra.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra.setText(Html.fromHtml(s(
                            Double.parseDouble(espacoInicial.getText().toString()),
                            Double.parseDouble(velocidade.getText().toString()),
                            Double.parseDouble(tempo.getText().toString())) + " m"));
                }
                //calcula v
                else if (!espacoFinal.getText().toString().equals("") &&
                        !espacoInicial.getText().toString().equals("")&&
                        !tempo.getText().toString().equals(""))
                {
                    velocidade.setEnabled(false);
                    tvExtra.setGravity(Gravity.CENTER);
                    tvExtra.setBackgroundResource(R.drawable.degrade2);
                    tvExtra.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra.setText(Html.fromHtml(v(
                            Double.parseDouble(espacoFinal.getText().toString()),
                            Double.parseDouble(espacoInicial.getText().toString()),
                            Double.parseDouble(tempo.getText().toString())) + " m/s"));
                }
                //calcula delT
                else if (!espacoFinal.getText().toString().equals("") &&
                        !espacoInicial.getText().toString().equals("")&&
                        !velocidade.getText().toString().equals(""))
                {
                    tempo.setEnabled(false);
                    tvExtra.setGravity(Gravity.CENTER);
                    tvExtra.setBackgroundResource(R.drawable.degrade2);
                    tvExtra.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra.setText(Html.fromHtml(delT(
                            Double.parseDouble(espacoFinal.getText().toString()),
                            Double.parseDouble(espacoInicial.getText().toString()),
                            Double.parseDouble(velocidade.getText().toString())) + " s"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void espacoFinalPressed()
    {
        espacoFinal.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (espacoFinal.getText().toString().equals(""))
                {
                    tvExtra.setBackgroundResource(R.color.branco);
                    tvExtra.setText("");
                    espacoInicial.setEnabled(true);
                    velocidade.setEnabled(true);
                    tempo.setEnabled(true);
                }
                //calcula v
                else if (!espacoFinal.getText().toString().equals("") &&
                        !espacoInicial.getText().toString().equals("")&&
                        !tempo.getText().toString().equals(""))
                {
                    velocidade.setEnabled(false);
                    tvExtra.setGravity(Gravity.CENTER);
                    tvExtra.setBackgroundResource(R.drawable.degrade2);
                    tvExtra.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra.setText(Html.fromHtml(v(
                            Double.parseDouble(espacoFinal.getText().toString()),
                            Double.parseDouble(espacoInicial.getText().toString()),
                            Double.parseDouble(tempo.getText().toString())) + " m/s"));
                }
                //calcula delT
                else if (!espacoFinal.getText().toString().equals("") &&
                        !espacoInicial.getText().toString().equals("")&&
                        !velocidade.getText().toString().equals(""))
                {
                    tempo.setEnabled(false);
                    tvExtra.setGravity(Gravity.CENTER);
                    tvExtra.setBackgroundResource(R.drawable.degrade2);
                    tvExtra.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra.setText(Html.fromHtml(delT(
                            Double.parseDouble(espacoFinal.getText().toString()),
                            Double.parseDouble(espacoInicial.getText().toString()),
                            Double.parseDouble(velocidade.getText().toString())) + " s"));
                }
                //calcula s0
                else if (!espacoFinal.getText().toString().equals("") &&
                        !velocidade.getText().toString().equals("")&&
                        !tempo.getText().toString().equals(""))
                {
                    espacoInicial.setEnabled(false);
                    tvExtra.setGravity(Gravity.CENTER);
                    tvExtra.setBackgroundResource(R.drawable.degrade2);
                    tvExtra.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra.setText(Html.fromHtml(s0(
                            Double.parseDouble(espacoFinal.getText().toString()),
                            Double.parseDouble(velocidade.getText().toString()),
                            Double.parseDouble(tempo.getText().toString())) + " m"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void velocidadePressed()
    {
        velocidade.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (velocidade.getText().toString().equals(""))
                {
                    tvExtra.setBackgroundResource(R.color.branco);
                    tvExtra.setText("");
                    espacoInicial.setEnabled(true);
                    espacoFinal.setEnabled(true);
                    tempo.setEnabled(true);
                }
                //calcula delT
                else if (!espacoFinal.getText().toString().equals("") &&
                        !espacoInicial.getText().toString().equals("")&&
                        !velocidade.getText().toString().equals(""))
                {
                    tempo.setEnabled(false);
                    tvExtra.setGravity(Gravity.CENTER);
                    tvExtra.setBackgroundResource(R.drawable.degrade2);
                    tvExtra.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra.setText(Html.fromHtml(delT(
                            Double.parseDouble(espacoFinal.getText().toString()),
                            Double.parseDouble(espacoInicial.getText().toString()),
                            Double.parseDouble(velocidade.getText().toString())) + " s"));
                }
                //calcula s
                else if (!espacoInicial.getText().toString().equals("") &&
                        !velocidade.getText().toString().equals("")&&
                        !tempo.getText().toString().equals(""))
                {
                    espacoFinal.setEnabled(false);
                    tvExtra.setGravity(Gravity.CENTER);
                    tvExtra.setBackgroundResource(R.drawable.degrade2);
                    tvExtra.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra.setText(Html.fromHtml(s(
                            Double.parseDouble(espacoInicial.getText().toString()),
                            Double.parseDouble(velocidade.getText().toString()),
                            Double.parseDouble(tempo.getText().toString())) + " m"));
                }
                //calcula s0
                else if (!espacoFinal.getText().toString().equals("") &&
                        !velocidade.getText().toString().equals("")&&
                        !tempo.getText().toString().equals(""))
                {
                    espacoInicial.setEnabled(false);
                    tvExtra.setGravity(Gravity.CENTER);
                    tvExtra.setBackgroundResource(R.drawable.degrade2);
                    tvExtra.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra.setText(Html.fromHtml(s0(
                            Double.parseDouble(espacoFinal.getText().toString()),
                            Double.parseDouble(velocidade.getText().toString()),
                            Double.parseDouble(tempo.getText().toString())) + " m"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void tempoPressed()
    {
        tempo.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (tempo.getText().toString().equals(""))
                {
                    tvExtra.setBackgroundResource(R.color.branco);
                    tvExtra.setText("");
                    espacoFinal.setEnabled(true);
                    espacoInicial.setEnabled(true);
                    velocidade.setEnabled(true);
                }
                //calcula s0
                else if (!espacoFinal.getText().toString().equals("") &&
                        !velocidade.getText().toString().equals("")&&
                        !tempo.getText().toString().equals(""))
                {
                    espacoInicial.setEnabled(false);
                    tvExtra.setGravity(Gravity.CENTER);
                    tvExtra.setBackgroundResource(R.drawable.degrade2);
                    tvExtra.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra.setText(Html.fromHtml(s0(
                            Double.parseDouble(espacoFinal.getText().toString()),
                            Double.parseDouble(velocidade.getText().toString()),
                            Double.parseDouble(tempo.getText().toString())) + " m"));
                }
                //calcula s
                else if (!espacoInicial.getText().toString().equals("") &&
                        !velocidade.getText().toString().equals("")&&
                        !tempo.getText().toString().equals(""))
                {
                    espacoFinal.setEnabled(false);
                    tvExtra.setGravity(Gravity.CENTER);
                    tvExtra.setBackgroundResource(R.drawable.degrade2);
                    tvExtra.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra.setText(Html.fromHtml(s(
                            Double.parseDouble(espacoInicial.getText().toString()),
                            Double.parseDouble(velocidade.getText().toString()),
                            Double.parseDouble(tempo.getText().toString())) + " m"));
                }
                //calcula v
                else if (!espacoFinal.getText().toString().equals("") &&
                        !espacoInicial.getText().toString().equals("")&&
                        !tempo.getText().toString().equals(""))
                {
                    velocidade.setEnabled(false);
                    tvExtra.setGravity(Gravity.CENTER);
                    tvExtra.setBackgroundResource(R.drawable.degrade2);
                    tvExtra.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra.setText(Html.fromHtml(v(
                            Double.parseDouble(espacoFinal.getText().toString()),
                            Double.parseDouble(espacoInicial.getText().toString()),
                            Double.parseDouble(tempo.getText().toString())) + " m/s"));
                }
            }
            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });
    }
}