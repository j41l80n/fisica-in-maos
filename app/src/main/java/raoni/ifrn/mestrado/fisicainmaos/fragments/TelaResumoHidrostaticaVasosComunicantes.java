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

public class TelaResumoHidrostaticaVasosComunicantes extends Fragment
{
    private View rootView;
    private TextView tvExtra1;
    private TextView tvExtra2;

    private EditText forca1;
    private EditText areaEmbuloMenor;
    private EditText forca2;
    private EditText areaEmbuloMaior;

    private EditText f1_2;
    private EditText h1;
    private EditText f2_2;
    private EditText h2;

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        configuraTextView();
        configuraEditText();

        //1
        f1Pressed();
        areaEmbuloMenorPressed();
        f2Pressed();
        a2Pressed();
        //2
        f1_2Pressed();
        h1Pressed();
        f2_2Pressed();
        h2Pressed();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        rootView = inflater.inflate(R.layout.tela_resumo_hidrostatica_vasos_comunicantes, container, false);
        return rootView;
    }

    private void configuraTextView()
    {
        TextView tvTelaResumoVasosComunicantes01 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrostatica_vasos_comunicantes_01);
        TextView tvTelaResumoVasosComunicantes02 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrostatica_vasos_comunicantes_02);
        TextView tvTelaResumoVasosComunicantes03 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrostatica_vasos_comunicantes_03);
        TextView tvTelaResumoVasosComunicantes04 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrostatica_vasos_comunicantes_04);
        TextView tvTelaResumoVasosComunicantes05 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrostatica_vasos_comunicantes_05);
        TextView tvTelaResumoVasosComunicantes06 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrostatica_vasos_comunicantes_06);
        TextView tvTelaResumoVasosComunicantes07 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrostatica_vasos_comunicantes_07);
        TextView tvTelaResumoVasosComunicantes08 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrostatica_vasos_comunicantes_08);
        TextView tvTelaResumoVasosComunicantes09 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrostatica_vasos_comunicantes_09);
        TextView tvTelaResumoVasosComunicantes10 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrostatica_vasos_comunicantes_10);
        TextView tvTelaResumoVasosComunicantes11 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrostatica_vasos_comunicantes_11);
        TextView tvTelaResumoVasosComunicantes12 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrostatica_vasos_comunicantes_12);

        TextView unidades0001 = (TextView) rootView.findViewById(R.id.tv_unidades_0014);
        TextView unidades0002 = (TextView) rootView.findViewById(R.id.tv_unidades_0015);
        TextView unidades0003 = (TextView) rootView.findViewById(R.id.tv_unidades_0016);
        TextView unidades0004 = (TextView) rootView.findViewById(R.id.tv_unidades_0017);
        TextView unidades0005 = (TextView) rootView.findViewById(R.id.tv_unidades_0018);
        TextView unidades0006 = (TextView) rootView.findViewById(R.id.tv_unidades_0019);
        TextView unidades0007 = (TextView) rootView.findViewById(R.id.tv_unidades_0020);
        TextView unidades0008 = (TextView) rootView.findViewById(R.id.tv_unidades_0021);

        unidades0001.setText(Html.fromHtml("N"));
        unidades0002.setText(Html.fromHtml("m<sup>2</sup>"));
        unidades0003.setText(Html.fromHtml("N"));
        unidades0004.setText(Html.fromHtml("m<sup>2</sup>"));
        unidades0005.setText(Html.fromHtml("N"));
        unidades0006.setText(Html.fromHtml("m"));
        unidades0007.setText(Html.fromHtml("N"));
        unidades0008.setText(Html.fromHtml("n"));

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumoVasosComunicantes01.setTypeface(font);
        tvTelaResumoVasosComunicantes02.setTypeface(font);
        tvTelaResumoVasosComunicantes03.setTypeface(font);
        tvTelaResumoVasosComunicantes04.setTypeface(font);
        tvTelaResumoVasosComunicantes05.setTypeface(font);
        tvTelaResumoVasosComunicantes06.setTypeface(font);
        tvTelaResumoVasosComunicantes07.setTypeface(font);
        tvTelaResumoVasosComunicantes08.setTypeface(font);
        tvTelaResumoVasosComunicantes09.setTypeface(font);
        tvTelaResumoVasosComunicantes10.setTypeface(font);
        tvTelaResumoVasosComunicantes11.setTypeface(font);
        tvTelaResumoVasosComunicantes12.setTypeface(font);

        tvExtra1 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrostatica_6_extra_01);
        tvExtra2 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrostatica_6_extra_02);
        tvTelaResumoVasosComunicantes01.setText(Html.fromHtml(
                "<p> Todos os pontos de uma superfície horizontal, em um líquido em repouso, suportam a mesma pressão.</p>"));
        tvTelaResumoVasosComunicantes02.setText(Html.fromHtml("<p>Sendo a pressão a mesma em um líquido em repouso e no mesmo nível, podemos usar líquidos não miscíveis para determinar densidades.</p>"));
        tvTelaResumoVasosComunicantes03.setText(Html.fromHtml("<p>Sendo a pressão e 1 igual a pressão em 2,</p>" +
                "<p>Princípio de Pascal: &ldquo;A pressão aplicada a um fluido dentro de um recipiente fechado é transmitida, sem variação, a todas as partes do fluido, " +
                "bem como às paredes&rdquo;.</p>"));
        tvTelaResumoVasosComunicantes04.setText(Html.fromHtml("Força aplicada no \nêmbolo menor (F<sub>1</sub>) = "));
        tvTelaResumoVasosComunicantes05.setText(Html.fromHtml("Área do êmbolo \nmenor (A<sub>1</sub>) = "));
        tvTelaResumoVasosComunicantes06.setText(Html.fromHtml("Força aplicada \nno êmbolo maior (F<sub>2</sub>) ="));
        tvTelaResumoVasosComunicantes07.setText(Html.fromHtml("Área do êmbolo maior (A<sub>2</sub>) ="));
        tvTelaResumoVasosComunicantes08.setText(Html.fromHtml("Força aplicada no êmbolo \nmenor (F<sub>1</sub>) =  "));
        tvTelaResumoVasosComunicantes09.setText(Html.fromHtml("Deslocamento sofrido pelo \nmenor êmbolo (h<sub>1</sub>) = "));
        tvTelaResumoVasosComunicantes10.setText(Html.fromHtml("Força aplicada no êmbolo \nmaior (F<sub>2</sub>) = "));
        tvTelaResumoVasosComunicantes11.setText(Html.fromHtml("Deslocamento sofrido pelo \nmaior êmbolo (h<sub>2</sub>) = "));
        tvTelaResumoVasosComunicantes12.setText(Html.fromHtml("<p><b>Exemplo:</b> Elevador hidráulico</p>"));
    }

    private void configuraEditText()
    {
        forca1 = (EditText) rootView.findViewById(R.id.et_tela_resumo_hidrostatica_vasos_comunicantes_01);
        areaEmbuloMenor = (EditText) rootView.findViewById(R.id.et_tela_resumo_hidrostatica_vasos_comunicantes_02);
        forca2 = (EditText) rootView.findViewById(R.id.et_tela_resumo_hidrostatica_vasos_comunicantes_03);
        areaEmbuloMaior = (EditText) rootView.findViewById(R.id.et_tela_resumo_hidrostatica_vasos_comunicantes_04);

        f1_2 = (EditText) rootView.findViewById(R.id.et_tela_resumo_hidrostatica_vasos_comunicantes_05);
        h1 = (EditText) rootView.findViewById(R.id.et_tela_resumo_hidrostatica_vasos_comunicantes_06);
        f2_2 = (EditText) rootView.findViewById(R.id.et_tela_resumo_hidrostatica_vasos_comunicantes_07);
        h2 = (EditText) rootView.findViewById(R.id.et_tela_resumo_hidrostatica_vasos_comunicantes_08);
    }

    //1
    private double f1(double a1, double f2, double a2)
    {
        //f1 = a1 * (f2 / a2)
        return a1 * (f2 / a2);
    }

    private double a1(double a2, double f1, double f2)
    {
        //a1 = a2 * (f1 / f2)
        return a2 * (f1 / f2);
    }

    private void f1Pressed()
    {
        forca1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (forca1.getText().toString().equals(""))
                {
                    tvExtra1.setText("");
                    tvExtra1.setBackgroundResource(R.color.branco);
                    areaEmbuloMenor.setEnabled(true);
                    forca2.setEnabled(true);
                    areaEmbuloMaior.setEnabled(true);
                    forca1.setEnabled(true);
                }
                //calcula area
                else if (!areaEmbuloMaior.getText().toString().equals("") &&
                        !forca1.getText().toString().equals("") &&
                        !forca2.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));

                    areaEmbuloMenor.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(a1(
                            Double.parseDouble(areaEmbuloMaior.getText().toString()),
                            Double.parseDouble(forca1.getText().toString()),
                            Double.parseDouble(forca2.getText().toString())
                    ) + " m<sup>2</sup>"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void areaEmbuloMenorPressed()
    {
        areaEmbuloMenor.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (areaEmbuloMenor.getText().toString().equals(""))
                {
                    tvExtra1.setText("");
                    tvExtra1.setBackgroundResource(R.color.branco);
                    areaEmbuloMenor.setEnabled(true);
                    forca2.setEnabled(true);
                    areaEmbuloMaior.setEnabled(true);
                    forca1.setEnabled(true);
                }
                //calcula f
                else if (!areaEmbuloMenor.getText().toString().equals("") &&
                        !forca2.getText().toString().equals("")&&
                        !areaEmbuloMaior.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));

                    forca1.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(f1(
                            Double.parseDouble(areaEmbuloMenor.getText().toString()),
                            Double.parseDouble(forca2.getText().toString()),
                            Double.parseDouble(areaEmbuloMaior.getText().toString())
                    ) + " N"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void f2Pressed()
    {
        forca2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (forca2.getText().toString().equals(""))
                {
                    tvExtra1.setText("");
                    tvExtra1.setBackgroundResource(R.color.branco);
                    areaEmbuloMenor.setEnabled(true);
                    forca2.setEnabled(true);
                    areaEmbuloMaior.setEnabled(true);
                    forca1.setEnabled(true);
                }
                //calcula area
                else if (!areaEmbuloMenor.getText().toString().equals("") &&
                        !forca2.getText().toString().equals("")&&
                        !areaEmbuloMaior.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));

                    areaEmbuloMenor.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(f1(
                            Double.parseDouble(areaEmbuloMenor.getText().toString()),
                            Double.parseDouble(forca2.getText().toString()),
                            Double.parseDouble(areaEmbuloMaior.getText().toString())
                    ) + " N"));
                }
                else if (!areaEmbuloMaior.getText().toString().equals("") &&
                        !forca1.getText().toString().equals("")&&
                        !forca2.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));

                    areaEmbuloMenor.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(a1(
                            Double.parseDouble(areaEmbuloMaior.getText().toString()),
                            Double.parseDouble(forca1.getText().toString()),
                            Double.parseDouble(forca2.getText().toString())
                    ) + " m<sup>2</sup>"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void a2Pressed()
    {
        areaEmbuloMaior.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (areaEmbuloMaior.getText().toString().equals(""))
                {
                    tvExtra1.setText("");
                    tvExtra1.setBackgroundResource(R.color.branco);
                    areaEmbuloMenor.setEnabled(true);
                    forca2.setEnabled(true);
                    areaEmbuloMaior.setEnabled(true);
                    forca1.setEnabled(true);
                }
                //calcula area
                else if (!areaEmbuloMenor.getText().toString().equals("") &&
                        !forca2.getText().toString().equals("")&&
                        !areaEmbuloMaior.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));

                    forca1.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(f1(
                            Double.parseDouble(areaEmbuloMenor.getText().toString()),
                            Double.parseDouble(forca2.getText().toString()),
                            Double.parseDouble(areaEmbuloMaior.getText().toString())
                    ) + " N"));
                }
                else if (!areaEmbuloMaior.getText().toString().equals("") &&
                        !forca1.getText().toString().equals("")&&
                        !areaEmbuloMaior.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));

                    areaEmbuloMenor.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(a1(
                            Double.parseDouble(areaEmbuloMaior.getText().toString()),
                            Double.parseDouble(forca1.getText().toString()),
                            Double.parseDouble(forca2.getText().toString())
                    ) + "m<sup>2</sup>"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    //2
    private double f1_2(double f2, double h2, double h1)
    {
        //f1 = (f2 * h2) / h1
        return (f2 * h2) / h1;
    }

    private double h1(double f2, double h2, double f1)
    {
        //h1 = (f2 * h2) / f1
        return (f2 * h2) / f1;
    }

    private void f1_2Pressed()
    {
        f1_2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (f1_2.getText().toString().equals(""))
                {
                    tvExtra2.setText("");
                    tvExtra2.setBackgroundResource(R.color.branco);
                    f1_2.setEnabled(true);
                    h1.setEnabled(true);
                    f2_2.setEnabled(true);
                    h2.setEnabled(true);
                }
                //calcula h1
                else if (!f2_2.getText().toString().equals("") &&
                        !h2.getText().toString().equals("")&&
                        !f1_2.getText().toString().equals(""))
                {
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));

                    h1.setEnabled(false);
                    tvExtra2.setText(Html.fromHtml(h1(
                            Double.parseDouble(f2_2.getText().toString()),
                            Double.parseDouble(h2.getText().toString()),
                            Double.parseDouble(f1_2.getText().toString())
                    ) + " m"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void h1Pressed()
    {
        h1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (h1.getText().toString().equals(""))
                {
                    tvExtra2.setBackgroundResource(R.color.branco);

                    tvExtra2.setText("");
                    f1_2.setEnabled(true);
                    h1.setEnabled(true);
                    f2_2.setEnabled(true);
                    h2.setEnabled(true);
                }
                //calcula area
                else if (!f2_2.getText().toString().equals("") &&
                        !h2.getText().toString().equals("")&&
                        !h1.getText().toString().equals(""))
                {
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    f1_2.setEnabled(false);
                    tvExtra2.setText(Html.fromHtml(f1_2(
                            Double.parseDouble(f2_2.getText().toString()),
                            Double.parseDouble(h2.getText().toString()),
                            Double.parseDouble(h1.getText().toString())
                    ) + " N"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void f2_2Pressed()
    {
        f2_2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (f2_2.getText().toString().equals(""))
                {
                    tvExtra2.setBackgroundResource(R.color.branco);

                    tvExtra2.setText("");
                    f1_2.setEnabled(true);
                    h1.setEnabled(true);
                    f2_2.setEnabled(true);
                    h2.setEnabled(true);
                }
                //calcula
                else if (!f2_2.getText().toString().equals("") &&
                        !h2.getText().toString().equals("")&&
                        !h1.getText().toString().equals(""))
                {
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    f1_2.setEnabled(false);
                    tvExtra2.setText(Html.fromHtml(f1_2(
                            Double.parseDouble(f2_2.getText().toString()),
                            Double.parseDouble(h2.getText().toString()),
                            Double.parseDouble(h1.getText().toString())
                    ) + " N"));
                }
                //calcula h1
                else if (!f2_2.getText().toString().equals("") &&
                        !h2.getText().toString().equals("")&&
                        !f1_2.getText().toString().equals(""))
                {
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    h1.setEnabled(false);
                    tvExtra2.setText(Html.fromHtml(h1(
                            Double.parseDouble(f2_2.getText().toString()),
                            Double.parseDouble(h2.getText().toString()),
                            Double.parseDouble(f1_2.getText().toString())
                    ) + " m"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void h2Pressed()
    {
        h2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (h2.getText().toString().equals(""))
                {
                    tvExtra2.setBackgroundResource(R.color.branco);

                    tvExtra2.setText("");
                    f1_2.setEnabled(true);
                    h1.setEnabled(true);
                    f2_2.setEnabled(true);
                    h2.setEnabled(true);
                }
                //calcula area
                else if (!f2_2.getText().toString().equals("") &&
                        !h2.getText().toString().equals("")&&
                        !h1.getText().toString().equals(""))
                {
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    f1_2.setEnabled(false);
                    tvExtra2.setText(Html.fromHtml(f1_2(
                            Double.parseDouble(f2_2.getText().toString()),
                            Double.parseDouble(h2.getText().toString()),
                            Double.parseDouble(h1.getText().toString())
                    ) + " N"));
                }
                //calcula h1
                else if (!f2_2.getText().toString().equals("") &&
                        !h2.getText().toString().equals("")&&
                        !f1_2.getText().toString().equals(""))
                {
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    h1.setEnabled(false);
                    tvExtra2.setText(Html.fromHtml(h1(
                            Double.parseDouble(f2_2.getText().toString()),
                            Double.parseDouble(h2.getText().toString()),
                            Double.parseDouble(f1_2.getText().toString())
                    ) + " m"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
