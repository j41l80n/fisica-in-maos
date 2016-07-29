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

public class TelaResumoGravitacaoLeisKepler extends Fragment
{
    private View rootView;

    private TextView tvExtra1;
    private TextView tvExtra2;

    private EditText ta;
    private EditText ra;
    private EditText tb;
    private EditText rb;

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        configuraTextView();
        configuraEditText();

        taPressed();
        raPressed();
        tbPressed();
        rbPressed();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        rootView = inflater.inflate(R.layout.tela_resumo_gravitacao_leis_kepler, container, false);
        return rootView;
    }

    private void configuraTextView()
    {
        TextView tvTelaResumoLesKepler01 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_gravitacao_leis_kepler_01);
        TextView tvTelaResumoLesKepler02 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_gravitacao_leis_kepler_02);
        TextView tvTelaResumoLesKepler03 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_gravitacao_leis_kepler_03);
        TextView tvTelaResumoLesKepler04 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_gravitacao_leis_kepler_04);
        TextView tvTelaResumoLesKepler05 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_gravitacao_leis_kepler_05);
        TextView tvTelaResumoLesKepler06 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_gravitacao_leis_kepler_06);
        TextView tvTelaResumoLesKepler07 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_gravitacao_leis_kepler_07);
        TextView tvTelaResumoLesKepler08 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_gravitacao_leis_kepler_08);

        TextView unidades01 = (TextView) rootView.findViewById(R.id.tv_unidades_0039);
        TextView unidades02 = (TextView) rootView.findViewById(R.id.tv_unidades_0040);
        TextView unidades03 = (TextView) rootView.findViewById(R.id.tv_unidades_0041);
        TextView unidades04 = (TextView) rootView.findViewById(R.id.tv_unidades_0042);

        //unidades01.setText(Html.fromHtml(""));
        //unidades02.setText(Html.fromHtml(""));
        //unidades03.setText(Html.fromHtml(""));
        //unidades04.setText(Html.fromHtml(""));

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumoLesKepler01.setTypeface(font);
        tvTelaResumoLesKepler02.setTypeface(font);
        tvTelaResumoLesKepler03.setTypeface(font);
        tvTelaResumoLesKepler04.setTypeface(font);
        tvTelaResumoLesKepler05.setTypeface(font);
        tvTelaResumoLesKepler06.setTypeface(font);
        tvTelaResumoLesKepler07.setTypeface(font);
        tvTelaResumoLesKepler08.setTypeface(font);

        tvExtra1 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_gravitacao_01_extra_01);
        tvExtra2 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_gravitacao_01_extra_02);

        tvExtra2.setText(Html.fromHtml("<p>Obs.: O raio deve ser dado em unidade astronômica (1UA = 1,5x10<sup>8</sup> km) e o período em anos.</p>"));

        tvTelaResumoLesKepler01.setText(Html.fromHtml(
                "<p><b>1ª LEI - LEI DAS ÓRBITAS:</b></p>" +
                "<p>“Os planetas descrevem órbitas elípticas em torno do Sol, com o Sol ocupando um dos focos.”</p>"));
        tvTelaResumoLesKepler02.setText(Html.fromHtml("<p><b>2ª LEI – LEI DAS ÁREAS:</b></p>" +
                "<p>&ldquo;A reta imaginária que liga o planeta ao Sol, descreve áreas iguais em intervalo de tempos iguais&rdquo;.</p>" +
                "<p>Como resultado disso o planeta apresenta velocidade maior quando mais próximo do Sol e velocidade menor quando mais afastado.</p>" +
                "<p>O ponto mais próximo e o mais afastado se chamam, respectivamente, Periélio e Afélio.</p>"));
        tvTelaResumoLesKepler03.setText(Html.fromHtml("<p><b>3ª Lei – Lei dos períodos:</b></p>" +
                "<p>&ldquo;O quadrado do período de um planeta, dividido pela sua distância média até o Sol ao cubo é igual a uma constante&rdquo;.</p>"));
        tvTelaResumoLesKepler04.setText(Html.fromHtml("<p>Portanto, podemos comparar o movimento de dois planetas através dessa lei:</p>"));
        tvTelaResumoLesKepler05.setText(Html.fromHtml("Período do planeta A (T<sub>A</sub>) = "));
        tvTelaResumoLesKepler06.setText(Html.fromHtml("Raio do planeta A (R<sub>A</sub>) ="));
        tvTelaResumoLesKepler07.setText(Html.fromHtml("Período do planeta B (T<sub>B</sub>) = "));
        tvTelaResumoLesKepler08.setText(Html.fromHtml("Raio do planeta B (T<sub>B</sub>) = "));
    }

    private void configuraEditText()
    {
        ta = (EditText) rootView.findViewById(R.id.et_tela_resumo_gravitacao_leis_kepler_01);
        ra = (EditText) rootView.findViewById(R.id.et_tela_resumo_gravitacao_leis_kepler_02);
        tb = (EditText) rootView.findViewById(R.id.et_tela_resumo_gravitacao_leis_kepler_03);
        rb = (EditText) rootView.findViewById(R.id.et_tela_resumo_gravitacao_leis_kepler_04);

    }

    //1
    private double ra(double rb, double ta, double tb)
    {
        //ra = rb^3 * ta^2 / tb^2
        return Math.pow((Math.pow(rb, 3) * Math.pow(ta, 2)) / Math.pow(tb, 2), 1/3);
    }

    private double ta(double tb, double ra, double rb)
    {
        //ra = rb^3 * ta^2 / tb^2
        return Math.sqrt((Math.pow(tb, 2) * Math.pow(ra, 3)) / Math.pow(rb, 3));
    }

    private void taPressed()
    {
        ta.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (ta.getText().toString().equals(""))
                {
                    tvExtra1.setText("");
                    tvExtra1.setBackgroundResource(R.color.branco);
                    ta.setEnabled(true);
                    ra.setEnabled(true);
                    tb.setEnabled(true);
                    rb.setEnabled(true);
                }
                //ra
                else if (!ta.getText().toString().equals("") &&
                        !tb.getText().toString().equals("") &&
                        !rb.getText().toString().equals(""))
                {
                    ra.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setText(Html.fromHtml(ra(
                            Double.parseDouble(rb.getText().toString()),
                            Double.parseDouble(ta.getText().toString()),
                            Double.parseDouble(tb.getText().toString())
                    ) + " m"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void raPressed()
    {
        ra.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (ra.getText().toString().equals(""))
                {
                    tvExtra1.setText("");
                    tvExtra1.setBackgroundResource(R.color.branco);

                    ta.setEnabled(true);
                    ra.setEnabled(true);
                    tb.setEnabled(true);
                    rb.setEnabled(true);
                }
                //ta
                else if (!tb.getText().toString().equals("") &&
                        !ra.getText().toString().equals("") &&
                        !rb.getText().toString().equals(""))
                {
                    ta.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setText(Html.fromHtml(ta(
                            Double.parseDouble(tb.getText().toString()),
                            Double.parseDouble(ra.getText().toString()),
                            Double.parseDouble(rb.getText().toString())
                    ) + " m"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void tbPressed()
    {
    tb.addTextChangedListener(new TextWatcher()
    {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after)
        {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count)
        {
            if (tb.getText().toString().equals(""))
            {
                tvExtra1.setText("");
                tvExtra1.setBackgroundResource(R.color.branco);

                ta.setEnabled(true);
                ra.setEnabled(true);
                tb.setEnabled(true);
                rb.setEnabled(true);
            }
            //ta
            else if (!rb.getText().toString().equals("") &&
                    !ra.getText().toString().equals("") &&
                    !rb.getText().toString().equals(""))
            {
                ta.setEnabled(false);
                tvExtra1.setBackgroundResource(R.drawable.degrade2);
                tvExtra1.setGravity(Gravity.CENTER);
                tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                tvExtra1.setText(Html.fromHtml(ta(
                        Double.parseDouble(tb.getText().toString()),
                        Double.parseDouble(ra.getText().toString()),
                        Double.parseDouble(rb.getText().toString())
                ) + " m"));
            }
            //ra
            else if (!ta.getText().toString().equals("") &&
                    !tb.getText().toString().equals("") &&
                    !rb.getText().toString().equals(""))
            {
                ra.setEnabled(false);
                tvExtra1.setBackgroundResource(R.drawable.degrade2);
                tvExtra1.setGravity(Gravity.CENTER);
                tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                tvExtra1.setText(Html.fromHtml(ra(
                        Double.parseDouble(rb.getText().toString()),
                        Double.parseDouble(ta.getText().toString()),
                        Double.parseDouble(tb.getText().toString())
                ) + " m"));
            }
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    });
}

    private void rbPressed()
    {
        rb.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (rb.getText().toString().equals(""))
                {
                    tvExtra1.setText("");
                    tvExtra1.setBackgroundResource(R.color.branco);

                    ta.setEnabled(true);
                    ra.setEnabled(true);
                    tb.setEnabled(true);
                    rb.setEnabled(true);
                }
                //ta
                else if (!rb.getText().toString().equals("") &&
                        !ra.getText().toString().equals("") &&
                        !rb.getText().toString().equals(""))
                {
                    ta.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setText(Html.fromHtml(ta(
                            Double.parseDouble(tb.getText().toString()),
                            Double.parseDouble(ra.getText().toString()),
                            Double.parseDouble(rb.getText().toString())
                    ) + " m"));
                }
                //ra
                else if (!ta.getText().toString().equals("") &&
                        !tb.getText().toString().equals("") &&
                        !rb.getText().toString().equals(""))
                {
                    ra.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setText(Html.fromHtml(ra(
                            Double.parseDouble(rb.getText().toString()),
                            Double.parseDouble(ta.getText().toString()),
                            Double.parseDouble(tb.getText().toString())
                    ) + " m"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
