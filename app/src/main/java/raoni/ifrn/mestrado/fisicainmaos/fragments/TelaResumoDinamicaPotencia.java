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

public class TelaResumoDinamicaPotencia extends Fragment
{
    private View rootView;
    private TextView tvExtra1;
    private TextView tvExtra2;

    private EditText potencia;
    private EditText trabalho;
    private EditText tempo;

    private EditText rendimento;
    private EditText pUtil;
    private EditText pTotal;

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        configuraTextView();
        configuraEditText();
        potenciaPressed();
        tempoPressed();
        trabalhoPressed();
        rendimentoPressed();
        pUtilPressed();
        pTotalPressed();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        rootView = inflater.inflate(R.layout.tela_resumo_dinamica_potencia, container, false);
        return rootView;
    }

    private void configuraTextView()
    {
        TextView tvTelaResumoPotencia01 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_potencia_01);
        TextView tvTelaResumoPotencia02 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_potencia_02);
        TextView tvTelaResumoPotencia03 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_potencia_03);
        TextView tvTelaResumoPotencia04 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_potencia_04);
        TextView tvTelaResumoPotencia05 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_potencia_05);
        TextView tvTelaResumoPotencia06 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_potencia_06);
        TextView tvTelaResumoPotencia07 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_potencia_07);
        TextView tvTelaResumoPotencia08 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_potencia_08);
        TextView tvTelaResumoPotencia09 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_potencia_09);
        TextView tvTelaResumoPotencia10 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_potencia_10);
        TextView tvTelaResumoPotencia11 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_potencia_11);

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumoPotencia01.setTypeface(font);
        tvTelaResumoPotencia02.setTypeface(font);
        tvTelaResumoPotencia03.setTypeface(font);
        tvTelaResumoPotencia04.setTypeface(font);
        tvTelaResumoPotencia05.setTypeface(font);
        tvTelaResumoPotencia06.setTypeface(font);
        tvTelaResumoPotencia07.setTypeface(font);
        tvTelaResumoPotencia08.setTypeface(font);
        tvTelaResumoPotencia09.setTypeface(font);
        tvTelaResumoPotencia10.setTypeface(font);
        tvTelaResumoPotencia11.setTypeface(font);

        tvExtra1 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_06_extra_01);
        tvExtra2 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_06_extra_02);

        tvTelaResumoPotencia01.setText(Html.fromHtml(
                "<p>É a rapidez com que um trabalho é realizado, ou com que uma determinada energia é convertida.</p>"));
        tvTelaResumoPotencia02.setText(Html.fromHtml("Unidade: Watt(W) = Joule/segundo (J/s)"));
        tvTelaResumoPotencia03.setText(Html.fromHtml("Potência (Pot) = "));
        tvTelaResumoPotencia04.setText(Html.fromHtml("Trabalho (W) = "));
        tvTelaResumoPotencia05.setText(Html.fromHtml("Tempo (Δt) = "));
        tvTelaResumoPotencia06.setText(Html.fromHtml("Em um gráfico P<sub>ot</sub> x t, a área do gráfico representa o trabalho."));
        tvTelaResumoPotencia07.setText(Html.fromHtml("<p>Potencia em função da velocidade: </p>" +
                "<p>Pot = W/∆t, sendo W = F.d, temos que Pot = F.d/∆t => Pot = F.V</p>" +
                "<h4>Rendimento</h4>" +
                "<p> a relação entre a energia utilizada pelo sistema (energia útil) e a energia total fornecida ao mesmo.</p>"));
        tvTelaResumoPotencia08.setText(Html.fromHtml("P<sub>total</sub> = P<sub>útil</sub> + P<sub>dissipada</sub>"));
        tvTelaResumoPotencia09.setText(Html.fromHtml("Rendimento (ƞ) = "));
        tvTelaResumoPotencia10.setText(Html.fromHtml("Potência útil (Pútil) = "));
        tvTelaResumoPotencia11.setText(Html.fromHtml("Potência total (P<sub>total</sub>) = "));
    }

    private void configuraEditText()
    {
        potencia = (EditText) rootView.findViewById(R.id.et_tela_resumo_dinamica_potencia_01);
        trabalho = (EditText) rootView.findViewById(R.id.et_tela_resumo_dinamica_potencia_02);
        tempo = (EditText) rootView.findViewById(R.id.et_tela_resumo_dinamica_potencia_03);

        rendimento = (EditText) rootView.findViewById(R.id.et_tela_resumo_dinamica_potencia_04);
        pUtil = (EditText) rootView.findViewById(R.id.et_tela_resumo_dinamica_potencia_05);
        pTotal = (EditText) rootView.findViewById(R.id.et_tela_resumo_dinamica_potencia_06);
    }

    //1
    private double pot(double w, double delT)
    {
        //Pot = w / ∆t
        return w / delT;
    }

    private double w(double pot, double delT)
    {
        //w = pot * ∆t
        return pot * delT;
    }

    private double delT(double w, double pot)
    {
        //∆t = w / pot
        return w / pot;
    }

    private void potenciaPressed()
    {
        potencia.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (potencia.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.color.branco);
                    tvExtra1.setText("");
                    trabalho.setEnabled(true);
                    tempo.setEnabled(true);
                }
                //calcula Trabalho (w)
                else if (!potencia.getText().toString().equals("") &&
                        !tempo.getText().toString().equals(""))
                {
                    trabalho.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.color.branco);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setText(Html.fromHtml(w(
                            Double.parseDouble(potencia.getText().toString()),
                            Double.parseDouble(tempo.getText().toString())
                    ) + " J"));
                }
                //calcula Variacao Tempo (Δt)
                else if (!potencia.getText().toString().equals("") &&
                        !trabalho.getText().toString().equals(""))
                {
                    tempo.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setText(Html.fromHtml(delT(
                            Double.parseDouble(trabalho.getText().toString()),
                            Double.parseDouble(potencia.getText().toString())
                    ) + " s"));
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
                    tvExtra1.setBackgroundResource(R.color.branco);
                    tvExtra1.setText("");
                    potencia.setEnabled(true);
                    trabalho.setEnabled(true);
                }
                //calcula trabalho (J)
                else if (!trabalho.getText().toString().equals("") &&
                        !tempo.getText().toString().equals(""))
                {
                    potencia.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setText(Html.fromHtml(pot(
                            Double.parseDouble(trabalho.getText().toString()),
                            Double.parseDouble(tempo.getText().toString())
                    ) + " W"));
                }
                //calcula Potencia (w)
                else if (!potencia.getText().toString().equals("") &&
                        !tempo.getText().toString().equals(""))
                {
                    trabalho.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setText(w(
                            Double.parseDouble(potencia.getText().toString()),
                            Double.parseDouble(tempo.getText().toString())
                    ) + " J");
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
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
                    potencia.setEnabled(true);
                    tempo.setEnabled(true);
                }
                //calcula potencia
                else if (!trabalho.getText().toString().equals("") &&
                        !tempo.getText().toString().equals(""))
                {
                    potencia.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setText(Html.fromHtml(pot(
                            Double.parseDouble(trabalho.getText().toString()),
                            Double.parseDouble(tempo.getText().toString())
                    ) + " W"));
                }
                //calcula Variacao Tempo (Δt)
                else if (!potencia.getText().toString().equals("") &&
                        !trabalho.getText().toString().equals(""))
                {
                    tempo.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setText(Html.fromHtml(delT(
                            Double.parseDouble(trabalho.getText().toString()),
                            Double.parseDouble(potencia.getText().toString())
                    ) + " s"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    //2
    private double n(double pUtil, double pTtotal)
    {
        //η = pUtil / pTtotal
        return pUtil / pTtotal;
    }

    private double pTtotal(double pUtil, double n)
    {
        //pTtotal = pUtil / η
        return pUtil / n;
    }

    private double pUtil(double n, double pTtotal)
    {
        //pUtil = n * pTtotal
        return n * pTtotal;
    }

    private void rendimentoPressed()
    {
        rendimento.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (rendimento.getText().toString().equals(""))
                {
                    tvExtra2.setBackgroundResource(R.color.branco);
                    tvExtra2.setText("");
                    pUtil.setEnabled(true);
                    pTotal.setEnabled(true);
                }
                //calcula Potencia total
                else if (!rendimento.getText().toString().equals("") &&
                        !pUtil.getText().toString().equals(""))
                {
                    pTotal.setEnabled(false);
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setText(Html.fromHtml(pTtotal(
                            Double.parseDouble(pUtil.getText().toString()),
                            Double.parseDouble(rendimento.getText().toString())
                    ) + " W"));
                }
                //calcula Potencia Util
                else if (!rendimento.getText().toString().equals("") &&
                        !pTotal.getText().toString().equals(""))
                {
                    pUtil.setEnabled(false);
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setText(Html.fromHtml(pUtil(
                            Double.parseDouble(rendimento.getText().toString()),
                            Double.parseDouble(pTotal.getText().toString())
                    ) + " W"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void pUtilPressed()
    {
        pUtil.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (pUtil.getText().toString().equals(""))
                {
                    tvExtra2.setBackgroundResource(R.color.branco);
                    tvExtra2.setText("");
                    rendimento.setEnabled(true);
                    pTotal.setEnabled(true);
                }
                //calcula Potencia total
                else if (!rendimento.getText().toString().equals("") &&
                        !pUtil.getText().toString().equals(""))
                {
                    pTotal.setEnabled(false);
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setText(Html.fromHtml(pTtotal(
                            Double.parseDouble(pUtil.getText().toString()),
                            Double.parseDouble(rendimento.getText().toString())
                    ) + " W"));
                }
                //calcula Rendimento
                else if (!pUtil.getText().toString().equals("") &&
                        !pTotal.getText().toString().equals(""))
                {
                    rendimento.setEnabled(false);
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setText(Html.fromHtml(n(
                            Double.parseDouble(pUtil.getText().toString()),
                            Double.parseDouble(pTotal.getText().toString())
                    ) + ""));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void pTotalPressed()
    {
        pTotal.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (pTotal.getText().toString().equals(""))
                {
                    tvExtra2.setBackgroundResource(R.color.branco);
                    tvExtra2.setText("");
                    rendimento.setEnabled(true);
                    pUtil.setEnabled(true);
                }
                //calcula Potencia util
                else if (!pTotal.getText().toString().equals("") &&
                        !rendimento.getText().toString().equals(""))
                {
                    pUtil.setEnabled(false);
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setText(Html.fromHtml(pUtil(
                            Double.parseDouble(rendimento.getText().toString()),
                            Double.parseDouble(pTotal.getText().toString())
                    ) + " W"));
                }
                //calcula Rendimento
                else if (!pUtil.getText().toString().equals("") &&
                        !pTotal.getText().toString().equals(""))
                {
                    rendimento.setEnabled(false);
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setText(Html.fromHtml(n(
                            Double.parseDouble(pUtil.getText().toString()),
                            Double.parseDouble(pTotal.getText().toString())
                    ) + ""));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
