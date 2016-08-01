package raoni.ifrn.mestrado.fisicainmaos.activities;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import com.facebook.FacebookSdk;
import com.facebook.CallbackManager;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.share.widget.LikeView;

import raoni.ifrn.mestrado.fisicainmaos.R;
import raoni.ifrn.mestrado.fisicainmaos.helpers.ShakeEventListener;

public class MainActivity extends FragmentActivity
{
    private Intent intentMainActivity;
    private Bundle bundleMainActivity;
    private Button btSimulacoes;
    private Button btResumos;
    private Button btEmail;
    private Button btBiografias;
    private Button btConversor;
    private Button btQuiz;
    private SensorManager mSensorManager;
    private ShakeEventListener mSensorListener;
    private ImageView ivAtomo;
    private CallbackManager callbackManager;
    LikeView likeView;

    public void onCreate(Bundle savedInstanceState)
    {
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        initFacebookSDK();
        setContentView(R.layout.activity_main);

        setup();
    }

    private void setup()
    {
        setupButtons();
        simulacoes();
        resumos();
        quiz();
        conversor();
        biografias();
        sendEamil();
        likeView();
        //eventShake();
        //animatedIconAtom();
    }

    private void initFacebookSDK()
    {
        FacebookSdk.sdkInitialize(getApplicationContext());
        callbackManager = CallbackManager.Factory.create();
    }

    private void animatedIconAtom()
    {
        /*ivAtomo = (ImageView) findViewById(R.id.iv_activity_main_atomo);
        Animation hyperspaceJumpAnimation = AnimationUtils.loadAnimation(this, R.anim.hyperspace_jump);
        ivAtomo.startAnimation(hyperspaceJumpAnimation);*/
    }

    private void likeView()
    {
        likeView  = (LikeView) findViewById(R.id.like_view);
        likeView.setEnabled(true);
        likeView.setLikeViewStyle(LikeView.Style.BUTTON);
        likeView.setObjectIdAndType("https://www.facebook.com/Física-in-Mãos-468740279999022/", LikeView.ObjectType.PAGE);
    }

    private void setupButtons()
    {
        btSimulacoes = (Button) findViewById(R.id.activity_main_bt_simulacoes);
        btResumos = (Button) findViewById(R.id.activity_main_bt_resumos);
        btEmail = (Button) findViewById(R.id.activity_main_bt_email);
        btQuiz = (Button) findViewById(R.id.activity_main_bt_questoes);
        btBiografias = (Button) findViewById(R.id.activity_main_bt_biografias);
        btConversor = (Button) findViewById(R.id.activity_main_bt_conversor);
    }

    private void simulacoes()
    {
        btSimulacoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(checkInternetConnection())
                {
                    intentMainActivity = new Intent(getApplicationContext(), SimulacoesActivity.class);
                    startActivity(intentMainActivity);
                }
            }
        });
    }

    private void resumos()
    {
        btResumos.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intentMainActivity = new Intent(getApplicationContext(), ResumosActivity.class);
                startActivity(intentMainActivity);
            }
        });
    }

    private void conversor()
    {
        btConversor.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intentMainActivity = new Intent(getApplicationContext(), ConversorActivity.class);
                startActivity(intentMainActivity);
            }
        });
    }

    private void quiz()
    {
        btQuiz.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intentMainActivity = new Intent(getApplicationContext(), QuizEscolheTemaAssuntoActivity.class);
                startActivity(intentMainActivity);
            }
        });
    }

    private void biografias()
    {
        btBiografias.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intentMainActivity = new Intent(getApplicationContext(), BiografiasActivity.class);
                startActivity(intentMainActivity);
            }
        });
    }

    private void sendEamil()
    {
        btEmail.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                btEmail.setBackground(getResources().getDrawable(R.drawable.bt_enviar_email_pressed));
                if(checkInternetConnection())
                {
                    Toast.makeText(getApplicationContext(), "Envie um email ao idealizador", Toast.LENGTH_LONG).show();
                    emailMessage();
                }

            }
        });
    }

    public boolean checkInternetConnection()
    {
        ConnectivityManager conectivtyManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = conectivtyManager.getActiveNetworkInfo();
        boolean isConnected = activeNetwork != null && activeNetwork.isConnectedOrConnecting();

        String texto = "";

        if(isConnected)
        {
            return true;
        }
        else
        {
            texto = "Nao ha conexoes ativas";
            btEmail.setBackground(getResources().getDrawable(R.drawable.bt_enviar_email_not_pressed));
            Toast.makeText(getApplicationContext(), texto, Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    protected void emailMessage()
    {
        String[] TO = {"fisicainmaos@hotmail.com"};

        intentMainActivity= new Intent(Intent.ACTION_SEND);
        intentMainActivity.setData(Uri.parse("mailto:"));
        intentMainActivity.setType("text/plain");
        intentMainActivity.putExtra(Intent.EXTRA_EMAIL, TO);
        intentMainActivity.putExtra(Intent.EXTRA_SUBJECT, "Fisica in Mãos");
        intentMainActivity.putExtra(Intent.EXTRA_TEXT, "Escreva seu email");

        try
        {
            startActivityForResult(Intent.createChooser(intentMainActivity, "Escolha sua conta de email"), 1);
        }
        catch (android.content.ActivityNotFoundException e)
        {
            Toast.makeText(getApplicationContext(), "Nao há cliente de email instalado", Toast.LENGTH_SHORT).show();
        }
    }

    private void eventShake()
    {
        mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        mSensorListener = new ShakeEventListener();
        mSensorListener.setOnShakeListener(new ShakeEventListener.OnShakeListener() {
            public void onShake() {
                ivAtomo.setImageResource(R.drawable.atomo_com_brilho);
            }
        });
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        AppEventsLogger.activateApp(this);
        //mSensorManager.registerListener(mSensorListener, mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER), SensorManager.SENSOR_DELAY_UI);
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        // Logs 'app deactivate' App Event.
        AppEventsLogger.deactivateApp(this);
        //mSensorManager.unregisterListener(mSensorListener);
    }

    @Override
    protected void onActivityResult(final int requestCode, final int resultCode, final Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        callbackManager.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_CANCELED)
        {
            btEmail.setBackground(getResources().getDrawable(R.drawable.bt_enviar_email_not_pressed));
        }
        else if(resultCode == RESULT_OK)
        {
            try
            {

            }
            catch (Exception e)
            {
                Toast.makeText(getApplicationContext(), e.toString(), Toast.LENGTH_SHORT).show();
            }
        }
    }
}
