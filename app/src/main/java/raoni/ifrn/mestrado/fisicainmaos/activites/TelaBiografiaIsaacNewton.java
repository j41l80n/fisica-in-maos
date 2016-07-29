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

public class TelaBiografiaIsaacNewton extends FragmentActivity
{
    public void onCreate(Bundle savedInstanceState)
    {
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_biografia_isaac_newton);

        TextView telaBiografiaIsaacNewtonTv01 = (TextView) findViewById(R.id.tela_biografia_isaac_newton_tv_01);
        TextView telaBiografiaIsaacNewtonTv02 = (TextView) findViewById(R.id.tela_biografia_isaac_newton_tv_02);
        TextView telaBiografiaIsaacNewtonTv03 = (TextView) findViewById(R.id.tela_biografia_isaac_newton_tv_03);

        Typeface font = Typeface.createFromAsset(getApplicationContext().getAssets(), "fonts/footlight_mt_light.ttf");
        telaBiografiaIsaacNewtonTv01.setTypeface(font);
        telaBiografiaIsaacNewtonTv02.setTypeface(font);
        telaBiografiaIsaacNewtonTv03.setTypeface(font);

        telaBiografiaIsaacNewtonTv01.setText(Html.fromHtml("<p>\tNascido em Woolsthorpe, Lincolnshire," +
                " Inglaterra, no dia 25 de dezembro de 1642 (segundo o calendário da época), ou " +
                "em 4 de janeiro de 1643 (segundo calendário usado hoje). Poucas semanas antes de " +
                "seu nascimento fica órfão de pai e com aproximadamente 4 anos após sua mãe" +
                " casar-se novamente, entregou o Isaac aos cuidados da avó.</p>" +
                "<p>\tAos 12 anos sua mãe retorna para casa, após a morte do segundo marido, com mais " +
                "três filhos. Nessa época ela retira Newton da escola para que o mesmo vire " +
                "fazendeiro. Com o fracasso na atividade, retornou a escola e concluiu o" +
                " ensino básico.</p>" +
                "<p>\tNa escola era um aluno mediano, mas sempre manifestou interesse por atividades" +
                " manuais. Na escola ainda construiu um moinho de vento, e um quadrante solar de" +
                " pedra, que hoje se encontra na Sociedade Real de Londres.</p>" +
                "<p>\tAos 18 anos foi aceito no Trinity College, da Universidade de Cambridge." +
                " Se formou em bacharel em artes em 1665 e aos 27 anos mestre. Durante a epidemia" +
                " de peste bubônica, em 1665, a universidade fica fechada por 18 meses. Na" +
                " tentativa de fugir da praga, Newton volta a morar com a mãe, na fazenda da" +
                " família. Nesse período desenvolveu vários trabalhos, entre eles: as leis básicas " +
                "da Mecânica (as três leis de Newton, que foram aperfeiçoadas e posteriormente)" +
                ", estudou os corpos celestiais, descobriu a lei fundamental da gravitação," +
                " inventou o método de cálculo diferencial, estabeleceu os alicerces de suas " +
                "grandes descobertas ópticas e desenvolveu o teorema do binômio de Newton.</p>" +
                "<p>\tPor ter um ego muito grande, Newton não aceitava facilmente críticas negativas, " +
                "por isso criou um ódio por Robert Hooke, que durou por toda sua vida. Em 1678 e" +
                " no seguinte, após a morte de sua mãe, sofreu um colapso nervoso, se afastando" +
                " dos estudos nesse período. Após retornar os estudos sobre gravidade e as órbitas" +
                " dos planetas, ironicamente recebeu de Hooke uma sugestão de explicar a atração" +
                " dos astros através do inverso quadrado da distância.</p>" +
                "<p>\tDedicou-se a estudar os raios luminosos. Foi o primeiro a defender o modelo " +
                "corpuscular da luz, chegando à conclusão que a luz era resultado do rápido" +
                " movimento de infinidades de minúsculas partículas emitidas por uma fonte " +
                "luminosa. Nesse mesmo período, utilizando um prisma em uma fresta de luz que" +
                " entrava pela janela, descobriu que a luz branca resulta da mistura das sete cores" +
                " básicas (cores do arco-íris), ao colocar outro prisma na frente dos raios" +
                " coloridos viu que eles voltam a formar um feixe branco. Aperfeiçoando a" +
                " fabricação das lentes e espelhos, fabricou o primeiro telescópio refletor.</p>"));

