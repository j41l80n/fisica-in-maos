package raoni.ifrn.mestrado.fisicainmaos.activities;

import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.Html;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import raoni.ifrn.mestrado.fisicainmaos.R;

public class BiografiaBernoulliActivity extends FragmentActivity
{
    public void onCreate(Bundle savedInstanceState)
    {
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_biografia_bernoulli);

        setup();
    }

    private void setup()
    {
        //
        setupTextViews();
    }

    private void setupTextViews()
    {
        TextView telaBiografiaBernoulliTv01 = (TextView) findViewById(R.id.tela_biografia_bernoulli_tv_01);
        TextView telaBiografiaBernoulliTv02 = (TextView) findViewById(R.id.tela_biografia_bernoulli_tv_02);
        TextView telaBiografiaBernoulliTv03 = (TextView) findViewById(R.id.tela_biografia_bernoulli_tv_03);

        Typeface font = Typeface.createFromAsset(getApplicationContext().getAssets(), "fonts/footlight_mt_light.ttf");
        telaBiografiaBernoulliTv01.setTypeface(font);
        telaBiografiaBernoulliTv02.setTypeface(font);
        telaBiografiaBernoulliTv03.setTypeface(font);

        telaBiografiaBernoulliTv01.setText(Html.fromHtml("<p>\tDaniel Bernoulli nasceu em 8 de " +
                "fevereiro de 1700, em Gröningen (Holanda).</p>" +
                "<p>Filho de um famoso professor de matemática e física, Johann Bernoulli (1667-1748), " +
                "herdou os talentos familiares, de matemáticos, físicos e filósofos, seguindo a " +
                "carreira de Físico e Matemático. Ficou mais conhecido por seus trabalhos " +
                "relacionados a mecânica dos fluidos, probabilidade e estatística, sendo o primeiro" +
                " a estudar as interações moleculares na pressão atmosférica. No estudo dos" +
                " fluidos ficou famoso por um princípio fundamental da hidrodinâmica (termo " +
                "esse criado pelo próprio), o “Princípio de Bernoulli” para fluidos em movimento. " +
                "Juntamente com seu pai publicou um trabalho sobre o movimento orbital dos " +
                "planetas. Eram membros de sua família os matemáticos Jacob Bernoulli I " +
                "(1654-1705 - Tio), Nicolaus II (1695-1726 - Irmão) e Johann Bernoulli II " +
                "(1710-1790 - Irmão). Daniel representava a quarta geração dos criadores da " +
                "Física-Matemática.</p>" +
                "<p>\tAos 21 anos Daniel já era formado em medicina e como tese de doutorado, " +
                "aplicou a matemática à ação dos pulmões. Provando o que já se esperava não " +
                "atuou como médico e partiu para a matemática. Em 1726 lecionou matemática e foi" +
                " membro da Academia de São Petersburgo e após deixar a Rússia, em 1733, atuou " +
                "como professor em Basiléia. Foi eleito para Académie des Sciences de Paris, onde" +
                " ganhou dez prêmios, o primeiro deles aos 24 anos de idade, quando apresentou um" +
                " instrumento para medição do tempo no mar. Embora na física seja lembrado pela sua " +
                "equação da hidrodinâmica, em seu livro Hydrodynamica (1738) não se encontra em " +
                "nenhuma parte explicitamente o que conhecemos pela equação de Bernoulli. Neste " +
                "livro apresentou algumas novidades como a teoria cinética dos gases, o uso dos " +
                "manômetros e a propulsão a jato. Embora apresente um estudo sobre o princípio de " +
                "energia de Leibniz, onde relaciona as parcelas de energia cinética e potencial." +
                " Além disso, também fez sucesso com alguns problemas e teorias, no campo das " +
                "probabilidades. </p>"));

        telaBiografiaBernoulliTv02.setText(Html.fromHtml("<p>\tNa realidade, a equação de Bernoulli, " +
                "como nós conhecemos, só veio a ser descrita por Leonard Euler (1707-1783), um " +
                "extraordinário matemático suíço e amigo de Daniel, vista em seus trabalhos sobre" +
                " equações de aceleração para fluxos em condições estacionárias sob a ação da " +
                "gravidade. Leonard também recebeu créditos por várias equações da hidráulica e " +
                "por projetar uma turbina hidráulica</p>"));

        telaBiografiaBernoulliTv03.setText(Html.fromHtml("<p>\tBernoulli foi um solteirão convicto, não" +
                " deixou filhos, e morreu na Basileia em 17 de março de 1782, Suíça.</p>" +
                "<p>\tA família Bernoulli causou tanto impacto nas ciências e na matemática, que pelo " +
                "menos cinco leis, princípios ou equações levam o nome Bernoulli.</p>"));
    }
}