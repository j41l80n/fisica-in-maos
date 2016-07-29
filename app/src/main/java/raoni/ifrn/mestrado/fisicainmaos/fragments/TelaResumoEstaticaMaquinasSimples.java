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

public class TelaResumoEstaticaMaquinasSimples extends Fragment
{
    private View rootView;
    private TextView tvExtra1;

    private EditText m;
    private EditText f;
    private EditText d;

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        configuraTextView();
        configuraEditText();

        mPressed();
        fPressed();
        dPressed();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        rootView = inflater.inflate(R.layout.tela_resumo_estatica_maquinas_simples, container, false);
        return rootView;
    }

    private void configuraTextView()
    {
        TextView tvTelaResumoMaquinasSimples01 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_estatica_maquinas_simples_01);
        TextView tvTelaResumoMaquinasSimples02 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_estatica_maquinas_simples_02);
        TextView tvTelaResumoMaquinasSimples03 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_estatica_maquinas_simples_03);
        TextView tvTelaResumoMaquinasSimples04 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_estatica_maquinas_simples_04);
        TextView tvTelaResumoMaquinasSimples05 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_estatica_maquinas_simples_05);
        TextView tvTelaResumoMaquinasSimples06 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_estatica_maquinas_simples_06);
        TextView tvTelaResumoMaquinasSimples07 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_estatica_maquinas_simples_07);
        TextView tvTelaResumoMaquinasSimples08 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_estatica_maquinas_simples_08);

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumoMaquinasSimples01.setTypeface(font);
        tvTelaResumoMaquinasSimples02.setTypeface(font);
        tvTelaResumoMaquinasSimples03.setTypeface(font);
        tvTelaResumoMaquinasSimples04.setTypeface(font);
        tvTelaResumoMaquinasSimples05.setTypeface(font);
        tvTelaResumoMaquinasSimples06.setTypeface(font);
        tvTelaResumoMaquinasSimples07.setTypeface(font);
        tvTelaResumoMaquinasSimples08.setTypeface(font);

        tvExtra1 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_estatica_3_extra_01);

        tvTelaResumoMaquinasSimples01.setText(Html.fromHtml(
                "<p>Torque ou momento: É uma ação que se exerce em um corpo no sentido de provocar-lhe " +
                "uma torção em torno de um eixo. A facilidade de torcer um corpo pode ser aumentada quando utilizamos um braço de força. Quanto maior a distância do ponto de rotação ao ponto onde " +
                "aplicamos a força, maior será o torque aplicado.</p>"));
        tvTelaResumoMaquinasSimples02.setText(Html.fromHtml("<p>Grandeza vetorial </p>" +
                "<p>Unidade: N.m </p>"));
        tvTelaResumoMaquinasSimples03.setText(Html.fromHtml("M = "));
        tvTelaResumoMaquinasSimples04.setText(Html.fromHtml("F = "));
        tvTelaResumoMaquinasSimples05.setText(Html.fromHtml("D = "));
        tvTelaResumoMaquinasSimples06.setText(Html.fromHtml("<p>F<sub>y</sub> = F.sen&theta;</p>" +
                "<p>Se a força F aplicada para provocar o torque for inclinada, pode-se calcular o momento dessa forma:</p>"));
        tvTelaResumoMaquinasSimples07.setText(Html.fromHtml("<p>Binário</p>" +
                "<p>istema formado por duas forças de mesma intensidade, mesma direção e sentidos opostos.</p>"));
        tvTelaResumoMaquinasSimples08.setText(Html.fromHtml("<p>O momento de um binário é igual a 0.</p>"));

    }

    private void configuraEditText()
    {
        m = (EditText) rootView.findViewById(R.id.et_tela_resumo_estatica_maquinas_simples_01);
        f = (EditText) rootView.findViewById(R.id.et_tela_resumo_estatica_maquinas_simples_02);
        d = (EditText) rootView.findViewById(R.id.et_tela_resumo_estatica_maquinas_simples_03);
    }

    //1
    private double m(double f, double d)
    {
        //m = f * d
        return f * d;
    }

    private double f(double m, double d)
    {
        //f = m / d
        return m / d;
    }

    private double d(double m, double f)
    {
        //d = m / f
        return m / f;
    }

    private void mPressed()
    {
        m.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (m.getText().toString().equals(""))
                {
                    tvExtra1.setText("");
                    tvExtra1.setBackgroundResource(R.color.branco);
                    f.setEnabled(true);
                    d.setEnabled(true);
                }
                //calcula Deslocamento
                else if (!m.getText().toString().equals("") &&
                        !f.getText().toString().equals(""))
                {
                    d.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setText(Html.fromHtml(d(
                            Double.parseDouble(m.getText().toString()),
                            Double.parseDouble(f.getText().toString())
                    ) + " m"));
                }
                //calcula Forca (f)
                else if (!m.getText().toString().equals("") &&
                        !d.getText().toString().equals(""))
                {
                    f.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setText(Html.fromHtml(f(
                            Double.parseDouble(m.getText().toString()),
                            Double.parseDouble(d.getText().toString())
                    ) + " N"));
                }
            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });
    }

    private void fPressed()
    {
        f.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (f.getText().toString().equals(""))
                {
                    tvExtra1.setText("");
                    tvExtra1.setBackgroundResource(R.color.branco);
                    m.setEnabled(true);
                    d.setEnabled(true);
                }
                //calcula Deslocamento
                else if (!m.getText().toString().equals("") &&
                        !f.getText().toString().equals(""))
                {
                    d.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setText(Html.fromHtml(d(
                            Double.parseDouble(m.getText().toString()),
                            Double.parseDouble(f.getText().toString())
                    ) + " m"));
                }
                //calcula m
                else if (!d.getText().toString().equals("") &&
                         !f.getText().toString().equals(""))
                {
                    m.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setText(Html.fromHtml(m(
                            Double.parseDouble(f.getText().toString()),
                            Double.parseDouble(d.getText().toString())
                    ) + " N.m"));
                }
            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });
    }

    private void dPressed()
    {
        d.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (d.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.color.branco);
                    tvExtra1.setText("");
                    f.setEnabled(true);
                    m.setEnabled(true);
                }
                //calcula Forca (f)
                else if (!m.getText().toString().equals("") &&
                        !d.getText().toString().equals(""))
                {
                    f.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setText(Html.fromHtml(f(
                            Double.parseDouble(m.getText().toString()),
                            Double.parseDouble(d.getText().toString())
                    ) + " N"));
                }
                //calcula m
                else if (!f.getText().toString().equals("") &&
                        !d.getText().toString().equals(""))
                {
                    m.setEnabled(false);
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    tvExtra1.setText(Html.fromHtml(m(
                            Double.parseDouble(f.getText().toString()),
                            Double.parseDouble(d.getText().toString())
                    ) + " N.m"));
                }
            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });
    }
}
