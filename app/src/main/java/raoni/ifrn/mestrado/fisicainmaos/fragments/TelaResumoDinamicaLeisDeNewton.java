package raoni.ifrn.mestrado.fisicainmaos.fragments;

import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
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

public class TelaResumoDinamicaLeisDeNewton extends Fragment
{
    private Handler mHandler = new Handler();

    private View rootView;
    private TextView tvExtra1;
    private TextView tvExtra2;

    private EditText forca;
    private EditText massa;
    private EditText aceleracao;

    private EditText peso;
    private EditText massa2;
    private EditText gravidade;

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        configuraTextView();
        configuraEditText();
        forcaPressed();
        aceleracaoPressed();
        massaPressed();
        pesoPressed();
        massa2Pressed();
        gravidadePressed();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        rootView = inflater.inflate(R.layout.tela_resumo_dinamica_leis_newton, container, false);

        return rootView;
    }

    private void configuraTextView()
    {
        TextView tvTelaResumoDinamica01 = (TextView) getActivity().findViewById(R.id.tv_tela_resumo_dinamica_01);
        TextView tvTelaResumoDinamica02 = (TextView) getActivity().findViewById(R.id.tv_tela_resumo_dinamica_02);
        TextView tvTelaResumoDinamica03 = (TextView) getActivity().findViewById(R.id.tv_tela_resumo_dinamica_03);
        TextView tvTelaResumoDinamica04 = (TextView) getActivity().findViewById(R.id.tv_tela_resumo_dinamica_04);
        TextView tvTelaResumoDinamica05 = (TextView) getActivity().findViewById(R.id.tv_tela_resumo_dinamica_05);
        TextView tvTelaResumoDinamica06 = (TextView) getActivity().findViewById(R.id.tv_tela_resumo_dinamica_06);
        TextView tvTelaResumoDinamica07 = (TextView) getActivity().findViewById(R.id.tv_tela_resumo_dinamica_07);
        TextView tvTelaResumoDinamica08 = (TextView) getActivity().findViewById(R.id.tv_tela_resumo_dinamica_08);
        TextView tvTelaResumoDinamica09 = (TextView) getActivity().findViewById(R.id.tv_tela_resumo_dinamica_09);
        TextView tvTelaResumoDinamica10 = (TextView) getActivity().findViewById(R.id.tv_tela_resumo_dinamica_10);
        TextView tvTelaResumoDinamica11 = (TextView) getActivity().findViewById(R.id.tv_tela_resumo_dinamica_11);
        TextView tvTelaResumoDinamica12 = (TextView) getActivity().findViewById(R.id.tv_tela_resumo_dinamica_12);
        TextView tvTelaResumoDinamica13 = (TextView) getActivity().findViewById(R.id.tv_tela_resumo_dinamica_13);

        TextView unidades01 = (TextView) getActivity().findViewById(R.id.tv_unidades_dn_01);
        TextView unidades02 = (TextView) getActivity().findViewById(R.id.tv_unidades_dn_02);

        unidades01.setText(Html.fromHtml("m/s<sup>2</sup>"));
        unidades02.setText(Html.fromHtml("m/s<sup>2</sup>"));

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumoDinamica01.setTypeface(font);
        tvTelaResumoDinamica02.setTypeface(font);
        tvTelaResumoDinamica03.setTypeface(font);
        tvTelaResumoDinamica04.setTypeface(font);
        tvTelaResumoDinamica05.setTypeface(font);
        tvTelaResumoDinamica06.setTypeface(font);
        tvTelaResumoDinamica07.setTypeface(font);
        tvTelaResumoDinamica08.setTypeface(font);
        tvTelaResumoDinamica09.setTypeface(font);
        tvTelaResumoDinamica10.setTypeface(font);
        tvTelaResumoDinamica11.setTypeface(font);
        tvTelaResumoDinamica12.setTypeface(font);
        tvTelaResumoDinamica13.setTypeface(font);

        tvExtra1 = (TextView) getActivity().findViewById(R.id.tv_tela_resumo_dinamica_02_extra_01);
        tvExtra2 = (TextView) getActivity().findViewById(R.id.tv_tela_resumo_dinamica_02_extra_02);

        tvTelaResumoDinamica01.setText(Html.fromHtml("<p><b>1ª Lei – Princípio da Inércia:</b></p><p>“Todo " +
                                         "corpo em repouso ou movimento retilíneo uniforme tende a permanecer em seu " +
                                          "estado, desde que a resultante das forças que agem sobre ele seja nula.”</p>" +
                                            "<p>Quanto maior a massa de um corpo, maior sua inércia.</p>"));
        tvTelaResumoDinamica02.setText(Html.fromHtml("<p>Força resultante: Uma força que substitui todas as outras atuantes, produzindo o mesmo efeito dinâmico. " +
                                        "É a soma vetorial de todas as forças que agem sobre um corpo. F<sub>r</sub> = F<sub>1</sub> + F<sub>2</sub> + F<sub>3</sub> + F<sub>n</sub></p>" +
                                        "<p>Ex.: * Na decolagem um passageiro é projetado para trás e no pouso é projetado para frente.</p><ul><li>Uso do cinto de segurança</li>" +
                                    "Veículo fazendo uma curva. O passageiro em seu interior tende a permanecer em linha reta.<li></li></ul>"));
        tvTelaResumoDinamica03.setText(Html.fromHtml("<p><b>2ª Lei – Princípio fundamental da dinâmica:</b></p>" +
                "<p>“A força resultante que age sobre uma partícula origina nela uma aceleração, proporcional ao módulo da força aplicada e de mesma direção e sentido da força.”</p>"));
        //tvTelaResumoDinamica04.setText(Html.fromHtml("<p><b>F<sub>r</sub> = m.a</b></p>"));
        tvTelaResumoDinamica04.setVisibility(View.GONE);
        tvTelaResumoDinamica05.setText(Html.fromHtml("Força (F) = "));
        tvTelaResumoDinamica06.setText(Html.fromHtml("Massa (m) = "));
        tvTelaResumoDinamica07.setText(Html.fromHtml("Aceleração (a) = "));
        tvTelaResumoDinamica08.setText(Html.fromHtml("<p><b>Unidade: N (Newton)</b></p>" +
                "<p>A força resultante em um movimento circular aponta para o centro.</p>" +
                "<p>A força peso pode ser expressa como sendo: </p>"));
        tvTelaResumoDinamica09.setText(Html.fromHtml("Peso (p) = "));
        tvTelaResumoDinamica10.setText(Html.fromHtml("Massa (m) = "));
        tvTelaResumoDinamica11.setText(Html.fromHtml("Gravidade (g) = "));
        tvTelaResumoDinamica12.setText(Html.fromHtml("<p>Lembre-se que peso &ne; massa. " +
                "O peso de um corpo depende de gravidade local.</p>" +
                "<p>A gravidade na Terra é aproximadamente 9,8 m/s<sup>2</sup> na linha do " +
                "equador, mas esse valor varia conforme a altitude e local.</p>" +
                "<p><b>3ª Lei – Ação e reação</b></p>" +
                "<p>&ldquo;Para toda ação existe uma reação de mesmo modulo, mesma direção e" +
                " sentido contrário.&rdquo;</p>"));
        tvTelaResumoDinamica13.setText(Html.fromHtml("<p>Exemplos:</p>" +
                "<p>A Terra atrai a Lua com a mesma força, em módulo, que a Lua atrai a Terra.</p>" +
                "<p>Um barco a motor empurra a água e recebe uma reação em sentido contrário.</p>"));
    }

    private void configuraEditText()
    {
        //1
        forca = (EditText) getActivity().findViewById(R.id.et_tela_resumo_dinamica_01_01);
        massa = (EditText) getActivity().findViewById(R.id.et_tela_resumo_dinamica_01_02);
        aceleracao = (EditText) getActivity().findViewById(R.id.et_tela_resumo_dinamica_01_03);
        //2
        peso = (EditText) getActivity().findViewById(R.id.et_tela_resumo_dinamica_01_04);
        massa2 = (EditText) getActivity().findViewById(R.id.et_tela_resumo_dinamica_01_05);
        gravidade = (EditText) getActivity().findViewById(R.id.et_tela_resumo_dinamica_01_06);
    }

    //1
    private double fr(double m, double a)
    {
        //fr = m * a
        return  m * a;
    }

    private double aceleracao(double fr, double m)
    {
        //a = fr / m
        return  fr / m;
    }

    private double massa(double fr, double a)
    {
        //m = fr / a
        return  fr / a;
    }

    private void forcaPressed()
    {
        forca.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (forca.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.color.branco);
                    tvExtra1.setText("");
                    massa.setEnabled(true);
                    aceleracao.setEnabled(true);
                }
                //calcula Massa (m)
                else if (!forca.getText().toString().equals("") &&
                        !aceleracao.getText().toString().equals(""))
                {
                    massa.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setText(Html.fromHtml(massa(
                            Double.parseDouble(forca.getText().toString()),
                            Double.parseDouble(aceleracao.getText().toString())
                    ) + " Kg"));
                }
                //calcula Aceleracao (a)
                else if (!forca.getText().toString().equals("") &&
                        !massa.getText().toString().equals(""))
                {
                    aceleracao.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setText(Html.fromHtml(aceleracao(
                            Double.parseDouble(forca.getText().toString()),
                            Double.parseDouble(massa.getText().toString())
                    ) + " m/s<sup>2</sup>"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void aceleracaoPressed()
    {
        aceleracao.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (aceleracao.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.color.branco);
                    tvExtra1.setText("");
                    massa.setEnabled(true);
                    forca.setEnabled(true);
                }
                //calcula Massa (m)
                else if (!forca.getText().toString().equals("") &&
                        !aceleracao.getText().toString().equals(""))
                {
                    massa.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setText(Html.fromHtml(massa(
                            Double.parseDouble(forca.getText().toString()),
                            Double.parseDouble(aceleracao.getText().toString())
                    ) + " Kg"));
                }
                //calcula Forca Resultante (fr)
                else if (!aceleracao.getText().toString().equals("") &&
                        !massa.getText().toString().equals(""))
                {
                    forca.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setText(Html.fromHtml(fr(
                            Double.parseDouble(massa.getText().toString()),
                            Double.parseDouble(aceleracao.getText().toString())
                    ) + " N"));
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
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (massa.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.color.branco);
                    tvExtra1.setText("");
                    aceleracao.setEnabled(true);
                    forca.setEnabled(true);
                }
                //calcula Aceleracao (a)
                else if (!forca.getText().toString().equals("") &&
                        !massa.getText().toString().equals(""))
                {
                    aceleracao.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setText(Html.fromHtml(aceleracao(
                            Double.parseDouble(forca.getText().toString()),
                            Double.parseDouble(massa.getText().toString())
                    ) + " m/s<sup>2</sup>"));
                }
                //calcula Forca Resultante (fr)
                else if (!aceleracao.getText().toString().equals("") &&
                        !massa.getText().toString().equals(""))
                {
                    forca.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setText(Html.fromHtml(fr(
                            Double.parseDouble(massa.getText().toString()),
                            Double.parseDouble(aceleracao.getText().toString())
                    ) + " N"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    //2
    private double peso(double m, double g)
    {
        //p = m * g
        return  m * g;
    }

    private double gravidade(double p, double m)
    {
        //g = P / m
        return  p / m;
    }

    private double massa02(double p, double g)
    {
        //m = p / g
        return  p / g;
    }

    private void pesoPressed()
    {
        peso.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (peso.getText().toString().equals(""))
                {
                    tvExtra2.setBackgroundResource(R.color.branco);
                    tvExtra2.setText("");
                    gravidade.setEnabled(true);
                    massa2.setEnabled(true);
                }
                //calcula Gravidade (g)
                else if (!peso.getText().toString().equals("") &&
                        !massa2.getText().toString().equals(""))
                {
                    gravidade.setEnabled(false);
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setText(Html.fromHtml(gravidade(
                            Double.parseDouble(peso.getText().toString()),
                            Double.parseDouble(massa2.getText().toString())
                    ) + " m/s<sup>2</sup>"));
                }
                //calcula Massa (m)
                else if (!peso.getText().toString().equals("") &&
                        !gravidade.getText().toString().equals(""))
                {
                    massa2.setEnabled(false);
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setText(Html.fromHtml(massa02(
                            Double.parseDouble(peso.getText().toString()),
                            Double.parseDouble(gravidade.getText().toString())
                    ) + " Kg"));
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
                    gravidade.setEnabled(true);
                    peso.setEnabled(true);
                }
                //calcula Gravidade (g)
                else if (!peso.getText().toString().equals("") &&
                        !massa2.getText().toString().equals(""))
                {
                    gravidade.setEnabled(false);
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setText(Html.fromHtml(gravidade(
                            Double.parseDouble(peso.getText().toString()),
                            Double.parseDouble(massa2.getText().toString())
                    ) + " m/s<sup>2</sup>"));
                }
                //calcula Peso (p)
                else if (!massa2.getText().toString().equals("") &&
                        !gravidade.getText().toString().equals(""))
                {
                    peso.setEnabled(false);
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setText(Html.fromHtml(peso(
                            Double.parseDouble(massa.getText().toString()),
                            Double.parseDouble(gravidade.getText().toString())
                    ) + " N"));
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
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (gravidade.getText().toString().equals(""))
                {
                    tvExtra2.setText("");
                    massa2.setEnabled(true);
                    peso.setEnabled(true);
                    tvExtra2.setBackgroundResource(R.color.branco);
                }
                //calcula Massa (m)
                else if (!peso.getText().toString().equals("") &&
                        !gravidade.getText().toString().equals(""))
                {
                    massa.setEnabled(false);
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setText(Html.fromHtml(massa02(
                            Double.parseDouble(peso.getText().toString()),
                            Double.parseDouble(gravidade.getText().toString())
                    ) + " Kg"));
                }
                //calcula Peso (p)
                else if (!massa2.getText().toString().equals("") &&
                        !gravidade.getText().toString().equals("")) {
                    peso.setEnabled(false);
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setText(Html.fromHtml(peso(
                            Double.parseDouble(massa2.getText().toString()),
                            Double.parseDouble(gravidade.getText().toString())
                    ) + " N"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

}
