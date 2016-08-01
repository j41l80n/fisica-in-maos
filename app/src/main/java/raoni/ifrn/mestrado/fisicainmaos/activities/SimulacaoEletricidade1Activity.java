package raoni.ifrn.mestrado.fisicainmaos.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;

import raoni.ifrn.mestrado.fisicainmaos.R;

public class SimulacaoEletricidade1Activity extends Activity
{
    WebView wvTelaSimulacaoMecanica;
    private String simulacao1;
    int chave;

    public void onCreate(Bundle savedInstanceState)
    {
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_simulacao_eletricidade1);

        simulacao1 = "https://phet.colorado.edu/sims/html/balloons-and-static-electricity/latest/balloons-and-static-electricity_en.html";

        wvTelaSimulacaoMecanica = (WebView) findViewById(R.id.wv_tela_simulacao_eletricidade1);
        wvTelaSimulacaoMecanica.loadUrl(simulacao1);

        WebSettings settings = wvTelaSimulacaoMecanica .getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDatabaseEnabled(true);
    }
}
