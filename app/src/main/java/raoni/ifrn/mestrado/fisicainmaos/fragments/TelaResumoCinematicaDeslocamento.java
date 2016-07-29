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

public class TelaResumoCinematicaDeslocamento extends Fragment
{
    private View rootView;
    private EditText posicaoInicial;
    private EditText posicaoFinal;
    private EditText deslocamento;
    private TextView tvExtra;

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        configuraTextView();
        configuraEdittext();
        etPosicaoFinalPressed();
        etPosicaoInicialPressed();
        deslocamentoPressed();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        rootView = inflater.inflate(R.layout.tela_resumo_cinematica_06, container, false);
        return rootView;
    }

    private void configuraTextView()
    {
        TextView tvTelaResumoCinematica0600 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_06_00);
        TextView tvTelaResumoCinematica0601 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_06_01);
        TextView tvTelaResumoCinematica0602 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_06_02);
        TextView tvTelaResumoCinematica0603 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_06_03);
        TextView tvTelaResumoCinematica0604 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_06_04);

        tvExtra = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_06_00_extra);

        //tvTelaResumoCinematica0600.setText(Html.fromHtml("∆S = S - S<sub>0</sub>"));
        tvTelaResumoCinematica0601.setText(Html.fromHtml("Unidade no <b>SI</b>: metros (m)"));
        tvTelaResumoCinematica0602.setText(Html.fromHtml("Posição inicial (<i>S</i><sub>0</sub>):"));
        tvTelaResumoCinematica0603.setText(Html.fromHtml("Posição final (<i>S</i>):  "));
        tvTelaResumoCinematica0604.setText(Html.fromHtml("Deslocamento (<i>∆S<i>):"));

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumoCinematica0601.setTypeface(font);
        tvTelaResumoCinematica0602.setTypeface(font);
        tvTelaResumoCinematica0603.setTypeface(font);
        tvTelaResumoCinematica0604.setTypeface(font);
    }

    private void configuraEdittext()
    {
        posicaoInicial = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_06_01);
        posicaoFinal = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_06_02);
        deslocamento = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_06_03);
    }

    private void etPosicaoInicialPressed()
    {
        posicaoInicial.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if(posicaoInicial.getText().toString().equals(""))
                {
                    tvExtra.setText("");
                    tvExtra.setBackgroundResource(R.color.branco);
                    posicaoFinal.setEnabled(true);
                    deslocamento.setEnabled(true);
                }
                else if(!posicaoInicial.getText().toString().equals("")
                        && !posicaoFinal.getText().toString().equals(""))
                {
                    double x;
                    double y;

                    deslocamento.setEnabled(false);

                    x = Double.parseDouble(posicaoInicial.getText().toString());
                    y = Double.parseDouble(posicaoFinal.getText().toString());

                    tvExtra.setBackgroundResource(R.drawable.degrade2);
                    tvExtra.setGravity(Gravity.CENTER);
                    tvExtra.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra.setText((y -x) + " m");
                }
                else if (!posicaoInicial.getText().toString().equals("") &&
                        !deslocamento.getText().toString().equals(""))
                {
                    double x;
                    double y;

                    posicaoFinal.setEnabled(false);

                    x = Double.parseDouble(posicaoInicial.getText().toString());
                    y = Double.parseDouble(deslocamento.getText().toString());
                    tvExtra.setGravity(Gravity.CENTER);
                    tvExtra.setBackgroundResource(R.drawable.degrade2);
                    tvExtra.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra.setText((y + x) + " m");
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void etPosicaoFinalPressed()
    {
        posicaoFinal.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if(posicaoFinal.getText().toString().equals(""))
                {
                    tvExtra.setText("");
                    tvExtra.setBackgroundResource(R.color.branco);
                    posicaoInicial.setEnabled(true);
                    deslocamento.setEnabled(true);
                }
                else if(!posicaoFinal.getText().toString().equals("")
                        && !posicaoInicial.getText().toString().equals(""))
                {
                    double x;
                    double y;

                    deslocamento.setEnabled(false);

                    x = Double.parseDouble(posicaoInicial.getText().toString());
                    y = Double.parseDouble(posicaoFinal.getText().toString());

                    tvExtra.setBackgroundResource(R.drawable.degrade2);
                    tvExtra.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra.setText((y -x) + " m");
                }
                else if (!posicaoFinal.getText().toString().equals("") &&
                        !deslocamento.getText().toString().equals(""))
                {
                    double x;
                    double y;

                    posicaoFinal.setEnabled(false);

                    x = Double.parseDouble(posicaoInicial.getText().toString());
                    y = Double.parseDouble(deslocamento.getText().toString());
                    tvExtra.setGravity(Gravity.CENTER);
                    tvExtra.setBackgroundResource(R.drawable.degrade2);
                    tvExtra.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra.setText((y + x) + " m");
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void deslocamentoPressed()
    {
        deslocamento.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (deslocamento.getText().toString().equals("")) {
                    tvExtra.setText("");
                    tvExtra.setBackgroundResource(R.color.branco);
                    posicaoInicial.setEnabled(true);
                    posicaoFinal.setEnabled(true);
                }
                else if (!deslocamento.getText().toString().equals("") &&
                        !posicaoInicial.getText().toString().equals(""))
                {
                    double x;
                    double y;

                    posicaoFinal.setEnabled(false);

                    x = Double.parseDouble(deslocamento.getText().toString());
                    y = Double.parseDouble(posicaoInicial.getText().toString());
                    tvExtra.setGravity(Gravity.CENTER);
                    tvExtra.setBackgroundResource(R.drawable.degrade2);
                    tvExtra.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra.setText((x + y) + " m");
                }
                else if (!deslocamento.getText().toString().equals("") &&
                        !posicaoFinal.getText().toString().equals(""))
                {
                    double x;
                    double y;

                    posicaoInicial.setEnabled(false);

                    x = Double.parseDouble(deslocamento.getText().toString());
                    y = Double.parseDouble(posicaoFinal.getText().toString());
                    tvExtra.setGravity(Gravity.CENTER);
                    tvExtra.setBackgroundResource(R.drawable.degrade2);
                    tvExtra.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra.setText((x + y) + " m");
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
