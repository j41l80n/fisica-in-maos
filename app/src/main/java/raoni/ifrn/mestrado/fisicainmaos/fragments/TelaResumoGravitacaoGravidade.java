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

public class TelaResumoGravitacaoGravidade extends Fragment
{
    private View rootView;

    private EditText gravidade;
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

        gravidadePressed();
        //constanteGPressed();
        massaPlanetaPressed();
        raioPlanetaPressed();

        etConstanteG.setEnabled(false);
        etConstanteG.setText("6,7 E-11");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        rootView = inflater.inflate(R.layout.tela_resumo_gravitacao_gravidade, container, false);
        return rootView;
    }

    private void configuraTextView()
    {
        TextView tvTelaResumogravitacao01 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_gravitacao_gravitacao_01);
        TextView tvTelaResumogravitacao02 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_gravitacao_gravitacao_02);
        TextView tvTelaResumogravitacao03 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_gravitacao_gravitacao_03);
        TextView tvTelaResumogravitacao04 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_gravitacao_gravitacao_04);
        TextView tvTelaResumogravitacao05 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_gravitacao_gravitacao_05);
        TextView tvTelaResumogravitacao06 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_gravitacao_gravitacao_06);

        TextView tvTelaResumogravitacao07 = (TextView) rootView.findViewById(R.id.tv_gravitacao_extra_input_0001);
        TextView tvTelaResumogravitacao08 = (TextView) rootView.findViewById(R.id.tv_gravitacao_extra_input_0002);
        TextView tvTelaResumogravitacao09 = (TextView) rootView.findViewById(R.id.tv_gravitacao_extra_input_0003);
        TextView tvTelaResumogravitacao010 = (TextView) rootView.findViewById(R.id.tv_gravitacao_extra_input_0004);

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumogravitacao01.setTypeface(font);
        tvTelaResumogravitacao02.setTypeface(font);
        tvTelaResumogravitacao03.setTypeface(font);
        tvTelaResumogravitacao04.setTypeface(font);
        tvTelaResumogravitacao05.setTypeface(font);
        tvTelaResumogravitacao06.setTypeface(font);

        tvTelaResumogravitacao07.setText(Html.fromHtml("m/s<sup>2</sup>"));
        tvTelaResumogravitacao08.setText(Html.fromHtml("Nm<sup>2</sup>/Kg<sup>2</sup>"));
        tvTelaResumogravitacao09.setText(Html.fromHtml("Kg"));
        tvTelaResumogravitacao010.setText(Html.fromHtml("m"));

            tvExtra1 = (TextView) rootView.findViewById(R.id.tv_tela_gravitacao_gravidade_extra_001);

        tvTelaResumogravitacao01.setText(Html.fromHtml(
                "<p>Um corpo próximo à superfície da Terra fica submetido a uma força de atração gravitacional que aponta para o centro da Terra. Sendo a força Peso " +
                "também direcionada para o centro da Terra, temos que:</p>"));
        tvTelaResumogravitacao02.setText(Html.fromHtml("Gravidade (g) = "));
        tvTelaResumogravitacao03.setText(Html.fromHtml("Constante gravitacional (G) = "));
        tvTelaResumogravitacao04.setText(Html.fromHtml("Massa do planeta (M) = "));
        tvTelaResumogravitacao05.setText(Html.fromHtml("Raio do planeta (R) = "));
        tvTelaResumogravitacao06.setText(Html.fromHtml("<p>Unidade: m/s<sup>2</sup> ou N/kg</p>" +
                "<p>Devido o movimento de rotação da Terra e o fato de a mesma ser achatada, o " +
                "valor de g é máxima nos polos 9,823 m/s<sup>2</sup> e mínima no equador 9,789 " +
                "m/s<sup>2</sup>, onde os efeitos da rotação são mais sentidos.</p>" +
                "<p><b>Imponderabilidade</b>: É a sensação de ausência de peso. Os corpos dentro" +
                " de uma nave espacial, e a própria nave, ficam submetidos a mesma aceleração," +
                " por estarem sendo atraídos para a Terra. estão constantemente em " +
                "queda livre, o que dá a sensação de ausência de Peso.</p>"));
    }

    private void configuraEditText()
    {
        gravidade = (EditText) rootView.findViewById(R.id.et_tela_resumo_gravitacao_gravitacao_01);
        etConstanteG = (EditText) rootView.findViewById(R.id.et_tela_resumo_gravitacao_gravitacao_02);
        massaPlaneta = (EditText) rootView.findViewById(R.id.et_tela_resumo_gravitacao_gravitacao_03);
        raioPlaneta = (EditText) rootView.findViewById(R.id.et_tela_resumo_gravitacao_gravitacao_04);
    }

    //1
    private double g(double G, double M, double r)
    {
        //f = (G * M) / r^2
        return (G * M) / Math.pow(r, 2);
    }

    private double R(double G, double M, double g)
    {
        //R = √(G * M) / g
        return Math.sqrt((G * M) / g);
    }

    private double M(double g, double R, double G)
    {
        //M = g * R^2 / G
        return (g * Math.pow(R, 2)) / G;
    }

    private void gravidadePressed()
    {
        gravidade.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (gravidade.getText().toString().equals(""))
                {
                    tvExtra1.setText("");
                    gravidade.setEnabled(true);
                    tvExtra1.setBackgroundResource(R.color.branco);
                    //etConstanteG.setEnabled(true);
                    massaPlaneta.setEnabled(true);
                    raioPlaneta.setEnabled(true);
                }
                //calcula R
                else if (!etConstanteG.getText().toString().equals("") &&
                        !massaPlaneta.getText().toString().equals("") &&
                        !gravidade.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    raioPlaneta.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(R(
                            constanteG,
                            Double.parseDouble(massaPlaneta.getText().toString()),
                            Double.parseDouble(gravidade.getText().toString())
                    ) + " m"));
                }
                //calcula M
                else if (!gravidade.getText().toString().equals("") &&
                        !raioPlaneta.getText().toString().equals("") &&
                        !etConstanteG.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    massaPlaneta.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(M(
                            Double.parseDouble(gravidade.getText().toString()),
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

                    gravidade.setEnabled(true);
                    //etConstanteG.setEnabled(true);
                    massaPlaneta.setEnabled(true);
                    raioPlaneta.setEnabled(true);
                }
                //calcula R
                else if (!etConstanteG.getText().toString().equals("") &&
                        !massaPlaneta.getText().toString().equals("") &&
                        !gravidade.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    raioPlaneta.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(R(
                            constanteG,
                            Double.parseDouble(massaPlaneta.getText().toString()),
                            Double.parseDouble(gravidade.getText().toString())
                    ) + " m"));
                }
                //calcula g
                else if (!etConstanteG.getText().toString().equals("") &&
                        !massaPlaneta.getText().toString().equals("") &&
                        !raioPlaneta.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    gravidade.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(g(
                            constanteG,
                            Double.parseDouble(massaPlaneta.getText().toString()),
                            Double.parseDouble(raioPlaneta.getText().toString())
                    ) + " m/s<sup>2</sup>"));
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
                    gravidade.setEnabled(true);
                    //etConstanteG.setEnabled(true);
                    tvExtra1.setBackgroundResource(R.color.branco);

                    massaPlaneta.setEnabled(true);
                    raioPlaneta.setEnabled(true);
                }
                //calcula M
                else if (!gravidade.getText().toString().equals("") &&
                        !raioPlaneta.getText().toString().equals("") &&
                        !etConstanteG.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    massaPlaneta.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(M(
                            Double.parseDouble(gravidade.getText().toString()),
                            Double.parseDouble(raioPlaneta.getText().toString()),
                            constanteG
                    ) + " Kg"));
                }
                //calcula g
                else if (!etConstanteG.getText().toString().equals("") &&
                        !massaPlaneta.getText().toString().equals("") &&
                        !raioPlaneta.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    gravidade.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(g(
                            constanteG,
                            Double.parseDouble(massaPlaneta.getText().toString()),
                            Double.parseDouble(raioPlaneta.getText().toString())
                    ) + " m/s<sup>2</sup>"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
