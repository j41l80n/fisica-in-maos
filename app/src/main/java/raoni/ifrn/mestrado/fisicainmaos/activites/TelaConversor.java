package raoni.ifrn.mestrado.fisicainmaos.activites;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import raoni.ifrn.mestrado.fisicainmaos.R;

public class TelaConversor extends Activity
{
    private EditText etTelaConversorValorEntrada;
    private Spinner spTelaConversorGrandeza;
    private Spinner spTelaConversorValorEntrada;
    private Spinner spTelaConversorValorSaida;
    private TextView tvTelaConversorValorSaida;

    private int codigoGrandeza;
    private int codigoEntrada;
    private int codigoSaida;

    Double valorSaida = 0.0;
    ArrayAdapter<String> adaptador;
    ImageView ivTelaConversorSeta;

    private static final String[] GRANDEZAS = new String[]
    {"",
            "Comprimento",
            "Velocidade",
            "Área",
            "Volume",
            "Tempo",
            "Massa",
            "Densidade",
            "Pressão"};

    private static final String[] UNIDADES_COMPRIMENTO = new String[]
    {"",
            "km",
            "hm",
            "dam",
            "m",
            "dm",
            "dm",
            "mm",
            "pé",
            "polegadas",
            "jarda",
            "milha",
            "anos-luz"};

    private static final String[] UNIDADES_VELOCIDADE = new String[]
    {"",
            "km/h",
            "m/s",
            "milhas/h",
            "nó"};

    private static final String[] UNIDADES_AREA = new String[]
    {"",
            "km²",
            "m²",
            "cm²",
            "hectare(ha)",
            "acre"};

    private static final String[] UNIDADES_VOLUME = new String[]
    {"",
            "km³",
            "m³",
            "cm³",
            "mm³",
            "l",
            "barril",
            "galão"};

    private static final String[] UNIDADES_TEMPO = new String[]
    {"",
            "s",
            "min",
            "h",
            "dias",
            "mês",
            "ano"};

    private static final String[] UNIDADES_MASSA = new String[]
    {"",
            "kg",
            "g",
            "t (Tonelada)"};

    private static final String[] UNIDADES_DENSIDADE = new String[]
    {"",
            "g/cm³",
            "kg/m³",
            "g/m³",
            "mg/m³"};

    private static final String[] UNIDADES_PRESSAO = new String[]
    {"",
            "Pa",
            "atm",
            "bar",
            "psi"};

    //create
    public void onCreate(Bundle savedInstanceState)
    {
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_conversor);


        configuraEditText();
        configuraSpinner();
        configuraImageView();
        girarImagem(2000);
        configuraTextview();

        ArrayAdapter<String> adp = new ArrayAdapter<>(this, R.layout.spinner_textview, GRANDEZAS);
        adp.setDropDownViewResource(R.layout.spinner_textview);
        spTelaConversorGrandeza.setAdapter(adp);

