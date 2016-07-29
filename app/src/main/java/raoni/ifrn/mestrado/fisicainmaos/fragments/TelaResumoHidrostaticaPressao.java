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

public class TelaResumoHidrostaticaPressao extends Fragment
{
    private View rootView;

    private TextView tvExtra1;
    private TextView tvExtra2;

    private EditText pressao;
    private EditText forca;
    private EditText area;

    private EditText pressao2;
    private EditText densidade;
    private EditText gravidade;
    private EditText alturaColunaAgua;

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        configuraTextView();
        configuraEditText();

        //1
        pressaoPressed();
        areaPressed();
        forcaPressed();
        //2
        pressao2Pressed();
        densidadePressed();
        gravidadePressed();
        alturaColunaAguaPressed();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        rootView = inflater.inflate(R.layout.tela_resumo_hidrostatica_pressao, container, false);
        return rootView;
    }

    private void configuraTextView()
    {
        TextView tvTelaResumopressao01 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrostatica_pressao_01);
        TextView tvTelaResumopressao02 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrostatica_pressao_02);
        TextView tvTelaResumopressao03 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrostatica_pressao_03);
        TextView tvTelaResumopressao04 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrostatica_pressao_04);
        TextView tvTelaResumopressao05 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrostatica_pressao_05);
        TextView tvTelaResumopressao06 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrostatica_pressao_06);
        TextView tvTelaResumopressao07 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrostatica_pressao_07);
        TextView tvTelaResumopressao08 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrostatica_pressao_08);
        TextView tvTelaResumopressao09 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrostatica_pressao_09);
        TextView tvTelaResumopressao10 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrostatica_pressao_10);
        TextView tvTelaResumopressao11 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrostatica_pressao_11);
        TextView tvTelaResumopressao12 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrostatica_pressao_12);

        TextView unidades01 = (TextView) rootView.findViewById(R.id.tv_unidades_0007);
        TextView unidades02 = (TextView) rootView.findViewById(R.id.tv_unidades_0008);
        TextView unidades03 = (TextView) rootView.findViewById(R.id.tv_unidades_0009);
        TextView unidades04 = (TextView) rootView.findViewById(R.id.tv_unidades_0010);
        TextView unidades05 = (TextView) rootView.findViewById(R.id.tv_unidades_0011);
        TextView unidades06 = (TextView) rootView.findViewById(R.id.tv_unidades_0012);
        TextView unidades07 = (TextView) rootView.findViewById(R.id.tv_unidades_0013);

        unidades01.setText(Html.fromHtml("N/m<sup>2</sup>"));
        unidades02.setText(Html.fromHtml("N"));
        unidades03.setText(Html.fromHtml("m<sup>2</sup>"));
        unidades04.setText(Html.fromHtml("N/m<sup>2</sup>"));
        unidades05.setText(Html.fromHtml("Kg/m<sup>3</sup>"));
        unidades06.setText(Html.fromHtml("m/s<sup>2</sup>"));
        unidades07.setText(Html.fromHtml("m"));


        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumopressao01.setTypeface(font);
        tvTelaResumopressao02.setTypeface(font);
        tvTelaResumopressao03.setTypeface(font);
        tvTelaResumopressao04.setTypeface(font);
        tvTelaResumopressao05.setTypeface(font);
        tvTelaResumopressao06.setTypeface(font);
        tvTelaResumopressao07.setTypeface(font);
        tvTelaResumopressao08.setTypeface(font);
        tvTelaResumopressao09.setTypeface(font);
        tvTelaResumopressao10.setTypeface(font);
        tvTelaResumopressao11.setTypeface(font);
        tvTelaResumopressao12.setTypeface(font);

        tvExtra1 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrostatica_4_extra_01);
        tvExtra2 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrostatica_4_extra_02);

        tvTelaResumopressao01.setText(Html.fromHtml(
                "<p>É a relação força aplicada pela área de contato.</p>"));
        tvTelaResumopressao02.setText(Html.fromHtml("Pressão (p) = "));
        tvTelaResumopressao03.setText(Html.fromHtml("Força (F) = "));
        tvTelaResumopressao04.setText(Html.fromHtml("Área (A) = "));
        tvTelaResumopressao05.setText(Html.fromHtml("<p>Unidade: N/m<sup>2</sup></p>" +
                "<p>Quanto menor a área de contato, maior a pressão exercida.</p>"));
        tvTelaResumopressao06.setText(Html.fromHtml("<p>Pressão atmosférica: Pressão exercida pelos gases sobre corpos presentes na Terra.</p>" +
                "<p>P<sub>atm</sub> = 76 cmhg = 1 atm = 1,02.10<sup>5</sup> Pa</p>" +
                "<p>Quanto maior a altitude, menos ar encontramos, portanto menor a pressão atmosférica.</p>" +
                ""));
        tvTelaResumopressao07.setText(Html.fromHtml("<p>Pressão hidrostática: Pressão exercida pela coluna de água. </p>"));
        tvTelaResumopressao08.setText(Html.fromHtml("Pressão (p) = "));
        tvTelaResumopressao09.setText(Html.fromHtml("Densidade (d) = "));
        tvTelaResumopressao10.setText(Html.fromHtml("Gravidade (g) = "));
        tvTelaResumopressao11.setText(Html.fromHtml("Altura da coluna de água (h) = "));
        tvTelaResumopressao12.setText(Html.fromHtml("<p>Pressão aplicada em um líquido com a extremidade superior aberta</p>"));
    }

    private void configuraEditText()
    {
        pressao = (EditText) rootView.findViewById(R.id.et_tela_resumo_hidrostatica_pressao_01);
        forca = (EditText) rootView.findViewById(R.id.et_tela_resumo_hidrostatica_pressao_02);
        area = (EditText) rootView.findViewById(R.id.et_tela_resumo_hidrostatica_pressao_03);

        pressao2 = (EditText) rootView.findViewById(R.id.et_tela_resumo_hidrostatica_pressao_04);
        densidade = (EditText) rootView.findViewById(R.id.et_tela_resumo_hidrostatica_pressao_05);
        gravidade = (EditText) rootView.findViewById(R.id.et_tela_resumo_hidrostatica_pressao_06);
        alturaColunaAgua = (EditText) rootView.findViewById(R.id.et_tela_resumo_hidrostatica_pressao_07);
    }

    //1
    private double pressao(double f, double a)
    {
        //p = f / a
        return f / a;
    }

    private double forca(double p, double a)
    {
        //f = p * a
        return p * a;
    }

    private double area(double f, double p)
    {
        //a = f / p
        return f / p;
    }

    private void pressaoPressed()
    {
        pressao.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (pressao.getText().toString().equals(""))
                {
                    tvExtra1.setText("");
                    tvExtra1.setBackgroundResource(R.color.branco);
                    forca.setEnabled(true);
                    area.setEnabled(true);
                }
                //calcula area
                else if (!pressao.getText().toString().equals("") &&
                        !forca.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    area.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(area(
                            Double.parseDouble(forca.getText().toString()),
                            Double.parseDouble(pressao.getText().toString())
                    ) + " m<sup>2</sup>"));
                }
                //calcula forca
                else if (!pressao.getText().toString().equals("") &&
                        !area.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));

                    forca.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(forca(
                            Double.parseDouble(pressao.getText().toString()),
                            Double.parseDouble(area.getText().toString())
                    ) + " N"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void areaPressed()
    {
        area.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (area.getText().toString().equals(""))
                {
                    tvExtra1.setText("");
                    tvExtra1.setBackgroundResource(R.color.branco);
                    forca.setEnabled(true);
                    pressao.setEnabled(true);
                }
                //calcula pressao
                else if (!area.getText().toString().equals("") &&
                        !forca.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));

                    pressao.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(pressao(
                            Double.parseDouble(forca.getText().toString()),
                            Double.parseDouble(area.getText().toString())
                    ) + " N/m<sup>2</sup>"));
                }
                //calcula forca
                else if (!pressao.getText().toString().equals("") &&
                        !area.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));

                    forca.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(forca(
                            Double.parseDouble(pressao.getText().toString()),
                            Double.parseDouble(area.getText().toString())
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
                    tvExtra1.setText("");
                    tvExtra1.setBackgroundResource(R.color.branco);
                    area.setEnabled(true);
                    pressao.setEnabled(true);
                }
                //calcula pressao
                else if (!area.getText().toString().equals("") &&
                        !forca.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));

                    pressao.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(pressao(
                            Double.parseDouble(forca.getText().toString()),
                            Double.parseDouble(area.getText().toString())
                    ) + " N/m<sup>2</sup>"));
                }
                //calcula area
                else if (!pressao.getText().toString().equals("") &&
                        !forca.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));

                    area.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(area(
                            Double.parseDouble(forca.getText().toString()),
                            Double.parseDouble(pressao.getText().toString())
                    ) + " m<sup>2</sup>"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    //2
    private double p(double d, double g, double h)
    {
        //p = d * g * h
        return d * g * h;
    }

    private double h(double p, double d, double g)
    {
        //h = p / (d * g)
        return p / (d * g);
    }

    private double d(double p, double h, double g)
    {
        //d = p / (h * g)
        return p / (h * g);
    }

    private void pressao2Pressed()
    {
        pressao2.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (pressao2.getText().toString().equals(""))
                {
                    tvExtra2.setText("");
                    tvExtra2.setBackgroundResource(R.color.branco);
                    densidade.setEnabled(true);
                    gravidade.setEnabled(true);
                    alturaColunaAgua.setEnabled(true);
                }
                //calcula h
                else if (!pressao2.getText().toString().equals("") &&
                        !densidade.getText().toString().equals("") &&
                        !gravidade.getText().toString().equals(""))
                {
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));

                    alturaColunaAgua.setEnabled(false);
                    tvExtra2.setText(Html.fromHtml(h(
                            Double.parseDouble(pressao2.getText().toString()),
                            Double.parseDouble(densidade.getText().toString()),
                            Double.parseDouble(gravidade.getText().toString())
                    ) + " m"));
                }
                //calcula d
                else if (!pressao2.getText().toString().equals("") &&
                        !alturaColunaAgua.getText().toString().equals("")&&
                        !gravidade.getText().toString().equals(""))
                {
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    densidade.setEnabled(false);
                    tvExtra2.setText(Html.fromHtml(d(
                            Double.parseDouble(pressao2.getText().toString()),
                            Double.parseDouble(alturaColunaAgua.getText().toString()),
                            Double.parseDouble(gravidade.getText().toString())
                    ) + " Kg/m<sup>3</sup>"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void densidadePressed()
    {
        densidade.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (densidade.getText().toString().equals(""))
                {
                    tvExtra2.setBackgroundResource(R.color.branco);

                    tvExtra2.setText("");
                    pressao2.setEnabled(true);
                    gravidade.setEnabled(true);
                    alturaColunaAgua.setEnabled(true);
                }
                //calcula h
                else if (!pressao2.getText().toString().equals("") &&
                        !densidade.getText().toString().equals("") &&
                        !gravidade.getText().toString().equals(""))
                {
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    alturaColunaAgua.setEnabled(false);
                    tvExtra2.setText(Html.fromHtml(h(
                            Double.parseDouble(pressao2.getText().toString()),
                            Double.parseDouble(densidade.getText().toString()),
                            Double.parseDouble(gravidade.getText().toString())
                    ) + " m"));
                }
                //calcula p
                else if (!densidade.getText().toString().equals("") &&
                        !gravidade.getText().toString().equals("")&&
                        !alturaColunaAgua.getText().toString().equals(""))
                {
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    pressao2.setEnabled(false);
                    tvExtra2.setText(Html.fromHtml(p(
                            Double.parseDouble(densidade.getText().toString()),
                            Double.parseDouble(gravidade.getText().toString()),
                            Double.parseDouble(alturaColunaAgua.getText().toString())
                    ) + " N/m<sup>2</sup>"));
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
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (gravidade.getText().toString().equals(""))
                {
                    tvExtra2.setText("");
                    tvExtra2.setBackgroundResource(R.color.branco);

                    pressao2.setEnabled(true);
                    densidade.setEnabled(true);
                    alturaColunaAgua.setEnabled(true);
                }
                //calcula h
                else if (!pressao2.getText().toString().equals("") &&
                        !densidade.getText().toString().equals("") &&
                        !gravidade.getText().toString().equals(""))
                {
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    alturaColunaAgua.setEnabled(false);
                    tvExtra2.setText(Html.fromHtml(h(
                            Double.parseDouble(pressao2.getText().toString()),
                            Double.parseDouble(densidade.getText().toString()),
                            Double.parseDouble(gravidade.getText().toString())
                    ) + " m"));
                }
                //calcula p
                else if (!densidade.getText().toString().equals("") &&
                        !gravidade.getText().toString().equals("")&&
                        !alturaColunaAgua.getText().toString().equals(""))
                {
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    pressao2.setEnabled(false);
                    tvExtra2.setText(Html.fromHtml(p(
                            Double.parseDouble(densidade.getText().toString()),
                            Double.parseDouble(gravidade.getText().toString()),
                            Double.parseDouble(alturaColunaAgua.getText().toString())
                    ) + " N/m<sup>2</sup>"));
                }
                //calcula d
                else if (!pressao2.getText().toString().equals("") &&
                        !alturaColunaAgua.getText().toString().equals("")&&
                        !gravidade.getText().toString().equals(""))
                {
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    densidade.setEnabled(false);
                    tvExtra2.setText(Html.fromHtml(d(
                            Double.parseDouble(pressao2.getText().toString()),
                            Double.parseDouble(alturaColunaAgua.getText().toString()),
                            Double.parseDouble(gravidade.getText().toString())
                    ) + " Kg/m<sup>3</sup>"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void alturaColunaAguaPressed()
    {
        alturaColunaAgua.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (alturaColunaAgua.getText().toString().equals(""))
                {
                    tvExtra2.setText("");
                    tvExtra2.setBackgroundResource(R.color.branco);

                    pressao2.setEnabled(true);
                    densidade.setEnabled(true);
                    gravidade.setEnabled(true);
                }
                //calcula p
                else if (!densidade.getText().toString().equals("") &&
                        !gravidade.getText().toString().equals("")&&
                        !alturaColunaAgua.getText().toString().equals(""))
                {
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    pressao2.setEnabled(false);
                    tvExtra2.setText(Html.fromHtml(p(
                            Double.parseDouble(densidade.getText().toString()),
                            Double.parseDouble(gravidade.getText().toString()),
                            Double.parseDouble(alturaColunaAgua.getText().toString())
                    ) + " N/m<sup>2</sup>"));
                }
                //calcula d
                else if (!pressao2.getText().toString().equals("") &&
                        !alturaColunaAgua.getText().toString().equals("")&&
                        !gravidade.getText().toString().equals(""))
                {
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    densidade.setEnabled(false);
                    tvExtra2.setText(Html.fromHtml(d(
                            Double.parseDouble(pressao2.getText().toString()),
                            Double.parseDouble(alturaColunaAgua.getText().toString()),
                            Double.parseDouble(gravidade.getText().toString())
                    ) + " Kg/m<sup>3</sup>"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
