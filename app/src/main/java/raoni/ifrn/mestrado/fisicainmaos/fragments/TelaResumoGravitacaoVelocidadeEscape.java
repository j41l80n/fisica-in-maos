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

public class TelaResumoGravitacaoVelocidadeEscape extends Fragment
{
    private View rootView;

    private EditText velocidadeE;
    private EditText etConstanteG;
    private EditText massaPlaneta;
    private EditText raioPlaneta;

    private static final double constanteG = 6.7 * Math.pow(10, -11);

    private TextView tvExtra1;


    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        configuraTextView();
        configuraEditText();

        velocidadeEPressed();
        //constanteGPressed();
        massaPlanetaPressed();
        raioPlanetaPressed();

        etConstanteG.setEnabled(false);
        etConstanteG.setText("6,7 E-11");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        rootView = inflater.inflate(R.layout.tela_resumo_gravitacao_velocidade_escape, container, false);
        return rootView;
    }

    private void configuraTextView()
    {
        TextView tvTelaResumoVelocidadeEscape01 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_gravitacao_velocidade_escape_01);
        TextView tvTelaResumoVelocidadeEscape02 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_gravitacao_velocidade_escape_02);
        TextView tvTelaResumoVelocidadeEscape03 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_gravitacao_velocidade_escape_03);
        TextView tvTelaResumoVelocidadeEscape04 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_gravitacao_velocidade_escape_04);
        TextView tvTelaResumoVelocidadeEscape05 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_gravitacao_velocidade_escape_05);
        TextView tvTelaResumoVelocidadeEscape06 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_gravitacao_velocidade_escape_06);
        TextView tvTelaResumoVelocidadeEscape07 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_gravitacao_velocidade_escape_07);
        TextView tvTelaResumoVelocidadeEscape08 = (TextView) rootView.findViewById(R.id.tv_gravitacao_extra_input2_0001);



        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumoVelocidadeEscape01.setTypeface(font);
        tvTelaResumoVelocidadeEscape02.setTypeface(font);
        tvTelaResumoVelocidadeEscape03.setTypeface(font);
        tvTelaResumoVelocidadeEscape04.setTypeface(font);
        tvTelaResumoVelocidadeEscape05.setTypeface(font);
        tvTelaResumoVelocidadeEscape06.setTypeface(font);
        tvTelaResumoVelocidadeEscape07.setTypeface(font);

        tvTelaResumoVelocidadeEscape01.setText(Html.fromHtml("Nm<sup>2</sup>/Kg<sup>2</sup>"));

        tvExtra1 = (TextView) rootView.findViewById(R.id.tv_tela_gravitacao_velocidade_escape_extra_001);

        tvTelaResumoVelocidadeEscape01.setText(Html.fromHtml("<p>Para se colocar em órbita um objeto, é necessário que ele seja lançado com uma velocidade mínima, que denominamos <b>velocidade de escape</b>. </p>"));
        tvTelaResumoVelocidadeEscape02.setText(Html.fromHtml("Velocidade de escape (V<sub>e</sub>) = "));
        tvTelaResumoVelocidadeEscape03.setText(Html.fromHtml("Constante gravitacional (G) = "));
        tvTelaResumoVelocidadeEscape04.setText(Html.fromHtml("Massa do planeta (M) = "));
        tvTelaResumoVelocidadeEscape05.setText(Html.fromHtml("Raio do planeta (R) = "));
        tvTelaResumoVelocidadeEscape06.setText(Html.fromHtml("<p>A velocidade de escape não depende da massa do corpo a ser lançado.</p>" +
                "<p>Em função da gravidade a velocidade de escape é dado por:</p>"));
        tvTelaResumoVelocidadeEscape07.setText(Html.fromHtml("<p><b>Buraco negro</b>: Buracos negros são estrelas com massa superior a 20 vezes a massa do Sol que, ao acabar seu combustível, ficam sob ação de sua gravidade, passando a " +
                "ocupar um volume muito pequeno, da ordem de centenas de quilômetros.</p>" +
                "<p>Tendo esses corpos massa muito grande e raio muito pequeno, apresentam velocidades de escape que chegam a ter valor superior a velocidade da luz.</p>"));
    }

    private void configuraEditText()
    {
        velocidadeE = (EditText) rootView.findViewById(R.id.et_tela_resumo_gravitacao_lei_gravitacao_02);
        etConstanteG = (EditText) rootView.findViewById(R.id.et_tela_resumo_gravitacao_lei_gravitacao_03);
        massaPlaneta = (EditText) rootView.findViewById(R.id.et_tela_resumo_gravitacao_lei_gravitacao_04);
        raioPlaneta = (EditText) rootView.findViewById(R.id.et_tela_resumo_gravitacao_lei_gravitacao_05);
    }

    //1
    private double ve(double G, double M, double R)
    {
        //ve = (2 * G * M) / R
        return Math.sqrt((2 * G * M) / R);
    }

    private double R(double G, double M, double ve)
    {
        //R = (2 * G * M) / ve^2
        return (2 * G * M) / Math.pow(ve, 2);
    }

    private double M(double ve, double R, double G)
    {
        //M = ve^2 * R / 2 * G
        return (Math.pow(ve, 2) * R) / (2 * G);
    }

    private void velocidadeEPressed()
    {
        velocidadeE.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (velocidadeE.getText().toString().equals(""))
                {
                    tvExtra1.setText("");
                    velocidadeE.setEnabled(true);
                    tvExtra1.setBackgroundResource(R.color.branco);

                    velocidadeE.setEnabled(true);
                    //etConstanteG.setEnabled(true);
                    massaPlaneta.setEnabled(true);
                    raioPlaneta.setEnabled(true);
                }
                //calcula R
                else if (//!etConstanteG.getText().toString().equals("") &&
                        !massaPlaneta.getText().toString().equals("") &&
                        !velocidadeE.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    raioPlaneta.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(R(constanteG,
                            Double.parseDouble(massaPlaneta.getText().toString()),
                            Double.parseDouble(velocidadeE.getText().toString())
                    ) + " m"));
                }
                //calcula M
                else if (!velocidadeE.getText().toString().equals("") &&
                        !raioPlaneta.getText().toString().equals("")
                        //!etConstanteG.getText().toString().equals("")
                        )
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    massaPlaneta.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(M(
                            Double.parseDouble(velocidadeE.getText().toString()),
                            Double.parseDouble(raioPlaneta.getText().toString()),
                            constanteG
                    ) + " m"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void massaPlanetaPressed()
    {
        massaPlaneta.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (massaPlaneta.getText().toString().equals(""))
                {
                    tvExtra1.setText("");
                    tvExtra1.setBackgroundResource(R.color.branco);

                    velocidadeE.setEnabled(true);
                    //etConstanteG.setEnabled(true);
                    massaPlaneta.setEnabled(true);
                    raioPlaneta.setEnabled(true);
                }
                //calcula R
                else if (//!etConstanteG.getText().toString().equals("") &&
                        !massaPlaneta.getText().toString().equals("") &&
                        !velocidadeE.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    raioPlaneta.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(R(constanteG,
                            Double.parseDouble(massaPlaneta.getText().toString()),
                            Double.parseDouble(velocidadeE.getText().toString())
                    ) + " m"));
                }
                //calcula ve
                else if (//!etConstanteG.getText().toString().equals("") &&
                        !massaPlaneta.getText().toString().equals("") &&
                        !raioPlaneta.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    velocidadeE.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(ve(constanteG,
                            Double.parseDouble(massaPlaneta.getText().toString()),
                            Double.parseDouble(raioPlaneta.getText().toString())
                    ) + " m/s"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void raioPlanetaPressed()
    {
        raioPlaneta.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (raioPlaneta.getText().toString().equals(""))
                {
                    tvExtra1.setText("");
                    velocidadeE.setEnabled(true);
                    tvExtra1.setBackgroundResource(R.color.branco);

                    //etConstanteG.setEnabled(true);
                    massaPlaneta.setEnabled(true);
                    raioPlaneta.setEnabled(true);
                }
                //calcula M
                else if (!velocidadeE.getText().toString().equals("") &&
                        !raioPlaneta.getText().toString().equals("")
                        //!etConstanteG.getText().toString().equals("")
                        )
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    massaPlaneta.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(M(
                            Double.parseDouble(velocidadeE.getText().toString()),
                            Double.parseDouble(raioPlaneta.getText().toString()),
                            constanteG
                    ) + " m"));
                }
                //calcula ve
                else if (//!etConstanteG.getText().toString().equals("") &&
                        !massaPlaneta.getText().toString().equals("") &&
                        !raioPlaneta.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    velocidadeE.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(ve(
                            constanteG,
                            Double.parseDouble(massaPlaneta.getText().toString()),
                            Double.parseDouble(raioPlaneta.getText().toString())
                    ) + " m/s"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
