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

public class BiografiaStevenActivity extends FragmentActivity
{
    public void onCreate(Bundle savedInstanceState)
    {
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_biografia_steven);

        setup();
    }

    private void setup()
    {
        //
        setupTextViews();
    }

    private void setupTextViews()
    {
        TextView telaBiografiaStevenTv01 = (TextView) findViewById(R.id.tela_biografia_steven_tv_01);
        TextView telaBiografiaStevenTv02 = (TextView) findViewById(R.id.tela_biografia_steven_tv_02);
        TextView telaBiografiaStevenTv03 = (TextView) findViewById(R.id.tela_biografia_steven_tv_03);
        TextView telaBiografiaStevenTv04 = (TextView) findViewById(R.id.tela_biografia_steven_tv_04);
        TextView telaBiografiaStevenTv05 = (TextView) findViewById(R.id.tela_biografia_steven_tv_05);

        Typeface font = Typeface.createFromAsset(getApplicationContext().getAssets(), "fonts/footlight_mt_light.ttf");
        telaBiografiaStevenTv01.setTypeface(font);
        telaBiografiaStevenTv02.setTypeface(font);
        telaBiografiaStevenTv03.setTypeface(font);
        telaBiografiaStevenTv04.setTypeface(font);
        telaBiografiaStevenTv05.setTypeface(font);

        telaBiografiaStevenTv01.setText(Html.fromHtml("<p>\tSimon Stevin nasceu em Burges (1548), " +
                "Flandres (agora Bélgica). Pouca coisa foi registrada de sua vida, inclusive o dia " +
                "de seu nascimento é desconhecido.</p>" +
                "<p>\tFilho adotivo de ricos cidadãos flamengos, iniciou sua vida profissional como " +
                "coletor de impostos. Após seus vinte anos de idade viajou por alguns países: " +
                "Noruega, Polônia, Prússia. Na volta estabeleceu-se na atual Holanda.  Por ser " +
                "amigo intimo do príncipe Maurício de Nassau da Holanda serviu como consultor em" +
                " questões de engenharia militar e engenharia civil, e mais tarde se tornou um" +
                " oficial público.</p>" +
                "<p>\tNa tentativa de impedir a movimentação de tropas inimigas, inventou sistemas para" +
                " inundar regiões baixas, com a movimentação de comportas em diques. Como " +
                "engenheiro, supervisionou a construção de vias navegáveis, de estradas e de " +
                "outras obras públicas. Atuou, ainda, como chefe do setor de intendência do" +
                " exército.</p>" +
                "<p>\tStevin, além de apresentar diversos trabalhos na área de engenharia, astronomia " +
                "e física, na matemática apresentou regras para cálculos de juros simples e" +
                " compostos, apresenta exemplos e fornece tabelas. Os trabalhos de Stevin foram " +
                "utilizados por vários banqueiros da Europa.</p>" +
                "<p>\tNo domínio da física estudou os campos da estática, dando continuação aos " +
                "trabalhos de Arquimedes (centro de gravidade dos corpos, teorema dos planos " +
                "inclinados e a teoria da alavanca) e da hidrostática. Experimentalmente, mostrou" +
                " que a pressão que um fluído exerce na base do recipiente depende exclusivamente" +
                " da sua altura (Teorema de Stevin), explicando assim o conhecido paradoxo " +
                "hidrostático, que previa que a pressão exercida por uma coluna de água, no" +
                " fundo de um recipiente, dependia do volume de água. Deu início ao estudo de " +
                "hidrostática, quando por influência das teorias de Da Vince, estudou o " +
                "comportamento hidrostático das pressões, divulgando o princípio do paralelogramo " +
                "para a adição das forças.</p>"));

        telaBiografiaStevenTv02.setText(Html.fromHtml("<p>\tStevin foi o primeiro a constatar, " +
                "experimentalmente, que dois corpos de massas diferentes, ao serem abandonados ao " +
                "mesmo tempo, chegam ao solo simultaneamente. Embora costume-se atribuir essa " +
                "experiência a Galileu, ele apenas a analisou melhor.</p>" +
                "<p>\tNa matemática introduziu o uso de números inteiros, frações decimais e números " +
                "irracionais e aceitou o uso de números negativos, reduzindo e simplificando as " +
                "regras de resoluções de equações. Unifica as equações quadráticas e apresenta " +
                "métodos para obter soluções para equações de qualquer grau. Propôs também o " +
                "sistema decimal de pesos e medidas.</p>" +
                "<p>\tStevin trabalhou também em diversas outras áreas do conhecimento:</p>" +
                "&bull; Verificou que os polos Norte geográfico e Sul magnético não coincidiam, " +
                "sendo assim, calculou essa declinação magnética em diversos locais."));

        telaBiografiaStevenTv03.setText(Html.fromHtml("&bull; Através da geometria, demonstrou que era " +
                "impossível o funcionamento de um motor-perpétuo (dispositivo mecânico, que após " +
                "um impulso inicial, se acreditava poder trabalhar infinitamente sem requerer " +
                "energia)."));

        telaBiografiaStevenTv04.setText(Html.fromHtml("&bull; Um de seus inventos mais curiosos é um " +
                "veículo que se movia na praia, movido pelo vento, feito para deslocar até 26 " +
                "pessoas. Hoje em dia foi desenvolvido algo parecido, porém para apenas uma pessoa."));

        telaBiografiaStevenTv05.setText(Html.fromHtml("<p>\tStevin faleceu no ano de 1620, porém " +
                "dia e local (Haia ou Leiden) da sua morte são desconhecidos.</p>" +
                "<p>\t<b>Curiosidade: </b></p>" +
                "&bull; Muito pouco se sabe sobre a vida particular de Stevin\n" +
                "" +
                "\n&bull; Casou-se consideravelmente tarde, com 64 anos de idade, e deixou quatro " +
                "filhos."));
    }
}