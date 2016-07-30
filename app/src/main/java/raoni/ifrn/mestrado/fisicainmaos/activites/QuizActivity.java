package raoni.ifrn.mestrado.fisicainmaos.activites;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Collections;
import java.util.List;

import raoni.ifrn.mestrado.fisicainmaos.R;
import raoni.ifrn.mestrado.fisicainmaos.helpers.BancoDadosPerguntas;
import raoni.ifrn.mestrado.fisicainmaos.helpers.Questao;

public class QuizActivity extends Activity
{
    private List<Questao> arrayListQuestao;
    private int pontuacao;
    private int erros = 0;
    private int acertos = 0;
    private int quantidadeQuestoesJogadas = 0;
    private Questao questaoAtual;
    private Button btPular;
    private RadioGroup rgQuiz;
    private RadioButton rbAssertivaA;
    private RadioButton rbAssertivaB;
    private RadioButton rbAssertivaC;
    private RadioButton rbAssertivaD;
    private RadioButton answer;
    private BancoDadosPerguntas bancoDadosPerguntas = new BancoDadosPerguntas(this);
    private TextView tvPergunta;
    private Bundle bundleTelaQuiz;
    private Bundle bundle;
    private Intent intentTelaQuiz;
    private Intent intent;
    private RelativeLayout rlPrincipal;
    private int quantidadePulos = 3;
    private ScrollView scrollView;
    MediaPlayer mediaPlayer = null;
    Button btTerminar;
    private int teste = 0;

