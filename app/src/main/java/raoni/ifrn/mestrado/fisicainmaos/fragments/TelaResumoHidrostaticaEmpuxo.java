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

public class TelaResumoHidrostaticaEmpuxo extends Fragment
{
    private View rootView;
    private TextView tvExtra1;

    private EditText empuxo;
    private EditText densidade;
    private EditText volume;
    private EditText gravidade;


    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        configuraTextView();
        configuraEditText();
        //1
        empuxoPressed();
        densidadePressed();
        volumePressed();
        gravidadePressed();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        rootView = inflater.inflate(R.layout.tela_resumo_hidrostatica_empuxo, container, false);
        return rootView;
    }

    private void configuraTextView()
    {
        TextView tvTelaResumopressao01 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrostatica_empuxo_01);
        TextView tvTelaResumopressao02 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrostatica_empuxo_02);
        TextView tvTelaResumopressao03 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrostatica_empuxo_03);
        TextView tvTelaResumopressao04 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrostatica_empuxo_04);
        TextView tvTelaResumopressao05 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrostatica_empuxo_05);

        TextView unidades01 = (TextView) rootView.findViewById(R.id.tv_unidades_0022);
        TextView unidades02 = (TextView) rootView.findViewById(R.id.tv_unidades_0023);
        TextView unidades03 = (TextView) rootView.findViewById(R.id.tv_unidades_0024);
        TextView unidades04 = (TextView) rootView.findViewById(R.id.tv_unidades_0025);

        unidades01.setText(Html.fromHtml("N"));
        unidades02.setText(Html.fromHtml("Kg/m<sup>3</sup>"));
        unidades03.setText(Html.fromHtml("m<sup>3</sup>"));
        unidades04.setText(Html.fromHtml("m/s<sup>2</sup>"));

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumopressao01.setTypeface(font);
        tvTelaResumopressao02.setTypeface(font);
        tvTelaResumopressao03.setTypeface(font);
        tvTelaResumopressao04.setTypeface(font);
        tvTelaResumopressao05.setTypeface(font);

        tvExtra1 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrostatica_7_extra_01);

        tvTelaResumopressao01.setText(Html.fromHtml(
                "<p>&ldquo;Um corpo imerso em um fluido em equilíbrio recebe deste, uma força vertical para cima de valor igual ao peso do fluido deslocado&rdquo;.</p>"));
        tvTelaResumopressao02.setText(Html.fromHtml("Empuxo (E) = "));
        tvTelaResumopressao03.setText(Html.fromHtml("Densidade do líquido (d<sub>liq</sub>) = "));
        tvTelaResumopressao04.setText(Html.fromHtml("Volume do líquido deslocado (v<sub>liq</sub>) = "));
        tvTelaResumopressao05.setText(Html.fromHtml("Gravidade (g) = "));
    }

    private void configuraEditText()
    {
        empuxo = (EditText) rootView.findViewById(R.id.et_tela_resumo_hidrostatica_empuxo_01);
        densidade = (EditText) rootView.findViewById(R.id.et_tela_resumo_hidrostatica_empuxo_02);
        volume = (EditText) rootView.findViewById(R.id.et_tela_resumo_hidrostatica_empuxo_03);
        gravidade = (EditText) rootView.findViewById(R.id.et_tela_resumo_hidrostatica_empuxo_04);
    }

    //1
    private double e(double d, double v, double g)
    {
        //e = d * v * g
        return d * v * g;
    }

    private double v(double e, double d, double g)
    {
        //v = e / (d * g)
        return e / (d * g);
    }

    private double d(double e, double v, double g)
    {
        //d = e / (v * g)
        return e / (v * g);
    }

    private void empuxoPressed()
    {
        empuxo.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (empuxo.getText().toString().equals(""))
                {
                    tvExtra1.setText("");
                    tvExtra1.setBackgroundResource(R.color.branco);
                    densidade.setEnabled(true);
                    volume.setEnabled(true);
                    gravidade.setEnabled(true);
                }
                //calcula v
                else if (!empuxo.getText().toString().equals("") &&
                        !densidade.getText().toString().equals("")&&
                        !gravidade.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    volume.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(v(
                            Double.parseDouble(empuxo.getText().toString()),
                            Double.parseDouble(densidade.getText().toString()),
                            Double.parseDouble(gravidade.getText().toString())
                    ) + " m<sup>3</sup>"));
                }
                //calcula d
                else if (!empuxo.getText().toString().equals("") &&
                        !volume.getText().toString().equals("")&&
                        !gravidade.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    densidade.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(d(
                            Double.parseDouble(empuxo.getText().toString()),
                            Double.parseDouble(volume.getText().toString()),
                            Double.parseDouble(gravidade.getText().toString())
                    ) + " Kg/m<sup>3<sup>"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void densidadePressed()
    {
        densidade.addTextChangedListener(new TextWatcher() {
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
                    empuxo.setEnabled(true);
                    volume.setEnabled(true);
                    gravidade.setEnabled(true);
                }
                //calcula v
                else if (!empuxo.getText().toString().equals("") &&
                        !densidade.getText().toString().equals("")&&
                        !gravidade.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    volume.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(v(
                            Double.parseDouble(empuxo.getText().toString()),
                            Double.parseDouble(densidade.getText().toString()),
                            Double.parseDouble(gravidade.getText().toString())
                    ) + " m<sup>3</sup>"));
                }
                //calcula e
                else if (!densidade.getText().toString().equals("") &&
                        !volume.getText().toString().equals("")&&
                        !gravidade.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    empuxo.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(e(
                            Double.parseDouble(densidade.getText().toString()),
                            Double.parseDouble(volume.getText().toString()),
                            Double.parseDouble(gravidade.getText().toString())
                    ) + " N"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void volumePressed()
    {
        volume.addTextChangedListener(new TextWatcher() {
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
                    empuxo.setEnabled(true);
                    densidade.setEnabled(true);
                    gravidade.setEnabled(true);
                }
                //calcula d
                else if (!empuxo.getText().toString().equals("") &&
                        !volume.getText().toString().equals("")&&
                        !gravidade.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    densidade.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(d(
                            Double.parseDouble(empuxo.getText().toString()),
                            Double.parseDouble(volume.getText().toString()),
                            Double.parseDouble(gravidade.getText().toString())
                    ) + " Kg/m<sup>3</sup>"));
                }
                //calcula e
                else if (!densidade.getText().toString().equals("") &&
                        !volume.getText().toString().equals("")&&
                        !gravidade.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    empuxo.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(e(
                            Double.parseDouble(densidade.getText().toString()),
                            Double.parseDouble(volume.getText().toString()),
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
        gravidade.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (gravidade.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.color.branco);
                    tvExtra1.setText("");
                    empuxo.setEnabled(true);
                    densidade.setEnabled(true);
                    volume.setEnabled(true);
                }
                //calcula d
                else if (!empuxo.getText().toString().equals("") &&
                        !volume.getText().toString().equals("")&&
                        !gravidade.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    densidade.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(d(
                            Double.parseDouble(empuxo.getText().toString()),
                            Double.parseDouble(volume.getText().toString()),
                            Double.parseDouble(gravidade.getText().toString())
                    ) + " Kg/m<sup>3</sup>"));
                }
                //calcula e
                else if (!densidade.getText().toString().equals("") &&
                        !volume.getText().toString().equals("")&&
                        !gravidade.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    empuxo.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(e(
                            Double.parseDouble(densidade.getText().toString()),
                            Double.parseDouble(volume.getText().toString()),
                            Double.parseDouble(gravidade.getText().toString())
                    ) + " N"));
                }
                //calcula v
                else if (!empuxo.getText().toString().equals("") &&
                        !densidade.getText().toString().equals("")&&
                        !gravidade.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    volume.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(v(
                            Double.parseDouble(empuxo.getText().toString()),
                            Double.parseDouble(densidade.getText().toString()),
                            Double.parseDouble(gravidade.getText().toString())
                    ) + " m<sup>3</sup>"));
                }
            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });
    }
}
