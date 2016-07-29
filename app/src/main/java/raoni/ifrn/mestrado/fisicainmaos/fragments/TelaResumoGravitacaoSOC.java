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

public class TelaResumoGravitacaoSOC extends Fragment
{
    private View rootView;

    private static final double constanteG = 6.7 * Math.pow(10, -11);

    private EditText velocidade;
    private EditText etConstanteG;
    private EditText massaP;
    private EditText raioPlaneta;

    private  TextView tvExtra1;

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        configuraTextView();
        configuraEditText();
        //1
        velocidadePressed();
        //constanteGPressed();
        massaPPressed();
        raioPlanetaPressed();

        etConstanteG.setEnabled(false);
        etConstanteG.setText("6,7 E-11");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        rootView = inflater.inflate(R.layout.tela_resumo_gravitacao_soc, container, false);
        return rootView;
    }

    private void configuraTextView()
    {
        TextView tvTelaResumoSOC01 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_gravitacao_soc_01);
        TextView tvTelaResumoSOC02 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_gravitacao_soc_02);
        TextView tvTelaResumoSOC03 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_gravitacao_soc_03);
        TextView tvTelaResumoSOC04 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_gravitacao_soc_04);
        TextView tvTelaResumoSOC05 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_gravitacao_soc_05);
        TextView tvTelaResumoSOC06 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_gravitacao_soc_06);
        TextView tvTelaResumoSOC07 = (TextView) rootView.findViewById(R.id.tv_gravitacao_extra_input3_0001);


        tvTelaResumoSOC07.setText(Html.fromHtml("Nm<sup>2</sup>/Kg<sup>2</sup>"));

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumoSOC01.setTypeface(font);
        tvTelaResumoSOC02.setTypeface(font);
        tvTelaResumoSOC03.setTypeface(font);
        tvTelaResumoSOC04.setTypeface(font);
        tvTelaResumoSOC05.setTypeface(font);
        tvTelaResumoSOC06.setTypeface(font);

        tvExtra1 = (TextView) rootView.findViewById(R.id.tv_tela_gravitacao_soc_extra_001);

        tvTelaResumoSOC01.setText(Html.fromHtml(
                "<p>Um satélite em órbita circular fica submetido a uma força centrípeta representada pela força gravitacional.</p>"));
        tvTelaResumoSOC02.setText(Html.fromHtml("Velocidade (V) = "));
        tvTelaResumoSOC03.setText(Html.fromHtml("Constante gravitacional (G) = "));
        tvTelaResumoSOC04.setText(Html.fromHtml("Massa do planeta (M) = "));
        tvTelaResumoSOC05.setText(Html.fromHtml("Raio do planeta (R) = "));
        tvTelaResumoSOC06.setText(Html.fromHtml("<p>Quanto mais afastado estiver o satélite do planeta, ou o planeta do Sol, " +
                "menor será sua velocidade orbital.</p>" +
                "<p>A velocidade orbital de um planeta, ou satélite, não depende da massa do mesmo. </p>" +
                "<p><b>Satélite Geoestacionário:</b></p>" +
                "<p>São, em geral, satélites de telecomunicação, que se encontram parados em relação a um ponto fixo da Terra.</p>" +
                "<p>- Possui período igual ao da Terra (24h).</p>" +
                "<p>- O raio médio de sua órbita é de aproximadamente 36000km.</p>"));
    }

    private void configuraEditText()
    {
        velocidade = (EditText) rootView.findViewById(R.id.et_tela_resumo_gravitacao_soc_01);
        etConstanteG = (EditText) rootView.findViewById(R.id.et_tela_resumo_gravitacao_soc_02);
        massaP = (EditText) rootView.findViewById(R.id.et_tela_resumo_gravitacao_soc_03);
        raioPlaneta = (EditText) rootView.findViewById(R.id.et_tela_resumo_gravitacao_soc_04);
    }

    //1
    private double v(double G, double M, double r)
    {
        //v = √((G * M) / R)
        return Math.sqrt(((G * M) / r));
    }

    private double R(double G, double M, double v)
    {
        //R = G * M / v^2
        return (G * M) / Math.pow(v, 2);
    }

    private double M(double v, double R, double G)
    {
        //M = (v^2 * R) / G
        return (Math.pow(v, 2) * R) / G;
    }

    private void velocidadePressed()
    {
        velocidade.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (velocidade.getText().toString().equals(""))
                {
                    tvExtra1.setText("");
                    tvExtra1.setBackgroundResource(R.color.branco);
                    velocidade.setEnabled(true);
                    //etConstanteG.setEnabled(true);
                    massaP.setEnabled(true);
                    raioPlaneta.setEnabled(true);
                }
                //calcula R
                else if (!etConstanteG.getText().toString().equals("") &&
                        !massaP.getText().toString().equals("") &&
                        !velocidade.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    raioPlaneta.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(R(
                            constanteG,
                            Double.parseDouble(massaP.getText().toString()),
                            Double.parseDouble(velocidade.getText().toString())
                    ) + " m"));
                }
                //calcula M
                else if (!velocidade.getText().toString().equals("") &&
                        !raioPlaneta.getText().toString().equals("") &&
                        !etConstanteG.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    massaP.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(M(
                            Double.parseDouble(velocidade.getText().toString()),
                            Double.parseDouble(raioPlaneta.getText().toString()),
                            constanteG
                    ) + " Kg"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void massaPPressed()
    {
        massaP.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (massaP.getText().toString().equals(""))
                {
                    tvExtra1.setText("");
                    tvExtra1.setBackgroundResource(R.color.branco);

                    velocidade.setEnabled(true);
                    //etConstanteG.setEnabled(true);
                    massaP.setEnabled(true);
                    raioPlaneta.setEnabled(true);
                }
                //calcula R
                else if (!etConstanteG.getText().toString().equals("") &&
                        !massaP.getText().toString().equals("") &&
                        !velocidade.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    raioPlaneta.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(R(
                            constanteG,
                            Double.parseDouble(massaP.getText().toString()),
                            Double.parseDouble(velocidade.getText().toString())
                    ) + " m"));
                }
                //calcula v
                else if (!etConstanteG.getText().toString().equals("") &&
                        !massaP.getText().toString().equals("") &&
                        !raioPlaneta.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    velocidade.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(v(
                            constanteG,
                            Double.parseDouble(massaP.getText().toString()),
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
                    tvExtra1.setBackgroundResource(R.color.branco);

                    velocidade.setEnabled(true);
                    //etConstanteG.setEnabled(true);
                    massaP.setEnabled(true);
                    raioPlaneta.setEnabled(true);
                }
                //calcula M
                else if (!velocidade.getText().toString().equals("") &&
                        !raioPlaneta.getText().toString().equals("") &&
                        !etConstanteG.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    massaP.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(M(
                            Double.parseDouble(velocidade.getText().toString()),
                            Double.parseDouble(raioPlaneta.getText().toString()),
                            constanteG
                    ) + " Kg"));
                }
                //calcula v
                else if (!etConstanteG.getText().toString().equals("") &&
                        !massaP.getText().toString().equals("") &&
                        !raioPlaneta.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    velocidade.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(v(
                            constanteG,
                            Double.parseDouble(massaP.getText().toString()),
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