    TextView tvcodigo;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_quiz);

        setup();
    }

    private void setup()
    {
        intent = getIntent();
        bundle = getIntent().getExtras();

        setupRelativeLayout();
        setupTextViews();
        setupRadioGroup();
        setupRadioButtons();
        checkQuestion();
        setupScrollViews();
        startQuis();
        setupButtons();
        endGame();
    }

    private void setupButtons()
    {
        //
        btTerminar = (Button) findViewById(R.id.bt_terminar_quiz);
    }

    private void endGame()
    {
        btTerminar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                hideComponents();
                bundleTelaQuiz = new Bundle();
                bundleTelaQuiz.putInt("acertos", acertos);
                bundleTelaQuiz.putInt("erros", erros);
                //bundleTelaQuiz.putInt("pulos", pulosUtilizados);
                intentTelaQuiz = new Intent(getApplicationContext(), QuizResultadoActivity.class);
                intentTelaQuiz.putExtras(bundleTelaQuiz);
                startActivityForResult(intentTelaQuiz, 98);
            }
        });
    }

    private void setupScrollViews()
    {
        //
        scrollView = (ScrollView) findViewById(R.id.sv_quis);
    }

    private void startQuis()
    {
        toast("toque na tela para iniciar");
        rlPrincipal.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                showComponents();
            }
        });
    }

    private void showComponents()
    {
        tvPergunta.setVisibility(View.VISIBLE);
        scrollView.setVisibility(View.VISIBLE);
        btTerminar.setVisibility(View.VISIBLE);

        arrayListQuestao = bancoDadosPerguntas.pegarTodasQuestoes(bundle.getInt("tema"), bundle.getInt("assunto"));
        teste = arrayListQuestao.size();

        questaoAtual = arrayListQuestao.get(0);

        newQuestion();

        rlPrincipal.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
            }
        });
    }

    private void setupRelativeLayout()
    {
        //
        rlPrincipal = (RelativeLayout) findViewById(R.id.rl_principal);
    }

    private void checkQuestion()
    {
        rgQuiz.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                if (
                        rbAssertivaA.isChecked() || rbAssertivaB.isChecked()
                                || rbAssertivaC.isChecked() || rbAssertivaD.isChecked())
                {
                    intentTelaQuiz = new Intent(getApplicationContext(), QuizConfirmaRespostaActivity.class);

                    int resID = getApplicationContext().getResources().getIdentifier("clicou", "raw", getApplicationContext().getPackageName());
                    playSound(resID);
                    startActivityForResult(intentTelaQuiz, 0);
                }
            }
        });
    }

    private void setupTextViews()
    {
        tvPergunta = (TextView) findViewById(R.id.tela_quiz_tv_pergunta);
        tvPergunta.setTextColor(getResources().getColor(R.color.branco));
        tvPergunta.setShadowLayer(3, 0, 0, getResources().getColor(R.color.verde));

        Typeface font = Typeface.createFromAsset(getApplicationContext().getAssets(), "fonts/footlight_mt_light.ttf");
        tvPergunta.setTypeface(font);
    }

    private void setupRadioGroup()
    {
        //
        rgQuiz = (RadioGroup)findViewById(R.id.tela_quiz_rg_quiz);
    }

    private void setupRadioButtons()
    {
        rbAssertivaA = (RadioButton) findViewById(R.id.tela_quiz_rb_acertiva_a);
        rbAssertivaB = (RadioButton) findViewById(R.id.tela_quiz_rb_acertiva_b);
        rbAssertivaC = (RadioButton) findViewById(R.id.tela_quiz_rb_acertiva_c);
        rbAssertivaD = (RadioButton) findViewById(R.id.tela_quiz_rb_acertiva_d);

        Typeface font = Typeface.createFromAsset(getApplicationContext().getAssets(), "fonts/footlight_mt_light.ttf");
        rbAssertivaA.setTypeface(font);
        rbAssertivaB.setTypeface(font);
        rbAssertivaC.setTypeface(font);
        rbAssertivaD.setTypeface(font);

        //rbAssertivaA.setTextColor(getResources().getColor(R.color.branco));
        //rbAssertivaA.setShadowLayer(3, 0, 0, getResources().getColor(R.color.DeepSkyBlue));
        //rbAssertivaB.setTextColor(getResources().getColor(R.color.branco));
        //rbAssertivaB.setShadowLayer(3, 0, 0, getResources().getColor(R.color.DeepSkyBlue));
        //rbAssertivaC.setTextColor(getResources().getColor(R.color.branco));
        //rbAssertivaC.setShadowLayer(3, 0, 0, getResources().getColor(R.color.DeepSkyBlue));
        //rbAssertivaD.setTextColor(getResources().getColor(R.color.branco));
        //rbAssertivaD.setShadowLayer(3, 0, 0, getResources().getColor(R.color.DeepSkyBlue));
    }

    private void newQuestion()
    {
        tvPergunta.setText(Html.fromHtml(questaoAtual.getQuestao()));
        //tvcodigo.setText(Html.fromHtml(questaoAtual.getTema() + ""));
        rbAssertivaA.setText(Html.fromHtml(questaoAtual.getQuestaoAssertivaA()));
        rbAssertivaB.setText(Html.fromHtml(questaoAtual.getQuestaoAssertivaB()));
        rbAssertivaC.setText(Html.fromHtml(questaoAtual.getQuestaoAssertivaC()));
        rbAssertivaD.setText(Html.fromHtml(questaoAtual.getQuestaoAssertivaD()));
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent)
    {
        rgQuiz = (RadioGroup) findViewById(R.id.tela_quiz_rg_quiz);

        if (resultCode == RESULT_CANCELED)
        {
            resetaAssertivas();
        }
        else if (resultCode == RESULT_OK)
        {
            try
            {
                bundleTelaQuiz = intent.getExtras();
                answer = (RadioButton) findViewById(rgQuiz.getCheckedRadioButtonId());

                quantidadeQuestoesJogadas++;

                if (bundleTelaQuiz.getInt("chave") == 1)
                {
                    finish();
                }
                else if(bundleTelaQuiz.getInt("finalizaJogo") == 343)
                {
                    Bundle bundle = new Bundle();
                    bundle.putInt("finalizaJogo", 356);
                    Intent intent2 = new Intent();
                    intent2.putExtras(bundle);
                    setResult(RESULT_OK, intent2);
                    finish();
                }
                else if (bundleTelaQuiz.getInt("chave") == 99)
                {

                    String resposta = answer.getText().toString();
                    String verificadorQuestao = Html.fromHtml(questaoAtual.getQuestaoResposta()).toString();

                    if(resposta.equals(verificadorQuestao))
                    {
                        acertos++;
                        int resID = getApplicationContext().getResources().getIdentifier("acertou", "raw", getApplicationContext().getPackageName());
                        playSound(resID);
                        //tvQuantidadeAcertos.setText("acertos: " + acertos);
                        toast("você acertou");
                    }
                    if(!resposta.equals(verificadorQuestao))
                    {
                        erros++;
                        int resID = getApplicationContext().getResources().getIdentifier("no", "raw", getApplicationContext().getPackageName());
                        playSound(resID);
                        //tvQuantidadeErros.setText("erros: " + erros);
                        toast("você errou");
                    }
                    if(quantidadeQuestoesJogadas < teste)
                    {
                        arrayListQuestao.remove(0);
                        Collections.shuffle(arrayListQuestao);
                        questaoAtual = arrayListQuestao.get(0);
                        newQuestion();
                    }
                    else if (quantidadeQuestoesJogadas == teste)
                    {
                        //arrayListQuestao.remove(0);
                        hideComponents();
                        bundleTelaQuiz = new Bundle();
                        bundleTelaQuiz.putInt("acertos", acertos);
                        bundleTelaQuiz.putInt("erros", erros);
                        //bundleTelaQuiz.putInt("pulos", pulosUtilizados);
                        intentTelaQuiz = new Intent(getApplicationContext(), QuizResultadoActivity.class);
                        intentTelaQuiz.putExtras(bundleTelaQuiz);
                        startActivityForResult(intentTelaQuiz, 98);
                    }
                }
            }
            catch (Exception e)
            {
                toast(e.toString());
            }
            resetaAssertivas();
        }
    }

    private void resetaAssertivas()
    {
        //
        rgQuiz.clearCheck();
    }

    private void hideComponents()
    {
        scrollView.setVisibility(View.GONE);
        btTerminar.setVisibility(View.GONE);
        tvPergunta.setVisibility(View.GONE);
        rlPrincipal.setVisibility(View.VISIBLE);
    }

    private void toast(String mensagem)
    {
        //
        Toast.makeText(getApplicationContext(), mensagem, Toast.LENGTH_SHORT).show();
    }

    public void playSound(int id)
    {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), id);
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
        {
            public void onCompletion(MediaPlayer mp)
            {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
        mediaPlayer.start();
    }

    @Override
    protected void onResume()
    {
        //
        super.onResume();
    }
}
