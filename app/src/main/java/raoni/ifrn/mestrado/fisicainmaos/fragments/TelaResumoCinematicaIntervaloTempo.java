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

public class TelaResumoCinematicaIntervaloTempo extends Fragment
{
    private TextView tvTelaResumoCinematica0500;
    private TextView tvTelaResumoCinematica0501;
    private TextView tvTelaResumoCinematica0502;
    private TextView tvTelaResumoCinematica0503;
    private TextView tvTelaResumoCinematica0504;
    private TextView tvExtra;
    private EditText etTempoInicial;
    private EditText etInstanteFinal;
    private EditText etIntervaloTempo;
    private View rootView;

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        configuraTextView();
        configuraEditText();
        etTempoInicialPressed();
        etTempoFinalPressed();
        etIntervaloTempo();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        rootView = inflater.inflate(R.layout.tela_resumo_cinematica_intervalo_tempo, container, false);
        return rootView;
    }

    private void configuraTextView()
    {
        tvTelaResumoCinematica0500 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_05_00);
        tvTelaResumoCinematica0501 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_05_01);
        tvTelaResumoCinematica0502 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_05_02);
        tvTelaResumoCinematica0503 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_05_03);
        tvTelaResumoCinematica0504 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_05_04);
        tvExtra = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_05_00_extra);

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumoCinematica0501.setTypeface(font);
        tvTelaResumoCinematica0502.setTypeface(font);
        tvTelaResumoCinematica0503.setTypeface(font);
        tvTelaResumoCinematica0504.setTypeface(font);

        //tvTelaResumoCinematica0500.setText(Html.fromHtml("∆t = t - t<sub>0</sub>"));
        tvTelaResumoCinematica0501.setText(Html.fromHtml("Unidade no <b>SI</b>: segundos (s)"));
        tvTelaResumoCinematica0502.setText(Html.fromHtml("Instante inicial (<i>t</i><sub>0</sub>):"));
        tvTelaResumoCinematica0503.setText(Html.fromHtml("Instante final (<i>t</i>):"));
        tvTelaResumoCinematica0504.setText(Html.fromHtml("Intervalo de tempo (<i>∆t</i>):"));
    }

    private void configuraEditText()
    {
        etTempoInicial = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_05_01);
        etInstanteFinal = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_05_02);
        etIntervaloTempo = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_05_03);
    }

    private void etTempoInicialPressed()
    {
        etTempoInicial.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if(etTempoInicial.getText().toString().equals(""))
                {
                    tvExtra.setText("");
                    tvExtra.setBackgroundResource(R.color.branco);
                    etIntervaloTempo.setEnabled(true);
                }
                else if(!etInstanteFinal.getText().toString().equals("")
                        && !etTempoInicial.getText().toString().equals(""))
                {
                    double tInicial;
                    double tFinal;

                    etIntervaloTempo.setEnabled(false);

                    tInicial = Double.parseDouble(etTempoInicial.getText().toString());
                    tFinal = Double.parseDouble(etInstanteFinal.getText().toString());

                    tvExtra.setBackgroundResource(R.drawable.degrade2);
                    tvExtra.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra.setGravity(Gravity.CENTER);
                    tvExtra.setText((tFinal - tInicial) + " s");
                }
                else if (!etIntervaloTempo.getText().toString().equals("") &&
                        !etTempoInicial.getText().toString().equals(""))
                {
                    double x;
                    double y;

                    etIntervaloTempo.setEnabled(false);

                    x = Double.parseDouble(etTempoInicial.getText().toString());
                    y = Double.parseDouble(etInstanteFinal.getText().toString());

                    tvExtra.setBackgroundResource(R.drawable.degrade2);
                    tvExtra.setGravity(Gravity.CENTER);
                    tvExtra.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra.setText((y - x) + " s");
                }
            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });
    }

    private void etTempoFinalPressed()
    {
        etInstanteFinal.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (etInstanteFinal.getText().toString().equals(""))
                {
                    tvExtra.setText("");
                    tvExtra.setBackgroundResource(R.color.branco);
                    etIntervaloTempo.setEnabled(true);
                }
                else if (!etInstanteFinal.getText().toString().equals("") &&
                        !etTempoInicial.getText().toString().equals(""))
                {
                    double tInicial;
                    double tFinal;

                    etIntervaloTempo.setEnabled(false);

                    tInicial = Double.parseDouble(etTempoInicial.getText().toString());
                    tFinal = Double.parseDouble(etInstanteFinal.getText().toString());

                    tvExtra.setBackgroundResource(R.drawable.degrade2);
                    tvExtra.setGravity(Gravity.CENTER);
                    tvExtra.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra.setText((tFinal - tInicial) + " s");
                }
                else if (!etIntervaloTempo.getText().toString().equals("") &&
                        !etInstanteFinal.getText().toString().equals(""))
                {
                    double x;
                    double y;

                    etIntervaloTempo.setEnabled(false);

                    x = Double.parseDouble(etIntervaloTempo.getText().toString());
                    y = Double.parseDouble(etInstanteFinal.getText().toString());
                    tvExtra.setGravity(Gravity.CENTER);
                    tvExtra.setBackgroundResource(R.drawable.degrade2);
                    tvExtra.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra.setText((y + x) + " s");
                }
            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });
    }

    private void etIntervaloTempo()
    {
        etIntervaloTempo.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (etIntervaloTempo.getText().toString().equals(""))
                {
                    tvExtra.setText("");
                    tvExtra.setBackgroundResource(R.color.branco);
                    etTempoInicial.setEnabled(true);
                    etInstanteFinal.setEnabled(true);
                }
                else if (!etIntervaloTempo.getText().toString().equals("") &&
                        !etTempoInicial.getText().toString().equals(""))
                {
                    double x;
                    double y;

                    etInstanteFinal.setEnabled(false);

                    x = Double.parseDouble(etTempoInicial.getText().toString());
                    y = Double.parseDouble(etIntervaloTempo.getText().toString());
                    tvExtra.setGravity(Gravity.CENTER);
                    tvExtra.setBackgroundResource(R.drawable.degrade2);
                    tvExtra.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra.setText((y + x) + " s");
                }
                else if (!etIntervaloTempo.getText().toString().equals("") &&
                        !etInstanteFinal.getText().toString().equals(""))
                {
                    double x;
                    double y;

                    etTempoInicial.setEnabled(false);

                    x = Double.parseDouble(etIntervaloTempo.getText().toString());
                    y = Double.parseDouble(etInstanteFinal.getText().toString());
                    tvExtra.setGravity(Gravity.CENTER);
                    tvExtra.setBackgroundResource(R.drawable.degrade2);
                    tvExtra.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra.setText((y + x) + " s");
                }
            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });
    }
}
