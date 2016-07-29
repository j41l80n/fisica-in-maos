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

public class TelaResumoDinamicaImpulso extends Fragment
{
    private View rootView;
    private TextView tvExtra1;

    private EditText impulso;
    private EditText forca;
    private EditText delT;

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        configuraTextView();
        configuraEditText();
        pTotalPressed();
        forcaPressed();
        delTPressed();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        rootView = inflater.inflate(R.layout.tela_resumo_dinamica_impulso, container, false);
        return rootView;
    }

    private void configuraTextView()
    {
        TextView tvTelaResumoImpulso01 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_implulso_01);
        TextView tvTelaResumoImpulso02 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_implulso_02);
        TextView tvTelaResumoImpulso03 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_implulso_03);
        TextView tvTelaResumoImpulso04 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_implulso_04);
        TextView tvTelaResumoImpulso05 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_implulso_05);
        TextView tvTelaResumoImpulso06 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_implulso_06);

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumoImpulso01.setTypeface(font);
        tvTelaResumoImpulso02.setTypeface(font);
        tvTelaResumoImpulso03.setTypeface(font);
        tvTelaResumoImpulso04.setTypeface(font);
        tvTelaResumoImpulso05.setTypeface(font);
        tvTelaResumoImpulso06.setTypeface(font);

        tvExtra1 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_dinamica_07_extra_01);

        tvTelaResumoImpulso01.setText(Html.fromHtml(
                "<p>Força aplicada em determinado intervalo de tempo, responsável por fazer esse corpo entrar em movimento.</p>"));
        tvTelaResumoImpulso02.setText(Html.fromHtml("Impulso (I) = "));
        tvTelaResumoImpulso03.setText(Html.fromHtml("Força (F) = "));
        tvTelaResumoImpulso04.setText(Html.fromHtml("Variação de tempo (Δt) = "));
        tvTelaResumoImpulso05.setText(Html.fromHtml("<h4>Grandeza Vetorial</h4>" +
                "<p>Unidade: N.s</p>" +
                "<p>Em um gráfico F x t, a área do gráfico representa o impulso.</p>"));
        tvTelaResumoImpulso06.setText(Html.fromHtml("<p>Quanto maior o intervalor de tempo em que a força é aplicada, maior o impulso.</p>" +
                "<p>Como a força é inversamente proporcional ao tempo, quanto maior o tempo de interação, por exemplo, no final de um movimento," +
                " menor será a força aplicada sobre o corpo.</p>" +
                "<p>Ex.: Uso do Air-Bag nos carros, o ato de dobrar os joelhos ao cairmos de um local alto...</p>"));
    }

    private void configuraEditText()
    {
        impulso = (EditText)  rootView.findViewById(R.id.et_tela_resumo_dinamica_implulso_01);
        forca = (EditText)  rootView.findViewById(R.id.et_tela_resumo_dinamica_implulso_02);
        delT = (EditText)  rootView.findViewById(R.id.et_tela_resumo_dinamica_implulso_03);
    }

    //1
    private double impulso(double f, double t)
    {
        //i = f * .∆t
        return f * t;
    }

    private double delT(double i, double f)
    {
        //∆t = i / f
        return i / f;
    }

    private double forca(double i, double delT)
    {
        //f = i / ∆t
        return i / delT;
    }

    private void pTotalPressed()
    {
        impulso.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (impulso.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.color.branco);
                    tvExtra1.setText("");
                    forca.setEnabled(true);
                    delT.setEnabled(true);
                }
                //calcula Variacao de tempo
                else if (!impulso.getText().toString().equals("") &&
                        !forca.getText().toString().equals(""))
                {
                    delT.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setText(Html.fromHtml(delT(
                            Double.parseDouble(impulso.getText().toString()),
                            Double.parseDouble(forca.getText().toString())
                    ) + " s"));
                }
                //calcula Forca
                else if (!impulso.getText().toString().equals("") &&
                        !delT.getText().toString().equals(""))
                {
                    forca.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setText(Html.fromHtml(forca(
                            Double.parseDouble(impulso.getText().toString()),
                            Double.parseDouble(delT.getText().toString())
                    ) + " N"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

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
                    impulso.setEnabled(true);
                    delT.setEnabled(true);
                }
                //calcula Variacao de tempo
                else if (!impulso.getText().toString().equals("") &&
                        !forca.getText().toString().equals(""))
                {
                    delT.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setText(Html.fromHtml(delT(
                            Double.parseDouble(impulso.getText().toString()),
                            Double.parseDouble(forca.getText().toString())
                    ) + " s"));
                }
                //calcula impulso
                else if (!forca.getText().toString().equals("") &&
                        !delT.getText().toString().equals(""))
                {
                    impulso.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setText(Html.fromHtml(impulso(
                            Double.parseDouble(forca.getText().toString()),
                            Double.parseDouble(delT.getText().toString())
                    ) + " N.s"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void delTPressed()
    {
        delT.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (delT.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.color.branco);
                    tvExtra1.setText("");
                    impulso.setEnabled(true);
                    forca.setEnabled(true);
                }
                //calcula Forca
                else if (!impulso.getText().toString().equals("") &&
                        !delT.getText().toString().equals(""))
                {
                    forca.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setText(Html.fromHtml(forca(
                            Double.parseDouble(impulso.getText().toString()),
                            Double.parseDouble(delT.getText().toString())
                    ) + " N"));
                }
                //calcula impulso
                else if (!forca.getText().toString().equals("") &&
                        !delT.getText().toString().equals(""))
                {
                    impulso.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setText(Html.fromHtml(impulso(
                            Double.parseDouble(forca.getText().toString()),
                            Double.parseDouble(delT.getText().toString())
                    ) + " N.s"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