        spGrandeza();
        spValorEntrada();
        spValorSaida();
        editTextValorEntrada();
    }

    //configura textviews
    private void configuraTextview()
    {
        TextView tvGrandeza = (TextView) findViewById(R.id.tv_grandeza);
        TextView tvValorEntrada = (TextView) findViewById(R.id.tv_ve);
        TextView tvValorSaida = (TextView) findViewById(R.id.tv_vsaid);

        Typeface font2 = Typeface.createFromAsset(getAssets(), "fonts/appleberry.ttf");
        tvGrandeza.setTypeface(font2);
        tvValorEntrada.setTypeface(font2);
        tvValorSaida.setTypeface(font2);

        tvTelaConversorValorSaida = (TextView) findViewById(R.id.tv_tela_conversor_valor_saida);
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/caviar_negrito.ttf");
        tvTelaConversorValorSaida.setTypeface(font);
    }

    //configura imageviews
    private void configuraImageView()
    {
        ivTelaConversorSeta = (ImageView) findViewById(R.id.iv_tela_conversor_seta);
    }

    private void girarImagem(long time)
    {
        //ivTelaConversorSeta.setOnClickListener(new View.OnClickListener()
        //{
        //    @Override
        //    public void onClick(View view)
        //    {
        //        if(!ivTelaConversorSeta.isActivated())
         //       {
                    RotateAnimation anim = new RotateAnimation(0, 360,
                            Animation.RELATIVE_TO_SELF, 0.5f,
                            Animation.RELATIVE_TO_SELF, 0.5f);
                    anim.setInterpolator(new LinearInterpolator());
                    anim.setDuration(time);
                    anim.setRepeatCount(0);

                    ivTelaConversorSeta.startAnimation(anim);

          //      }

           // }
        //});
    }

    //configura spinners
    private void configuraSpinner()
    {
        spTelaConversorGrandeza = (Spinner) findViewById(R.id.sp_tela_conversor_grandeza);
        spTelaConversorValorEntrada = (Spinner) findViewById(R.id.sp_tela_conversor_valor_entrada);
        spTelaConversorValorSaida = (Spinner) findViewById(R.id.sp_tela_conversor_valor_saida);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.spinner_textview, GRANDEZAS);
        spTelaConversorGrandeza.setAdapter(adapter);

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, R.layout.spinner_textview, UNIDADES_COMPRIMENTO);
        spTelaConversorValorEntrada.setAdapter(adapter2);

        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, R.layout.spinner_textview, UNIDADES_VELOCIDADE);
        spTelaConversorValorSaida.setAdapter(adapter3);

    }

    //configura edittexts
    private void configuraEditText()
    {
        etTelaConversorValorEntrada = (EditText) findViewById(R.id.et_tela_conversor_valor_entrada);
    }

    //seleciona a grandeza
    private void spGrandeza()
    {
        spTelaConversorGrandeza.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                if (position == 0)
                {
                    tvTelaConversorValorSaida.setText("");
                    spTelaConversorValorSaida.setSelection(0, true);
                    spTelaConversorValorEntrada.setSelection(0, true);
                    spTelaConversorValorEntrada.setEnabled(false);
                    spTelaConversorValorSaida.setEnabled(false);
                    etTelaConversorValorEntrada.setText("");
                    etTelaConversorValorEntrada.setVisibility(View.GONE);
                    codigoGrandeza = position;
                }
                else
                {
                    switch (position)
                    {
                        case 1:
                            adaptador = new ArrayAdapter<>(getApplicationContext(), R.layout.spinner_textview, UNIDADES_COMPRIMENTO);
                            break;
                        case 2:
                            adaptador = new ArrayAdapter<>(getApplicationContext(), R.layout.spinner_textview, UNIDADES_VELOCIDADE);
                            break;
                        case 3:
                            adaptador = new ArrayAdapter<>(getApplicationContext(), R.layout.spinner_textview, UNIDADES_AREA);
                            break;
                        case 4:
                            adaptador = new ArrayAdapter<>(getApplicationContext(), R.layout.spinner_textview, UNIDADES_VOLUME);
                            break;
                        case 5:
                            adaptador = new ArrayAdapter<>(getApplicationContext(), R.layout.spinner_textview, UNIDADES_TEMPO);
                            break;
                        case 6:
                            adaptador = new ArrayAdapter<>(getApplicationContext(), R.layout.spinner_textview, UNIDADES_MASSA);
                            break;
                        case 7:
                            adaptador = new ArrayAdapter<>(getApplicationContext(), R.layout.spinner_textview, UNIDADES_DENSIDADE);
                            break;
                        case 8:
                            adaptador = new ArrayAdapter<>(getApplicationContext(), R.layout.spinner_textview, UNIDADES_PRESSAO);
                            break;
                    }
                    spTelaConversorValorEntrada.setEnabled(true);
                    etTelaConversorValorEntrada.setVisibility(View.VISIBLE);
                    spTelaConversorValorEntrada.setAdapter(adaptador);
                    spTelaConversorValorSaida.setAdapter(adaptador);
                    codigoGrandeza = position;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    //seleciona o valor de entrada
    private void spValorEntrada()
    {
        spTelaConversorValorEntrada.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                tvTelaConversorValorSaida.setText("");
                spTelaConversorValorSaida.setSelection(0, true);
                etTelaConversorValorEntrada.setVisibility(View.GONE);
                etTelaConversorValorEntrada.setText("");

                if(position == 0)
                {
                    tvTelaConversorValorSaida.setText("");
                    etTelaConversorValorEntrada.setText("");
                    etTelaConversorValorEntrada.setEnabled(false);
                    codigoEntrada = position;
                }
                else
                {
                    etTelaConversorValorEntrada.setVisibility(View.VISIBLE);
                    etTelaConversorValorEntrada.setEnabled(true);
                    codigoEntrada = position;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {
                // sometimes you need nothing here
            }
        });
    }

    //editText para ser inserido a ser convertido
    private void editTextValorEntrada()
    {
        etTelaConversorValorEntrada.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (etTelaConversorValorEntrada.getText().toString().equals("")) {
                    spTelaConversorValorSaida.setEnabled(false);
                    spTelaConversorValorSaida.setSelection(0, true);
                    tvTelaConversorValorSaida.setText("");
                } else if (!etTelaConversorValorEntrada.getText().toString().equals("") &&
                        !tvTelaConversorValorSaida.getText().toString().equals("")) {
                    spTelaConversorValorSaida.setEnabled(true);
                    conversor(Double.parseDouble(etTelaConversorValorEntrada.getText().toString()), codigoEntrada, codigoSaida);
                } else {
                    spTelaConversorValorSaida.setEnabled(true);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                //
            }
        });
    }

    //ao selecionar, o spinner calcula o valor de saida
    private void spValorSaida()
    {
        spTelaConversorValorSaida.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                tvTelaConversorValorSaida.setText("");
                if (position == 0)
                {
                    tvTelaConversorValorSaida.setText("");
                }
                else
                {
                    girarImagem(500);
                    codigoSaida = position;
                    if (!etTelaConversorValorEntrada.getText().toString().equals(""))
                    {
                        conversor(Double.parseDouble(
                                        etTelaConversorValorEntrada.getText().toString()),
                                codigoEntrada, codigoSaida);
                    }
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void conversor(Double valor, int codigoValorEntrada, int codigoValorSaida)
    {
        //--------------- Comprimento --------------

            //--------------------------
            //---------- KM
            //--------------------------
        if(this.codigoGrandeza == 1 && codigoValorEntrada == 1 && codigoValorSaida == 1)
        {
            valorSaida = valor;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 1 && codigoValorSaida == 2)
        {
            //HM
            valorSaida = valor * 10;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 1 && codigoValorSaida == 3)
        {
            //DAM
            valorSaida = valor * 100;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 1 && codigoValorSaida == 4)
        {
            //M
            valorSaida = valor * 1000;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 1 && codigoValorSaida == 5)
        {
            //DM
            valorSaida = valor * 10000;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 1 && codigoValorSaida == 6)
        {
            //CM
            valorSaida = valor * 100000;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 1 && codigoValorSaida == 7)
        {
            //MM
            valorSaida = valor * 1000000;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 1 && codigoValorSaida == 8)
        {
            //PE
            valorSaida = valor * 3280.84;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 1 && codigoValorSaida == 9)
        {
            //POL
            valorSaida = valor * 39370.1;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 1 && codigoValorSaida == 10)
        {
            //JAR
            valorSaida = valor * 1093.61;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 1 && codigoValorSaida == 11)
        {
            //MI
            valorSaida = valor * 0.621371;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 1 && codigoValorSaida == 12)
        {
            //ALU
            valorSaida = valor * (1.057 * Math.pow(10, -13));
        }

            //--------------------------
            //---------- HECTOMETRO
            //--------------------------
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 2 && codigoValorSaida == 1)
        {
            //KM
            valorSaida = valor * 0.1;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 2 && codigoValorSaida == 2)
        {
            //HM
            valorSaida = valor;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 2 && codigoValorSaida == 3)
        {
            //DAM
            valorSaida = valor * 10;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 2 && codigoValorSaida == 4)
        {
            //M
            valorSaida = valor * 100;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 2 && codigoValorSaida == 5)
        {
            //DM
            valorSaida = valor * 1000;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 2 && codigoValorSaida == 6)
        {
            //CM
            valorSaida = valor * 10000;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 2 && codigoValorSaida == 7)
        {
            //MM
            valorSaida = valor * 100000;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 2 && codigoValorSaida == 8)
        {
            //PE
            valorSaida = valor * 328.084;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 2 && codigoValorSaida == 9)
        {
            //POL
            valorSaida = valor * 3937.01;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 2 && codigoValorSaida == 10)
        {
            //JAR
            valorSaida = valor * 109.361;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 2 && codigoValorSaida == 11)
        {
            //MIL
            valorSaida = valor * 0.0621371;

        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 2 && codigoValorSaida == 12)
        {
            //ALU
            valorSaida = valor * (1.057 * Math.pow(10, -14));
        }
            //--------------------------
            //---------- DECAMETRO
            //--------------------------
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 3 && codigoValorSaida == 1)
        {
            //KM
            valorSaida = valor * 0.01;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 3 && codigoValorSaida == 2)
        {
            //HM
            valorSaida = valor * 0.1;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 3 && codigoValorSaida == 3)
        {
            //DAM
            valorSaida = valor;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 3 && codigoValorSaida == 4)
        {
            //M
            valorSaida = valor * 10;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 3 && codigoValorSaida == 5)
        {
            //DM
            valorSaida = valor * 100;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 3 && codigoValorSaida == 6)
        {
            //CM
            valorSaida = valor * 1000;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 3 && codigoValorSaida == 7)
        {
            //MM
            valorSaida = valor * 10000;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 3 && codigoValorSaida == 8)
        {
            //PE
            valorSaida = valor * 32.8084;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 3 && codigoValorSaida == 9)
        {
            //POL
            valorSaida = valor * 393.701;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 3 && codigoValorSaida == 10)
        {
            //JAR
            valorSaida = valor * 10.9361;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 3 && codigoValorSaida == 11)
        {
            //MIL
            valorSaida = valor * 0.00621371;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 3&& codigoValorSaida == 12)
        {
            //ALU
            valorSaida = valor * (1.057 * Math.pow(10, -15));
        }
            //--------------------------
            //---------- METRO
            //--------------------------
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 4 && codigoValorSaida == 1)
        {
            //KM
            valorSaida = valor * Math.pow(10, -3);
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 4 && codigoValorSaida == 2)
        {
            //HM
            valorSaida = valor * Math.pow(10, -2);
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 4 && codigoValorSaida == 3)
        {
            //DAM
            valorSaida = valor * Math.pow(10, -1);
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 4 && codigoValorSaida == 4)
        {
            //M
            valorSaida = valor;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 4 && codigoValorSaida == 5)
        {
            //DM
            valorSaida = valor * 10;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 4 && codigoValorSaida == 6)
        {
            //CM
            valorSaida = valor * 100;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 4 && codigoValorSaida == 7)
        {
            //MM
            valorSaida = valor * 1000;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 4 && codigoValorSaida == 8)
        {
            //PE
            valorSaida = valor * 3.28084;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 4 && codigoValorSaida == 9)
        {
            //POL
            valorSaida = valor * 39.3701;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 4 && codigoValorSaida == 10)
        {
            //JAR
            valorSaida = valor * 1.09361;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 4 && codigoValorSaida == 11)
        {
            //MIL
            valorSaida = valor * 0.000621371;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 4 && codigoValorSaida == 12)
        {
            //ALU
            valorSaida = valor * (1.057 * Math.pow(10, -16));
        }
            //--------------------------
            //---------- DECIMETRO
            //--------------------------
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 5 && codigoValorSaida == 1)
        {
            //KM
            valorSaida = valor * 0.0001;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 5 && codigoValorSaida == 2)
        {
            //HM
            valorSaida = valor * 0.001;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 5 && codigoValorSaida == 3)
        {
            //DAM
            valorSaida = valor * 0.01;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 5 && codigoValorSaida == 4)
        {
            //M
            valorSaida = valor * 0.1;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 5 && codigoValorSaida == 5)
        {
            //DM
            valorSaida = valor;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 5 && codigoValorSaida == 6)
        {
            //CM
            valorSaida = valor * 10;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 5 && codigoValorSaida == 7)
        {
            //MM
            valorSaida = valor * 100;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 5 && codigoValorSaida == 8)
        {
            //PE
            valorSaida = valor * 0.328084;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 5 && codigoValorSaida == 9)
        {
            //POL
            valorSaida = valor * 3.93701;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 5 && codigoValorSaida == 10)
        {
            //JAR
            valorSaida = valor * 0.109361;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 5 && codigoValorSaida == 11)
        {
            //MIL
            valorSaida = valor * Math.pow(6.21371, -5);
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 5 && codigoValorSaida == 12)
        {
            //ALU
           // valorSaida = valor * (1.057 * Math.pow(10, -13));
            valorSaida = valor * (1.057 * Math.pow(10, -17));
        }
            //--------------------------
            //---------- CENTIMETRO
            //--------------------------
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 6 && codigoValorSaida == 1)
        {
            //KM
            valorSaida = valor * Math.pow(1, -5);
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 6 && codigoValorSaida == 2)
        {
            //HM
            valorSaida = valor * Math.pow(1, -4);
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 6 && codigoValorSaida == 3)
        {
            //DAM
            valorSaida = valor * Math.pow(1, -3);
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 6 && codigoValorSaida == 4)
        {
            //M
            valorSaida = valor * Math.pow(1, -2);
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 6 && codigoValorSaida == 5)
        {
            //DM
            valorSaida = valor * Math.pow(1, -1);
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 6 && codigoValorSaida == 6)
        {
            //CM
            valorSaida = valor;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 6 && codigoValorSaida == 7)
        {
            //MM
            valorSaida = valor * 10;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 6 && codigoValorSaida == 8)
        {
            //PE
            valorSaida = valor * 0.0328084;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 6 && codigoValorSaida == 9)
        {
            //POL
            valorSaida = valor * 0.393701;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 6 && codigoValorSaida == 10)
        {
            //JAR
            valorSaida = valor * 0.0109361;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 6 && codigoValorSaida == 11)
        {
            //MIL
            valorSaida = valor * Math.pow(6.21371, -6);
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 6 && codigoValorSaida == 12)
        {
            //ALU
            valorSaida = valor * (1.057 * Math.pow(10, -18));
        }
            //--------------------------
            //---------- MM
            //--------------------------
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 7 && codigoValorSaida == 1)
        {
            //KM
            valorSaida = valor * Math.pow(1, -6);
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 7 && codigoValorSaida == 2)
        {
            //HM
            valorSaida = valor * Math.pow(1, -5);
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 7 && codigoValorSaida == 3)
        {
            //DAM
            valorSaida = valor * Math.pow(1, -4);
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 7 && codigoValorSaida == 4)
        {
            //M
            valorSaida = valor * Math.pow(1, -3);
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 7 && codigoValorSaida == 5)
        {
            //DM
            valorSaida = valor * Math.pow(1, -2);
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 7 && codigoValorSaida == 6)
        {
            //CM
            valorSaida = valor * Math.pow(1, -1);
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 7 && codigoValorSaida == 7)
        {
            //MM
            valorSaida = valor;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 7 && codigoValorSaida == 8)
        {
            //PE
            valorSaida = valor * 0.00328084;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 7&& codigoValorSaida == 9)
        {
            //POL
            valorSaida = valor * 0.0393701;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 7 && codigoValorSaida == 10)
        {
            //JAR
            valorSaida = valor * 0.00109361;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 7 && codigoValorSaida == 11)
        {
            //MIL
            valorSaida = valor * Math.pow(6.21371, -7);
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 7 && codigoValorSaida == 12)
        {
            //ALU
            valorSaida = valor * (1.057 * Math.pow(10, -19));
        }
            //--------------------------
            //---------- PE
            //--------------------------
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 8 && codigoValorSaida == 1)
        {
            //KM
            valorSaida = valor * 0.0003048;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 8 && codigoValorSaida == 2)
        {
            //HM
            valorSaida = valor * 0.003048;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 8 && codigoValorSaida == 3)
        {
            //DAM
            valorSaida = valor * 0.03048;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 8 && codigoValorSaida == 4)
        {
            //M
            valorSaida = valor * 0.3048;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 8 && codigoValorSaida == 5)
        {
            //DM
            valorSaida = valor * 3.048;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 8 && codigoValorSaida == 6)
        {
            //CM
            valorSaida = valor * 30.48;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 8 && codigoValorSaida == 7)
        {
            //MM
            valorSaida = valor * 304.8;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 8 && codigoValorSaida == 8)
        {
            //PE
            valorSaida = valor;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 8 && codigoValorSaida == 9)
        {
            //POL
            valorSaida = valor * 12;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 8 && codigoValorSaida == 10)
        {
            //JAR
            valorSaida = valor * 0.333333;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 8 && codigoValorSaida == 11)
        {
            //MIL
            valorSaida = valor * 0.000189394;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 8 && codigoValorSaida == 12)
        {
            //ALU
            valorSaida = valor * (3.22174 * Math.pow(10, -17));
        }
            //--------------------------
            //---------- POLEGADAS
            //--------------------------
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 9 && codigoValorSaida == 1)
        {
            //KM
            valorSaida = valor * Math.pow(2.54, -5);
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 9 && codigoValorSaida == 2)
        {
            //HM
            valorSaida = valor * 0.000254;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 9 && codigoValorSaida == 3)
        {
            //DAM
            valorSaida = valor * 0.00254;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 9 && codigoValorSaida == 4)
        {
            //M
            valorSaida = valor * 0.0254;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 9 && codigoValorSaida == 5)
        {
            //DM
            valorSaida = valor * 0.254;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 9 && codigoValorSaida == 6)
        {
            //CM
            valorSaida = valor * 2.54;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 9 && codigoValorSaida == 7)
        {
            //MM
            valorSaida = valor * 25.4;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 9 && codigoValorSaida == 8)
        {
            //PE
            valorSaida = valor * 0.0833333;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 9 && codigoValorSaida == 9)
        {
            //POL
            valorSaida = valor;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 9 && codigoValorSaida == 10)
        {
            //JAR
            valorSaida = valor * 0.0277778;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 9 && codigoValorSaida == 11)
        {
            //MIL
            valorSaida = valor * Math.pow(1.57828, -5);
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 9 && codigoValorSaida == 12)
        {
            //ALU
            valorSaida = valor * (2.68478 * Math.pow(10, -18));
        }
            //--------------------------
            //---------- JARDA
            //--------------------------
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 10 && codigoValorSaida == 1)
        {
            //KM
            valorSaida = valor * 0.0009144;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 10 && codigoValorSaida == 2)
        {
            //HM
            valorSaida = valor * 0.009144;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 10 && codigoValorSaida == 3)
        {
            //DAM
            valorSaida = valor * 0.09144;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 10 && codigoValorSaida == 4)
        {
            //M
            valorSaida = valor * 0.9144;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 10 && codigoValorSaida == 5)
        {
            //DM
            valorSaida = valor * 9.144;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 10 && codigoValorSaida == 6)
        {
            //CM
            valorSaida = valor * 91.44;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 10 && codigoValorSaida == 7)
        {
            //MM
            valorSaida = valor * 914.4;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 10 && codigoValorSaida == 8)
        {
            //PE
            valorSaida = valor * 3;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 10 && codigoValorSaida == 9)
        {
            //POL
            valorSaida = valor * 36;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 10 && codigoValorSaida == 10)
        {
            //JAR
            valorSaida = valor;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 10 && codigoValorSaida == 11)
        {
            //MIL
            valorSaida = valor * 0.000568182;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 10 && codigoValorSaida == 12)
        {
            //ALU
            valorSaida = valor * (9.66522 * Math.pow(10, -17));
        }

            //--------------------------
            //---------- MILHA
            //--------------------------
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 11 && codigoValorSaida == 1)
        {
            //KM
            valorSaida = valor * 1.60934;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 11 && codigoValorSaida == 2)
        {
            //HM
            valorSaida = valor * 16.0934;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 11 && codigoValorSaida == 3)
        {
            //DAM
            valorSaida = valor * 160.934;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 11 && codigoValorSaida == 4)
        {
            //M
            valorSaida = valor * 1609.34;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 11 && codigoValorSaida == 5)
        {
            //DM
            valorSaida = valor * 16093.4;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 11 && codigoValorSaida == 6)
        {
            //CM
            valorSaida = valor * 160934;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 11 && codigoValorSaida == 7)
        {
            //MM
            valorSaida = valor * Math.pow(1.609, 6);
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 11 && codigoValorSaida == 8)
        {
            //PE
            valorSaida = valor * 5280;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 11 && codigoValorSaida == 9)
        {
            //POL
            valorSaida = valor * 63360;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 11 && codigoValorSaida == 10)
        {
            //JAR
            valorSaida = valor * 1760;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 11 && codigoValorSaida == 11)
        {
            //MIL
            valorSaida = valor;
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 11 && codigoValorSaida == 12)
        {
            //ALU
            valorSaida = valor * (1.70108 * Math.pow(10, -13));
        }

            //--------------------------
            //---------- ANOS LUZ
            //--------------------------
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 12 && codigoValorSaida == 1)
        {
            //KM
            valorSaida = valor * (9.461 * Math.pow(10, 12));
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 12 && codigoValorSaida == 2)
        {
            //HM
            valorSaida = valor * (9.461 * Math.pow(10, 13));
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 12 && codigoValorSaida == 3)
        {
            //DAM
            valorSaida = valor * (9.461 * Math.pow(10, 14));
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 12 && codigoValorSaida == 4)
        {
            //M
            valorSaida = valor * (9.461 * Math.pow(10, 15));
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 12 && codigoValorSaida == 5)
        {
            //DM
            valorSaida = valor * (9.461 * Math.pow(10, 16));
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 12 && codigoValorSaida == 6)
        {
            //CM
            valorSaida = valor * (9.461 * Math.pow(10, 17));
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 12 && codigoValorSaida == 7)
        {
            //MM
            valorSaida = valor * (9.461 * Math.pow(10, 18));
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 12 && codigoValorSaida == 8)
        {
            //PE
            valorSaida = valor * (3.104 * Math.pow(10, 16));
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 12 && codigoValorSaida == 9)
        {
            //POL
            valorSaida = valor * (3.725 * Math.pow(10, 17));
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 12 && codigoValorSaida == 10)
        {
            //JAR
            valorSaida = valor * (1.035 * Math.pow(10, 16));
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 12 && codigoValorSaida == 11)
        {
            //MIL
            valorSaida = valor * (5.879 * Math.pow(10, 12));
        }
        else if(this.codigoGrandeza == 1 && codigoValorEntrada == 12 && codigoValorSaida == 12)
        {
            //ALU
            valorSaida = valor;
        }

        //--------------- Velocidade --------------
            //---------- KM^2
        else if(this.codigoGrandeza == 2 && codigoValorEntrada == 1 && codigoValorSaida == 1)
        {
            //KM/H
            valorSaida = valor;
        }
        else if(this.codigoGrandeza == 2 && codigoValorEntrada == 1 && codigoValorSaida == 2)
        {
            //M/S
            valorSaida = valor / 3.6;
        }
        else if(this.codigoGrandeza == 2 && codigoValorEntrada == 1 && codigoValorSaida == 3)
        {
            //MIL/S
            valorSaida = valor * 0.621;
        }
        else if(this.codigoGrandeza == 2 && codigoValorEntrada == 1 && codigoValorSaida == 4) {
            //NO
            valorSaida = valor * 0.54;
        }

            //---------- m/s
        else if(this.codigoGrandeza == 2 && codigoValorEntrada == 2 && codigoValorSaida == 1)
        {
            //KM/H
            valorSaida = valor * 3.6;
        }
        else if(this.codigoGrandeza == 2 && codigoValorEntrada == 2 && codigoValorSaida == 2)
        {
            //M/S
            valorSaida = valor;
        }
        else if(this.codigoGrandeza == 2 && codigoValorEntrada == 2 && codigoValorSaida == 3)
        {
            //MIL/S
            valorSaida = valor * 2.237;
        }
        else if(this.codigoGrandeza == 2 && codigoValorEntrada == 2 && codigoValorSaida == 4)
        {
            //NO
            valorSaida = valor * 1.944;
        }

        //---------- MILHAS/H
        else if(this.codigoGrandeza == 2 && codigoValorEntrada == 3 && codigoValorSaida == 1)
        {
            //KM/H
            valorSaida = valor * 1.609;
        }
        else if(this.codigoGrandeza == 2 && codigoValorEntrada == 3 && codigoValorSaida == 2)
        {
            //M/S
            valorSaida = valor * 0.447;
        }
        else if(this.codigoGrandeza == 2 && codigoValorEntrada == 3 && codigoValorSaida == 3)
        {
            //MIL/S
            valorSaida = valor;
        }
        else if(this.codigoGrandeza == 2 && codigoValorEntrada == 3 && codigoValorSaida == 4)
        {
            //NO
            valorSaida = valor * 0.869;
        }

        //---------- NO
        else if(this.codigoGrandeza == 2 && codigoValorEntrada == 4 && codigoValorSaida == 1)
        {
            //KM/H
            valorSaida = valor * 1.852;
        }
        else if(this.codigoGrandeza == 2 && codigoValorEntrada == 4 && codigoValorSaida == 2)
        {
            //M/S
            valorSaida = valor * 0.514;
        }
        else if(this.codigoGrandeza == 2 && codigoValorEntrada == 4 && codigoValorSaida == 3)
        {
            //MIL/S
            valorSaida = valor * 1.151;
        }
        else if(this.codigoGrandeza == 2 && codigoValorEntrada == 4 && codigoValorSaida == 4)
        {
            //NO
            valorSaida = valor;
        }

        //--------------- Area --------------
            //---------- Km^2
        else if(this.codigoGrandeza == 3 && codigoValorEntrada == 1 && codigoValorSaida == 1)
        {
            //KM2
            valorSaida = valor;
        }
        else if(this.codigoGrandeza == 3 && codigoValorEntrada == 1 && codigoValorSaida == 2)
        {
            //M2
            valorSaida = valor * 1000000;

        }
        else if(this.codigoGrandeza == 3 && codigoValorEntrada == 1 && codigoValorSaida == 3)
        {
            //CM2
            valorSaida = valor * 10000000000.0;

        }
        else if(this.codigoGrandeza == 3 && codigoValorEntrada == 1 && codigoValorSaida == 4)
        {
            //HECTARE(HA)
            valorSaida = valor * 100;

        }
        else if(this.codigoGrandeza == 3 && codigoValorEntrada == 1 && codigoValorSaida == 5)
        {
            //HA
            valorSaida = valor * 247.106;

        }

            //---------- m^2
        else if(this.codigoGrandeza == 3 && codigoValorEntrada == 2 && codigoValorSaida == 1)
        {
            //KM2
            valorSaida = valor * Math.pow(10, -6);
        }
        else if(this.codigoGrandeza == 3 && codigoValorEntrada == 2 && codigoValorSaida == 2)
        {
            //M2
            valorSaida = valor;
        }
        else if(this.codigoGrandeza == 3 && codigoValorEntrada == 2 && codigoValorSaida == 3)
        {
            //CM2
            valorSaida = valor * 10000;
        }
        else if(this.codigoGrandeza == 3 && codigoValorEntrada == 2 && codigoValorSaida == 4)
        {
            //HECTARE(HA)
            valorSaida = valor * Math.pow(10, -4);

        }
        else if(this.codigoGrandeza == 3 && codigoValorEntrada == 2 && codigoValorSaida == 5)
        {
            //ACRE
            valorSaida = valor * (2.471 * Math.pow(10, -4));

        }

            //---------- cm^2
        else if(this.codigoGrandeza == 3 && codigoValorEntrada == 3 && codigoValorSaida == 1)
        {
            //KM^2
            valorSaida = valor * (10 * Math.pow(10, -11));
        }
        else if(this.codigoGrandeza == 3 && codigoValorEntrada == 3 && codigoValorSaida == 2)
        {
            //M^2
            valorSaida = valor * Math.pow(10, -4);
        }
        else if(this.codigoGrandeza == 3 && codigoValorEntrada == 3 && codigoValorSaida == 3)
        {
            //CM^2
            valorSaida = valor;

        }
        else if(this.codigoGrandeza == 3 && codigoValorEntrada == 3 && codigoValorSaida == 4)
        {
            //HECTARE(HA)
            valorSaida = valor * Math.pow(10, -8);

        }
        else if(this.codigoGrandeza == 3 && codigoValorEntrada == 3 && codigoValorSaida == 5)
        {
            //ACRE
            valorSaida = valor * (2.471 * Math.pow(10, -8));

        }

            //---------- hectare
        else if(this.codigoGrandeza == 3 && codigoValorEntrada == 4 && codigoValorSaida == 1)
        {
            // HECTARE (HA) -> KM2
            valorSaida = valor * 0.01;

        }
        else if(this.codigoGrandeza == 3 && codigoValorEntrada == 4 && codigoValorSaida == 2)
        {
            //M2
            valorSaida = valor * 10000;

        }
        else if(this.codigoGrandeza == 3 && codigoValorEntrada == 4 && codigoValorSaida == 3)
        {
            //CM2
            valorSaida = valor * 100000000;

        }
        else if(this.codigoGrandeza == 3 && codigoValorEntrada == 4 && codigoValorSaida == 4)
        {
            //HECTARE(HA)
            valorSaida = valor;

        }
        else if(this.codigoGrandeza == 3 && codigoValorEntrada == 4 && codigoValorSaida == 5)
        {
            //ACRE
            valorSaida = valor * 2.471;

        }

        //---------- acre
        else if(this.codigoGrandeza == 3 && codigoValorEntrada == 5 && codigoValorSaida == 1)
        {
            //KM2
            valorSaida = valor * 0.004;

        }
        else if(this.codigoGrandeza == 3 && codigoValorEntrada == 5 && codigoValorSaida == 2)
        {
            //M2
            valorSaida = valor * 4046.854;

        }
        else if(this.codigoGrandeza == 3 && codigoValorEntrada == 5 && codigoValorSaida == 3)
        {
            //CM2
            valorSaida = valor * 40468544.812;

        }
        else if(this.codigoGrandeza == 3 && codigoValorEntrada == 5 && codigoValorSaida == 4)
        {
            //HECTARE(HA)
            valorSaida = valor * 0.405;

        }
        else if(this.codigoGrandeza == 3 && codigoValorEntrada == 5 && codigoValorSaida == 5)
        {
            //ACRE
            valorSaida = valor;
        }

        //--------------- Volume --------------
            //---------- Km^3
        else if(this.codigoGrandeza == 4 && codigoValorEntrada == 1 && codigoValorSaida == 1)
        {
            //KM3
            valorSaida = valor;
        }
        else if(this.codigoGrandeza == 4 && codigoValorEntrada == 1 && codigoValorSaida == 2)
        {
            //M3
            valorSaida = valor * 1000000000;
        }
        else if(this.codigoGrandeza == 4 && codigoValorEntrada == 1 && codigoValorSaida == 3)
        {
            //CM3
            valorSaida = valor * Math.pow(10, 15);
        }
        else if(this.codigoGrandeza == 4 && codigoValorEntrada == 1 && codigoValorSaida == 4)
        {
            //MM3
            valorSaida = valor * Math.pow(10, 18);
        }
        else if(this.codigoGrandeza == 4 && codigoValorEntrada == 1 && codigoValorSaida == 5)
        {
            //L
            valorSaida = valor * Math.pow(10, 12);
        }
        else if(this.codigoGrandeza == 4 && codigoValorEntrada == 1 && codigoValorSaida == 6)
        {
            //BARRIL
            valorSaida = valor * 6110602000.0;
        }
        else if(this.codigoGrandeza == 4 && codigoValorEntrada == 1 && codigoValorSaida == 7)
        {
            //GALAO
            valorSaida = valor * 219968800000.0;
        }

            //---------- m^3
        else if(this.codigoGrandeza == 4 && codigoValorEntrada == 2 && codigoValorSaida == 1)
        {
            //KM3
            valorSaida = valor * Math.pow(10, -9);
        }
        else if(this.codigoGrandeza == 4 && codigoValorEntrada == 2 && codigoValorSaida == 2)
        {
            //M3
            valorSaida = valor;
        }
        else if(this.codigoGrandeza == 4 && codigoValorEntrada == 2 && codigoValorSaida == 3)
        {
            //CM3
            valorSaida = valor * 1000000 ;
        }
        else if(this.codigoGrandeza == 4 && codigoValorEntrada == 2 && codigoValorSaida == 4)
        {
            //MM3
            valorSaida = valor * 1000000000.0;
        }
        else if(this.codigoGrandeza == 4 && codigoValorEntrada == 2 && codigoValorSaida == 5)
        {
            //L
            valorSaida = valor * 1000;
        }
        else if(this.codigoGrandeza == 4 && codigoValorEntrada == 2 && codigoValorSaida == 6)
        {
            //BARRIL
            valorSaida = valor * 6.111;
        }
        else if(this.codigoGrandeza == 4 && codigoValorEntrada == 2 && codigoValorSaida == 7)
        {
            //GALAO
            valorSaida = valor * 219.969;
        }

        //---------- cm^3
        else if(this.codigoGrandeza == 4 && codigoValorEntrada == 3 && codigoValorSaida == 1)
        {
            //KM3
            valorSaida = valor * Math.pow(10, -15);
        }
        else if(this.codigoGrandeza == 4 && codigoValorEntrada == 3 && codigoValorSaida == 2)
        {
            //M3
            valorSaida = valor * Math.pow(10, -6);
        }
        else if(this.codigoGrandeza == 4 && codigoValorEntrada == 3 && codigoValorSaida == 3)
        {
            //CM3
            valorSaida = valor;

        }
        else if(this.codigoGrandeza == 4 && codigoValorEntrada == 3 && codigoValorSaida == 4)
        {
            //MM3
            valorSaida = valor * 1000;
        }
        else if(this.codigoGrandeza == 4 && codigoValorEntrada == 3 && codigoValorSaida == 5)
        {
            //L
            valorSaida = valor * 0.001;
        }
        else if(this.codigoGrandeza == 4 && codigoValorEntrada == 3 && codigoValorSaida == 6)
        {
            //BARRIL
            valorSaida = valor * (6.111 * Math.pow(10, -6));
        }
        else if(this.codigoGrandeza == 4 && codigoValorEntrada == 3 && codigoValorSaida == 7)
        {
            //GALAO
            valorSaida = valor * (2.2 * Math.pow(10, -4));
        }

            //---------- mm^3
        else if(this.codigoGrandeza == 4 && codigoValorEntrada == 4 && codigoValorSaida == 1)
        {
            // MM3 -> KM3
            valorSaida = valor * Math.pow(10, -18);
        }
        else if(this.codigoGrandeza == 4 && codigoValorEntrada == 4 && codigoValorSaida == 2)
        {
            //M3
            valorSaida = valor * Math.pow(10, -9);
        }
        else if(this.codigoGrandeza == 4 && codigoValorEntrada == 4 && codigoValorSaida == 3)
        {
            //CM3
            valorSaida = valor * 0.001;
        }
        else if(this.codigoGrandeza == 4 && codigoValorEntrada == 4 && codigoValorSaida == 4)
        {
            //MM3
            valorSaida = valor;
        }
        else if(this.codigoGrandeza == 4 && codigoValorEntrada == 4 && codigoValorSaida == 5)
        {
            //L
            valorSaida = valor * Math.pow(10, -6);
        }
        else if(this.codigoGrandeza == 4 && codigoValorEntrada == 4 && codigoValorSaida == 6)
        {
            //BARRIL
            valorSaida = valor * (6.111 * Math.pow(10, -9));

        }
        else if(this.codigoGrandeza == 4 && codigoValorEntrada == 4 && codigoValorSaida == 7) {
            //GALAO
            valorSaida = valor * (2.2 * Math.pow(10, -7));
        }

            //---------- L
        else if(this.codigoGrandeza == 4 && codigoValorEntrada == 5 && codigoValorSaida == 1)
        {
            //KM3
            valorSaida = valor * (10 * Math.pow(10, -13));
        }
        else if(this.codigoGrandeza == 4 && codigoValorEntrada == 5 && codigoValorSaida == 2)
        {
            //M3
            valorSaida = valor * 0.001;
        }
        else if(this.codigoGrandeza == 4 && codigoValorEntrada == 5 && codigoValorSaida == 3)
        {
            //CM3
            valorSaida = valor * 1000;
        }
        else if(this.codigoGrandeza == 4 && codigoValorEntrada == 5 && codigoValorSaida == 4)
        {
            //MM3
            valorSaida = valor * 1000000;
        }
        else if(this.codigoGrandeza == 4 && codigoValorEntrada == 5 && codigoValorSaida == 5)
        {
            //L
            valorSaida = valor;
        }
        else if(this.codigoGrandeza == 4 && codigoValorEntrada == 5 && codigoValorSaida == 6)
        {
            //BARRIL
            valorSaida = valor * 0.006 ;
        }
        else if(this.codigoGrandeza == 4 && codigoValorEntrada == 5 && codigoValorSaida == 7)
        {
            //GALAO
            valorSaida = valor * 0.22;
        }

            //---------- barril
        else if(this.codigoGrandeza == 4 && codigoValorEntrada == 6 && codigoValorSaida == 1)
        {
            //KM3
            valorSaida = valor * (1.636 * Math.pow(10, -10));
        }
        else if(this.codigoGrandeza == 4 && codigoValorEntrada == 6 && codigoValorSaida == 2)
        {
            //M3
            valorSaida = valor * 0.164;
        }
        else if(this.codigoGrandeza == 4 && codigoValorEntrada == 6 && codigoValorSaida == 3)
        {
            //CM3
            valorSaida = valor * 163649.997 ;
        }
        else if(this.codigoGrandeza == 4 && codigoValorEntrada == 6 && codigoValorSaida == 4)
        {
            //MM3
            valorSaida = valor * (1.636 * Math.pow(10, -8));
        }
        else if(this.codigoGrandeza == 4 && codigoValorEntrada == 6 && codigoValorSaida == 5)
        {
            //L
            valorSaida = valor * 163.65;
        }
        else if(this.codigoGrandeza == 4 && codigoValorEntrada == 6 && codigoValorSaida == 6)
        {
            //BARRIL
            valorSaida = valor;
        }
        else if(this.codigoGrandeza == 4 && codigoValorEntrada == 6 && codigoValorSaida == 7)
        {
            //GALAO
            valorSaida = valor * 35.998;
        }

            //---------- galao
        else if(this.codigoGrandeza == 4 && codigoValorEntrada == 7 && codigoValorSaida == 1)
        {
            //KM3
            valorSaida = valor * (4.546 * Math.pow(10, -12));

        }
        else if(this.codigoGrandeza == 4 && codigoValorEntrada == 7 && codigoValorSaida == 2)
        {
            //M3
            valorSaida = valor * 0.005;

        }
        else if(this.codigoGrandeza == 4 && codigoValorEntrada == 7 && codigoValorSaida == 3)
        {
            //CM3
            valorSaida = valor * 4546.099 ;

        }
        else if(this.codigoGrandeza == 4 && codigoValorEntrada == 7 && codigoValorSaida == 4)
        {
            //MM3
            valorSaida = valor * 4546099.265;

        }
        else if(this.codigoGrandeza == 4 && codigoValorEntrada == 7 && codigoValorSaida == 5)
        {
            //L
            valorSaida = valor * 4.546;

        }
        else if(this.codigoGrandeza == 4 && codigoValorEntrada == 7 && codigoValorSaida == 6)
        {
            //BARRIL
            valorSaida = valor * 0.028;

        }
        else if(this.codigoGrandeza == 4 && codigoValorEntrada == 7 && codigoValorSaida == 7)
        {
            //GALAO
            valorSaida = valor;

        }

        //--------------- Tempo --------------
            //---------- segundos
        else if(this.codigoGrandeza == 5 && codigoValorEntrada == 1 && codigoValorSaida == 1)
        {
            //S
            valorSaida = valor;

        }
        else if(this.codigoGrandeza == 5 && codigoValorEntrada == 1 && codigoValorSaida == 2)
        {
            //MIM
            valorSaida = valor * 0.017;

        }
        else if(this.codigoGrandeza == 5 && codigoValorEntrada == 1 && codigoValorSaida == 3)
        {
            //H
            valorSaida = valor * (2.778 * Math.pow(10, -4));

        }
        else if(this.codigoGrandeza == 5 && codigoValorEntrada == 1 && codigoValorSaida == 4)
        {
            //DIAS
            valorSaida = valor * (1.157 * Math.pow(10, -5));

        }
        else if(this.codigoGrandeza == 5 && codigoValorEntrada == 1 && codigoValorSaida == 5)
        {
            //MES
            valorSaida = valor * (3.803 * Math.pow(10, -7));
        }
        else if(this.codigoGrandeza == 5 && codigoValorEntrada == 1 && codigoValorSaida == 6)
        {
            //ANO
            valorSaida = valor * (3.169 * Math.pow(10, -8));
        }

            //---------- minutos
        else if(this.codigoGrandeza == 5 && codigoValorEntrada == 2 && codigoValorSaida == 1)
        {
            //S
            valorSaida = valor * 60;
        }
        else if(this.codigoGrandeza == 5 && codigoValorEntrada == 2 && codigoValorSaida == 2)
        {
            //MIM
            valorSaida = valor;
        }
        else if(this.codigoGrandeza == 5 && codigoValorEntrada == 2 && codigoValorSaida == 3)
        {
            //H
            valorSaida = valor * 0.017;
        }
        else if(this.codigoGrandeza == 5 && codigoValorEntrada == 2 && codigoValorSaida == 4)
        {
            //DIAS
            valorSaida = valor * 0.001;
        }
        else if(this.codigoGrandeza == 5 && codigoValorEntrada == 2 && codigoValorSaida == 5)
        {
            //MES
            valorSaida = valor * (2.282 * Math.pow(10, -5));
        }
        else if(this.codigoGrandeza == 5 && codigoValorEntrada == 2 && codigoValorSaida == 6)
        {
            //ANO
            valorSaida = valor * (1.901 * Math.pow(10, -6));
        }

            //---------- horas
        else if(this.codigoGrandeza == 5 && codigoValorEntrada == 3 && codigoValorSaida == 1)
        {
            //S
            valorSaida = valor * 3600;
        }
        else if(this.codigoGrandeza == 5 && codigoValorEntrada == 3 && codigoValorSaida == 2)
        {
            //MIM
            valorSaida = valor * 60;
        }
        else if(this.codigoGrandeza == 5 && codigoValorEntrada == 3 && codigoValorSaida == 3)
        {
            //H
            valorSaida = valor;
        }
        else if(this.codigoGrandeza == 5 && codigoValorEntrada == 3 && codigoValorSaida == 4)
        {
            //DIAS
            valorSaida = valor * 0.042;
        }
        else if(this.codigoGrandeza == 5 && codigoValorEntrada == 3 && codigoValorSaida == 5)
        {
            //MES
            valorSaida = valor * 0.001;
        }
        else if(this.codigoGrandeza == 5 && codigoValorEntrada == 3 && codigoValorSaida == 6)
        {
            //ANO
            valorSaida = valor * (1.141 * Math.pow(10, -4));
        }

            //---------- dias
        else if(this.codigoGrandeza == 5 && codigoValorEntrada == 4 && codigoValorSaida == 1)
        {
            //S
            valorSaida = valor * 86400;
        }
        else if(this.codigoGrandeza == 5 && codigoValorEntrada == 4 && codigoValorSaida == 2)
        {
            //MIM
            valorSaida = valor * 1440;
        }
        else if(this.codigoGrandeza == 5 && codigoValorEntrada == 4 && codigoValorSaida == 3)
        {
            //H
            valorSaida = valor * 24;
        }
        else if(this.codigoGrandeza == 5 && codigoValorEntrada == 4 && codigoValorSaida == 4)
        {
            //DIAS
            valorSaida = valor;
        }
        else if(this.codigoGrandeza == 5 && codigoValorEntrada == 4 && codigoValorSaida == 5)
        {
            //MES
            valorSaida = valor * 0.033;
        }
        else if(this.codigoGrandeza == 5 && codigoValorEntrada == 4 && codigoValorSaida == 6)
        {
            //ANO
            valorSaida = valor * 0.003;
        }

            //---------- mes
        else if(this.codigoGrandeza == 5 && codigoValorEntrada == 5 && codigoValorSaida == 1)
        {
            //S
            valorSaida = valor * 2629800;
        }
        else if(this.codigoGrandeza == 5 && codigoValorEntrada == 5 && codigoValorSaida == 2)
        {
            //MIM
            valorSaida = valor * 43830;
        }
        else if(this.codigoGrandeza == 5 && codigoValorEntrada == 5 && codigoValorSaida == 3)
        {
            //H
            valorSaida = valor * 730.5;
        }
        else if(this.codigoGrandeza == 5 && codigoValorEntrada == 5 && codigoValorSaida == 4)
        {
            //DIAS
            valorSaida = valor * 30.438;
        }
        else if(this.codigoGrandeza == 5 && codigoValorEntrada == 5 && codigoValorSaida == 5)
        {
            //MES
            valorSaida = valor;
        }
        else if(this.codigoGrandeza == 5 && codigoValorEntrada == 5 && codigoValorSaida == 6)
        {
            //ANO
            valorSaida = valor * 0.083;
        }

            //---------- ano
        else if(this.codigoGrandeza == 5 && codigoValorEntrada == 6 && codigoValorSaida == 1)
        {
            //S
            valorSaida = valor * 31557600;

        }
        else if(this.codigoGrandeza == 5 && codigoValorEntrada == 6 && codigoValorSaida == 2)
        {
            //MIM
            valorSaida = valor * 525960;
        }
        else if(this.codigoGrandeza == 5 && codigoValorEntrada == 6 && codigoValorSaida == 3)
        {
            //H
            valorSaida = valor * 8766;
        }
        else if(this.codigoGrandeza == 5 && codigoValorEntrada == 6 && codigoValorSaida == 4)
        {
            //DIAS
            valorSaida = valor * 365.25;
        }
        else if(this.codigoGrandeza == 5 && codigoValorEntrada == 6 && codigoValorSaida == 5)
        {
            //MES
            valorSaida = valor * 12;
        }
        else if(this.codigoGrandeza == 5 && codigoValorEntrada == 6 && codigoValorSaida == 6)
        {
            //ANO
            valorSaida = valor;
        }

        //--------------- Massa --------------
            //---------- Kg
        else if(this.codigoGrandeza == 6 && codigoValorEntrada == 1 && codigoValorSaida == 1)
        {
            //G
            valorSaida = valor;
        }
        else if(this.codigoGrandeza == 6 && codigoValorEntrada == 1 && codigoValorSaida == 2)
        {
            //G
            valorSaida = valor * 1000 ;
        }
        else if(this.codigoGrandeza == 6 && codigoValorEntrada == 1 && codigoValorSaida == 3)
        {
            //T (Tonelada)
            valorSaida = valor * 0.001 ;
        }

            //---------- g
        else if(this.codigoGrandeza == 6 && codigoValorEntrada == 2 && codigoValorSaida == 1)
        {
            //KG
            valorSaida = valor * 0.001;
        }
        else if(this.codigoGrandeza == 6 && codigoValorEntrada == 2 && codigoValorSaida == 2)
        {
            //G
            valorSaida = valor;
        }
        else if(this.codigoGrandeza == 6 && codigoValorEntrada == 2 && codigoValorSaida == 3)
        {
            //T (Tonelada)
            valorSaida = valor * Math.pow(10, -6) ;
        }

            //---------- T
        else if(this.codigoGrandeza == 6 && codigoValorEntrada == 3 && codigoValorSaida == 1)
        {
            //KG
            valorSaida = valor * 1000;
        }
        else if(this.codigoGrandeza == 6 && codigoValorEntrada == 3 && codigoValorSaida == 2)
        {
            //G
            valorSaida = valor * 1000000;
        }
        else if(this.codigoGrandeza == 6 && codigoValorEntrada == 3 && codigoValorSaida == 3)
        {
            //T (Tonelada)
            valorSaida = valor;
        }

        //--------------- Densidade --------------
            //---------- g/cm^3
        else if(this.codigoGrandeza == 7 && codigoValorEntrada == 1 && codigoValorSaida == 1)
        {
            //G/CM3
            valorSaida = valor;
        }
        else if(this.codigoGrandeza == 7 && codigoValorEntrada == 1 && codigoValorSaida == 2)
        {
            //KG/M3
            valorSaida = valor * 1000;
        }
        else if(this.codigoGrandeza == 7 && codigoValorEntrada == 1 && codigoValorSaida == 3)
        {
            //G/M3
            valorSaida = valor * 1000000;
        }
        else if(this.codigoGrandeza == 7 && codigoValorEntrada == 1 && codigoValorSaida == 4)
        {
            //MG/M3
            valorSaida = valor * 1000000000;
        }

            //---------- Kg/m^3
        else if(this.codigoGrandeza == 7 && codigoValorEntrada == 2 && codigoValorSaida == 1)
        {
            //G/CM3
            valorSaida = valor * 0.001;
        }
        else if(this.codigoGrandeza == 7 && codigoValorEntrada == 2 && codigoValorSaida == 2)
        {
            //KG/M3
            valorSaida = valor;
        }
        else if(this.codigoGrandeza == 7 && codigoValorEntrada == 2 && codigoValorSaida == 3)
        {
            //G/M3
            valorSaida = valor * 1000;
        }
        else if(this.codigoGrandeza == 7 && codigoValorEntrada == 2 && codigoValorSaida == 4)
        {
            //MG/M3
            valorSaida = valor * 1000000;
        }

            //---------- g/m^3
        else if(this.codigoGrandeza == 7 && codigoValorEntrada == 3 && codigoValorSaida == 1)
        {
            //G/CM3
            valorSaida = valor * 0.000001;
        }
        else if(this.codigoGrandeza == 7 && codigoValorEntrada == 3 && codigoValorSaida == 2)
        {
            //KG/M3
            valorSaida = valor * 0.001;
        }
        else if(this.codigoGrandeza == 7 && codigoValorEntrada == 3 && codigoValorSaida == 3)
        {
            //G/M3
            valorSaida = valor;
        }
        else if(this.codigoGrandeza == 7 && codigoValorEntrada == 3 && codigoValorSaida == 4)
        {
            //MG/M3
            valorSaida = valor * 1000;
        }

            //---------- mg/m^3
        else if(this.codigoGrandeza == 7 && codigoValorEntrada == 4 && codigoValorSaida == 1)
        {
            //G/CM3
            valorSaida = valor * Math.pow(1, -9);
        }
        else if(this.codigoGrandeza == 7 && codigoValorEntrada == 4 && codigoValorSaida == 2)
        {
            //KG/M3
            valorSaida = valor * 0.000001;
        }
        else if(this.codigoGrandeza == 7 && codigoValorEntrada == 4 && codigoValorSaida == 3)
        {
            //G/M3
            valorSaida = valor * 0.001;
        }
        else if(this.codigoGrandeza == 7 && codigoValorEntrada == 4 && codigoValorSaida == 4)
        {
            //MG/M3
            valorSaida = valor;
        }

        //--------------- Pressao --------------
            //---------- pa
        else if(this.codigoGrandeza == 8 && codigoValorEntrada == 1 && codigoValorSaida == 1)
        {
            //PA
            valorSaida = valor;
        }
        else if(this.codigoGrandeza == 8 && codigoValorEntrada == 1 && codigoValorSaida == 2)
        {
            //ATM
            valorSaida = valor * (9.869 * Math.pow(10, -6));
        }
        else if(this.codigoGrandeza == 8 && codigoValorEntrada == 1 && codigoValorSaida == 3)
        {
            //BAR
            valorSaida = valor * Math.pow(10, -5);
        }
        else if(this.codigoGrandeza == 8 && codigoValorEntrada == 1 && codigoValorSaida == 4)
        {
            //PSI
            valorSaida = valor * 0.000145037738;
        }

            //---------- atm
        else if(this.codigoGrandeza == 8 && codigoValorEntrada == 2 && codigoValorSaida == 1)
        {
            //PA
            valorSaida = valor * 101324.997;
        }
        else if(this.codigoGrandeza == 8 && codigoValorEntrada == 2 && codigoValorSaida == 2)
        {
            //ATM
            valorSaida = valor;
        }
        else if(this.codigoGrandeza == 8 && codigoValorEntrada == 2 && codigoValorSaida == 3)
        {
            //BAR
            valorSaida = valor * 1.013;
        }
        else if(this.codigoGrandeza == 8 && codigoValorEntrada == 2 && codigoValorSaida == 4)
        {
            //PSI
            valorSaida = valor * 14.6959488;
        }

            //---------- bar
        else if(this.codigoGrandeza == 8 && codigoValorEntrada == 3 && codigoValorSaida == 1)
        {
            //PA
            valorSaida = valor * 100000;
        }
        else if(this.codigoGrandeza == 8 && codigoValorEntrada == 3 && codigoValorSaida == 2)
        {
            //ATM
            valorSaida = valor * 0.987;
        }
        else if(this.codigoGrandeza == 8 && codigoValorEntrada == 3 && codigoValorSaida == 3)
        {
            //BAR
            valorSaida = valor;
        }
        else if(this.codigoGrandeza == 8 && codigoValorEntrada == 3 && codigoValorSaida == 4)
        {
            //PSI
            valorSaida = valor * 14.5037738007;
        }

            //---------- psi
        else if(this.codigoGrandeza == 8 && codigoValorEntrada == 4 && codigoValorSaida == 1)
        {
            //PA
            valorSaida = valor * 6894.759;
        }
        else if(this.codigoGrandeza == 8 && codigoValorEntrada == 4 && codigoValorSaida == 2)
        {
            //ATM
            valorSaida = valor * 0.068;
        }
        else if(this.codigoGrandeza == 8 && codigoValorEntrada == 4 && codigoValorSaida == 3)
        {
            //BAR
            valorSaida = valor * 0.069;
        }
        else if(this.codigoGrandeza == 8 && codigoValorEntrada == 4 && codigoValorSaida == 4)
        {
            //PSI
            valorSaida = valor;
        }
        tvTelaConversorValorSaida.setText(valorSaida.toString().trim());
    }
}
