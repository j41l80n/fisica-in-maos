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

public class TelaResumoCinematicaLancamentoObliquuo extends Fragment
{
    private View rootView;
    private TextView tvExtra01;
    private TextView tvExtra02;
    //1
    private EditText v0y;
    private EditText v0;
    private EditText senT;
    //2
    private EditText v0x;
    private EditText v02;
    private EditText cosT;

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        configuraTextView();
        configuraEditText();
        //1
        v0yPressed();
        v0Pressed();
        senTPressed();
        //2
        v0xPressed();
        v02Pressed();
        cosTPressed();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        rootView = inflater.inflate(R.layout.tela_resumo_cinematica_lancamento_obliquo, container, false);
        return rootView;
    }

    private void configuraTextView()
    {
        TextView tvTelaResumoCinematica1301 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_13_01);
        TextView tvTelaResumoCinematica1302 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_13_02);
        TextView tvTelaResumoCinematica1303 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_13_03);
        TextView tvTelaResumoCinematica1304 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_13_04);
        TextView tvTelaResumoCinematica1305 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_13_05);
        TextView tvTelaResumoCinematica1306 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_13_06);
        TextView tvTelaResumoCinematica1307 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_13_07);
        TextView tvTelaResumoCinematica1308 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_13_08);
        TextView tvTelaResumoCinematica1309 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_13_09);

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumoCinematica1301.setTypeface(font);
        tvTelaResumoCinematica1302.setTypeface(font);
        tvTelaResumoCinematica1303.setTypeface(font);
        tvTelaResumoCinematica1304.setTypeface(font);
        tvTelaResumoCinematica1305.setTypeface(font);
        tvTelaResumoCinematica1306.setTypeface(font);
        tvTelaResumoCinematica1307.setTypeface(font);
        tvTelaResumoCinematica1308.setTypeface(font);
        tvTelaResumoCinematica1309.setTypeface(font);

        tvExtra01 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_13_extra_01);
        tvExtra02 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_cinematica_13_extra_02);

        tvTelaResumoCinematica1301.setText(Html.fromHtml("<p>Dois movimento simultâneos e " +
                "independentes, um de lançamento vertical para cima e outro de M.R.U para frente." +
                " A trajetória descrita no movimento é uma parábola com concavidade para baixo.</p>" +
                "<p>Usa-se as mesmas equações de M.R.U e de lançamento vertical</p>" +
                "<p>Para um maior alcance deve-se usar um ângulo de 45°, e nesse caso o " +
                "alcance é 4x maior que a altura máxima alcançada.</p>"));
        tvTelaResumoCinematica1302.setText(Html.fromHtml("<p>Quanto maior a altura alcançada " +
                "maior o tempo de permanência do objeto no ar.</p>" +
                "<p>Velocidade inicial vertical: </p>"));
        tvTelaResumoCinematica1303.setText(Html.fromHtml("<p>V0y</p>"));
        tvTelaResumoCinematica1304.setText(Html.fromHtml("<p>V0</p>"));
        tvTelaResumoCinematica1305.setText(Html.fromHtml("<p>Senϴ</p>"));
        tvTelaResumoCinematica1306.setText(Html.fromHtml("<p>Velocidade horizontal: </p>"));
        tvTelaResumoCinematica1307.setText(Html.fromHtml("<p>V0x</p>"));
        tvTelaResumoCinematica1308.setText(Html.fromHtml("<p>V0</p>"));
        tvTelaResumoCinematica1309.setText(Html.fromHtml("<p>Cosϴ</p>"));
    }

    private void configuraEditText()
    {
        v0y = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_13_01);
        v0 = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_13_02);
        senT = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_13_03);

        v0x = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_13_04);
        v02 = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_13_05);
        cosT = (EditText) rootView.findViewById(R.id.et_tela_resumo_cinematica_13_06);
    }

    //1
    private double v0y(double v0, double senT)
    {
        //v0y = senT * v0
        return senT * v0;
    }

    private double v0(double v, double senT)
    {
        //v0 =
        return v / senT;
    }

    private void v0yPressed()
    {
        v0y.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (v0y.getText().toString().equals(""))
                {
                    tvExtra01.setBackgroundResource(R.color.branco);
                    tvExtra01.setText("");
                    v0.setEnabled(true);
                    senT.setEnabled(true);
                }
                //v0
                else if (!v0y.getText().toString().equals("") &&
                        !senT.getText().toString().equals("")) {
                    v0.setEnabled(false);
                    tvExtra01.setGravity(Gravity.CENTER);
                    tvExtra01.setBackgroundResource(R.drawable.degrade2);
                    tvExtra01.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra01.setText(v0(
                            Double.parseDouble(v0y.getText().toString()),
                            Double.parseDouble(senT.getText().toString())) + " m/s");
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void v0Pressed()
    {
        v0.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (v0.getText().toString().equals(""))
                {
                    tvExtra01.setBackgroundResource(R.color.branco);
                    tvExtra01.setText("");
                    v0y.setEnabled(true);
                    senT.setEnabled(true);
                }
                //v0y
                else if (!v0.getText().toString().equals("") &&
                        !senT.getText().toString().equals(""))
                {
                    v0y.setEnabled(false);
                    tvExtra01.setGravity(Gravity.CENTER);
                    tvExtra01.setBackgroundResource(R.drawable.degrade2);
                    tvExtra01.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra01.setText(v0y(
                            Double.parseDouble(v0.getText().toString()),
                            Double.parseDouble(senT.getText().toString())) + " m/s");
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void senTPressed()
    {
        senT.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (senT.getText().toString().equals(""))
                {
                    tvExtra01.setBackgroundResource(R.color.branco);
                    tvExtra01.setText("");
                    v0y.setEnabled(true);
                    v0.setEnabled(true);
                }
                //v0
                else if (!v0.getText().toString().equals("") &&
                        !senT.getText().toString().equals("")) {
                    v0y.setEnabled(false);
                    tvExtra01.setGravity(Gravity.CENTER);
                    tvExtra01.setBackgroundResource(R.drawable.degrade2);
                    tvExtra01.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra01.setText(Html.fromHtml(v0y(
                            Double.parseDouble(v0.getText().toString()),
                            Double.parseDouble(senT.getText().toString())) + " m/s"));
                }
                //v0y
                else if (!v0y.getText().toString().equals("") &&
                        !senT.getText().toString().equals("")) {
                    v0.setEnabled(false);
                    tvExtra01.setGravity(Gravity.CENTER);
                    tvExtra01.setBackgroundResource(R.drawable.degrade2);
                    tvExtra01.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra01.setText(Html.fromHtml(v0(
                            Double.parseDouble(v0y.getText().toString()),
                            Double.parseDouble(senT.getText().toString())) + " m/s"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    //2
    private double v0x(double v0, double cosT)
    {
        //v0x = v0 * cosT
        return v0 * cosT;
    }

    private double v02(double v0x, double cosT)
    {
        //v0x = v0 * cosT
        return v0x / cosT;
    }

    private void v0xPressed()
    {
        v0x.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (v0x.getText().toString().equals(""))
                {
                    tvExtra02.setBackgroundResource(R.color.branco);
                    tvExtra02.setText("");
                    v02.setEnabled(true);
                    cosT.setEnabled(true);
                }
                //v02
                else if (!v0x.getText().toString().equals("") &&
                        !cosT.getText().toString().equals("")) {
                    v02.setEnabled(false);
                    tvExtra02.setGravity(Gravity.CENTER);
                    tvExtra02.setBackgroundResource(R.drawable.degrade2);
                    tvExtra02.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra02.setText(v02(
                            Double.parseDouble(v0x.getText().toString()),
                            Double.parseDouble(cosT.getText().toString())) + " m/s");
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void v02Pressed()
    {
        v02.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (v02.getText().toString().equals(""))
                {
                    tvExtra02.setBackgroundResource(R.color.branco);
                    tvExtra02.setText("");
                    v0x.setEnabled(true);
                    cosT.setEnabled(true);
                }
                //v0x
                else if (!v02.getText().toString().equals("") &&
                        !cosT.getText().toString().equals("")) {
                    v0x.setEnabled(false);
                    tvExtra02.setGravity(Gravity.CENTER);
                    tvExtra02.setBackgroundResource(R.drawable.degrade2);
                    tvExtra02.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra02.setText(v0x(
                            Double.parseDouble(v02.getText().toString()),
                            Double.parseDouble(cosT.getText().toString())) + " m/s");
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void cosTPressed()
    {
        cosT.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (cosT.getText().toString().equals(""))
                {
                    tvExtra02.setBackgroundResource(R.color.branco);
                    tvExtra02.setText("");
                    v0x.setEnabled(true);
                    v02.setEnabled(true);
                }
                //v0x
                else if (!v02.getText().toString().equals("") &&
                        !cosT.getText().toString().equals("")) {
                    v0x.setEnabled(false);
                    tvExtra02.setGravity(Gravity.CENTER);
                    tvExtra02.setBackgroundResource(R.drawable.degrade2);
                    tvExtra02.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra02.setText(v0x(
                            Double.parseDouble(v02.getText().toString()),
                            Double.parseDouble(cosT.getText().toString())) + " m/s");
                }
                //v02
                else if (!v0x.getText().toString().equals("") &&
                        !cosT.getText().toString().equals("")) {
                    v02.setEnabled(false);
                    tvExtra02.setGravity(Gravity.CENTER);
                    tvExtra02.setBackgroundResource(R.drawable.degrade2);
                    tvExtra02.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra02.setText(v02(
                            Double.parseDouble(v0x.getText().toString()),
                            Double.parseDouble(cosT.getText().toString())) + " m/s");
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}