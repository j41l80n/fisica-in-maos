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

public class TelaResumoHidrodinamicaEquacaoTorricelli extends Fragment
{
    private View rootView;
    private TextView tvExtra1;

    private EditText velocidadePonto2;
    private EditText gravidade;
    private EditText altura;

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        configuraTextView();
        configuraEditText();
        gravidadePressed();
        alturaPressed();
        velocidadePonto2Pressed();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState)
    {
        rootView = inflater.inflate(R.layout.tela_resumo_hidrodinamica_equacao_torricelli, container, false);
        return rootView;
    }

    private void configuraTextView()
    {
        TextView tvTelaResumoEquacaoTorricelli01 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrodinamica_equacao_torricelli_01);
        TextView tvTelaResumoEquacaoTorricelli02 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrodinamica_equacao_torricelli_02);
        TextView tvTelaResumoEquacaoTorricelli03 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrodinamica_equacao_torricelli_03);
        TextView tvTelaResumoEquacaoTorricelli04 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrodinamica_equacao_torricelli_04);
        TextView tvTelaResumoEquacaoTorricelli05 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrodinamica_equacao_torricelli_05);

        TextView unidades01 = (TextView) rootView.findViewById(R.id.tv_unidades_0036);
        TextView unidades02 = (TextView) rootView.findViewById(R.id.tv_unidades_0037);
        TextView unidades03 = (TextView) rootView.findViewById(R.id.tv_unidades_0038);

        unidades01.setText(Html.fromHtml("m/s"));
        unidades02.setText(Html.fromHtml("m/s<sup>2</sup>"));
        unidades03.setText(Html.fromHtml("m"));

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/footlight_mt_light.ttf");
        tvTelaResumoEquacaoTorricelli01.setTypeface(font);
        tvTelaResumoEquacaoTorricelli02.setTypeface(font);
        tvTelaResumoEquacaoTorricelli03.setTypeface(font);
        tvTelaResumoEquacaoTorricelli04.setTypeface(font);
        tvTelaResumoEquacaoTorricelli05.setTypeface(font);

        tvExtra1 = (TextView) rootView.findViewById(R.id.tv_tela_resumo_hidrodinamica_05_extra_01);

        tvTelaResumoEquacaoTorricelli01.setText(Html.fromHtml(
                "<p>A velocidade de escoamento de um fluido só depende da altura: </p>"));
        tvTelaResumoEquacaoTorricelli02.setText(Html.fromHtml("Velocidade no ponto 2 (v<sub>2</sub>) = "));
        tvTelaResumoEquacaoTorricelli03.setText(Html.fromHtml("Gravidade (g) =  "));
        tvTelaResumoEquacaoTorricelli04.setText(Html.fromHtml("Altura (h) = "));
        tvTelaResumoEquacaoTorricelli05.setText(Html.fromHtml("<p>Como a área 1 é muito maior que a área 2, de acordo com a equação da continuidade,</p>" +
                "<p>A<sub>1</sub>.v<sub>1</sub> = A<sub>2</sub>.v<sub>2</sub>, a velocidade 1 tem que ser muito pequena, ao passo de a desconsiderarmos. </p>"));
    }

    private void configuraEditText()
    {
        velocidadePonto2 = (EditText) rootView.findViewById(R.id.et_tela_resumo_hidrodinamica_vazao_01);
        gravidade = (EditText) rootView.findViewById(R.id.et_tela_resumo_hidrodinamica_vazao_02);
        altura = (EditText) rootView.findViewById(R.id.et_tela_resumo_hidrodinamica_vazao_03);
    }

    //1
    private double v2(double g, double h)
    {
        //v2 = 2 * g * h
        return 2 * g * h;
    }

    private double v(double g, double h)
    {
        //v = √(2 * g * h)
        return Math.sqrt((2 * g * h));
    }

    private double altura(double v, double g)
    {
        //h = v2 / (2 * g)
        return Math.pow(v, 2) / (2 * g);
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
                    tvExtra1.setBackgroundResource(R.color.branco);
                    tvExtra1.setText("");
                    velocidadePonto2.setEnabled(true);
                    altura.setEnabled(true);
                }
                //calcula Velocidade
                else if (!gravidade.getText().toString().equals("") &&
                        !altura.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    velocidadePonto2.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(v(
                            Double.parseDouble(gravidade.getText().toString()),
                            Double.parseDouble(altura.getText().toString())
                    ) + " m/s"));
                }
                //calcula Altura
                else if (!velocidadePonto2.getText().toString().equals("") &&
                        !gravidade.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    altura.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(altura(
                            Double.parseDouble(velocidadePonto2.getText().toString()),
                            Double.parseDouble(gravidade.getText().toString())
                    ) + " m"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void alturaPressed()
    {
        altura.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (altura.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.color.branco);
                    tvExtra1.setText("");
                    velocidadePonto2.setEnabled(true);
                    gravidade.setEnabled(true);
                }
                //calcula Velocidade
                else if (!gravidade.getText().toString().equals("") &&
                        !altura.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    velocidadePonto2.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(v(
                            Double.parseDouble(gravidade.getText().toString()),
                            Double.parseDouble(altura.getText().toString())
                    ) + " m/s"));
                }
                //calcula altura
                else if (!velocidadePonto2.getText().toString().equals("") &&
                        !gravidade.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    altura.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(altura(
                            Double.parseDouble(velocidadePonto2.getText().toString()),
                            Double.parseDouble(gravidade.getText().toString())
                    ) + " m"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void velocidadePonto2Pressed()
    {
        velocidadePonto2.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (velocidadePonto2.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.color.branco);
                    tvExtra1.setText("");
                    altura.setEnabled(true);
                    gravidade.setEnabled(true);
                }
                //calcula altura
                else if (!velocidadePonto2.getText().toString().equals("") &&
                        !gravidade.getText().toString().equals(""))
                {
                    tvExtra1.setBackgroundResource(R.drawable.degrade2);
                    tvExtra1.setGravity(Gravity.CENTER);
                    tvExtra1.setTextColor(getResources().getColor(R.color.branco));
                    altura.setEnabled(false);
                    tvExtra1.setText(Html.fromHtml(altura(
                            Double.parseDouble(velocidadePonto2.getText().toString()),
                            Double.parseDouble(gravidade.getText().toString())
                    ) + " m"));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
