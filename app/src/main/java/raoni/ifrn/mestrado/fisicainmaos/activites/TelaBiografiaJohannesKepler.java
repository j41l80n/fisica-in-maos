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

public class TelaBiografiaJohannesKepler extends FragmentActivity
{
    public void onCreate(Bundle savedInstanceState)
    {
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_biografia_johannes_kepler);

        TextView telaBiografiaJohannesKeplerTv01 = (TextView) findViewById(R.id.tela_biografia_johannes_kepler_tv_01);
        TextView telaBiografiaJohannesKeplerTv02 = (TextView) findViewById(R.id.tela_biografia_johannes_kepler_tv_02);
        TextView telaBiografiaJohannesKeplerTv03 = (TextView) findViewById(R.id.tela_biografia_johannes_kepler_tv_03);
        TextView telaBiografiaJohannesKeplerTv04 = (TextView) findViewById(R.id.tela_biografia_johannes_kepler_tv_04);

        Typeface font = Typeface.createFromAsset(getApplicationContext().getAssets(), "fonts/footlight_mt_light.ttf");
        telaBiografiaJohannesKeplerTv01.setTypeface(font);
        telaBiografiaJohannesKeplerTv02.setTypeface(font);
        telaBiografiaJohannesKeplerTv03.setTypeface(font);
        telaBiografiaJohannesKeplerTv04.setTypeface(font);


        telaBiografiaJohannesKeplerTv01.setText(Html.fromHtml("<p>\tKepler nasceu na cidade de Weil der" +
                " Stadt (Alemanha) em 27 de dezembro de 1571.</p>" +
                "<p>\tFoi um importante astrônomo, astrólogo e matemático da época do Renascimento " +
                "Científico (século XVI e XVII). Foi responsável por uma grande revolução na" +
                " ciência, colaborou com as leis da mecânica celeste, aperfeiçoou o telescópio " +
                "refrator de Galileu Galilei e teve, com seus estudos sobre o movimento dos astros," +
                " teve participação nas descobertas de Isaac Newton, sobre a gravitação universal." +
                " Kepler viveu na época das trevas da igreja católica, onde havia uma intensa " +
                "intolerância religiosa. Com o crescimento do protestantismo, a igreja católica" +
                " fazia de tudo para não perder fieis, inclusive não aceitar novas descobertas, " +
                "que fossem contrárias as ideias aceitas. Mesmo assim conseguiu obter grandes " +
                "resultados com seus estudos. As Leis de Kepler causarão uma revolução no " +
                "conhecimento astronômico, pois se acreditava até então que as órbitas dos " +
                "planetas eram circulares e que a Terra era o centro do universo. Com isso passou " +
                "a ser considerado um dos mais importantes cientistas da história.</p>" +
                "<p>\tDe 1594 até 1600 foi professor de astronomia e matemática na universidade de" +
                " Graz. Após esse período foi convidado a ser ajudante do astrônomo Tycho Brahe," +
                " em Praga. Embora Brahe admirasse o púlpilo, eles tinham concepções diferentes " +
                "sobre o sistema solar, Tycho era Geocêntrico e Kepler Heliocêntrico. Por conta " +
                "disso Tycho Brahe não permitia a Kepler ter acesso aos dados de suas observações," +
                " para que não usasse na defesa do heliocentrismo. Em 1601 Tycho morre e Kepler" +
                " assume seu cargo de astrônomo e matemático da corte do Imperador Rodolfo II. Em " +
                "1609 publica uma de suas obras mais importantes, “Astronomia Nova”, onde expõem " +
                "todo seu trabalho para calcular a órbita de Marte. Esta obra também contém duas " +
                "das chamadas Leis de Kepler, sobre o movimento dos plantas.</p>"));

        telaBiografiaJohannesKeplerTv02.setText(Html.fromHtml("<p>\tKepler se tornou matemático dos " +
                "estados da Áustria em 1612. Em 1619 publicou seu “Harmonices mundi”, enquanto " +
                "vivia em Linz, cujo trabalho trás a terceira lei de Kepler sobre o estudo dos " +
                "movimentos planetários.</p>"));

        telaBiografiaJohannesKeplerTv03.setText(Html.fromHtml("<p>\tAinda no ramo da física, Kepler" +
                " contribuiu com alguns estudos no campo da ótica. Na matemática, desenvolveu um " +
                "sistema infinitesimal, que foi um antecessor do cálculo. Associou os movimentos" +
                " planetários às escalas musicais.</p>"));

        telaBiografiaJohannesKeplerTv04.setText(Html.fromHtml("<p>\tJohannes era religioso e acreditava" +
                " na existência de Deus e concepção divina do Universo. Embora fosse um assunto" +
                " delicado e polêmico entre os astrônomos, Kepler estudava Astrologia e tinha " +
                "convicções sobre a sua importância. Achava que os corpos celestes exerciam " +
                "influência nos acontecimentos terrestres. No final de sua carreira, Kepler se" +
                " dedicou ao estudo da astrologia e a produção de cartas celestes, o que lhe " +
                "gerava uma boa renda, o que frustrou muitos astrônomos.</p>" +
                "<p>\tMorreu no dia 15 de novembro de 1630, em Regensburg, Baviera, Alemenha.</p>"));
    }
}
