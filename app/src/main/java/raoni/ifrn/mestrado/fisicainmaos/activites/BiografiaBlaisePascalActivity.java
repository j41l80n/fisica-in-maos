package raoni.ifrn.mestrado.fisicainmaos.activites;

import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.Html;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import raoni.ifrn.mestrado.fisicainmaos.R;

public class BiografiaBlaisePascalActivity extends FragmentActivity
{
    public void onCreate(Bundle savedInstanceState)
    {
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_biografia_blaise_pascal);

        setup();
    }

    private void setup()
    {
        //
        setupTextViews();
    }

    private void setupTextViews()
    {
        TextView telaBiografiaBlaisePascalTv01 = (TextView) findViewById(R.id.tela_biografia_blaise_pascal_tv_01);
        TextView telaBiografiaBlaisePascalTv02 = (TextView) findViewById(R.id.tela_biografia_blaise_pascal_tv_02);
        TextView telaBiografiaBlaisePascalTv03 = (TextView) findViewById(R.id.tela_biografia_blaise_pascal_tv_03);
        TextView telaBiografiaBlaisePascalTv04 = (TextView) findViewById(R.id.tela_biografia_blaise_pascal_tv_04);

        Typeface font = Typeface.createFromAsset(getApplicationContext().getAssets(), "fonts/footlight_mt_light.ttf");
        telaBiografiaBlaisePascalTv01.setTypeface(font);
        telaBiografiaBlaisePascalTv02.setTypeface(font);
        telaBiografiaBlaisePascalTv03.setTypeface(font);
        telaBiografiaBlaisePascalTv04.setTypeface(font);

        telaBiografiaBlaisePascalTv01.setText(Html.fromHtml("<p>\tBlaise Pascal, nasceu no dia 19 de " +
                "Junho de 1623, em Clermont-Ferrand (França), filho de Étienne Pascal e Antoniette" +
                " Bejon. Sua família tinha uma situação financeira estável, pois seu pai era um" +
                " mercador rico que fazia parte da nobreza. Com apenas 3 anos de idade Pascal" +
                " perdeu sua mãe, em 1626. O pai passou a cuidar do filho sozinho e para ajudar na " +
                "sua educação contratou professores para ensiná-lo em casa. Aos 11 anos escreveu" +
                " um tratado sobre os sons, baseado nas suas experiências. Com 12 anos chegou " +
                "sozinho à dedução de 32 proposições de geometria estabelecidas por Euclides." +
                " Publicou Essay pour les coniques (1640), contendo o célebre teorema de Pascal." +
                " Inventou o carrinho de mão e a cadeira de rodas. Em 1639, após seu pai ser" +
                " nomeado arrecadador de impostos da Alta Normandia decide ajudar seu pai, " +
                "facilitando seu trabalho. Blaise inventou uma calculadora mecânica chamada “La" +
                " pascaline” a primeira conhecida, quando tinha 19 anos de idade. Ele pretendia " +
                "que a máquina executasse as quatro operações básicas, porém só conseguiu " +
                "implementar a adição e subtração.<p>"));

        telaBiografiaBlaisePascalTv02.setText(Html.fromHtml("<p>\tSua trajetória na ciência se deu, em " +
                "boa parte, nos estudos do cálculo e das ciências. Na física estudou a mecânica " +
                "dos fluidos e ampliou a teoria de Torricelli sobre a pressão atmosférica e o " +
                "vácuo. Assim como tinham feito Galileu e Torricelli, refutou o conceito de" +
                " \"horror ao vazio\". Acreditava firmemente no uso de experimentos, ao invés " +
                "de apenas conceitos abstratos. Desenvolveu então diversas pesquisas utilizando" +
                " sifões, seringas e tubos de vários formatos, com diversos líquidos diferentes," +
                " com e sem o vácuo. Em suas experiências mostrou que o líquido sobe em um " +
                "barômetro devido à pressão do ar, e não por causa da tração do vácuo no topo do" +
                " tubo. Por volta de 1648, ele já havia estabelecido o Princípio de Pascal: “Um" +
                " fluido em repouso ou equilíbrio num recipiente transmite uma variação de " +
                "pressão igualmente e sem perdas em todos os pontos e direções, atuando em ângulos" +
                " retos nas superfícies com que têm contato.” Esse é o princípio de funcionamento" +
                " do macaco hidráulico. Devido seus trabalhos de grande importância foi" +
                " homenageado com a unidade de pressão, Pascal (Pa).</p>"));

        telaBiografiaBlaisePascalTv03.setText(Html.fromHtml("<p>\tDurante sua educação em casa, seu Pai " +
                "lhe ensina apenas História, Geografia e Filosofia, sempre utilizando jogos " +
                "didáticos. Seu Pai evitou que ele estudasse matemática quando ainda fosse novo," +
                " porém as proibições aos livros de matemática gerarão muita curiosidade e " +
                "instigarão seus estudos escondidos. Pascal criou na matemática a “Geometria " +
                "Projetiva” e realizou estudos sobre o cálculo infinitesimal. Ao lado do advogado " +
                "e matemático francês Pierre de Fermat (1601-1665), contribuiu decisivamente para " +
                "a criação de e da “Teoria das probabilidades”. Os resultados desses estudos são" +
                " aplicados em várias operações, de tabelas de mortalidade para seguros à" +
                " decomposição de partículas subatômicas. Desenvolveu também o conhecido " +
                "“ Triângulo de Pascal”, que se resumo a uma simples, porém importante, combinação " +
                "numérica, onde cada número é a soma dos dois números que o precedem acima." +
                " Fornecendo os coeficientes da expansão binominal, que é uma combinação usada " +
                "em probabilidade em outras séries numéricas.</p>"));

        telaBiografiaBlaisePascalTv04.setText(Html.fromHtml("<p>\tDurante toda a vida, Pascal sempre se " +
                "interessou pela vida religiosa. Aos 32 anos sofreu um acidente de carruagem, " +
                "quando o veículo ficou pendurado em um ponte, após os cavalos terem saído em " +
                "disparada. Após esse acidente, Pascal mudou a direção da sua vida e passou a se" +
                " dedicar quase que exclusivamente a assuntos religiosos.  O seu conjunto de " +
                "cartas Lettres Provinciales (Cartas Provinciais, de 1656), um conjunto de 18 " +
                "cartas escritas para defender um amigo Jansenista que estava em julgamento pelos " +
                "teólogos de paris, marcou o começo da era da prosa francesa moderna.</p>" +

                "<p>\tNa filosofia sua obra mais famosa é Pensamentos, que são pensamentos pessoais sobre" +
                " o sofrimento a fé e o humano, escritos em 1658, com o intuito de defender o " +
                "cristianismo. Ele escrevia com consciência sobre a dor porque constantemente " +
                "sofria com enxaquecas e úlceras estomacais. Essa obra ficou inacabada, e há" +
                " ainda hoje discussões filosóficas para tentar organizá-la.</p>" +

                "<p>\tUma de suas últimas grandes realizações foi a tentativa de inauguração de uma" +
                " linha de ônibus que deslocaria passageiros dentro de paris em um carro com" +
                " muitos assentos.</p>" +

                "<p>\tPascal morreu com 39 anos de idade, um ano após a morte de sua irmã, quando" +
                " começou a piorar sua saúde e sua condição emocional, provavelmente devido a um " +
                "tumor maligno no estômago e sérios danos no cérebro. Deixou sua marca em vários " +
                "campos, apesar de sua vida curta, incluindo a física, matemática, geometria, " +
                "filosofia e literatura cristã.</p>"));
    }
}
