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

public class BiografiaGalileuGalileiActivity extends FragmentActivity
{
    public void onCreate(Bundle savedInstanceState)
    {
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_biografia_galileu_galilei);

        setup();
    }

    private void setup()
    {
        //
        setupTextViews();
    }

    private void setupTextViews()
    {
        TextView telaBiografiaGalileuGalileiTv01 = (TextView) findViewById(R.id.tela_biografia_galileu_galilei_tv_01);
        TextView telaBiografiaGalileuGalileiTv02 = (TextView) findViewById(R.id.tela_biografia_galileu_galilei_tv_02);
        TextView telaBiografiaGalileuGalileiTv03 = (TextView) findViewById(R.id.tela_biografia_galileu_galilei_tv_03);
        TextView telaBiografiaGalileuGalileiTv04 = (TextView) findViewById(R.id.tela_biografia_galileu_galilei_tv_04);
        TextView telaBiografiaGalileuGalileiTv05 = (TextView) findViewById(R.id.tela_biografia_galileu_galilei_tv_05);
        TextView telaBiografiaGalileuGalileiTv06 = (TextView) findViewById(R.id.tela_biografia_galileu_galilei_tv_06);
        TextView telaBiografiaGalileuGalileiTv07 = (TextView) findViewById(R.id.tela_biografia_galileu_galilei_tv_07);

        Typeface font = Typeface.createFromAsset(getApplicationContext().getAssets(), "fonts/footlight_mt_light.ttf");
        telaBiografiaGalileuGalileiTv01.setTypeface(font);
        telaBiografiaGalileuGalileiTv02.setTypeface(font);
        telaBiografiaGalileuGalileiTv03.setTypeface(font);
        telaBiografiaGalileuGalileiTv04.setTypeface(font);
        telaBiografiaGalileuGalileiTv05.setTypeface(font);
        telaBiografiaGalileuGalileiTv06.setTypeface(font);
        telaBiografiaGalileuGalileiTv07.setTypeface(font);

        telaBiografiaGalileuGalileiTv01.setText(Html.fromHtml("<p>\tGalileu Galilei nasceu em Pisa," +
                " Itália, em 18/02/1564. Filho mais velho do músico Vincenzo Galilei e de Giulia" +
                " Ammannati, foi ainda jovem morar em Florença e iniciou estudos na área da" +
                " matemática.</p>" +

                "<p>\tEm 1581, a desejo do pai, retorna a Pisa e inicia faculdade de medicina, aos 17" +
                " anos. Por falta de recursos e de interesse, em 1585 desiste do curso de medicina" +
                " e volta seus esforços para o estudo da matemática. Em 1589 se torna professor da" +
                " universidade de Pisa, após dar palestras na academia florentina sobre o local e" +
                " o tamanho do inferno de Dante, e em 1592 assume a cátedra de matemático na " +
                "universidade de Pádua, em Veneza. Ainda em 1589, escreveu um texto sobre " +
                "movimento, no qual criticava os pontos de vista de Aristóteles a respeito da " +
                "queda livre e do movimento dos projéteis. Não se tem registros de que Galileu" +
                " tenha feito os experimentos na torre de Pisa, na verdade, acredita-se que tenham " +
                "sido feitas pelo seu adversário Giorgio Coressi, na tentativa de confirmar as " +
                "ideias de Aristóteles.</p>"));

        telaBiografiaGalileuGalileiTv02.setText(Html.fromHtml("<p>\tGalileu é considerado o primeiro " +
                "físico experimental, o que o levou a ser chamado de o Arquimedes de seu tempo, e " +
                "foi um dos maiores opositores dos conceitos de Aristóteles.</p>" +

                "<p>\tDurante o período em que lecionou em Pisa ofendeu muito os defensores " +
                "aristotélicos e ridicularizava os regulamentos universitários. Durante esse " +
                "período fez vários inimigos e se envolveu em várias disputas, além do mais tinha" +
                " a língua afiada, era presunçoso, vaidoso e sarcástico.</p>" +

                "<p>\tEm Veneza escreveu sobre diversos temas, como: alavancas, roldanas, o parafuso," +
                " arquitetura militar, o termoscópio, bússola geométrica e termômetro de ar.</p>"));

        telaBiografiaGalileuGalileiTv03.setText(Html.fromHtml("<p>\tGalileu desenvolveu um compasso " +
                "geométrico e militar, que era usado para medir ângulos e fazer cálculos. Com ele " +
                "podia-se calcular distâncias, alturas e inclinações, podia redesenhar um mapa em" +
                " outras dimensões e até melhorar o alcance da artilharia. Embora tenha vendido" +
                " alguns compassos, o que lhe deu lucro foi o que recebia nas aulas que tinha que " +
                "dar para ensinar como usar o compasso. Além disso, Galileu também criou um " +
                "instrumento para medição de pulso, uma bomba d’água que operava movida por um" +
                " cavalo e ajudou através do estudo de pêndulos, a construir o relógio de pêndulo.</p>"));

        telaBiografiaGalileuGalileiTv04.setText(Html.fromHtml("<p>\tMesmo sendo professor, Galileu" +
                " ganhava muito mal e precisava dar aulas de reforço em sua casa para complementar " +
                "seu salário. Estando com seus horários sempre muito cheios.</p>" +

                "<p>\tPor volta de 1608, Galileu toma conhecimento de um telescópio produzido por um" +
                " holandês, Hans Lippershey, fabricante de óculos. Em 1609 construiu seu próprio" +
                " telescópio, bem mais aperfeiçoado, e deu de presente ao senado para ser utilizado " +
                "pela marinha, em batalhas navais. Vale salientar que a real importância desse " +
                "gesto de Galileu foi de ganhar dinheiro e prestígio. O telescópio produzido pelo" +
                " holandês tinha uma ampliação de cerca de 3x, o aperfeiçoado por Galileu chegou " +
                "a ter cerca de 30x.</p>"));

        telaBiografiaGalileuGalileiTv05.setText(Html.fromHtml("<p>\tAtravés das observações feitas" +
                " pelo telescópio viu na Lua um grande número de cavidades e protuberâncias," +
                " calculando que algumas montanhas chegavam a ter 6400 m de altura, observou mais" +
                " de 500 estrelas e chegou à conclusão de que elas estavam a enormes distâncias," +
                " descobriu as quatro luas de Júpiter, as quatro fases de Vênus, as orelhas de" +
                " Saturno (anéis) e as manchas solares. Com suas publicações e sua repentina fama " +
                "aproveitou para conseguir uma posição na corte da Toscana, com um ótimo salário.</p>"));

        telaBiografiaGalileuGalileiTv06.setText(Html.fromHtml("<p>\tDurante esse período acumulou " +
                "muitos outros inimigos, respondendo-os com muita arrogância e prepotência," +
                " inclusive pessoas da própria igreja.</p>" +

                "<p>\tGalileu passou a divulgar e defender o modelo Heliocêntrico, o que ia de encontro " +
                "às ideias da igreja. Algumas de suas cartas foram usadas para condená-lo em " +
                "seu julgamento de heresia. Em 1616 Galileu recebe uma carta do vaticano pedindo" +
                " que ele parasse de defender e ensinar o sistema copernicano, caso contrário " +
                "seria preso.</p>" +

                "<p>\tEm 1630 publicou o livro “O diálogo”, um discursão entre três personagens, " +
                "um heliocêntrico (Galileu), um leigo inteligente e um geocêntrico burro. Além " +
                "de Galileu defender o modelo heliocêntrico nesse livro, ficou implícito para " +
                "alguns cardeais que o personagem burro era o Papa. O que o enfureceu, condenando" +
                " Galileu de heresia. Galileu foi preso e exilado em sua própria casa.</p>"));

        telaBiografiaGalileuGalileiTv07.setText(Html.fromHtml("<p>\tMorreu em 8 de janeiro de 1642," +
                " exilado em sua própria casa e cego de tanto observar as manchas solares. Durante " +
                "os últimos meses de vida foi auxiliado por um futuro renomado físico, Torricelli.</p>" +

                "<p>\t<b>Curiosidades:</b></p>" +
                "\t\t- Reza a lenda que, ao sair do tribunal após sua condenação, disse uma frase célebre: \"<i>Eppur si muove!</i>\", ou seja, \"contudo, ela se move\", referindo-se à Terra. \n" +
                "\t\t- Sempre muito religioso, Galileu, oferece suas duas filhas para a igreja.\n" +
                "\t\t- Em 1992, mais de três séculos passados da sua condenação, o Papa João Paulo II inicia a revisão do seu processo que decide pela sua absolvição.\n" +
                "\t\t- No ano da morte de Galileu surge outro gênio, Isaac Newton.\n"));
    }
}
