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

public class TelaResumoHidrostaticaDensidade extends Fragment
{
    private View rootView;

    private TextView tvExtra1;
    private TextView tvExtra2;

    private EditText densidade;
    private EditText massa;
    private EditText volume;

    private EditText massaEspecifica;
    private EditText massaCorpo;
    private EditText volumeOcupadoMassaCorpo;


    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        configuraTextView();
        configuraEditText();

        //1
        densidadePressed();
        massaPressed();
        volumePressed();
        //2
        massaEspecificaPressed();
        massaCorpoPressed();
        volumeOcupadoMassaCorpoPressed();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        rootView = inflater.inflate(R.layout.tela_resumo_hidrostatica_densidade, container, false);
        return rootView;
    }

    private void configuraTextView()
    {
        TextView tvTelaResumoDensidade01 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrostatica_densidade_01);
        TextView tvTelaResumoDensidade02 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrostatica_densidade_02);
        TextView tvTelaResumoDensidade03 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrostatica_densidade_03);
        TextView tvTelaResumoDensidade04 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrostatica_densidade_04);
        TextView tvTelaResumoDensidade05 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrostatica_densidade_05);
        TextView tvTelaResumoDensidade06 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrostatica_densidade_06);
        TextView tvTelaResumoDensidade07 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrostatica_densidade_07);
        TextView tvTelaResumoDensidade08 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrostatica_densidade_08);
        TextView tvTelaResumoDensidade09 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrostatica_densidade_09);
        TextView tvTelaResumoDensidade10 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrostatica_densidade_10);

        TextView unidades01 = (TextView) rootView.findViewById(R.id.tv_unidades_0001);
        TextView unidades02 = (TextView) rootView.findViewById(R.id.tv_unidades_0002);
        TextView unidades03 = (TextView) rootView.findViewById(R.id.tv_unidades_0003);
        TextView unidades04 = (TextView) rootView.findViewById(R.id.tv_unidades_0004);
        TextView unidades05 = (TextView) rootView.findViewById(R.id.tv_unidades_0005);
        TextView unidades06 = (TextView) rootView.findViewById(R.id.tv_unidades_0006);

        unidades01.setText(Html.fromHtml("Kg/m<sup>3</sup>"));
        unidades02.setText(Html.fromHtml("Kg"));
        unidades03.setText(Html.fromHtml("m<sup>3</sup>"));
        unidades04.setText(Html.fromHtml("Kg/m<sup>3</sup>"));
        unidades05.setText(Html.fromHtml("Kg"));
        unidades06.setText(Html.fromHtml("m<sup>3</sup>"));

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumoDensidade01.setTypeface(font);
        tvTelaResumoDensidade02.setTypeface(font);
        tvTelaResumoDensidade03.setTypeface(font);
        tvTelaResumoDensidade04.setTypeface(font);
        tvTelaResumoDensidade05.setTypeface(font);
        tvTelaResumoDensidade06.setTypeface(font);
        tvTelaResumoDensidade07.setTypeface(font);
        tvTelaResumoDensidade08.setTypeface(font);
        tvTelaResumoDensidade09.setTypeface(font);
        tvTelaResumoDensidade10.setTypeface(font);

        tvExtra1 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrostatica_2_extra_01);
        tvExtra2 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrostatica_2_extra_02);

        tvTelaResumoDensidade01.setText(Html.fromHtml(
                "<p>Relação entre o Volume total ocupado pelo corpo e sua massa.</p>"));
        tvTelaResumoDensidade02.setText(Html.fromHtml("<p>Unidade: Kg/m<sup>3</sup></p>"));
        tvTelaResumoDensidade03.setText(Html.fromHtml("Densidade (d) = "));
        tvTelaResumoDensidade04.setText(Html.fromHtml("Massa (m) = "));
        tvTelaResumoDensidade05.setText(Html.fromHtml("Volume (V) = "));
        tvTelaResumoDensidade06.setText(Html.fromHtml("<p><b>Massa específica</b>: Relação entre o Volume ocupado apenas pela massa do corpo.</p>"));
        tvTelaResumoDensidade07.setText(Html.fromHtml("Massa específica (µ) = "));
        tvTelaResumoDensidade08.setText(Html.fromHtml("Massa do corpo (m) = "));
        tvTelaResumoDensidade09.setText(Html.fromHtml("Volume ocupado pela massa do corpo (V) ="));
        tvTelaResumoDensidade10.setText(Html.fromHtml("Para corpos maciços a densidade é igual a massa específica."));
    }

    private void configuraEditText()
    {
        densidade = (EditText) rootView.findViewById(R.id.et_tela_resumo_hidrostatica_densidade_01);
        massa = (EditText) rootView.findViewById(R.id.et_tela_resumo_hidrostatica_densidade_02);
        volume = (EditText) rootView.findViewById(R.id.et_tela_resumo_hidrostatica_densidade_03);

        massaEspecifica = (EditText) rootView.findViewById(R.id.et_tela_resumo_hidrostatica_densidade_04);
        massaCorpo = (EditText) rootView.findViewById(R.id.et_tela_resumo_hidrostatica_densidade_05);
        volumeOcupadoMassaCorpo = (EditText) rootView.findViewById(R.id.et_tela_resumo_hidrostatica_densidade_06);
    }

    //1
    private double densidade(double m, double v)
    {
        //d = m / v
        return m / v;
    }

    private double massa(double d, double v)
    {
        //v = d * v
        return d * v;
    }

    private double volume(double m, double d)
    {
        //v = m / d
        return m / d;
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
                    tvExtra1.setBackgroundResource(R.color.branco);
                    tvExtra1.setText("");
                    massa.setEnabled(true);
                    volume.setEnabled(true);
                }
                //calcula volume
                else if (!densidade.getText().toString().equals("") &&
                        !massa.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    volume.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(volume(
                            Double.parseDouble(massa.getText().toString()),
                            Double.parseDouble(densidade.getText().toString())
                    ) + " m<sup>3</sup>"));
                }
                //calcula massa
                else if (!densidade.getText().toString().equals("") &&
                        !volume.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    massa.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(massa(
                            Double.parseDouble(densidade.getText().toString()),
                            Double.parseDouble(volume.getText().toString())
                    ) + " Kg"));
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
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (massa.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.color.branco);
                    tvExtra1.setText("");
                    densidade.setEnabled(true);
                    volume.setEnabled(true);
                }
                //calcula volume
                else if (!densidade.getText().toString().equals("") &&
                        !massa.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    volume.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(volume(
                            Double.parseDouble(massa.getText().toString()),
                            Double.parseDouble(densidade.getText().toString())
                    ) + " m<sup>3</sup>"));
                }
                //calcula massa
                else if (!massa.getText().toString().equals("") &&
                        !volume.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    densidade.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(densidade(
                            Double.parseDouble(massa.getText().toString()),
                            Double.parseDouble(volume.getText().toString())
                    ) + " Kg"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void volumePressed()
    {
        volume.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (volume.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.color.branco);
                    tvExtra1.setText("");
                    densidade.setEnabled(true);
                    massa.setEnabled(true);
                }
                //calcula densidade
                else if (!volume.getText().toString().equals("") &&
                        !massa.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    densidade.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(densidade(
                            Double.parseDouble(massa.getText().toString()),
                            Double.parseDouble(volume.getText().toString())
                    ) + " Kg/m<sup>3</sup>"));
                }
                //calcula massa
                else if (!densidade.getText().toString().equals("") &&
                        !volume.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    massa.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(massa(
                            Double.parseDouble(densidade.getText().toString()),
                            Double.parseDouble(volume.getText().toString())
                    ) + " Kg"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    //2
    private double massaEspecifica(double m, double v)
    {
        //µ = m / v
        return m / v;
    }

    private double massaCorpo(double m, double v)
    {
        //m = m * v
        return m * v;
    }

    private double volumeOcpado(double m, double µ)
    {
        //v = m / µ
        return m / µ;
    }

    private void massaEspecificaPressed()
    {
        massaEspecifica.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (massaEspecifica.getText().toString().equals(""))
                {

                    tvExtra2.setBackgroundResource(R.color.branco);
                    tvExtra2.setText("");
                    massaCorpo.setEnabled(true);
                    volumeOcupadoMassaCorpo.setEnabled(true);
                }
                //calcula volume ocupado pela massa
                else if (!massaCorpo.getText().toString().equals("") &&
                        !massaEspecifica.getText().toString().equals(""))
                {
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    volumeOcupadoMassaCorpo.setEnabled(false);
                    tvExtra2.setText(Html.fromHtml(volumeOcpado(
                            Double.parseDouble(massaCorpo.getText().toString()),
                            Double.parseDouble(massaEspecifica.getText().toString())
                    ) + " m<sup>3</sup>"));
                }
                //calcula massa do corpo
                else if (!massaEspecifica.getText().toString().equals("") &&
                        !volumeOcupadoMassaCorpo.getText().toString().equals(""))
                {
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    massaCorpo.setEnabled(false);
                    tvExtra2.setText(Html.fromHtml(massaCorpo(
                            Double.parseDouble(massaEspecifica.getText().toString()),
                            Double.parseDouble(volumeOcupadoMassaCorpo.getText().toString())
                    ) + " Kg"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void massaCorpoPressed()
    {
        massaCorpo.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (massaCorpo.getText().toString().equals(""))
                {
                    tvExtra2.setText("");
                    tvExtra2.setBackgroundResource(R.color.branco);

                    massaEspecifica.setEnabled(true);
                    volumeOcupadoMassaCorpo.setEnabled(true);
                }
                //calcula volume ocupado pela massa
                else if (!massaCorpo.getText().toString().equals("") &&
                        !massaEspecifica.getText().toString().equals(""))
                {
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    volumeOcupadoMassaCorpo.setEnabled(false);
                    tvExtra2.setText(Html.fromHtml(volumeOcpado(
                            Double.parseDouble(massaCorpo.getText().toString()),
                            Double.parseDouble(massaEspecifica.getText().toString())
                    ) + " m<sup>3</sup>"));
                }
                //calcula massa especifica
                else if (!massaCorpo.getText().toString().equals("") &&
                        !volumeOcupadoMassaCorpo.getText().toString().equals(""))
                {
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    massaEspecifica.setEnabled(false);
                    tvExtra2.setText(Html.fromHtml(massaEspecifica(
                            Double.parseDouble(massaCorpo.getText().toString()),
                            Double.parseDouble(volumeOcupadoMassaCorpo.getText().toString())
                    ) + " Kg/m<sup>3</sup>"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void volumeOcupadoMassaCorpoPressed()
    {
        volumeOcupadoMassaCorpo.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (volumeOcupadoMassaCorpo.getText().toString().equals(""))
                {
                    tvExtra2.setText("");
                    tvExtra2.setBackgroundResource(R.color.branco);

                    massaEspecifica.setEnabled(true);
                    massaCorpo.setEnabled(true);
                }
                //calcula massa especifica
                else if (!massaCorpo.getText().toString().equals("") &&
                        !volumeOcupadoMassaCorpo.getText().toString().equals(""))
                {
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    massaEspecifica.setEnabled(false);
                    tvExtra2.setText(Html.fromHtml(massaEspecifica(
                            Double.parseDouble(massaCorpo.getText().toString()),
                            Double.parseDouble(volumeOcupadoMassaCorpo.getText().toString())
                    ) + " Kg/m<sup>3</sup>"));
                }
                //calcula massa do corpo
                else if (!massaCorpo.getText().toString().equals("") &&
                        !volumeOcupadoMassaCorpo.getText().toString().equals(""))
                {
                    tvExtra2.setBackgroundResource(R.drawable.degrade2);
                    tvExtra2.setGravity(Gravity.CENTER);
                    tvExtra2.setTextColor(getResources().getColor(R.color.branco));
                    massaEspecifica.setEnabled(false);
                    tvExtra2.setText(Html.fromHtml(massaEspecifica(
                            Double.parseDouble(massaCorpo.getText().toString()),
                            Double.parseDouble(volumeOcupadoMassaCorpo.getText().toString())
                    ) + " Kg/m<sup>3</sup>"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
