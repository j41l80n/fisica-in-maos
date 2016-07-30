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

public class BiografiaTorricelliActivity extends FragmentActivity
{
    public void onCreate(Bundle savedInstanceState)
    {
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_biografia_torricelli);

        setup();
    }

    private void setup()
    {
        //
        setupTextViews();
    }

    private void setupTextViews()
    {
        TextView telaBiografiaTorricelliTv01 = (TextView) findViewById(R.id.tela_biografia_torricelli_tv_01);
        TextView telaBiografiaTorricelliTv02 = (TextView) findViewById(R.id.tela_biografia_torricelli_tv_02);
        TextView telaBiografiaTorricelliTv03 = (TextView) findViewById(R.id.tela_biografia_torricelli_tv_03);
        TextView telaBiografiaTorricelliTv04 = (TextView) findViewById(R.id.tela_biografia_torricelli_tv_04);
        TextView telaBiografiaTorricelliTv05 = (TextView) findViewById(R.id.tela_biografia_torricelli_tv_05);

        Typeface font = Typeface.createFromAsset(getApplicationContext().getAssets(), "fonts/footlight_mt_light.ttf");
        telaBiografiaTorricelliTv01.setTypeface(font);
        telaBiografiaTorricelliTv02.setTypeface(font);
        telaBiografiaTorricelliTv03.setTypeface(font);
        telaBiografiaTorricelliTv04.setTypeface(font);
        telaBiografiaTorricelliTv05 .setTypeface(font);

        telaBiografiaTorricelliTv01.setText(Html.fromHtml("<p>\tEvangelista Torricelli, nasceu em 15 de " +
                "outubro de 1608, em Faenza, região ao Norte da Itália. Por perder o pai muito" +
                " cedo, foi educado pelo tio, que em 1627 o enviou à Roma para estudar ciências com" +
                " o professor de matemática beneditino Benedetto Castelli (1577-1644), no Collegio " +
                "di Sapienza. Teve como amigos de classe futuros matemáticos de fama, como " +
                "Cavalieri e Ricci. O primeiro ensaio de Torricelli, \"Sobre os Projéteis\", " +
                "foi enviado a Galileu que ficou impressionado com a capacidade analítica e" +
                " matemática do estudante. Foi secretário e discípulo de Galileu nos seus " +
                "últimos meses de vida. Após a morte de Galileu, Torricelli tentou quis partir, " +
                "mas foi convidado pelo Grão-Duque da Toscana a ser o matemático da corte, " +
                "sucedendo seu mestre na cátedra de matemática da Universidade. Na época precedente" +
                " a Toscana, em que viveu em Roma, produziu pouca coisa.</p>"));

        telaBiografiaTorricelliTv02.setText(Html.fromHtml("<p>\tNo período em que foi professor de" +
                " matemática na Academia Florentina, realizou uma experiência com tubos de vidros " +
                "e mercúrio para medir a pressão atmosférica. Essa experiência ficou muito" +
                " conhecida e passou a dar o valor de 760 mmHg para a pressão atmosférica. Deu-se" +
                " origem então ao barômetro, nome dado por Pascal. Pascal também tentou provar " +
                "que não era vácuo que se formava no topo do tubo, e sim ar rarefeito, porém suas" +
                " explicações foram frustradas.</p>"));

        telaBiografiaTorricelliTv03.setText(Html.fromHtml("<p>Torricelli foi o primeiro a comprovar" +
                " que o ar pesa. Aproveitou a recém-descoberta do vácuo para realizar outras" +
                " experiências. Verificou que a luz se propaga com a mesma velocidade no vácuo e " +
                "no ar. Na física também contribuiu para hidráulica, dinâmica, estudos sobre o som " +
                "e magnetismo. Na matemática realizou o cálculo das áreas e dos volumes de figuras " +
                "em rotação, baseado nos métodos de Arquimedes. Esses estudos deram origem ao" +
                " cálculo integral, nas Mãos de Newton e Leibnitz.</p>" +
                "<p>\tTorricelli também desenvolveu um trabalho considerado um paradoxo.</p>"));

        telaBiografiaTorricelliTv04.setText(Html.fromHtml("<p>\tA trombeta de Gabriel ou Trombeta de " +
                "Torricelli é uma superfície com uma estranha propriedade:\n" +
                "Possui volume finito, porém sua área superficial é infinita. É assim chamada," +
                " pois faz referência à trombeta que o Arcanjo Gabriel tocará, anunciando assim " +
                "o dia do juízo final, associando o divino, ou infinito, com o finito.</p>" +
                "<p>\tFormulou uma equação para calcular a velocidade com que a água sai por um " +
                "orifício feito em um recipiente, quando se conhece a altura h da coluna de água." +
                " Notou que essa velocidade é a mesma que a água adquire ao cair livremente de" +
                " uma altura h, igual ao desnível da coluna de água. Essa descoberta constitui " +
                "uma consequência dos estudos de Galileu sobre queda livre e também representa o " +
                "princípio da conservação da energia mecânica. Seguindo o mesmo raciocínio, usou" +
                " a mesma equação para calcular a velocidade final de um corpo, sem se conhecer o " +
                "intervalo de tempo (Equação de Torricelli).</p>" +
                "<p>\tDentro da geometria estudou o ciclóide, um ponto na extremidade de uma roda, que" +
                " gira em um plano, sem escorregar. Calculou o comprimento do arco do ciclóide e a " +
                "área descrita nesse movimento.</p>"));

        telaBiografiaTorricelliTv05.setText(Html.fromHtml("<p>\tAcredita-se que no período em que " +
                "auxiliou Galileu, no final de sua vida, aprendeu a fabricar e aperfeiçoar lentes," +
                " desenvolvendo uma forma de deixar cada vez mais perfeitas as superfícies obtidas." +
                " Suas lentes e instrumentos ópticos alcançaram tal perfeição que o deixarão famoso " +
                "em toda a Europa e com grande prestígio nos círculos científicos. Seu “patrão”, o " +
                "Grão-Duque da Toscana, teria lhe dado cerca de 300 escudos de ouro pala invenção." +
                " Apesar de todo sucesso, esse segredo acabou se perdendo. Depois de comprado pelo" +
                " Grão-duque, esse segredo veio a ser confiado a Vincenzo Viviani. Após isso não " +
                "se há mais informações a seu respeito.</p>" +
                "<p>\tÀs vésperas de morrer Torricelli se preocupou em entregar seus manuscritos a algu" +
                "ém de confiança. Seus trabalhos foram entregues a Castelli, porém o mesmo faleceu " +
                "apenas 35 dias depois. Seu amigo Ricci, embora grande matemático se negou a " +
                "aceitar o fardo. Seu aluno Vincenzo Viviani aceitou o trabalho, mas não o " +
                "finalizou (sendo acusado de querer sabotar o projeto). Por fim seu amigo Ludovico" +
                " Serenai iniciou o difícil trabalho de transcrição, porém não chegou a vê-lo" +
                " finalizado e impresso. A edição final e integral das obras deixadas só ocorreu " +
                "em 1919.</p>" +
                "<p>\tAo final de sua vida ainda tralhava e dava aulas, que atraía cientistas de " +
                "toda Europa. Evangelista Torricelli faleceu em 25 de outubro de 1647 após ser" +
                " atacado por uma febre tifoide.</p>"));
    }
}