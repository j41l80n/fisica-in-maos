package raoni.ifrn.mestrado.fisicainmaos.activites;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;

import raoni.ifrn.mestrado.fisicainmaos.R;

public class TelaSimulacaoFisicaModerna1 extends Activity
{
    WebView wvTelaSimulacaoFisicaModerna1;
    private String simulacao1;
    int chave;

    public void onCreate(Bundle savedInstanceState)
    {
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_simulacao_fisica_moderna1);

        simulacao1 = "https://phet.colorado.edu/sims/html/molecules-and-light/latest/molecules-and-light_en.html";

        wvTelaSimulacaoFisicaModerna1 = (WebView) findViewById(R.id.wv_tela_simulacao_fisica_moderna1);
        wvTelaSimulacaoFisicaModerna1.loadUrl(simulacao1);

        WebSettings settings = wvTelaSimulacaoFisicaModerna1 .getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDatabaseEnabled(true);


    }
}
