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

public class TelaResumoGravitacaoLeiGravitacaoUniversal extends Fragment
{
    private View rootView;

    private TextView tvExtra1;

    private static final double constanteG = 6.7 * Math.pow(10, -11);

    private EditText forca;
    private EditText etConstanteG;
    private EditText massaMaior;
    private EditText massaMenor;
    private EditText distancia;

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        configuraTextView();
        configuraEditText();

        forcaPressed();
        //gPressed();
        massaMaiorPressed();
        massaMenorPressed();
        distanciaPressed();

        etConstanteG.setEnabled(false);
        etConstanteG.setText("6,7 E-11");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        rootView = inflater.inflate(R.layout.tela_resumo_gravitacao_lei_gravitacao_universal, container, false);
        return rootView;
    }

    private void configuraTextView()
    {
        TextView tvTelaResumoLeiGravitacaoUniversal01 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_gravitacao_lei_gravitacao_01);
        TextView tvTelaResumoLeiGravitacaoUniversal02 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_gravitacao_lei_gravitacao_02);
        TextView tvTelaResumoLeiGravitacaoUniversal03 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_gravitacao_lei_gravitacao_03);
        TextView tvTelaResumoLeiGravitacaoUniversal04 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_gravitacao_lei_gravitacao_04);
        TextView tvTelaResumoLeiGravitacaoUniversal05 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_gravitacao_lei_gravitacao_05);
        TextView tvTelaResumoLeiGravitacaoUniversal06 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_gravitacao_lei_gravitacao_06);
        TextView tvTelaResumoLeiGravitacaoUniversal07 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_gravitacao_lei_gravitacao_07);

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumoLeiGravitacaoUniversal01.setTypeface(font);
        tvTelaResumoLeiGravitacaoUniversal02.setTypeface(font);
        tvTelaResumoLeiGravitacaoUniversal03.setTypeface(font);
        tvTelaResumoLeiGravitacaoUniversal04.setTypeface(font);
        tvTelaResumoLeiGravitacaoUniversal05.setTypeface(font);
        tvTelaResumoLeiGravitacaoUniversal06.setTypeface(font);
        tvTelaResumoLeiGravitacaoUniversal07.setTypeface(font);

        tvExtra1 = (TextView) rootView.findViewById(R.id.tv_tela_gravitacao_universal_extra_001);

        tvTelaResumoLeiGravitacaoUniversal01.setText(Html.fromHtml(
                "<p>&ldquo;Matéria atrai matéria com forças cuja intensidade são diretamente proporcionais ao produto de suas massas e " +
                "inversamente proporcional ao quadrado da distância que os separa&rdquo;.</p>"));
        tvTelaResumoLeiGravitacaoUniversal02.setText(Html.fromHtml("<p>Onde G = Constante da gravitação universal = 6,7.10<sup>-11</sup>N.m<sup>2</sup>/kg<sup>2</sup></p>" +
                "<p>M e m = massa dos corpos envolvidos</p>"));
        tvTelaResumoLeiGravitacaoUniversal03.setText(Html.fromHtml("Força (F) = "));
        tvTelaResumoLeiGravitacaoUniversal04.setText(Html.fromHtml("Constante da gravitação universal (G) = "));
        tvTelaResumoLeiGravitacaoUniversal05.setText(Html.fromHtml("Massa do corpo maior (M) ="));
        tvTelaResumoLeiGravitacaoUniversal06.setText(Html.fromHtml("Massa do corpo menor (m) ="));
        tvTelaResumoLeiGravitacaoUniversal07.setText(Html.fromHtml("Distância entre o centro dos corpos (d) = "));
    }

    private void configuraEditText()
    {
        forca = (EditText) rootView.findViewById(R.id.et_tela_resumo_gravitacao_lei_gravitacao_01);
        etConstanteG = (EditText) rootView.findViewById(R.id.et_tela_resumo_gravitacao_lei_gravitacao_02);
        massaMaior = (EditText) rootView.findViewById(R.id.et_tela_resumo_gravitacao_lei_gravitacao_03);
        massaMenor = (EditText) rootView.findViewById(R.id.et_tela_resumo_gravitacao_lei_gravitacao_04);
        distancia = (EditText) rootView.findViewById(R.id.et_tela_resumo_gravitacao_lei_gravitacao_05);
    }

    //1
    private double f(double g, double M, double m, double d)
    {
        //f = g * M * m / d^2
        return (g * M * m) / Math.pow(d, 2);
    }

    private double d(double g, double M, double m, double f)
    {
        //d = r * M * m / f
        return Math.sqrt((g * M * m) / f);
    }

    private double M(double f, double d, double g, double m)
    {
        //
        return (f * Math.pow(d, 2)) / (g * m);
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
                    tvExtra1.setText("");
                    forca.setEnabled(true);
                    tvExtra1.setBackgroundResource(R.color.branco);
                    //etConstanteG.setEnabled(true);
                    massaMaior.setEnabled(true);
                    massaMenor.setEnabled(true);
                    distancia.setEnabled(true);
                }
                //calcula d
                else if (//!etConstanteG.getText().toString().equals("") &&
                        !massaMaior.getText().toString().equals("") &&
                        !massaMenor.getText().toString().equals("")&&
                        !forca.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    distancia.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(d(
                            constanteG,
                            Double.parseDouble(massaMaior.getText().toString()),
                            Double.parseDouble(massaMenor.getText().toString()),
                            Double.parseDouble(forca.getText().toString())
                    ) + " m"));
                }
                //calcula m
                else if (!forca.getText().toString().equals("") &&
                        !distancia.getText().toString().equals("") &&
                        //!etConstanteG.getText().toString().equals("")&&
                        !massaMenor.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    massaMaior.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(M(
                            Double.parseDouble(forca.getText().toString()),
                            Double.parseDouble(distancia.getText().toString()),
                            constanteG,
                            Double.parseDouble(massaMenor.getText().toString())
                    ) + " m"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void massaMaiorPressed()
    {
        massaMaior.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (massaMaior.getText().toString().equals(""))
                {
                    tvExtra1.setText("");
                    forca.setEnabled(true);
                    tvExtra1.setBackgroundResource(R.color.branco);
                    //etConstanteG.setEnabled(true);
                    massaMaior.setEnabled(true);
                    massaMenor.setEnabled(true);
                    distancia.setEnabled(true);
                }
                //calcula d
                else if (//!etConstanteG.getText().toString().equals("") &&
                        !massaMaior.getText().toString().equals("") &&
                        !massaMenor.getText().toString().equals("")&&
                        !forca.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    distancia.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(d(
                            constanteG,
                            Double.parseDouble(massaMaior.getText().toString()),
                            Double.parseDouble(massaMenor.getText().toString()),
                            Double.parseDouble(forca.getText().toString())
                    ) + " m"));
                }
                //calcula f
                else if (//!etConstanteG.getText().toString().equals("") &&
                        !massaMaior.getText().toString().equals("") &&
                        !massaMenor.getText().toString().equals("")&&
                        !distancia.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    forca.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(f(
                            constanteG,
                            Double.parseDouble(massaMaior.getText().toString()),
                            Double.parseDouble(massaMenor.getText().toString()),
                            Double.parseDouble(distancia.getText().toString())
                    ) + " m"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void massaMenorPressed()
    {
        massaMenor.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (massaMenor.getText().toString().equals(""))
                {
                    tvExtra1.setText("");
                    forca.setEnabled(true);
                    tvExtra1.setBackgroundResource(R.color.branco);
                    massaMaior.setEnabled(true);
                    massaMenor.setEnabled(true);
                    distancia.setEnabled(true);
                }
                //calcula d
                else if (//!etConstanteG.getText().toString().equals("") &&
                        !massaMaior.getText().toString().equals("") &&
                        !massaMenor.getText().toString().equals("")&&
                        !forca.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    distancia.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(d(
                            constanteG,
                            Double.parseDouble(massaMaior.getText().toString()),
                            Double.parseDouble(massaMenor.getText().toString()),
                            Double.parseDouble(forca.getText().toString())
                    ) + " m"));
                }
                //calcula m
                else if (!forca.getText().toString().equals("") &&
                        !distancia.getText().toString().equals("") &&
                        //!etConstanteG.getText().toString().equals("")&&
                        !massaMenor.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    massaMaior.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(M(
                            Double.parseDouble(forca.getText().toString()),
                            Double.parseDouble(distancia.getText().toString()),
                            constanteG,
                            Double.parseDouble(massaMenor.getText().toString())
                    ) + " m"));
                }
                //calcula f
                else if (//!etConstanteG.getText().toString().equals("") &&
                        !massaMaior.getText().toString().equals("") &&
                        !massaMenor.getText().toString().equals("")&&
                        !distancia.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    forca.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(f(
                            constanteG,
                            Double.parseDouble(massaMaior.getText().toString()),
                            Double.parseDouble(massaMenor.getText().toString()),
                            Double.parseDouble(distancia.getText().toString())
                    ) + " m"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void distanciaPressed()
    {
        distancia.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (distancia.getText().toString().equals(""))
                {
                    tvExtra1.setText("");
                    forca.setEnabled(true);
                    tvExtra1.setBackgroundResource(R.color.branco);
                    massaMaior.setEnabled(true);
                    massaMenor.setEnabled(true);
                    distancia.setEnabled(true);
                }
                //calcula m
                else if (!forca.getText().toString().equals("") &&
                        !distancia.getText().toString().equals("") &&
                        //!etConstanteG.getText().toString().equals("")&&
                        !massaMenor.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    massaMaior.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(M(
                            Double.parseDouble(forca.getText().toString()),
                            Double.parseDouble(distancia.getText().toString()),
                            constanteG,
                            Double.parseDouble(massaMenor.getText().toString())
                    ) + " m"));
                }
                //calcula f
                else if (//!etConstanteG.getText().toString().equals("") &&
                        !massaMaior.getText().toString().equals("") &&
                        !massaMenor.getText().toString().equals("")&&
                        !distancia.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    forca.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(f(
                            constanteG,
                            Double.parseDouble(massaMaior.getText().toString()),
                            Double.parseDouble(massaMenor.getText().toString()),
                            Double.parseDouble(distancia.getText().toString())
                    ) + " m"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
