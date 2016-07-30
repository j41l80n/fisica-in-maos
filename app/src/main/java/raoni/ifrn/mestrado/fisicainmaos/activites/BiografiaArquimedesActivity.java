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

public class BiografiaArquimedesActivity extends FragmentActivity
{
    public void onCreate(Bundle savedInstanceState)
    {
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_biografia_arquimedes);

        setup();
    }

    private void setup()
    {
        //
        setupTextViews();
    }

    private void setupTextViews()
    {
        TextView telaBiografiaArquimedesTv01 = (TextView) findViewById(R.id.tela_biografia_arquimedes_tv_01);
        TextView telaBiografiaArquimedesTv02 = (TextView) findViewById(R.id.tela_biografia_arquimedes_tv_02);
        TextView telaBiografiaArquimedesTv03 = (TextView) findViewById(R.id.tela_biografia_arquimedes_tv_03);
        TextView telaBiografiaArquimedesTv04 = (TextView) findViewById(R.id.tela_biografia_arquimedes_tv_04);
        TextView telaBiografiaArquimedesTv05 = (TextView) findViewById(R.id.tela_biografia_arquimedes_tv_05);
        TextView telaBiografiaArquimedesTv06 = (TextView) findViewById(R.id.tela_biografia_arquimedes_tv_06);
        TextView telaBiografiaArquimedesTv07 = (TextView) findViewById(R.id.tela_biografia_arquimedes_tv_07);
        TextView telaBiografiaArquimedesTv08 = (TextView) findViewById(R.id.tela_biografia_arquimedes_tv_08);
        TextView telaBiografiaArquimedesTv09 = (TextView) findViewById(R.id.tela_biografia_arquimedes_tv_09);

        Typeface font = Typeface.createFromAsset(getApplicationContext().getAssets(), "fonts/footlight_mt_light.ttf");
        telaBiografiaArquimedesTv01.setTypeface(font);
        telaBiografiaArquimedesTv02.setTypeface(font);
        telaBiografiaArquimedesTv03.setTypeface(font);
        telaBiografiaArquimedesTv04.setTypeface(font);
        telaBiografiaArquimedesTv05.setTypeface(font);
        telaBiografiaArquimedesTv06.setTypeface(font);
        telaBiografiaArquimedesTv07.setTypeface(font);
        telaBiografiaArquimedesTv08.setTypeface(font);
        telaBiografiaArquimedesTv09.setTypeface(font);

        telaBiografiaArquimedesTv01.setText(Html.fromHtml("<p>\tArquimedes viveu entre 287–212 a.C  " +
                "foi um inventor grego, físico e matemático. Ninguém sabia seu nome completo, " +
                "por tanto como era de costume chamavam-no de Arquimedes de Siracusa, sua " +
                "cidade Natal. Dentre suas várias invenções se destacam a \"Alavanca\" e " +
                "a \"Espiral de Arquimedes\". Desenvolveu o \"Princípio de Arquimedes\" e a" +
                " ideia de \"gravidade específica\", que é basicamente a razão entre a " +
                "densidade de duas substâncias, geralmente em relação a água. Fez grandes " +
                "descobertas e invenções como, por exemplo, o parafuso, a roldana e as rodas" +
                " dentadas.</p>"));
        telaBiografiaArquimedesTv02.setText(Html.fromHtml("<p>\tNasceu  em 287 A.C. na cidade de " +
                "Siracusa, na Sicília. Seu Pai, Fídias, era astrônomo grego e costumava reunir " +
                "em sua casa filósofos e homens da ciência. Estudando em Alexandria que, na época," +
                " reunia as maiores mentes do mundo, teve contato com grandes astrônomos e " +
                "matemáticos (dentre eles Eratóstenes de Cirene, o primeiro matemático a " +
                "realizar o cálculo da circunferência da terra), e com o que havia de mais " +
                "avançado na ciência do seu tempo. Há indícios de que tenha estudado com os " +
                "sucessores de Euclides, em Alexandria.</p>" +

                "<p>\tArquimedes gozava grande estima pela família real, quem sabe até um parentesco." +
                " Dado o grande apresso do rei Herão II por Arquimedes, o mesmo chegou a dizer:" +
                " “Mostrai-me um homem que faça crescer duas espigas de trigo onde hoje só cresce " +
                "uma e lhe concederei mais honras que ao próprio Arquimedes”.</p>" +

                "<p>\tApós retornar a sua cidade passou a desenvolver uma série de projetos. Chegou ao" +
                " chamado “Princípio de Arquimedes”, com a ideia de gravidade específica," +
                " onde afirmou que  \"Qualquer corpo mais denso que um fluido, ao ser mergulhado" +
                " neste, perderá peso correspondente ao volume de fluido deslocado\". Passou então " +
                "a comparar o peso do volume dos materiais, com o peso correspondente de água, " +
                "nascia ai o conceito de Empuxo. Sobre isso há uma conhecida anedota relacionada " +
                "ao conceito de Empuxo, conhecida como o “problema da coroa”. A estória diz que" +
                " Arquimedes estava tentando descobrir se parte do ouro utilizado para construir" +
                " a coroa do rei, teria sido substituído por prata. Essa solução teria surgido " +
                "durante um banho notando que toda vez que entrava na banheira transbordava uma" +
                " quantidade de água correspondente ao seu volume imerso, ele teria tido a ideia " +
                "de comparar o volume da coroa com volumes de iguais massas de ouro e prata. Ao" +
                " colocar os corpos em um recipiente com água, mediria a quantidade de líquido " +
                "derramado e encontraria a resposta. Feliz com a descoberta Arquimedes teria" +
                " saído nu pelas ruas gritando “Eureka”.</p>"));

        telaBiografiaArquimedesTv03.setText(Html.fromHtml("<p>\tAté mesmo Galileu teria desconfiado" +
                " desse método utilizado, afirmando que seria “Muito grosseiro e longe da " +
                "perfeição”. Acredita-se que para solucionar o problema, Arquimedes teria usado" +
                " uma balança hidrostática, onde se utilizando do princípio de Empuxo, poderia " +
                "calcular o peso do fluido deslocado pela coroa. Se a coroa contivesse prata, seu" +
                " volume seria maior do que o do ouro puro (por ter menor densidade), " +
                "consequentemente seu empuxo será maior e o peso na água será menor que o do " +
                "ouro puro. Assim conseguira-se determinar com precisão a proporção de prata utilizada.</p>"));

        telaBiografiaArquimedesTv04.setText(Html.fromHtml("<p>\tHá relatos que em uma visita ao Egito " +
                "teria inventado um dispositivo em forma de espiral para elevar água, o chamado " +
                "\"Parafuso de Arquimedes\" ou “parafuso infinito”. O parafuso de Arquimedes era" +
                " uma hélice helicoidal, encaixada dentro de um cilindro, que ao girar, fazia" +
                " com que a água subisse pelo cilindro.</p>"));

        telaBiografiaArquimedesTv05.setText(Html.fromHtml("<p>\tConsiderado por muitos historiadores" +
                " um dos maiores matemáticos de todos os tempos, Arquimedes desenvolveu um método " +
                "de integração para calcular áreas e volumes de alguns corpos, desenvolveu também " +
                "fórmulas para calcular área e volume de uma esfera. Usando métodos geométricos " +
                "desenvolveu trabalhos sobre o centro de gravidade de figuras planas e um segmento" +
                " de parábola. Arquimedes também mostrou em seu trabalho, Medidas de Círculo, " +
                "que o valor exato de π (Pi) situa-se entre <b>3^(10/71)</b>  e  <b>3^(1/7)</b>. Provou que" +
                " o volume de uma esfera representa 2/3 do volume de um cilindro que a envolve," +
                " considerou esse resultado tão importante que pediu que o mesmo fosse escrito" +
                " em sua lápide.</p>"));

        telaBiografiaArquimedesTv06.setText(Html.fromHtml("<p>\tPlutarco, contemporâneo de Arquimedes, " +
                "citou sobre o mesmo:</p>" +

                "<p>\t“...Não podemos, portanto, rejeitar como inaceitável o que é comumente dito" +
                " dele, que estando permanentemente encantado por sua Sereia particular, isto" +
                " é, pela Geometria, ele se esquecia de comer e beber e até descuidava de seu" +
                " corpo; e que, frequentemente, era preciso ser arrastado para comer, ungir-se " +
                "ou banhar-se e, ainda nesses momentos, traçava figuras geométricas nas cinzas " +
                "do fogão; e, depois de ungido com azeite, desenhava linhas com o dedo sobre o" +
                " seu corpo, tão grande era o prazer que encontrava nessas ocupações.</p>" +

                "<p>\tA maior parte de suas criações foram voltadas para engenhos de guerra. Com" +
                " seus conhecimentos em estática desenvolveu a alavanca, utilizada para mover" +
                " cargas pesadas. Utilizou-se das alavancas para aperfeiçoar as catapultas, " +
                "dando-as alcances variáveis. Declarou Arquimedes: \"Deem-me um ponto de apoio" +
                " e uma alavanca e eu moverei a terra\". Utilizando-se do mesmo princípio " +
                "desenvolveu as Gruas, que eram utilizadas para agarrar e virar os barcos " +
                "inimigos. Criou enormes espelhos côncavos destinados a focar os raios solares" +
                " sobre as velas dos navios inimigos, ateando-lhes fogo. Utilizando o princípio" +
                " de funcionamento das polias móveis, Arquimedes teria movido um navio carregado " +
                "de pessoas e materiais pela areia da praia, sem fazer muito esforço. Após esse " +
                "feito o rei teria decretado que tudo que fosse dito por Arquimedes, a partir" +
                "daquele momento, seria considerado verdade.</p>"));

        telaBiografiaArquimedesTv07.setText(Html.fromHtml("<p>\tDurante três anos o reino de Siracusa" +
                " resistiu a invasão das tropas romanas comandadas pelo general Marcellus " +
                "Claudius, na segunda guerra púnica. Porém em 212 a.C. a eficiência dos " +
                "engenhos criados por Arquimedes, não foram capazes de impedir a invasão dos " +
                "romanos. Durante a invasão os soldados receberam ordens para que a vida de " +
                "Arquimedes fosse poupada, porém um soldado invadiu sua casa e com um golpe de " +
                "espada matou o grande inventor, que se recusou a obedecer suas ordens, pois" +
                " estava concentrado na resolução de um problema.</p>"));

        telaBiografiaArquimedesTv08.setText(Html.fromHtml("<p>\t<b>CURIOSIDADES:</b></p>" +

                "<p>\tNo ano de 1900 foi encontrado no fundo do mar mediterrâneo, próximo a ilha de" +
                " Anticitara, na Grécia, um navio naufragado e dentro dele vários objetos " +
                "(tesouros). Tratava-se de um dos maiores naufrágios da História. Por volta de " +
                "85 a.C. e 60 a.C., após a vitória Grega  na primeira guerra Mitridática " +
                "(88 a.C. – 84 a.C.), o navio transportava o botim do saque feito após a " +
                "invasão em Atenas, quando naufragou. Uma peça em especial chamou muito a " +
                "atenção, uma grande engrenagem de bronze, que inicialmente não se sabia sua " +
                "utilidade.</p>"));


        telaBiografiaArquimedesTv09.setText(Html.fromHtml("<p>\tNo total faziam parte desse objeto 82" +
                " peças e uma caixa de madeira que o protegia. Após vários estudos chegaram a " +
                "conclusão que aquela máquina podia ter sido produzida por Arquimedes e tirada" +
                " do reino de Siracusa após a invasão Romana. O mecanismo mostrava com precisão " +
                "o movimento dos astros conhecidos, as fases da Lua, apontava as festividades " +
                "religiosas, datas de colheitas e as datas dos próximos eclipses. Essa máquina" +
                " ficou conhecida como “Máquina de Anticitera” ou “Computador de Arquimedes”.</p>"));
    }
}