        telaBiografiaIsaacNewtonTv02.setText(Html.fromHtml("<p>\tNuma época em que a economia dependia" +
                " diretamente das navegações, descobriu as leis que regem os fenômenos das marés." +
                " Publicou em 1687 o livro \"Philosophiae Naturalis Principia Mathematica\", " +
                "conhecido apenas por “Principia”, em três volumes, onde apresentou suas" +
                " descobertas, tratando também de questões sobre pressão atmosférica, velocidade" +
                " do som e a densidade do ar. Sobre sua publicação, Hooke ainda chegou a acusa-lo " +
                "de plágio, o que posteriormente acabou sendo infundado.</p>"));

        telaBiografiaIsaacNewtonTv03.setText(Html.fromHtml("<p>\tBaseado nas escrituras bíblicas, no" +
                "livro de Daniel, e no calendário gregoriano, fez a previsão que o fim do mundo " +
                "aconteceria no ano de 2060.</p>" +
                "<p>\tIsaac Newton fez fortuna na Bolsa Londrina. Em 1696 alcançou a posição política " +
                "que tanto pretendia, guardião da casa da moeda. Em 1699 a Rainha Ana o promoveu" +
                "a diretor da Casa da Moeda. Fazendo jus a posição reformou a moeda corrente e " +
                "puniu severamente os falsificadores.  Por duas vezes foi eleito membro do" +
                " Parlamento. Foi eleito presidente da Real Society em 1703, onde se congregava" +
                " os mais célebres pensadores da época, e tornou-se vitalício. Foi sócio " +
                "correspondente da Academia Francesa de Ciências. Nesse período sua carreira de" +
                " cientista já havia sido substituída pela política.</p>" +
                "<p>\tEm 1705, foi o primeiro cientista a receber o título de “Sir” concedido pela " +
                "rainha. Isaac Newton morreu em 20 de março de 1726, aos 84 anos, devido à causas " +
                "naturais, já que sua idade era extremamente elevada para os padrões da época." +
                " Após sua morte sua fama aumentou mais ainda, chegando a ser comparado " +
                "intelectualmente com Platão, Aristóteles e Galileu.</p>" +
                "<p>\tNewton sofreu muito com distúrbios mentais e depressão. Embora fosse um homem" +
                "muito arrogante, em suas palavras Newton demonstrou humildade: “Se enxerguei mais " +
                "longe, foi porque me apoiei sobre ombros de gigantes.”</p>" +
                "<p>\t<b>Curiosidades: </b></p>" +
                "&bull; Foi um dos precursores do iluminismo.<br/><br/>" +
                "&bull; No fim de sua vida Isaac Newton se dedicou a alquimia, na tentativa de " +
                "transformar metal em ouro.<br/><br/>" +
                "&bull; Isaac quase ficou cego após fazer testes pressionando o olho, pois acreditava " +
                "que a cor era efeito da pressão do nervo óptico. Além disso passou longo período" +
                " observando o Sol.<br/><br/>" +
                "&bull; Não foi uma maça caindo na cabeça de Newton que o influenciou no estudo da" +
                " gravitação. Em uma conversa com Stukeley, tomando chá debaixo de uma macieira," +
                " Isaac relata que foi em uma situação parecida, de contemplação, ao se perguntar" +
                " porque uma maçã sempre cai perpendicularmente, que lhe surgiu a ideia da força de" +
                " atração da matéria e a gravidade.<br/><br/>" +
                "&bull; Newton era tão focado em seus estudos que muitas vezes se esquecia de se " +
                "alimentar e dormir.<br/><br/>" +
                "&bull; Newton era muito religioso e fascinado pela bíblia e suas conclusões e " +
                "observações sobre ela eram muitas.<br/><br/>" +
                "&bull; Em certa ocasião Newton foi convidado por seu amigo, Dr. Stukeley, para um " +
                "jantar. O prato era frango e, como o convidado demorava, foi servido em sua " +
                "ausência, numa travessa coberta por uma tampa. Achando talvez que o amigo se " +
                "tivesse esquecido do convite, o Dr. Stukeley resolveu jantar sozinho: comeu o" +
                " frango, pôs os ossos na mesma travessa e tampou-a. Mas Newton acabou aparecendo, " +
                "cumprimentou o amigo, sentou-se, levantou a tampa da travessa e, ao ver apenas " +
                "os restos, disse: “Tinha me esquecido de que já jantamos”.<br/><br/>" +
                "&bull; Newton nunca se casou e, embora seja impossível verificar, é amplamente " +
                "conhecido que ele nunca teve relações sexuais, era muito solitário e alguns " +
                "historiadores afirmam que ele era homossexual.<br/><br/>"));
    }

}
