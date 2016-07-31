package raoni.ifrn.mestrado.fisicainmaos.helpers;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BancoDadosPerguntas extends SQLiteOpenHelper
{
    int codTema = 0;
    int codAssunto = 0;

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "banco_fisica_in_maos";
    private static final String TB_PERGUNTAS = "tb_perguntas";
    private static final String CODIGO_PERGUNTA = "codigo_pergunta";
    private static final String PERGUNTA = "pergunta";
    private static final String RESPOSTA = "resposta";
    private static final String ASSERTIVA_A = "assertiva_a";
    private static final String ASSERTIVA_B = "assertiva_b";
    private static final String ASSERTIVA_C = "assertiva_c";
    private static final String ASSERTIVA_D = "assertiva_d";
    private static final String NIVEL_PERGUNTA = "nivel_pergunta";
    private static final String TEMA_PERGUNTA = "tema";

    private static final String TB_TEMAS = "tb_temas";
    private static final String CODIGO_TEMA = "codigo_tema";
    private static final String TEMA = "tema";

    private static final String TB_ASSUNTOS = "tb_assuntos";
    private static final String ASSUNTO = "assunto";
    private static final String CODIGO_ASSUNTO = "codigo_assunto";

    private SQLiteDatabase bancoDadosFisicaInMaos;

    //---------------------CINEMATICA---------------------
        //----------Movimento e trajetória
    String pergunta1 = "Considere que Joãozinho passeia tranquilamente de skate pelo parque. Podemos afirmar que:";
    String resposta1 = "O skate está parado em relação a Joãozinho;";
    String alt1_1 = "Joãozinho está se movendo em relação ao skate;";
    String alt1_2 = "O skate está parado em relação a Joãozinho;";
    String alt1_3 = "O skate está parado em relação a Joãozinho e também em relação ao solo;";
    String alt1_4 = "O skate está se movendo em relação ao planeta Terra;";

    String pergunta2 = "Um ônibus se move para a região Leste de uma cidade. Dentro do ônibus " +
            "um garoto A joga uma bola para cima. Fora do ônibus um garoto B observa toda a " +
            "situação. Sobre a trajetória da bola:";
    String resposta2 = "O garoto B verá a bola descrever uma parábola para frente e cair nas mãos do garoto;";
    String alt2_1 = "A bola está em repouso em relação ao garoto B;";
    String alt2_2 = "O garoto A vê a bola descrever uma trajetória vertical e cair atrás dele;";
    String alt2_3 = "Os dois vêm à bola descrever a mesma trajetória;";
    String alt2_4 = "O garoto B verá a bola descrever uma parábola para frente e cair nas mãos do garoto;";

    String pergunta3 = "Um avião se prepara para jogar mantimentos em uma cidade isolada " +
            "pelas enchentes. Na hora em que esses mantimentos forem lançados, os mesmos farão uma trajetória:";
    String resposta3 = "Parabólica para frente;";
    String alt3_1 = "Parabólica para trás;";
    String alt3_2 = "Vertical para baixo;";
    String alt3_3 = "Parabólica para frente;";
    String alt3_4 = "Retilínea na horizontal;";

    String pergunta4 = "Um avião se prepara para jogar mantimentos em uma cidade isolada pelas " +
            "enchentes. Para isso os mantimentos devem ser abandonados:";
    String resposta4 = "Antes da cidade;";
    String alt4_1 = "Em qualquer posição;";
    String alt4_2 = "Depois da cidade;";
    String alt4_3 = "Em cima da cidade;";
    String alt4_4 = "Antes da cidade;";

    String pergunta5 = "Das alternativas abaixo, marque a <b>CORRETA</b>:";
    String resposta5 = "Nenhum corpo pode está em repouso ou movimento absoluto;";
    String alt5_1 = "Um corpo não pode estar em repouso em relação a um observador e em movimento" +
            " em relação a outro observador;";
    String alt5_2 = "É possível encontrar astros do sistema solar que estejam em repouso entre si;";
    String alt5_3 = "A trajetória descrita por um corpo será sempre a mesma independente do observador;";
    String alt5_4 = "Nenhum corpo pode está em repouso ou movimento absoluto;";

    String pergunta5_extra01 = "Um avião militar equipado para ser reabastecido em pleno vôo precisa" +
            " mover-se em conjunto com outro avião tanque. Pode-se afirmar que o avião que está " +
            "reabastecendo, em relação ao avião tanque " +
            "e ao solo, respectivamente, está:";
    String resposta5_extra01 = "em repouso e em movimento;";
    String alt5_1_extra01 = "em repouso e em movimento;";
    String alt5_2_extra01 = "em movimento e em repouso;";
    String alt5_3_extra01 = "em repouso e em repouso;";
    String alt5_4_extra01 = "em movimento e em movimento;";

    String pergunta5_extra02 = "(Unitau/SP - <b>adaptado</b>) Um móvel parte do km 50, indo até o km 60," +
            " onde, mudando o sentido do movimento, vai até o km 32. O deslocamento escalar e a" +
            " distância efetivamente percorrida são, respectivamente: ";
    String resposta5_extra02 = "-18 km e 38 km;";
    String alt5_1_extra02 = "28 km e 28 km;";
    String alt5_2_extra02 = "18 km e 38 km;";
    String alt5_3_extra02 = "-18 km e 38 km;";
    String alt5_4_extra02 = "38 km e 18 km;";

    String pergunta5_extra03 = "(UEPB - <b>adaptado</b>) Um professor de física verificando em sala de " +
            "aula que todos os seus alunos encontram-se sentados, passou a fazer algumas afirmações" +
            " para que eles refletissem e recordassem alguns conceitos sobre movimento. \n" +
            "Das afirmações seguintes formuladas pelo professor, a única <b>CORRETA</b> é:";
    String resposta5_extra03 = "Mesmo para mim (professor), que não paro de andar, seria possível " +
            "achar um referencial em relação ao qual eu estivesse em repouso;";
    String alt5_1_extra03 = "Mesmo para mim (professor), que não paro de andar, seria possível " +
            "achar um referencial em relação ao qual eu estivesse em repouso;";
    String alt5_2_extra03 = "A velocidade dos alunos que eu consigo observar agora, sentados em " +
            "seus lugares, é nula para qualquer observador humano;";
    String alt5_3_extra03 = "Como não há repouso absoluto, nenhum de nós está em repouso, em " +
            "relação a nenhum referencial;";
    String alt5_4_extra03 = "O Sol está em repouso em relação a qualquer referencial;";

    String pergunta5_extra04 = "(PUC/SP - <b>adaptado</b>) A afirmação “todo movimento é relativo” significa que:";
    String resposta5_extra04 = "A velocidade depende sempre de uma força;";
    String alt5_1_extra04 = "Todos os cálculos de velocidade são imprecisos;";
    String alt5_2_extra04 = "Não existe movimento com velocidade constante;";
    String alt5_3_extra04 = "A velocidade depende sempre de uma força;";
    String alt5_4_extra04 = "A descrição de qualquer movimento requer um referencial;";

    String pergunta5_extra05 = "(UFSM/RS - <b>adaptado</b>) Numa corrida de revezamento, dois atletas, por" +
            " um pequeno intervalo de tempo, andam juntos para a troca do bastão. Nesse intervalo de tempo,";
    String resposta5_extra05 = "num referencial fixo em um dos atletas, a velocidade do outro é nula;";
    String alt5_1_extra05 = "num referencial fixo na pista, os atletas têm velocidade nula;";
    String alt5_2_extra05 = "num referencial fixo em um dos atletas, a velocidade do outro é nula;";
    String alt5_3_extra05 = "o movimento real e verdadeiro dos atletas é aquele que se refere a " +
            "um referencial inercial fixo nas estrelas distantes;";
    String alt5_4_extra05 = "a velocidade de um em relação ao outro é constante e não nula;";

        //----------MRU
    String pergunta6 = "Durante um campeonato de moto GP, duas motos faziam uma disputa quando " +
            "uma delas começa a ultrapassar a moto da frente. Sabendo que a moto da frente está " +
            "a 150km/h e a de trás a 170km/h, pode-se afirmar que a moto de trás está?";
    String resposta6 = "Se aproximando com V<sub>relativa</sub> = 20km/h;";
    String alt6_1 = "Se afastando com V<sub>Relativa</sub> = 20km/h;";
    String alt6_2 = "Se aproximando com V<sub>relativa</sub> = 20km/h;";
    String alt6_3 = "Se afastando com V<sub>relativa</sub> = 170km/h;";
    String alt6_4 = "Se afastando com V<sub>relativa</sub> = 320km/h;";

    String pergunta7 = "Um carro se move segundo a função horária: S=55-10.t. Pode-se afirmar que:";
    String resposta7 = "O carro está movimento retrógrado;";
    String alt7_1 = "O carro está movimento retrógrado;";
    String alt7_2 = "Esse carro possui aceleração de -10m/s<sup>2</sup>;";
    String alt7_3 = "Em 5s ele chegará à origem das posições;";
    String alt7_4 = "O veículo se encontra em MRUV;";

    String pergunta8 = "Em uma prova de ciclismo, um atleta sofre uma queda e perde cerca de " +
            "20s até se recompor. Considerando que antes da queda o ciclista estivesse a " +
            "uma velocidade média de 15m/s, qual seria a distância percorrida pelo atleta " +
            "durante o tempo perdido.";
    String resposta8 = "300m;";
    String alt8_1 = "300m;";
    String alt8_2 = "30m;";
    String alt8_3 = "150m;";
    String alt8_4 = "250m;";

    String pergunta9 = "Dois objetos se movem de acordo com as seguintes equações horárias:" +
            " S<sub>A</sub> = 20 + 3.t e S<sub>B</sub> = 100 - 5.t. Qual a distância que separa" +
            " os objetos no início do movimento.";
    String resposta9 = "80m;";
    String alt9_1 = "120m;";
    String alt9_2 = "0m;";
    String alt9_3 = "100m;";
    String alt9_4 = "80m;";

    String pergunta10 = "Um trem de 100m de comprimento se move a uma velocidade média de 20m/s." +
            " Supondo que esse trem vá atravessar uma ponte de 200m de comprimento, determine" +
            " o tempo mínimo necessário para que o trem atravesse completamente a ponto.";
    String resposta10 = "15s;";
    String alt10_1 = "30s;";
    String alt10_2 = "15s;";
    String alt10_3 = "10s;";
    String alt10_4 = "5s;";

    String pergunta11 = "Em um filme, um carro da polícia encurrala o bandido em uma rua" +
            " estreita. Os dois começam a se mover na tentativa de se chocarem de frente." +
            " Sabendo que os carros se movem com 72km/h e 108km/h, e que eles demoram 5s " +
            "para colidirem, determine o espaço percorrido pelos carros até a colisão.";
    String resposta11 = "250m;";
    String alt11_1 = "100m;";
    String alt11_2 = "90m;";
    String alt11_3 = "250m;";
    String alt11_4 = "150m;";

    String pergunta11_exrtra01 = "(UEL/PR - <b>adaptado</b>) Um homem caminha com velocidade Vh = 3,6 km/h," +
            " uma ave, com velocidade Va = 30 m/min, e um inseto, com Vi = 60 cm/s. Essas" +
            " velocidades satisfazem a relação:";
    String resposta11_exrtra01 = "Vh &gt; Vi &gt; Va;";
    String alt11_1_exrtra01 = "Vi &gt; Vh &gt; Va ;";
    String alt11_2_exrtra01 = "Va &gt; Vi &gt; Vh ;";
    String alt11_3_exrtra01 = "Vh &gt; Va &gt; Vi;";
    String alt11_4_exrtra01 = "Vh &gt; Vi &gt; Va;";

    String pergunta11_exrtra02 = "Quando cai um raio vemos primeiro o clarão, que viaja a 300.000" +
            " km/s, e somente depois escutamos o trovão, pois a velocidade som é de 340 m/s. Se" +
            " uma pessoa vê o clarão e 5 segundos depois ouve o trovão, a que distância o raio caiu?";
    String resposta11_exrtra02 = "1,7 km;";
    String alt11_1_exrtra02 = "1,0 km;";
    String alt11_2_exrtra02 = "1,5 km;";
    String alt11_3_exrtra02 = "1,7 km;";
    String alt11_4_exrtra02 = "2,2 km;";

    String pergunta11_exrtra03 = "Em um filme do <i>Arnold Schwarzenegger</i>, o duble deste, deve passar" +
            " com o ônibus de 15m por um túnel de 55m que vai desabar e explodir. Quando o carro " +
            "começa a entrar no túnel, um sensor que ativa o cronômetro das bombas, que começarão" +
            " a explodir 2 segundos depois. Qual deve ser sua velocidade exata para que o ônibus" +
            " tenha saído, totalmente do túnel e nem um milímetro a mais.";
    String resposta11_exrtra03 = "35m/s;";
    String alt11_1_exrtra03 = "30m/s;";
    String alt11_2_exrtra03 = "35m/s;";
    String alt11_3_exrtra03 = "40m/s;";
    String alt11_4_exrtra03 = "20m/s;";

    String pergunta11_exrtra04 = "Um trem, com velocidade escalar constante e igual a 36 km/h, " +
            "gasta 1,0 min para atravessar completamente uma ponte retilínea de 100m de " +
            "comprimento. O comprimento do trem é:";
    String resposta11_exrtra04 = "500m;";
    String alt11_1_exrtra04 = "100m;";
    String alt11_2_exrtra04 = "200m;";
    String alt11_3_exrtra04 = "300m;";
    String alt11_4_exrtra04 = "500m;";

        //----------Queda livre e lançamento vertical:
    String pergunta12 = "Suponha que duas pessoas saltem, ao mesmo tempo e de uma mesma altura," +
                " de um determinado local na Lua. Uma delas possui um paraquedas aberto e a" +
                " outra não possui nada. Sobre o tempo de queda é <b>CORRETO</b> afirmar que:";
    String resposta12 = "Os dois tocam o solo ao mesmo tempo;";
    String alt12_1 = "O com paraquedas aberto chega primeiro ao solo;";
    String alt12_2 = "O sem paraquedas chega primeiro ao solo;";
    String alt12_3 = "Os dois tocam o solo ao mesmo tempo;";
    String alt12_4 = "Como não há gravidade na Lua, essa situação não é possível;";

    String pergunta13 = "Para dispersar a multidão, em uma confusão, um policial atira com sua" +
            " arma para cima. Sabendo que a bala sai da arma com velocidade de aproximadamente" +
            " 360m/s, é <b>CORRETO</b> afirmar que o tempo de subida, desprezando o ar, é de: (g = 10m/s<sup>2</sup>)";
    String resposta13 = "36s;";
    String alt13_1 = "18s;";
    String alt13_2 = "360s;";
    String alt13_3 = "20s;";
    String alt13_4 = "36s;";

    String pergunta14 = "Segundo Galileu, dois corpos de massas diferentes, abandonados de uma " +
            "mesma altura chegam juntos ao chão. Isso ocorre por que:";
    String resposta14 = "A aceleração da gravidade é a mesma para ambos os corpos;";
    String alt14_1 = "O menor corpo consegue sofrer menor resistência do ar;";
    String alt14_2 = "A aceleração da gravidade é a mesma para ambos os corpos;";
    String alt14_3 = "O corpo mais pesado sofre maior resistência do ar;";
    String alt14_4 = "Os pesos dos corpos são os mesmos;";

    String pergunta15 = "Quando lançamos um objeto verticalmente para cima, ele realiza um movimento:";
    String resposta15 = "Progressivo e retardado;";
    String alt15_1 = "Progressivo e retardado;";
    String alt15_2 = "Retrógrado e acelerado;";
    String alt15_3 = "Progressivo e acelerado;";
    String alt15_4 = "Retrógrado e retardado;";

    String pergunta16 = "Um objeto é abandonado do alto de um prédio de 20m de altura." +
            " Determine o tempo necessário para o objeto tocar o solo.";
    String resposta16 = "2s;";
    String alt16_1 = "20s;";
    String alt16_2 = "10s;";
    String alt16_3 = "4s;";
    String alt16_4 = "2s;";

    String pergunta17 = "Duas bolas são lançadas simultaneamente de uma altura h, na vertical e " +
            "em sentidos contrários, com a mesma velocidade V0. Ao tocarem o solo podemos afirmar que:";
    String resposta17 = "As duas apresentam a mesma velocidade;";
    String alt17_1 = "As duas apresentam a mesma velocidade;";
    String alt17_2 = "A que foi lançada para cima apresenta o dobro da velocidade da outra;";
    String alt17_3 = "A que lançada para baixo apresenta o dobro da velocidade da outra;";
    String alt17_4 = "A que foi lançada para cima apresenta menor velocidade;";

    String pergunta17_extra01 = "Um jogador de basquetebol consegue dar um grande impulso ao" +
            " saltar verticalmente, de modo que seus pés atingem uma altura máxima de 1,25 m sem" +
            " dobrar as pernas. A resistência do ar é desprezível e a aceleração da gravidade é " +
            "10 m/s2. O tempo que o jogador fica no ar é:";
    String resposta17_extra01 = "1,0s;";
    String alt17_1_extra01 = "1,0s;";
    String alt17_2_extra01 = "2,0s;";
    String alt17_3_extra01 = "3,0s;";
    String alt17_4_extra01 = "5,0s;";

    String pergunta17_extra02 = "Um astronauta passeando em Marte, onde a gravidade é de 3,7 m/s<sup>2</sup>," +
            " cai em um penhasco de 185m de altura. Desprezando o atrito com o ar da rarefeita " +
            "atmosfera marciana, determine a velocidade de impacto deste com o chão";
    String resposta17_extra02 = "37,0 m/s;";
    String alt17_1_extra02 = "3,7 m/s;";
    String alt17_2_extra02 = "37,0 m/s;";
    String alt17_3_extra02 = "74,0 m/s;";
    String alt17_4_extra02 = "370,0 m/s;";

    String pergunta17_extra03 = "(UFSC - <b>adaptado</b>) Quanto ao movimento de um corpo lançado " +
            "verticalmente para cima e submetido somente à ação da gravidade, é <b>CORRETO</b> afirmar que:";
    String resposta17_extra03 = "O tempo necessário para a subida é igual ao tempo de descida, sempre " +
            "que o corpo é lançado de um ponto e retorna ao mesmo ponto;";
    String alt17_1_extra03 = "A velocidade do corpo no ponto de altura máxima é diferente de zero;";
    String alt17_2_extra03 = "A velocidade do corpo é constante para todo o percurso;";
    String alt17_3_extra03 = "O tempo necessário para a subida é igual ao tempo de descida, sempre " +
            "que o corpo é lançado de um ponto e retorna ao mesmo ponto;";
    String alt17_4_extra03 = "A aceleração do corpo é maior na descida do que na subida;";

    String pergunta17_extra04 = "(Fafi/BH/ <b>adaptado</b>) Um menino lança uma bola verticalmente para" +
            " cima do nível da rua. Uma pessoa que está numa sacada a 10 m acima do solo apanha " +
            "essa bola quando está a caminho do chão. Sabendo-se que a velocidade inicial da bola é de" +
            " 15 m/s, pode-se dizer que a velocidade da bola, ao ser apanhada pela pessoa, era de";
    String resposta17_extra04 = "5 m/s;";
    String alt17_1_extra04 = "15 m/s;";
    String alt17_2_extra04 = "10 m/s;";
    String alt17_3_extra04 = "5 m/s;";
    String alt17_4_extra04 = "0 m/s;";

        //----------Lançamento horizontal e oblíquo:
    String pergunta18 = "Desprezando-se a resistência do ar, podemos afirmar que para se obter" +
                " um maior alcance um objeto deve ser lançado obliquamente com:";
    String resposta18 = "45&deg;;";
    String alt18_1 = "45&deg;;";
    String alt18_2 = "30&deg;;";
    String alt18_3 = "65&deg;;";
    String alt18_4 = "65&deg;;";

    String pergunta19 = "Quando repõe a bola em jogo, um goleiro chuta a bola com trajetória" +
            " parabólica. Sobre essa trajetória é <b>CORRETO</b> afirmar que no ponto mais alto:";
    String resposta19 = "A velocidade é constante para frente e a aceleração é nula;";
    String alt19_1 = "A velocidade e aceleração são nulas;";
    String alt19_2 = "A velocidade é constante para frente e a aceleração é nula;";
    String alt19_3 = "A aceleração muda de sentido;";
    String alt19_4 = "A velocidade muda de sentido e a aceleração é nula;";

    String pergunta20 = "Suponha que uma bola seja chutada, sempre com a mesma velocidade, com" +
            " ângulos diferentes 30&deg;, 45&deg; e 60&deg;. Sobre esses lançamentos podemos afirmar que a " +
            "bola permanece mais tempo no ar:";
    String resposta20 = "No lançamento de 60&deg;;";
    String alt20_1 = "No lançamento de 30&deg;;";
    String alt20_2 = "No lançamento de 45&deg;;";
    String alt20_3 = "No lançamento de 60&deg;;";
    String alt20_4 = "O tempo será o mesmo para os três ângulos;";

    String pergunta21 = "Três pedras (A.B e C) são lançadas, de uma mesma altura, do alto de " +
            "um edifício com velocidades de 10m/s, 20m/s e 30m/s. Desprezando a resistência do " +
            "ar, é <b>CORRETO</b> afirmar que:";
    String resposta21 = "As três pedras chegam ao mesmo tempo ao chão;";
    String alt21_1 = "A pedra A chega mais rápido ao chão;";
    String alt21_2 = "A pedra B chega mais rápido ao chão;";
    String alt21_3 = "A pedra C chega mais rápido ao chão;";
    String alt21_4 = "As três pedras chegam ao mesmo tempo ao chão";

    String pergunta22 = "Um canhão dispara uma bala, com um ângulo de 45&deg;, e uma velocidade" +
            " vertical de 30m/s. Pode-se afirmar que o tempo total que essa bala permanece no ar é de:";
    String resposta22 = "6s;";
    String alt22_1 = "3s;";
    String alt22_2 = "6s;";
    String alt22_3 = "10s;";
    String alt22_4 = "30s;";

    String pergunta22_extra01 = "<i>Galileu Galilei</i>, demonstrou que uma bola caindo rente ao mastro " +
            "de um navio em movimento e acompanha o movimento deste. O que isso prova?";
    String resposta22_extra01 = "As velocidades verticais e horizontais são independentes;";
    String alt22_1_extra01 = "As velocidades verticais e horizontais são independentes;";
    String alt22_2_extra01 = "A velocidade vertical acelera a velocidade horizontal;";
    String alt22_3_extra01 = "Que Galileu fraudava os experimentos, pois não é assim;";
    String alt22_4_extra01 = "Que a Terra gira bem devagar, por isso não percebemos;";

    String pergunta22_extra02 = "Durante uma guerra um avião a 500m de altura e com velocidade de " +
            "360 km/h na horizontal, despeja uma bomba sobro uma distância horizontal “d” do alvo. " +
            "Calcule o quando dever ser esta distância se desprezado o atrito";
    String resposta22_extra02 = "1 km;";
    String alt22_1_extra02 = "1 km;";
    String alt22_2_extra02 = "2 km;";
    String alt22_3_extra02 = "3 km;";
    String alt22_4_extra02 = "4 km;";

    String pergunta22_extra03 = "(PUC/SP - <b>adaptado</b>) Suponha que em uma partida de futebol, o " +
            "goleiro, ao bater o tiro de meta, chuta a bola, imprimindo-lhe uma velocidade " +
            "v<sub>0</sub> cujo vetor forma, com a horizontal, um ângulo &alpha;. Desprezando a resistência do " +
            "ar, são feitas as seguintes afirmações.";
    String resposta22_extra03 = "No ponto mais alto da trajetória é nulo o valor v<sub>y</sub> da componente vertical da velocidade;";
    String alt22_1_extra03 = "No ponto mais alto da trajetória, a velocidade vetorial da bola é nula;";
    String alt22_2_extra03 = "A velocidade inicial v0 pode ser decomposta igualmente nas direções horizontal e vertical;";
    String alt22_3_extra03 = "No ponto mais alto da trajetória é nulo o valor da aceleração da gravidade;";
    String alt22_4_extra03 = "No ponto mais alto da trajetória é nulo o valor v<sub>y</sub> da componente vertical da velocidade;";

    String pergunta22_extra04 = "(FAAP/SP - <b>adaptado</b>) Numa competição nos jogos de Winnipeg, no" +
            " Canadá, um atleta arremessa um disco com velocidade de 72 km/h, formando um ângulo " +
            "de 30&deg; com a horizontal. Desprezando-se os efeitos do ar, a altura máxima atingida" +
            "pelo disco é: (g = 10 m/s<sup>2</sup>)";
    String resposta22_extra04 = "5,0 m;";
    String alt22_1_extra04 = "5,0 m;";
    String alt22_2_extra04 = "10,0 m;";
    String alt22_3_extra04 = "15,0 m;";
    String alt22_4_extra04 = "25,0 m;";

    String pergunta22_extra05 = "(Unisinos/RS - <b>adaptado</b>) Suponha três setas <i>A</i>, <i>B</i> e " +
            "<i>C</i> lançadas, com iguais velocidades, obliquamente acima de um terreno plano e" +
            " horizontal, segundo os ângulos de 30&deg;, 45&deg; e 60&deg;, respectivamente. " +
            "Desconsiderando a resistência do ar, afirma-se que:";
    String resposta22_extra05 = "<i>A</i> permanecerá menos tempo no ar;";
    String alt22_1_extra05 = "<i>A</i> permanecerá menos tempo no ar;";
    String alt22_2_extra05 = "<i>B</i> alcançará maior altura;";
    String alt22_3_extra05 = "<i>C</i> terá maior alcance horizontal;";
    String alt22_4_extra05 = "<i>B</i> permanecerá mais tempo no ar;";

        //---------Cinemática vetorial e composição de movimento:
    String pergunta23 = "São grandezas vetoriais:";
    String resposta23 = "Deslocamento, Força e aceleração;";
    String alt23_1 = "Distância, temperatura e volume;";
    String alt23_2 = "Tempo, Peso e trabalho;";
    String alt23_3 = "Deslocamento, Força e aceleração;";
    String alt23_4 = "Área, velocidade e massa;";

    String pergunta24 = "Um relógio analógico possui ponteiros, das horas e minutos, com " +
            "comprimentos de 1cm e 1,4cm, respectivamente. Supondo que os ponteiros são vetores" +
            ", determine o vetor resultante quando o relógio marcar 7h05min.";
    String resposta24 = "0,4cm na direção do número 1 do relógio;";
    String alt24_1 = "2,4cm na direção do número 7 do relógio;";
    String alt24_2 = "1,4cm na direção do número 1 do relógio;";
    String alt24_3 = "1cm na direção do número 7 do relógio;";
    String alt24_4 = "0,4cm na direção do número 1 do relógio;";

    String pergunta25 = "São grandezas escalares: ";
    String resposta25 = "Massa, volume e distância;";
    String alt25_1 = "Massa, volume e distância;";
    String alt25_2 = "Temperatura, área e força;";
    String alt25_3 = "Peso, tempo e trabalho;";
    String alt25_4 = "Força, campo magnético e velocidade;";

    String pergunta26 = "Um carteiro percorre 3 km para o Norte e 4 km para Oeste entregando" +
            " cartas. O vetor deslocamento desse carteiro em relação ao ponto de partida vale:";
    String resposta26 = "5 km para noroeste;";
    String alt26_1 = "7 km para sudoeste;";
    String alt26_2 = "1 km para nordeste;";
    String alt26_3 = "5 km para noroeste;";
    String alt26_4 = "5 km para nordeste;";

    String pergunta27 = "Joãozinho brinca em uma escada rolante que sobe em movimento uniforme," +
            " subindo com uma velocidade de 10m/s e descendo com 4m/s em relação ao solo." +
            " Determine a velocidade de rolamento da escada rolante.";
    String resposta27 = "3m/s;";
    String alt27_1 = "10m/s;";
    String alt27_2 = "3m/s;";
    String alt27_3 = "4m/s;";
    String alt27_4 = "7m/s;";

        //----------MCU:
    String pergunta28 = "Quando um objeto, se movendo em movimento circular, executa 3 voltas " +
                "completas em 1s, certamente estamos falando de seu(ua):";
    String resposta28 = "Frequência;";
    String alt28_1 = "Frequência;";
    String alt28_2 = "Período;";
    String alt28_3 = "Velocidade angular;";
    String alt28_4 = "Aceleração centrípeta;";

    String pergunta29 = "Um garoto brinca em um carrossel, executando uma volta completa a " +
            "cada 30s. A frequência com que esse carrossel gira é de (em rpm):";
    String resposta29 = "0,5;";
    String alt29_1 = "0,5;";
    String alt29_2 = "2;";
    String alt29_3 = "30;";
    String alt29_4 = "60;";

    String pergunta30 = "Supondo que a coroa de uma bicicleta tenha uma raio duas vezes maior que " +
            "a catraca, é possível concluir que a catraca:";
    String resposta30 = "Possui o dobro da velocidade angular da coroa;";
    String alt30_1 = "Possui o dobro do período da coroa;";
    String alt30_2 = "Possui a mesma frequência da coroa.;";
    String alt30_3 = "Possui o dobro da velocidade linear da coroa;";
    String alt30_4 = "Possui o dobro da velocidade angular da coroa;";

    String pergunta31 = "Um Buggy apresenta rodas traseiras maiores que as dianteiras. Devido esse fato:";
    String resposta31 = "As duas rodas apresentam mesma velocidade linear;";
    String alt31_1 = "A roda traseira apresenta maior velocidade angular.;";
    String alt31_2 = "As duas rodas apresentam mesma velocidade angular;";
    String alt31_3 = "As duas rodas apresentam mesma velocidade linear;";
    String alt31_4 = "A roda dianteira apresenta maior período de rotação;";

        //----------MRUV:
    String pergunta32 = "Suponha que um carro se mova entre duas cidades, saindo da cidade A para" +
                " cidade B. Ao chegar à cidade freia o carro gradativamente, até parar." +
                " O movimento descrito por esse carro ao chegar na cidade B, é:";
    String resposta32 = "Progressivo e retardado;";
    String alt32_1 = "Progressivo e retardado;";
    String alt32_2 = "Retrógrado e acelerado;";
    String alt32_3 = "Progressivo e acelerado;";
    String alt32_4 = "Retrógrado e retardado;";

    String pergunta33 = "A velocidade em função do tempo de uma partícula em movimento" +
            " retilíneo uniformemente variado, expressa em unidades do SI, é v = 50 - 10t. " +
            "Pode-se afirmar que, no instante t = 3,0 s, essa partícula tem:";
    String resposta33 = "velocidade 20m/s e aceleração a = - 10 m/s<sup>2</sup>;";
    String alt33_1 = "velocidade e aceleração nulas;";
    String alt33_2 = "velocidade nula e daí em diante não se movimenta mais;";
    String alt33_3 = "velocidade 20m/s e aceleração a = - 10 m/s<sup>2</sup>;";
    String alt33_4 = "aceleração 50m/s<sup>2</sup> e velocidade -10m/s;";

    String pergunta34 = "Um Leopardo se move, partindo do repouso, de acordo com a função horária:" +
            " S = 5.t<sup>2</sup>. Qual a aceleração imprimida pelo Leopardo";
    String resposta34 = "10m/s<sup>2</sup>;";
    String alt34_1 = "10m/s<sup>2</sup>;";
    String alt34_2 = "5m/s<sup>2</sup>;";
    String alt34_3 = "20m/s<sup>2</sup>;";
    String alt34_4 = "15m/s<sup>2</sup>;";

    String pergunta35 = "Um carro de corrida parte do repouso com aceleração de 10m/s<sup>2</sup>. Sabendo " +
            "que no primeiro segundo ele percorre 5m, qual a distância total percorrida no t = 2s?";
    String resposta35 = "20m;";
    String alt35_1 = "15m;";
    String alt35_2 = "20m;";
    String alt35_3 = "30m;";
    String alt35_4 = "50m;";

    String pergunta35_extra01 = "Um motorista dirige na cidade a 72km/h, ao avistar uma simpática" +
            " velhinha a 30m atravessando a rua, freia com uma desaceleração de 5m/s2 até parar." +
            " Caso ocorra um impacto, ignore a massa da velhinha e considere a colisão totalmente" +
            " inelástica. Então, o que aconteceu?";
    String resposta35_extra01 = "A velhinha é brutalmente atropelada e arrastada por 10m;";
    String alt35_1_extra01 = "A velhinha sai ilesa e o carro para 5m antes;";
    String alt35_2_extra01 = "A velhinha morre do coração, o carro parou encostado nela;";
    String alt35_3_extra01 = "A velhinha é brutalmente atropelada e arrastada por 10m;";
    String alt35_4_extra01 = "A velhinha é brutalmente atropelada e arrastada por 50m;";

    String pergunta35_extra02 = "Um móvel possui equação horária, com dados do sistema" +
            " internacional de unidade (SI), S = 5 + 4.t -3.t<sup>2</sup>. Qual das equações a seguir representa, v = v<b><sub>0</sub></b> + a.t ?";
    String resposta35_extra02 = "v = 4 -6.t;";
    String alt35_1_extra02 = "v = 5 -3.t;";
    String alt35_2_extra02 = "v = 4 -6.t;";
    String alt35_3_extra02 = "v = 4 -3.t;";
    String alt35_4_extra02 = "v = -3 -3.t;";

    String pergunta35_extra03 = "(FEI/SP - <b>adaptado</b>) No movimento retilíneo uniformemente variado, com " +
            "velocidade inicial nula, a distância percorrida é:";
    String resposta35_extra03 = "diretamente proporcional ao quadrado do tempo de percurso;";
    String alt35_1_extra03 = "diretamente proporcional ao tempo de percurso;";
    String alt35_2_extra03 = "inversamente proporcional ao tempo de percurso;";
    String alt35_3_extra03 = "diretamente proporcional ao quadrado do tempo de percurso;";
    String alt35_4_extra03 = "inversamente proporcional ao quadrado do tempo de percurso;";

    String pergunta35_extra04 = "(UEPG/PR - <b>adaptado</b>) Um passageiro anotou, a cada minuto, a velocidade" +
            " indicada pelo velocímetro do táxi em que viajava; o resultado foi 12 km/h, 18 km/h," +
            " 24 km/h e 30 km/h. Pode-se afirmar que:";
    String resposta35_extra04 = "a aceleração média do carro é de 6 km/h, por minuto;";
    String alt35_1_extra04 = "o movimento do carro é uniforme;";
    String alt35_2_extra04 = "a aceleração média do carro é de 6 km/h, por minuto;";
    String alt35_3_extra04 = "o movimento do carro é retardado;";
    String alt35_4_extra04 = "a aceleração do carro é 0,1 km/h, por segundo;";

    String pergunta35_extra05 = "(Unimep/SP - <b>adaptado</b>) Uma partícula parte do repouso e em 5" +
            " segundos percorre 100 metros. Considerando o movimento retilíneo e uniformemente" +
            " variado, podemos afirmar que a aceleração da partícula é de:";
    String resposta35_extra05 = "8 m/s<sup>2</sup>;";
    String alt35_1_extra05 = "8 m/s<sup>2</sup>;";
    String alt35_2_extra05 = "4 m/s<sup>2</sup>;";
    String alt35_3_extra05 = "20 m/s<sup>2</sup>;";
    String alt35_4_extra05 = "4,5 m/s<sup>2</sup>;";

    String pergunta35_extra06 = "(Uneb/BA - <b>adaptado</b>o) Uma partícula, inicialmente a 2 m/s, é" +
            " acelerada uniformemente e, após percorrer 8 m, alcança a velocidade de 6 m/s. Nessas" +
            " condições, sua aceleração, em metros por segundo ao quadrado, é:";
    String resposta35_extra06 = "2;";
    String alt35_1_extra06 = "1;";
    String alt35_2_extra06 = "2;";
    String alt35_3_extra06 = "3;";
    String alt35_4_extra06 = "4;";
    //----------------------------------------------------

    //---------------------DINAMICA-----------------------
        //---------Leis de Newton:
    String pergunta36 = "Em um ônibus lotado, quando o motorista arranca de vez os passageiros: ";
    String resposta36 = "São projetados para trás;";
    String alt36_1 = "São projetados para frente;";
    String alt36_2 = "Não sentem nada;";
    String alt36_3 = "São projetados para trás;";
    String alt36_4 = "São projetados para os lados;";

    String pergunta37 = "Ao sofrer um acidente batendo frontalmente com um carro, um motociclista" +
            " é projetado para frente, passando por cima do carro. A física explica esse fato " +
            "através da(o):";
    String resposta37 = "Inércia;";
    String alt37_1 = "Ação e Reação;";
    String alt37_2 = "Inércia;";
    String alt37_3 = "Empuxo;";
    String alt37_4 = "Força Peso;";

    String pergunta38 = "Se aplicamos uma força de 30N em um objeto de 5kg, desprezando o atrito, " +
            "obteremos uma aceleração de:";
    String resposta38 = "6m/s<sup>2</sup>;";
    String alt38_1 = "6m/s<sup>2</sup>;";
    String alt38_2 = "25m<sup>2</sup>;";
    String alt38_3 = "25m<sup>2</sup>;";
    String alt38_4 = "150m<sup>2</sup>;";

    String pergunta39 = "É considerado par de ação de reação:";
    String resposta39 = "A hélice do barco empurra a água e a água empurra o barco;";
    String alt39_1 = "É considerado par de ação de reação:;";
    String alt39_2 = "A hélice do barco empurra a água e a água empurra o barco;";
    String alt39_3 = "Um atleta chuta a bola e a bola se move;";
    String alt39_4 = "A Terra atrai a Lua com uma força duas vezes maior que a Lua atrai a Terra;";

    String pergunta40 = "As forças de ação de reação não se anulam mutualmente por que:";
    String resposta40 = "São aplicadas em corpos diferentes;";
    String alt40_1 = "Apresentam módulos diferentes;";
    String alt40_2 = "São aplicadas no mesmo corpo;";
    String alt40_3 = "São aplicadas em corpos diferentes;";
    String alt40_4 = "São aplicadas em momentos diferentes;";

    String pergunta41 = "Na tentativa de emagrecer, Maria pensa em se mudar para Lua, " +
            "onde g = 1,6m/s<sup>2</sup>. Tendo Maria 55kg, na Lua ela apresentará ter massa" +
            " igual a: (g = 10m/s<sup>2</sup>)";
    String resposta41 = "55kg;";
    String alt41_1 = "55kg;";
    String alt41_2 = "88kg;";
    String alt41_3 = "550N;";
    String alt41_4 = "34kg;";

    String pergunta42 = "Assinale a alternativa <b>CORRETA</b>:";
    String resposta42 = "O peso de um corpo na Terra é maior do que na Lua;";
    String alt42_1 = "A massa de um corpo na Terra é maior do que na Lua;";
    String alt42_2 = "Massa e Peso são a mesma coisa;";
    String alt42_3 = "Peso mede a inércia de um corpo;";
    String alt42_4 = "O peso de um corpo na Terra é maior do que na Lua;";

    String pergunta43 = "Devido a inércia dos órgãos internos, quando um elevador está se " +
            "movendo as pessoas, geralmente, sentem uma sensação de desconforto no estômago. Isso pode ocorrer:";
    String resposta43 = "Quando o elevador sobe ou desce em movimento variado;";
    String alt43_1 = "Em qualquer situação;";
    String alt43_2 = "Apenas se o elevador se mover com velocidade constante;";
    String alt43_3 = "Quando o elevador sobe ou desce em movimento variado;";
    String alt43_4 = "Apenas quando o elevador sobe acelerado;";

    String pergunta44 = "Uma força agindo sobre uma massa de 3kg fornece a esta uma aceleração " +
            "de 2m/s<sup>2</sup>. Se esta mesma força agir sobre uma massa de 2kg, produzirá uma aceleração de:";
    String resposta44 = "3m/s<sup>2</sup>;";
    String alt44_1 = "3m/s<sup>2</sup>;";
    String alt44_2 = "6m/s<sup>2</sup>;";
    String alt44_3 = "1,5m/s<sup>2</sup>;";
    String alt44_4 = "zero;";

    String pergunta45 = "Na tentativa de parecer mais magra, Maria tenta verificar sua massa " +
            "dentro de um elevador. Em cima da balança Maria vai poder verificar que diminuiu" +
            " sua massa quando:";
    String resposta45 = "O elevador subir retardado;";
    String alt45_1 = "O elevador subir acelerado;";
    String alt45_2 = "O elevador descer retardado;";
    String alt45_3 = "O elevador se mover com velocidade constante;";
    String alt45_4 = "O elevador subir retardado;";

    String pergunta46 = "Um corpo em MRU está recebendo ação de:";
    String resposta46 = "Forças, que somadas, são nulas;";
    String alt46_1 = "Um corpo em MRU está recebendo ação de:;";
    String alt46_2 = "Forças, que somadas, são nulas;";
    String alt46_3 = "Uma aceleração constante;";
    String alt46_4 = "Uma força constante;";

        //----------Tipos de forças:
    String pergunta47 = "Normalmente em rampas de acesso são colocados pisos especiais para " +
                "evitar acidentes e facilitar o acesso de deficientes. O uso desses pisos" +
                " está ligado ao conceito físico de:";
    String resposta47 = "Atrito;";
    String alt47_1 = "Empuxo;";
    String alt47_2 = "Pressão;";
    String alt47_3 = "Viscosidade;";
    String alt47_4 = "Atrito;";

    String pergunta48 = "Em uma brincadeira de cabo de guerra, duas crianças puxam com 50N " +
            "cada uma das duas extremidades da corda. A tração aplicada na corda será de:";
    String resposta48 = "50N;";
    String alt48_1 = "0N;";
    String alt48_2 = "100N;";
    String alt48_3 = "25N;";
    String alt48_4 = "50N;";

    String pergunta49= "Para ajudar a erguer um cofre até o primeiro andar de uma casa foi " +
            "feito um sistema com duas polias móveis e uma fixa. Tendo o cofre 80kg, a" +
            " força mínima necessária para manter o cofre erguido é de: (g = 10m/s<sup>2</sup>)";
    String resposta49 = "200N;";
    String alt49_1 = "80N;";
    String alt49_2 = "400N;";
    String alt49_3 = "200N;";
    String alt49_4 = "40N;";

    String pergunta50 = "Os freios ABS possuem uma eficiência muito superior a dos freios a " +
            "tambor utilizados pela maioria dos carros. Essa superioridade se deve ao fato de:";
    String resposta50 = "Os freios ABS utilizarem atrito estático, que é maior que o cinético;";
    String alt50_1 = "Os freios ABS se aproveitarem do atrito cinético;";
    String alt50_2 = "Os freios ABS utilizarem atrito estático, que é maior que o cinético;";
    String alt50_3 = "Os freios ABS deixarem as rodas deslizarem, mas não travarem;";
    String alt50_4 = "Os freios a tambor travarem as rodas;";

    String pergunta51= "Um bloco de 3kg está apoiado sobre uma mesa e recebe uma força de" +
            " intensidade 10N, paralela a superfície. Sabendo que a superfície possui um " +
            "coeficiente de atrito cinético de 0,3 e estático de 0,5, determine o atrito que " +
            "responde a essa força aplicada";
    String resposta51 = "10N;";
    String alt51_1 = "15N;";
    String alt51_2 = "9N;";
    String alt51_3 = "6N;";
    String alt51_4 = "10N;";

    String pergunta52= "Qual a força aplicada a uma mola que está estendida em 3cm de seu " +
            "comprimento inicial, sabendo que sua constante molar vale k = 500N/m?";
    String resposta52 = "15N;";
    String alt52_1 = "167N;";
    String alt52_2 = "15N;";
    String alt52_3 = "150N;";
    String alt52_4 = "1500N;";

    String pergunta53 = "Se for aplicada uma força de 60N em uma mola de constante molar k = 300N/m," +
            " a deformação sofrida será de:";
    String resposta53 = "20cm;";
    String alt53_1 = "0,2cm;";
    String alt53_2 = "180cm;";
    String alt53_3 = "5m;";
    String alt53_4 = "20cm;";

        //----------Trabalho, potência e energia:
    String pergunta54= "Em uma competição 3 pessoas sobem de formas diferentes do térreo até " +
                "o 2&deg; andar de um prédio. O competidor A sobe por uma corda, o competidor" +
                " B pela escada e o competidor C pelo elevador. Realiza o menor trabalho:";
    String resposta54 = "Todos realizam o mesmo trabalho;";
    String alt54_1 = "O competidor A;";
    String alt54_2 = "Todos realizam o mesmo trabalho;";
    String alt54_3 = "O competidor B;";
    String alt54_4 = "O competidor C;";

    String pergunta55 = "Das forças abaixo não realiza trabalho:";
    String resposta55 = "Força centrípeta;";
    String alt55_1 = "Força centrípeta;";
    String alt55_2 = "Força peso;";
    String alt55_3 = "Força de atrito;";
    String alt55_4 = "Força elástica;";

    String pergunta56 = "Em um gráfico Força x deslocamento, a área sob a curva do gráfico representa:";
    String resposta56 = "Trabalho;";
    String alt56_1 = "Impulso;";
    String alt56_2 = "Trabalho;";
    String alt56_3 = "Distância;";
    String alt56_4 = "Potência;";

    String pergunta57 = "Determine o trabalho necessário para deslocar por 20m um objeto, " +
            "aplicando sobre ele uma força de 50N (desprezando o atrito).";
    String resposta57 = "1000J;";
    String alt57_1 = "1000J;";
    String alt57_2 = "500J;";
    String alt57_3 = "100J;";
    String alt57_4 = "200J;";

    String pergunta58 = "Zezinho, ciclista, desce a ladeira mais alta do seu bairro, com forte" +
            " vento contrário, com velocidade constante. Sobre as energias envolvidas nesse" +
            " processo, é <b>CORRETO</b> afirmar que:";
    String resposta58 = "Sua energia cinética permanece constante;";
    String alt58_1 = "Sua energia cinética está aumentando;";
    String alt58_2 = "Sua energia cinética permanece constante;";
    String alt58_3 = "Sua energia gravitacional aumenta ;";
    String alt58_4 = "Há conservação de energia;";

    String pergunta59 = "Ao descer em um tobogã, Zezinho nota que há várias transformações de " +
            "energia envolvidas no processo, dentre elas:";
    String resposta59 = "Gravitacional em cinética e térmica;";
    String alt59_1 = "Cinética em gravitacional;";
    String alt59_2 = "Gravitacional em elástica;";
    String alt59_3 = "Gravitacional em cinética e térmica;";
    String alt59_4 = "Térmica em cinética;";

    String pergunta60 = "São exemplos de forças dissipativas:";
    String resposta60 = "Força de atrito e resistência do ar;";
    String alt60_1 = "Força de atrito e resistência do ar;";
    String alt60_2 = "Força Normal e Peso;";
    String alt60_3 = "Força centrípeta e atrito;";
    String alt60_4 = "Força elástica e resistência do ar;";

    String pergunta61 = "Determine o trabalho realizado por uma pessoa de 80kg para subir uma " +
            "escada com 20 degraus, onde cada degrau tem 20cm de altura. (g = 10m/s<sup>2</sup>)";
    String resposta61 = "3200J;";
    String alt61_1 = "32000J;";
    String alt61_2 = "3200J;";
    String alt61_3 = "1600J;";
    String alt61_4 = "800J;";

    String pergunta62 = "Calcule a potência de uma máquina utilizada para erguer uma caixa " +
            "d’água de 60kg até o telhado de um prédio a 20m de altura, em um tempo " +
            "de 2min.(g = 10m/s<sup>2</sup>)";
    String resposta62 = "100W;";
    String alt62_1 = "200W;";
    String alt62_2 = "120W;";
    String alt62_3 = "600W;";
    String alt62_4 = "100W;";

    String pergunta63 = "Não realiza trabalho:";
    String resposta63 = "A força centrípeta;";
    String alt63_1 = "A força centrípeta;";
    String alt63_2 = "A força Peso;";
    String alt63_3 = "A força de tração;";
    String alt63_4 = "A força elétrica;";

    String pergunta64 = "Marque a opção que representa as transformações de energia ocorridas em uma usina nuclear.";
    String resposta64 = "Nuclear, Térmica, Cinética e Elétrica;";
    String alt64_1 = "Térmica, Nuclear, Gravitacional e Elétrica;";
    String alt64_2 = "Nuclear, Cinética, Mecânica e Elétrica;";
    String alt64_3 = "Nuclear, Térmica, Cinética e Elétrica;";
    String alt64_4 = "Cinética, Nuclear, Térmica e Elétrica;";

        //----------MHS
    String pergunta65 = "Sobre um sistema composto por duas molas de constantes elásticas " +
                "K<sub>1</sub> e K<sub>2</sub>, é <b>CORRETO</b> afirmar que:";
    String resposta65 = "A deformação das molas é a mesma quando associadas em paralelo;";
    String alt65_1 = "A constante elástica do sistema é maior quando as molas estão associadas em série;";
    String alt65_2 = "Quando associadas em série, a constante elástica é dada por K<sub>1</sub> e K<sub>2</sub>;";
    String alt65_3 = "A deformação das molas é a mesma quando associadas em paralelo;";
    String alt65_4 = "A força de deformação das molas é a mesma quando associadas em paralelo;";

    String pergunta65_extra01 = "Uma mola de constante elástica 800 N/m é comprimida da posição 15 " +
            "cm para a 5 cm por uma força F. Sendo F = k.x, determine o valor da força F";
    String resposta65_extra01 = "80 N;";
    String alt65_1_extra01 = "40 N;";
    String alt65_2_extra01 = "80 N;";
    String alt65_3_extra01 = "240 N;";
    String alt65_4_extra01 = "400 N;";

    String pergunta65_extra02 = "Um bloco A de massa 2kg é fixado em uma mola, que por sua vez é" +
            " presa ao teto. Considere a aceleração gravitacional g = 10 m/s<sup>2</sup> e a constante " +
            "elástica da mola k = 200 N/m. Determine a deformação na mola";
    String resposta65_extra02 = "10 cm;";
    String alt65_1_extra02 = "2 cm;";
    String alt65_2_extra02 = "5 cm;";
    String alt65_3_extra02 = "10 cm;";
    String alt65_4_extra02 = "50 cm;";

    String pergunta65_extra03 = "Uma mola helicoidal, de constante elástica k = 12N/m, foi partida " +
            "em 3 partes iguais. Em seguida, essas 3 partes foram associadas em paralelo. " +
            "Determine a constante elástica de cada pedaço da mola:";
    String resposta65_extra03 = "36 N/m;";
    String alt65_1_extra03 = "36 N/m;";
    String alt65_2_extra03 = "12 N/m;";
    String alt65_3_extra03 = "24 N/m;";
    String alt65_4_extra03 = "108 N/m;";

    String pergunta65_extra04 = "Após partir uma mola helicoidal, de constante elástica k = 12 N/m," +
            " em três partes iguais de K = 36 N/m e m = 100g cada, determine a constante elástica" +
            " equivalente e o período de oscilação se essas molas forem associadas em paralelo";
    String resposta65_extra04 = "108 N/m e 6.10<sup>-2</sup>&pi;.s;";
    String alt65_1_extra04 = "108 N/m e 6.10<sup>-2</sup>&pi;.s;";
    String alt65_2_extra04 = "36 N/m e 8.10<sup>-2</sup>&pi;.s;";
    String alt65_3_extra04 = "12 N/m e 18.10<sup>-2</sup>&pi;.s;";
    String alt65_4_extra04 = "72 N/m e 32.10<sup>-2</sup>&pi;.s;";

    String pergunta65_extra05 = "(UPE/PE - <b>adaptado</b>) Dada a equação horária da elongação de um MHS" +
            " x(t) = 4.cos[(&pi; / 2)t + &pi;], onde x(t) é dado em metros e t em segundos, analise as seguintes afirmativas:\n" +
            "<b>I</b> A amplitude é 4 m.\n" +
            "<b>II</b> O período é 4 s.\n" +
            "<b>III</b> A frequência do movimento oscilatório é 0,25 Hz.\n" +
            "Está <b>CORRETO</b> o que se afirma em:";
    String resposta65_extra05 = "I, II e III;";
    String alt65_1_extra05 = "I, apenas;";
    String alt65_2_extra05 = "I e II, apenas;";
    String alt65_3_extra05 = "I e III, apenas;";
    String alt65_4_extra05 = "I, II e III;";

    String pergunta65_extra06 = "(UCPEL/RS - <b>adaptado</b>) Considere as afirmativas abaixo e as analise como VERDADEIRAS (V) ou FALSAS (F).\n" +
            "<b>I</b> Deslocamento ou elongação de uma partícula em movimento oscilatório é a distância entre os extremos da trajetória.\n" +
            "<b>II</b> Amplitude de um movimento oscilatório é o tempo que a partícula vai da posição de equilíbrio a um extremo da trajetória.\n" +
            "<b>III</b> Movimento harmônico simples é qualquer movimento periódico.\n" +
            "<b>IV</b> A aceleração de um movimento harmônico simples é constante e diferente de zero.\n" +
            "<b>V</b> O período de um movimento harmônico simples independe da amplitude.\n" +
            "A sequência <b>CORRETA</b> é:";
    String resposta65_extra06 = "F – F – F – F – V;";
    String alt65_1_extra06 = "V – F – V – V – F;";
    String alt65_2_extra06 = "F – F – F – F – F;";
    String alt65_3_extra06 = "V – V – V – V – F;";
    String alt65_4_extra06 = "F – F – F – F – V;";

    String pergunta65_extra07 = "(MACKENZIE/SP - <b>adaptado</b>) Uma partícula em MHS tem velocidade máxima" +
            " 2,0pm/s. Se a amplitude do movimento é 20cm, seu período é de:";
    String resposta65_extra07 = "0,2 s;";
    String alt65_1_extra07 = "2 min;";
    String alt65_2_extra07 = "0,2 min;";
    String alt65_3_extra07 = "20 s;";
    String alt65_4_extra07 = "0,2 s;";

    String pergunta65_extra08 = "(UECE - <b>adaptado</b>) Um sistema oscilante massa-mola possui uma energia" +
            " mecânica igual a 1,0 J, uma amplitude de oscilação 0,5 m e uma velocidade máxima " +
            "igual a 2 m/s. Portanto, a constante da mola, a massa e a frequência são, " +
            "respectivamente, iguais a:";
    String resposta65_extra08 = "8,0 N/m, 0,5 kg e 2/&pi; Hz;";
    String alt65_1_extra08 = "8,0 N/m, 1,0 kg e 4/&pi; Hz;";
    String alt65_2_extra08 = "4,0 N/m, 0,5 kg e 4/&pi; Hz;";
    String alt65_3_extra08 = "8,0 N/m, 0,5 kg e 2/&pi; Hz;";
    String alt65_4_extra08= "4,0 N/m, 1,0 kg e 2/&pi; Hz;";

    String pergunta65_extra09 = "(UFMS - <b>adaptado</b>) O <i>Bungee Jump</i> é um esporte radical que consiste" +
            " na queda de grandes altitudes de uma pessoa amarrada numa corda elástica." +
            " Considerando desprezível a resistência do ar, é <b>CORRETO</b> afirmar que";
    String resposta65_extra09 = "a velocidade da pessoa é máxima quando a força elástica da corda " +
            "é igual à força peso que atua na pessoa;";
    String alt65_1_extra09 = "a velocidade da pessoa é máxima quando a força elástica da corda é " +
            "igual à força peso que atua na pessoa;";
    String alt65_2_extra09 = "a velocidade da pessoa é máxima quando o deslocamento da pessoa," +
            " em relação ao ponto que saltou, é igual ao comprimento da corda sob tensão nula;";
    String alt65_3_extra09 = "o tempo de movimento de queda independe da massa da pessoa;";
    String alt65_4_extra09 = "a altura mínima que a pessoa atinge em relação ao solo independe " +
            "da massa dessa pessoa;";

    String pergunta65_extra10 = "(ITA/SP - <b>adaptado</b>) Duas molas ideais, sem massa e de constantes " +
            "de elasticidade k1 e k2, sendo k1<k2, acham-se dependuradas no teto de uma sala. Em " +
            "suas extremidades livres penduram-se massas idênticas. Observa-se que, quando os" +
            " sistemas oscilam verticalmente, as massas atingem a mesma velocidade máxima. " +
            "Indicando por A1 e A3, as amplitudes dos movimentos e por E1 e E2 as energias" +
            " mecânicas dos sistemas (1) e (2), respectivamente, podemos dizer que:";
    String resposta65_extra10 = "A1 &gt; A2 e E1 = E2;";
    String alt65_1_extra10 = "A1 &gt; A2 e E1 = E2;";
    String alt65_2_extra10 = "A1 &gt; A2 e E1 = E2;";
    String alt65_3_extra10 = "A1 &lt; A2 e E1 &gt; E2;";
    String alt65_4_extra10 = "A1 = A2 e E1 &gt; E2;";

    String pergunta65_extra11 = "Um corpo de m = 0,05kg está preso a uma mola de constante" +
            " elástica 20 N/m. Desloca-se o objeto 20cm para direita, a partir da posição de" +
            " equilíbrio, passando a oscilar entre x = A e x = -A (Despreze o atrito). É <b>CORRETO</b> afirmar que:";
    String resposta65_extra11 = "Na posição x = 0, toda a energia do sistema está no corpo na forma de energia cinética e sua velocidade vale 4 m/s;";
    String alt65_1_extra11 = "Na posição x = -20 cm, a mola tem uma energia cinética de 0,4 J e potencial nula;";
    String alt65_2_extra11 = "Em x = -20 cm, toda a energia do sistema vale 0,4 J sob a forma de energia cinética;";
    String alt65_3_extra11 = "Na posição x = 0, toda a energia do sistema está no corpo na forma de energia cinética e sua velocidade vale 4 m/s;";
    String alt65_4_extra11 = "Na posição x = 20 cm, toda a energia do sistema vale 0,8 J sendo 0,6 J na mola e o restante no objeto;";

    String pergunta65_extra12 = "(EsPCEx - <b>adaptado</b>) Um objeto preso por uma mola de" +
            " constante elástica igual a 20 N/m executa um movimento harmônico simples em torno da" +
            " posição de equilíbrio. A energia mecânica do sistema é de 0,4 J e as forças" +
            " dissipativas são desprezíveis. A amplitude de oscilação do objeto é de:";
    String resposta65_extra12 = "0,2m;";
    String alt65_1_extra12 = "0,1m;";
    String alt65_2_extra12 = "0,2m;";
    String alt65_3_extra12 = "1,2m;";
    String alt65_4_extra12 = "0,6m;";

    String pergunta65_extra13 = "Um pequeno corpo de massa m é preso na extremidade de um fio" +
            " inextensível e de peso desprezível, no teto, constituindo um pêndulo simples. " +
            "Sabendo que o corpo oscila entre duas posições fixas 20 vezes em 10s, responda:";
    String resposta65_extra13 = "Se o comprimento do fio for 4 vezes maior, o período será dobrado;";
    String alt65_1_extra13 = "O período deste pêndulo é de 2s;";
    String alt65_2_extra13 = "A frequência de oscilação é de 0,5hz;";
    String alt65_3_extra13 = "Se o comprimento do fio for 4 vezes maior, o período será dobrado;";
    String alt65_4_extra13 = "Se a massa do corpo for triplicada, sua frequência ficará multiplicada por &radic;3;";

    String pergunta65_extra14 = "(UFRS - <b>adaptado</b>) Um pêndulo simples, de comprimento L, tem um período de " +
            "oscilação T, num determinado local. Para que o período de oscilação passe a valer 2T," +
            " no mesmo local, o comprimento do pêndulo deve ser aumentado para";
    String resposta65_extra14 = "4 L;";
    String alt65_1_extra14 = "1 L;";
    String alt65_2_extra14 = "2 L;";
    String alt65_3_extra14 = "4 L;";
    String alt65_4_extra14 = "5 L;";

    String pergunta65_extra15 = "(UFAL/AL - <b>adaptado</b>) Um relógio de pêndulo é construído tal que o" +
            " seu pêndulo realize 3600 oscilações completas a cada hora. O relógio está " +
            "descalibrado, de modo que o pêndulo oscila em um movimento harmônico simples de " +
            "frequência angular igual a 5&pi;/2 rad/s. Nessa situação, ao final de 3600 oscilações " +
            "completas do pêndulo terão se passado:";
    String resposta65_extra15 = "48 min;";
    String alt65_1_extra15 = "32 min;";
    String alt65_2_extra15 = "45 min;";
    String alt65_3_extra15 = "48 min;";
    String alt65_4_extra15 = "52 min;";

    String pergunta65_extra16 = "(UFOP/MG - <b>adaptado</b>) Dois sistemas oscilantes, um bloco pendurado " +
            "em uma mola vertical e um pêndulo simples, são preparados na Terra de tal forma que" +
            " possuam o mesmo período. Se os dois osciladores forem levados para a Estação Espacial " +
            "Internacional (ISS), como se comportarão os seus períodos nesse ambiente de micro gravidade?";
    String resposta65_extra16 = "O período do bloco pendurado na mola não sofrerá alteração, já o período do pêndulo deixará de ser o mesmo;";
    String alt65_1_extra16 = "Os períodos de ambos os osciladores se manterão os mesmos de quando estavam na Terra;";
    String alt65_2_extra16 = "O período do bloco pendurado na mola não sofrerá alteração, já o período do pêndulo deixará de ser o mesmo;";
    String alt65_3_extra16 = "O período do pêndulo será o mesmo, no entanto o período do bloco pendurado na mola será alterado;";
    String alt65_4_extra16 = "Os períodos de ambos os osciladores sofrerão modificação em relação a quando estavam na Terra;";

        //----------Impulso, Quantidade de movimento e Colisões
    String pergunta66 = "Um carro A, se movendo com velocidade V<sub>0</sub> constante, colide frontalmente " +
                "com um carro B, inicialmente em repouso. Após a colisão passam a se locomover" +
                " juntos, na mesma direção e sentido inicial de A. Considerando as massas de" +
                " A e B iguais, é <b>CORRETO</b> afirmar:";
    String resposta66 = "O choque foi inelástico e a velocidade final dos carros é V<sub>0</sub>/2;";
    String alt66_1 = "Houve conservação de massa e energia;";
    String alt66_2 = "O choque foi inelástico e a velocidade final dos carros é V<sub>0</sub>/2;";
    String alt66_3 = "O coeficiente de restituição vale 1;";
    String alt66_4 = "O Choque foi elástico, com conservação de energia;";

    String pergunta67 = "A colisão que ocorre entre as bolinhas do pêndulo de Newton são consideradas:";
    String resposta67 = "Elásticas;";
    String alt67_1 = "Elásticas;";
    String alt67_2 = "Parcialmente inelásticas;";
    String alt67_3 = "Inelásticas;";
    String alt67_4 = "Indiferentes;";

    String pergunta68 = "Considere um pêndulo de Newton com 5 bolinhas. Se de um lado forem" +
            " abandonadas 3 bolinhas, certamente do outro lado deve-se levantar:";
    String resposta68 = "3;";
    String alt68_1 = "2;";
    String alt68_2 = "5;";
    String alt68_3 = "3;";
    String alt68_4 = "Menos que 3;";

    String pergunta69 = "Um caminhão de brinquedo de 2kg se move com velocidade constante " +
            "de 5m/s. Em certo momento um tijolo de 500g cai sobre sua carroceria, passando a" +
            " se mover junto com o caminhão. É <b>CORRETO</b> afirmar que:";
    String resposta69 = "A velocidade final do caminhão é de 4m/s;";
    String alt69_1 = "Durante a colisão a energia cinética se conservou;";
    String alt69_2 = "A colisão foi parcialmente inelástica;";
    String alt69_3 = "A quantidade de movimento não se conserva;";
    String alt69_4 = "A velocidade final do caminhão é de 4m/s;";

    String pergunta70= "Hoje nos carros um dispositivo de segurança está salvando muitas vidas," +
            " o Air Bag. A grande eficiência do Air Bag se deve ao fato de:";
    String resposta70 = "Aumentar o tempo de interação durante a colisão, diminuindo a força aplicada sobre o motorista;";
    String alt70_1 = "Diminuir a energia trocada, devido a menor distância da colisão;";
    String alt70_2 = "Aumentar o tempo de interação durante a colisão, diminuindo a força aplicada sobre o motorista;";
    String alt70_3 = "Diminuir a velocidade da colisão, aumentando a desaceleração;";
    String alt70_4 = "Aumentar o impulso sobre o corpo do motorista;";

    String pergunta71 = "Em um gráfico Fxt, a área sob a curva do gráfico representa:";
    String resposta71 = "Impulso;";
    String alt71_1 = "Impulso;";
    String alt71_2 = "Velocidade;";
    String alt71_3 = "Potência;";
    String alt71_4 = "Energia;";

    String pergunta72 = "Um carro de aproximadamente 8000N se move a uma velocidade média" +
        " 90km/h, o que lhe confere uma quantidade de movimento, em Kg.m/s, de: (g = 10m/s<sup>2</sup>)";
    String resposta72 = "20000;";
    String alt72_1 = "89;";
    String alt72_2 = "8000;";
    String alt72_3 = "720000;";
    String alt72_4 = "20000;";

    String pergunta72_extra01 = "Suponha que Zezinho (70kg) caia do 15&deg; andar e assim obtenha uma " +
            "velocidade final de 30 m/s. Defina o impacto em seu equivalente em toneladas. Dados: " +
            "I = &Delta;Q, Q = m.v, I = F.&Delta;t e tempo de impacto de 0,01s.";
    String resposta72_extra01 = "210 ton;";
    String alt72_1_extra01 = "100 ton;";
    String alt72_2_extra01 = "120 ton;";
    String alt72_3_extra01 = "140 ton;";
    String alt72_4_extra01 = "210 ton;";

    String pergunta72_extra02 = "Um revolver comum de 38 polegadas lança um projétil de 13g a 300" +
            " m/s. Suponha que o atirador esteja sobre um skate e a massa do sistema atirador, " +
            "skate e revolver seja de 100kg. Ignore qualquer forma de atrito. Qual será a " +
            "velocidade aproximada do sistema após o primeiro tiro?";
    String resposta72_extra02 = "0,04 m/s;";
    String alt72_1_extra02 = "0,04 m/s;";
    String alt72_2_extra02 = "0,50 m/s;";
    String alt72_3_extra02 = "3,0 m/s;";
    String alt72_4_extra02 = "10 m/s;";

    String pergunta72_extra03 = "Um vagão A, de massa 10.000 kg, move-se com velocidade igual a" +
            " 0,4 m/sobre trilhos horizontais sem atrito até colidir com outro vagão B, de massa " +
            "20.000 kg, inicialmente em repouso. Após a colisão, o vagão A fica parado. A" +
            " velocidade final do vagão B vale:";
    String resposta72_extra03 = "0,2 m/s;";
    String alt72_1_extra03 = "0,4 m/s;";
    String alt72_2_extra03 = "0,2 m/s;";
    String alt72_3_extra03 = "0,6 m/s;";
    String alt72_4_extra03 = "0,5 m/s;";

    String pergunta72_extra04 = "(Fuvest - <b>adaptado</b>) Um vagão A, de massa 10.000 kg, move-se com" +
            " velocidade igual a 0,4 m/sobre trilhos horizontais sem atrito até colidir com outro " +
            "vagão B, de massa 20.000 kg, inicialmente em repouso. Após a colisão, o vagão A fica" +
            " parado. A energia cinética final do vagão B vale:";
    String resposta72_extra04 = "400 J;";
    String alt72_1_extra04 = "100 J;";
    String alt72_2_extra04 = "200 J;";
    String alt72_3_extra04 = "400 J;";
    String alt72_4_extra04 = "800 J;";

    String pergunta72_extra05 = "Em um acidente de transito, Raoni em seu Gol, a 30 m/s com 1000kg," +
            " bate na traseira de Iza em um New Beetle, de 1500kg a 20 m/s. Ambos ficam grudados " +
            "após o impacto. Determine o tipo de colisão e a velocidade final do conjunto logo após" +
            " o impacto.";
    String resposta72_extra05 = "Colisão inelástica e 24 m/s;";
    String alt72_1_extra05 = "Colisão elástica e 20 m/s;";
    String alt72_2_extra05 = "Colisão inelástica e 24 m/s;";
    String alt72_3_extra05 = "Colisão parcialmente elástica e 25 m/s;";
    String alt72_4_extra05 = "Colisão elástica e 30 m/s;";

    String pergunta72_extra06 = "(UFU/MG - <b>adaptado</b>) Um passageiro de 90 kg viaja no banco da frente de um " +
            "carro, que se move a 30 km/h. O carro, cuja massa é 810 kg, colide com um poste," +
            " parando bruscamente. A velocidade com a qual o passageiro será projetado para a " +
            "frente, caso não esteja utilizando o cinto de segurança, será, aproximadamente:";
    String resposta72_extra06 = "300 km/h;";
    String alt72_1_extra06 = "30 km/h;";
    String alt72_2_extra06 = "300 km/h;";
    String alt72_3_extra06 = "150 km/h;";
    String alt72_4_extra06 = "90 km/h;";

    String pergunta72_extra07 = "(UECE - <b>adapatad0</b>) Oito esferas estão suspensas, sendo quatro de" +
            " massa M = 150 g e quatro de massa m = 50 g, por fios flexíveis, inextensíveis e de" +
            " massas desprezíveis. Se uma esfera de massa M for deslocada de sua posição inicial e" +
            " solta, ela colidirá frontalmente com o grupo de esferas estacionadas. Considere o " +
            "choque entre as esferas perfeitamente elástico. O número n de esferas de massa m que " +
            "se moverão é:";
    String resposta72_extra07 = "três;";
    String alt72_1_extra07 = "um;";
    String alt72_2_extra07 = "dois;";
    String alt72_3_extra07 = "três;";
    String alt72_4_extra07 = "quatro;";
    //----------------------------------------------------

    //---------------------ESTATICA-----------------------
    String pergunta73 = "Um corpo fica sujeito à ação de três forças concorrentes, onde duas" +
            " delas têm intensidade 5N e 20N. Para que haja equilíbrio a terceira força deve" +
            " satisfazer que desigualdade?";
    String resposta73 = "15N &le; f &le; 25N;";
    String alt73_1 = "5N &le; f &le; 20N;";
    String alt73_2 = "f &ge; 5N;";
    String alt73_3 = "f &le; 25N;";
    String alt73_4 = "15N &le; f &le; 25N;";

    String pergunta74 = "Dois garotos puxam, por meio de duas cordas, um objeto de 20kg," +
            " que inicialmente repousa em equilíbrio, aplicando forças de 90N e 120N, " +
            "perpendiculares entre si. Para evitar que a caixa se mova um garoto C deve " +
            "aplicar uma outra força em outro sentido e direção. Determine a força " +
            "aplicada pelo garoto C.";
    String resposta74 = "150N;";
    String alt74_1 = "150N;";
    String alt74_2 = "210N;";
    String alt74_3 = "30N;";
    String alt74_4 = "250N;";

    String pergunta75 = "Zezinho usa uma chave de 15 cm para tentar soltar os parafusos " +
            "da roda do seu carro. Na tentativa de facilitar na soltura do parafuso ele utiliza" +
            " uma mão de força que aumenta em 30 cm o comprimento da chave. Sendo de 90N.m o" +
            " torque necessário para folgar o parafuso, qual a força mínima aplicada na chave?";
    String resposta75 = "200N;";
    String alt75_1 = "1350N;";
    String alt75_2 = "4050N;";
    String alt75_3 = "45N;";
    String alt75_4 = "200N;";

    String pergunta75_extra01 = "Quando a resultante de um sistema de forças aplicadas num corpo" +
            " é nula, é porque o corpo:";
    String resposta75_extra01 = "está em equilíbrio;";
    String alt75_1_extra01 = "somente se movimenta com velocidade constante;";
    String alt75_2_extra01 = "muda de direção de deslocamento;";
    String alt75_3_extra01 = "está em equilíbrio;";
    String alt75_4_extra01 = "somente está parado;";

    String pergunta75_extra02 = "De acordo com o estudo sobre a estática do corpo rígido, mais " +
            "precisamente sobre momento de uma força, marque a alternativa que completa a frase abaixo." +
            "\nQuando um corpo extenso está sujeito à ação de forças de resultante não nula, ele " +
            "pode adquirir movimento de ................., de ................ ou ..............., simultaneamente";
    String resposta75_extra02 = "translação, rotação, ambos;";
    String alt75_1_extra02 = "translação, rotação, ambos;";
    String alt75_2_extra02 = "aplicação, rotação, relação;";
    String alt75_3_extra02 = "translação, relação, rotação;";
    String alt75_4_extra02 = "equilíbrio, rotação, ação;";

    String pergunta75_extra03 = "(UFRJ - <b>adaptado</b>) Suponha que um menino esteja empurrando uma porta com uma " +
            "força F1 = 5 N, atuando a uma distância d1 = 2 m das dobradiças (eixo de rotação) e" +
            " que um homem exerça uma força F2 = 80 N a uma distância de 10 cm do eixo de rotação." +
            " Nestas condições, pode-se afirmar que:";
    String resposta75_extra03 = "a porta estaria girando no sentido de ser aberta;";
    String alt75_1_extra03 = "a porta estaria girando no sentido de ser fechada;";
    String alt75_2_extra03 = "a porta estaria girando no sentido de ser aberta;";
    String alt75_3_extra03 = "a porta não gira em sentido algum;";
    String alt75_4_extra03 = "o valor do momento aplicado à porta pelo homem é maior que o valor do " +
            "momento aplicado pelo menino;";

    String pergunta75_extra04 = "(ENEM - <b>adaptado</b>) Um portão está fixo em um muro por duas dobradiças A " +
            "(de cima) e B (de baixo), sendo P o peso do portão. Caso um garoto se dependure no" +
            " portão pela extremidade livre (oposta as dobradiças), e supondo que as reações " +
            "máximas suportadas pelas dobradiças sejam iguais, ";
    String resposta75_extra04 = "é mais provável que a dobradiça A arrebente primeiro que a B;";
    String alt75_1_extra04 = "é mais provável que a dobradiça A arrebente primeiro que a B;";
    String alt75_2_extra04 = "é mais provável que a dobradiça B arrebente primeiro que a A;";
    String alt75_3_extra04 = "seguramente as dobradiças A e B arrebentarão simultaneamente;";
    String alt75_4_extra04 = "nenhuma delas sofrerá qualquer esforço;";

    String pergunta75_extra05 = "Para elevar um elefante de 5 toneladas (50.000 N) é usada uma " +
            "alavanca resistente, sendo que 0,5m estão do lado do elefante e 4m estão do lado das" +
            " pessoas que fazem força na extremidade. Cada pessoa possui 100 Kg (1.000N) e queremos" +
            " saber quantos destes pendurados na alavanca serão necessários, no mínimo, para mover" +
            " o elefante";
    String resposta75_extra05 = "7;";
    String alt75_1_extra05 = "1;";
    String alt75_2_extra05 = "3;";
    String alt75_3_extra05 = "5;";
    String alt75_4_extra05 = "7;";

    String pergunta75_extra06 = "Em uma gangorra, queremos equilibrar uma criança de 40 Kg a 2 m" +
            " do eixo de rotação, com um adulto de 100 Kg à uma distância “x” do outro lado da" +
            " gangorra. Qual será a distância “x”? ";
    String resposta75_extra06 = "0,8m;";
    String alt75_1_extra06 = "0,2m;";
    String alt75_2_extra06 = "0,4m;";
    String alt75_3_extra06 = "0,8m;";
    String alt75_4_extra06 = "1,0m ;";

    String pergunta75_extra07 = "(UFSM - <b>adaptado</b>) Um jogador de 70 kg teve de ser retirado do campo, numa" +
            " maca. A maca tem 2 m de comprimento e os maqueiros, mantendo-a na horizontal, " +
            "seguram suas extremidades. O centro de massa do jogador está a 0,8 m de um dos" +
            " maqueiros. Considerando-se g = 10 m/s2 e desprezando a massa da maca, o módulo da " +
            "força vertical exercida por esse mesmo maqueiro é, em N:";
    String resposta75_extra07 = "420;";
    String alt75_1_extra07 = "280;";
    String alt75_2_extra07 = "350;";
    String alt75_3_extra07 = "420;";
    String alt75_4_extra07 = "700;";

    String pergunta75_extra08 = "(Mackenzie 1996 - <b>adaptado</b>)  Para um corpo que se encontra em equilíbrio" +
            " segundo um referencial, pode-se garantir que: ";
    String resposta75_extra08 = "é nula sua aceleração mas não necessariamente sua velocidade;";
    String alt75_1_extra08 = "é nula sua velocidade;";
    String alt75_2_extra08 = "é nula sua energia potencial;";
    String alt75_3_extra08 = "são nulas sua aceleração e sua velocidade;";
    String alt75_4_extra08 = "é nula sua aceleração mas não necessariamente sua velocidade;";
    //----------------------------------------------------

    //---------------------GRAVITACAO---------------------
        //----------Satélites em órbitas circulares
    String pergunta76 = "Satélites de telecomunicação, chamados geoestacionários, são satélites" +
            " que ficam “parados” em relação a um ponto fixo da Terra. Para que isso ocorra, o satélite:";
    String resposta76 = "Deve apresentar mesma velocidade angular da Terra;";
    String alt76_1 = "Deve apresentar mesma velocidade angular da Terra;";
    String alt76_2 = "Deve apresentar mesma velocidade linear da Terra;";
    String alt76_3 = "Deve estar posicionado acima de um dos trópicos;";
    String alt76_4 = "Deve ser posicionado na menor orbita possível;";

    String pergunta77 = "Dois satélites (A e B) giram em uma mesma órbita, em torno da Terra." +
            " Tendo o satélite A o dobro de massa do satélite B. Podemos afirmar que:";
    String resposta77 = "As forças de atração gravitacional de A e B são as mesmas;";
    String alt77_1 = "A força de atração gravitacional de A é 2x maior que a de B;";
    String alt77_2 = "A velocidade orbital de A é maior que a de B;";
    String alt77_3 = "As forças de atração gravitacional de A e B são as mesmas;";
    String alt77_4 = "A velocidade angular de B é maior que a de A;";

    String pergunta78 = "Dois satélites, A e B, giram em torno da Terra sobre a mesma órbita," +
            " sendo a massa de A o dobro da de B. Sobre seus períodos de rotação é <b>CORRETO</b> afirmar que:";
    String resposta78 = "T<sub>A</sub> = T<sub>B</sub>;";
    String alt78_1 = "T<sub>A</sub> = T<sub>B</sub>;";
    String alt78_2 = "T<sub>A</sub> &gt; T<sub>B</sub>;";
    String alt78_3 = "T<sub>A</sub> &lt; T<sub>B</sub>;";
    String alt78_4 = "T<sub>A</sub> &ge; T<sub>B</sub>;";

    String pergunta78_extra01 = "(Fuvest-SP) A melhor explicação para o fato de a Lua não cair sobre a Terra é que:";
    String resposta78_extra01 = "a Lua gira em torno da Terra;";
    String alt78_1_extra01 = "a gravidade terrestre não chega até a Lua;";
    String alt78_2_extra01 = "a Lua gira em torno da Terra;";
    String alt78_3_extra01 = "a Terra gira em torno de seu eixo;";
    String alt78_4_extra01 = "a Lua também é atraída pelo Sol;";

    String pergunta78_extra02 = "(Fuvest-SP) Satélites utilizados para telecomunicações são " +
            "colocados em órbitas geoestacionárias ao redor da Terra, ou seja,  de tal forma que " +
            "permaneçam sempre acima de um mesmo ponto da superfície da Terra. Considere algumas" +
            " condições que deveriam corresponder a esses satélites:" +
            "\nI.    Ter o mesmo período, de cerca de 24 horas.\n" +
            "II.   Ter aproximadamente a mesma massa.\n" +
            "III.  Estar aproximadamente à mesma altitude.\n" +
            "IV.  Manter-se num plano que contenha o círculo do equador terrestre.\n" +
            "O conjunto de todas as condições que satélites em órbitas geoestacionárias devem necessariamente obedecer corresponde a:\n";
    String resposta78_extra02 = "I, III e IV;";
    String alt78_1_extra02 = "I e III;";
    String alt78_2_extra02 = "I, II e III;";
    String alt78_3_extra02 = "I, III e IV;";
    String alt78_4_extra02 = "II e IV;";

    String pergunta78_extra03 = "Dois satélites, A e B, giram em torno da Terra sobre a mesma " +
            "órbita, sendo a massa de A o dobro da de B. Sobre suas velocidades é <b>CORRETO</b> afirmar que:";
    String resposta78_extra03 = "V<sub>A</sub> = V<sub>B</sub>;";
    String alt78_1_extra03 = "V<sub>A</sub> = V<sub>B</sub>;";
    String alt78_2_extra03 = "V<sub>A</sub> &gt; V<sub>B</sub>;";
    String alt78_3_extra03 = "V<sub>A</sub> &lt; V<sub>B</sub>;";
    String alt78_4_extra03 = "V<sub>A</sub> &ge; V<sub>B</sub>;";

    String pergunta78_extra04 = "(UFG)  Considere que a Estação Espacial Internacional, de " +
            "massa M, descreve uma órbita elíptica estável em torno da Terra, com um período de " +
            "revolução T e raio médio R da órbita. Nesse movimento,";
    String resposta78_extra04 = "a energia cinética é máxima no perigeu;";
    String alt78_1_extra04 = "o período depende de sua massa;";
    String alt78_2_extra04 = "a razão entre o cubo do seu período e o quadrado do raio médio da órbita é uma constante de movimento;";
    String alt78_3_extra04 = "o módulo de sua velocidade é constante em sua órbita;";
    String alt78_4_extra04 = "a energia cinética é máxima no perigeu;";

    String pergunta78_extra05 = "Qual é a figura geométrica que mais se assemelha à órbita de um " +
            "dos planetas em torno do Sol? ";
    String resposta78_extra05 = "Elipse;";
    String alt78_1_extra05 = "Reta;";
    String alt78_2_extra05 = "Elipse;";
    String alt78_3_extra05 = "Hipérbole;";
    String alt78_4_extra05 = "Circunferência;";

        //----------Leis de Kepler
    String pergunta79 = "Você já deve ter notado que vemos sempre a mesma face da Lua. Isso se deve ao fato de que:";
    String resposta79 = "O período de rotação da Lua coincide com o de translação;";
    String alt79_1 = "A Lua não possui movimento de Rotação;";
    String alt79_2 = "O período de rotação da Lua coincide com o de translação;";
    String alt79_3 = "A Lua não possui movimento de translação;";
    String alt79_4 = "A Lua não possui nem rotação nem translação   ;";

    String pergunta80 = "Qual é, aproximadamente, o tempo gasto pela Terra, em meses, para " +
            "percorrer uma área igual a 2/3 da total da elipse em torno do Sol";
    String resposta80 = "8;";
    String alt80_1 = "6;";
    String alt80_2 = "8;";
    String alt80_3 = "4;";
    String alt80_4 = "9;";

    String pergunta81 = "Quanto as Leis de Kepler é <b>CORRETO</b> afirmar que:";
    String resposta81 = "Quanto mais afastado um planeta, maior seu período de revolução;";
    String alt81_1 = "O verão ocorre no periélio;";
    String alt81_2 = "Quanto mais afastado um planeta, maior seu período de revolução;";
    String alt81_3 = "Os planetas descrevem orbitas circulares em torno do Sol;";
    String alt81_4 = "Os planetas apresentam maior velocidade no afélio;";

    String pergunta82 = "O movimento de translação da Terra e sua inclinação, permitem que a " +
            "terra experimente 4 estações diferentes. É <b>CORRETO</b> afirmar que:";
    String resposta82 = "Os hemisférios da Terra experimentam estações opostas;";
    String alt82_1 = "Ao passar pelo periélio o País experimenta o Verão;";
    String alt82_2 = "Os hemisférios da Terra experimentam estações opostas;";
    String alt82_3 = "Se no Brasil for primavera, na Europa é verão;";
    String alt82_4 = "Cada estação dura aproximadamente 4 meses;";

    String pergunta83 = "Assinale a alternativa <b>CORRETA</b>:";
    String resposta83 = "O planeta aumenta sua velocidade ao passar próximo do Sol;";
    String alt83_1 = "Os planetas mais afastados apresentam menor período de revolução;";
    String alt83_2 = "O planeta aumenta sua velocidade ao passar próximo do Sol;";
    String alt83_3 = "O planeta gira em torno do Sol com velocidade constante;";
    String alt83_4 = "Os planetas de mais massa apresentam maior período de revolução;";

    String pergunta84 = "Sobre as Leis de Kepler assinale a <b>CORRETA</b>";
    String resposta84 = "Um segmento de reta que une o planeta ao Sol varre áreas iguais em tempos iguais;";
    String alt84_1 = "Os planetas descrevem órbitas elípticas com o Sol no centro;";
    String alt84_2 = "O período do planeta ao cubo sobre seu raio ao quadrado é uma constante;";
    String alt84_3 = "Um segmento de reta que une o planeta ao Sol varre áreas iguais em tempos iguais;";
    String alt84_4 = "As órbitas descritas pelos planetas variam de acordo com a distância ao Sol;";

    String pergunta85 = "Sobre os físicos e suas teorias, é <b>INCORRETO</b> afirmar que:";
    String resposta85 = "Galileu apostava que a Terra era o centro do universo;";
    String alt85_1 = "Aristóteles foi o primeiro a propor um modelo Geocêntrico;";
    String alt85_2 = "Tycho Brahe defendia um modelo Geocêntrico;";
    String alt85_3 = "Nicolau Copérnico foi o primeiro a defender o modelo Heliocêntrico;";
    String alt85_4 = "Galileu apostava que a Terra era o centro do universo;";

    String pergunta86 = "Determine o período, em anos terrestres, de um planeta hipotético que" +
            " gravita em torno do Sol a uma distância de 4 vezes maior que a da Terra.";
    String resposta86 = "8 anos;";
    String alt86_1 = "8 anos;";
    String alt86_2 = "4 anos;";
    String alt86_3 = "16 anos;";
    String alt86_4 = "64 anos;";

    String pergunta86_extra01 = "Considere que a Estação Espacial Internacional, de massa M, " +
            "descreve uma órbita elíptica estável em torno da Terra, com um período de revolução" +
            " T e raio médio R da órbita.\n" +
            "Nesse movimento,\n";
    String resposta86_extra01 = "a energia cinética é máxima no perigeu;";
    String alt86_1_extra01 = "o período depende de sua massa;";
    String alt86_2_extra01 = "a razão entre o cubo do seu período e o quadrado " +
            "do raio médio da órbita é uma constante de movimento;";
    String alt86_3_extra01 = "a energia cinética é máxima no afélio;";
    String alt86_4_extra01 = "a energia cinética é máxima no perigeu;";

    String pergunta86_extra02 = ". (UNIFESP-SP) A Massa da Terra é aproximadamente 80 vezes a massa" +
            " da Lua e a distância entre os centros de massa desses astros é aproximadamente " +
            "60 vezes o raio da Terra. A respeito do sistema Terra-Lua pode-se afirmar que";
    String resposta86_extra02 = "a Terra e a Lua giram em torno de um ponto comum, o centro de " +
            "massa do sistema Terra-Lua, localizado no interior da Terra;";
    String alt86_1_extra02 = "a Lua gira em torno da Terra com órbita elíptica e em um dos focos " +
            "dessa órbita está o centro de massa da Terra;";
    String alt86_2_extra02 = "a Lua gira em torno da Terra com órbita circular e o centro de massa " +
            "da Terra está no centro dessa órbita;";
    String alt86_3_extra02 = "a Terra e a Lua giram em torno de um ponto comum, o centro de massa " +
            "do sistema Terra-Lua, localizado no interior da Terra;";
    String alt86_4_extra02 = "a Terra e a Lua giram em torno de um ponto comum, o centro de massa" +
            " do sistema Terra-Lua, localizado no interior da Lua;";

    String pergunta86_extra03 = "Durante o primeiro semestre deste ano, foi possível observar o " +
            "planeta Vênus bem brilhante, ao anoitecer.\n" +
            "Sabe-se que Vênus está bem mais perto do Sol que a Terra. Comparados com a Terra," +
            " o período de revolução de Vênus em torno do Sol é…………………..e sua velocidade " +
            "orbital é………………………. . As lacunas são <b>CORRETAMENTE</b> preenchidas, respectivamente, " +
            "por:";
    String resposta86_extra03 = "menor; maior;";
    String alt86_1_extra03 = "menor; menor;";
    String alt86_2_extra03 = "menor; igual;";
    String alt86_3_extra03 = "maior; maior;";
    String alt86_4_extra03 = "menor; maior;";

    String pergunta86_extra04 = "(ENEM - <b>adaptado</b>) As leis de Kepler definem o movimento da Terra em torno" +
            " do Sol. Qual é, aproximadamente, o tempo gasto, em meses, pela Terra para percorrer " +
            "uma área igual a um quarto da área total da elipse?";
    String resposta86_extra04 = "3;";
    String alt86_1_extra04 = "9;";
    String alt86_2_extra04 = "6;";
    String alt86_3_extra04 = "4;";
    String alt86_4_extra04 = "3;";

    String pergunta86_extra05 = ". (UEPB) O astrônomo alemão J. Kepler(1571-1630), adepto do " +
            "sistema heliocêntrico, desenvolveu um trabalho de grande vulto, aperfeiçoando as " +
            "idéias de Copérnico. Em conseqüência, ele conseguiu estabelecer três leis sobre o " +
            "movimento dos planetas, que permitiram um grande avanço no estudo da astronomia. " +
            "Um estudante ao ter tomado conhecimento das leis de Kepler concluiu, segundo as " +
            "proposições a seguir, que:\n" +
            "<b>I.</b> Para a primeira lei de Kepler (lei das órbitas), o verão ocorre quando a Terra" +
            " está mais próxima do Sol, e o inverno, quando ela está mais afastada.\n" +
            "<b>II.</b> Para a segunda lei de Kepler (lei das áreas), a velocidade de um planeta X, em " +
            "sua órbita, diminui à medida que ele se afasta do Sol.                                                                     \n" +
            "<b>III.</b> Para a terceira lei de Kepler (lei dos períodos), o período de rotação de um " +
            "planeta em torno de seu eixo, é tanto maior quanto maior for seu período de revolução.\n" +
            "Com base na análise feita, assinale a alternativa <b>CORRETA</b>:";
    String resposta86_extra05 = "apenas a proposição <b>II</b> é verdadeira;";
    String alt86_1_extra05 = "apenas as proposições <b>II</b> e <b>III</b> são verdadeiras;";
    String alt86_2_extra05 = "apenas as proposições <b>I</b> e <b>II</b> são verdadeiras;";
    String alt86_3_extra05 = "apenas a proposição <b>II</b> é verdadeira;";
    String alt86_4_extra05 = "todas as proposições são verdadeiras;";

    String pergunta86_extra06 = "Com referência a cinemática gravitacional, afirma-se:\n" +
            "I- A velocidade do planeta Terra no afélio e maior que no periélio.\n" +
            "II- Os planetas giram em torno do Sol, varrendo áreas iguais em tempos iguais.\n" +
            "III- O período de translação de Júpiter e o maior, comparado ao dos outros planetas.\n" +
            "IV- O período de translação dos planetas é proporcional a raiz quadrada do cubo do raio médio das suas órbitas.\n" +
            "Sao <b>CORRETAS</b> apenas as afirmativas";
    String resposta86_extra06 = "<b>II</b> e <b>IV</b>;";
    String alt86_1_extra06 = "<b>I</b> e <b>III</b>;";
    String alt86_2_extra06 = "<b>I</b> e <b>IV</b>;";
    String alt86_3_extra06 = "<b>II</b> e <b>IV</b>;";
    String alt86_4_extra06 = "<b>II</b>, <b>III</b> e <b>IV</b>;";

    String pergunta86_extra07 = "(Mackenzie/SP - <b>adaptado</b>) Dois satélites de um planeta têm períodos de" +
            " revolução de 32 dias e 256 dias, respectivamente. Se o raio da órbita do primeiro " +
            "satélite vale 1 unidade, então o raio da órbita do segundo será:";
    String resposta86_extra07 = "4 unidades ;";
    String alt86_1_extra07 = "4 unidades ;";
    String alt86_2_extra07 = "8 unidades ;";
    String alt86_3_extra07 = "16 unidades;";
    String alt86_4_extra07 = "64 unidades;";

        //----------Gravidade
    String pergunta87 = "É muito comum ouvirmos o termo “Gravidade zero” quando se fala dos" +
                " astronautas, porém sabemos que isso não existe, o que na verdade acontece:";
    String resposta87 = "É que os corpos estão constantemente caindo em queda livre;";
    String alt87_1 = "É que os corpos estão constantemente caindo em queda livre;";
    String alt87_2 = "É que a determinadas altura a gravidade da Terra não consegue mantem “preso” o astronauta;";
    String alt87_3 = "É que os corpos fora da Terra sofrem uma força de repulsão;";
    String alt87_4 = "É que os corpos sofrem uma atração gravitacional maior pelo Sol;";

    String pergunta88 = "Os astronautas no interior das naves espaciais parecem ‘flutuar’. " +
        "Das afirmativas abaixo a que melhor representa esse fenômeno é:";
    String resposta88 = "A nave e os astronautas estão em queda livre;";
    String alt88_1 = "O peso dos astronautas no interior da nave é nulo;";
    String alt88_2 = "A nave e seu conteúdo estão fora do campo gravitacional da Terra;";
    String alt88_3 = "Não atua nenhuma força sobre a nave e os astronautas;";
    String alt88_4 = "A nave e os astronautas estão em queda livre;";

    String pergunta88_extra01 = "(UFRS - <b>adaptado</b>) De acordo com o estudado sobre gravidade e" +
            " considerando que nosso planeta é achatado nos polos em relação ao Equador, podemos afirmar, quanto ao valor de g, que:";
    String resposta88_extra01 = "g (pólos) &gt; g (médio) &gt; g (Equador);";
    String alt88_1_extra01 = "g (médio) &gt; g (pólos) &gt; g (Equador);";
    String alt88_2_extra01 = "g (pólos) &gt; g (médio) &gt; g (Equador);";
    String alt88_3_extra01 = "g (Equador) &gt; g (médio) &gt; g (pólos);";
    String alt88_4_extra01 = "g (pólos) &gt; g (Equador) &gt; g (médio);";

    String pergunta88_extra02 = "(UNESP/SP - <b>adaptado</b>) Turistas que visitam Moscou podem experimentar a " +
            "ausência de gravidade voando em aviões de treinamento de cosmonautas.  Uma das " +
            "maneiras de dar aos passageiros desses voos a sensação de ausência de gravidade," +
            " durante um determinado intervalo de tempo, é fazer um desses aviões:";
    String resposta88_extra02 = "cair verticalmente de grande altura, em queda livre;";
    String alt88_1_extra02 = "voar em círculos, num plano vertical, com velocidade escalar constante;";
    String alt88_2_extra02 = "voar em círculos, num plano horizontal, com velocidade escalar constante;";
    String alt88_3_extra02 = "voar verticalmente para cima, com aceleração igual a g;";
    String alt88_4_extra02 = "cair verticalmente de grande altura, em queda livre;";

    String pergunta88_extra03 = "(UEMG - <b>adaptado</b>) Dois objetos de mesma massa são abandonados, simultaneamente, da mesma altura, um na Lua e outro na Terra, em queda livre. Sobre essa situação, Carolina e Leila chegaram às seguintes conclusões:\n" +
            "Carolina: Como partiram do repouso e de uma mesma altura, ambos atingiram o solo com a mesma energia cinética.\n" +
            "Leila: Como partiram do repouso e da mesma altura, ambos atingiram o solo no mesmo instante.\n" +
            "Sobre tais afirmações, é <b>CORRETO</b> dizer que:";
    String resposta88_extra03 = "as duas afirmações são falsas;";
    String alt88_1_extra03 = "as duas afirmações são falsas;";
    String alt88_2_extra03 = "as duas afirmações são verdadeiras;";
    String alt88_3_extra03 = "apenas Carolina fez uma afirmação verdadeira;";
    String alt88_4_extra03 = "apenas Leila fez uma afirmação verdadeira;";

    String pergunta88_extra04 = "(PUC/MG 2006 - <b>adaptado</b>)Leia as informações abaixo:\n" +
            "I. A galáxia Andrômeda exerce uma força sobre a Via Láctea.\n" +
            "II. O Sol exerce uma força sobre a Terra.\n" +
            "III. A Terra exerce uma força sobre o homem.\n" +
            "Assinale a alternativa que se refere à natureza das forças mencionadas nas três situações.";
    String resposta88_extra04 = "gravitacional;";
    String alt88_1_extra04 = "de contato;";
    String alt88_2_extra04 = "elétrica;";
    String alt88_3_extra04 = "nuclear;";
    String alt88_4_extra04 = "gravitacional;";

    String pergunta88_extra05 = "Um planeta tem massa igual ao triplo da massa da Terra e seu" +
            " raio é o dobro do raio terrestre. Nesta condição, afirma-se que sua gravidade em" +
            " relação à gravidade da Terra (g) é de:";
    String resposta88_extra05 = "3 g/4;";
    String alt88_1_extra05 = "3 g;";
    String alt88_2_extra05 = "g;";
    String alt88_3_extra05 = "3 g/2;";
    String alt88_4_extra05 = "3 g/4;";

        //---------Lei da gravitação universal
    String pergunta89 = "Em relação às marés:";
    String resposta89 = "Extremidades opostas da Terra experimentam marés iguais;";
    String alt89_1 = "Ocorrem duas marés por dia;";
    String alt89_2 = "O principal responsável pelas marés é o Sol;";
    String alt89_3 = "A região oposta a Lua experimenta maré baixa;";
    String alt89_4 = "Extremidades opostas da Terra experimentam marés iguais;";

    String pergunta90 = "A respeito do sistema Terra-Lua pode-se afirmar que:";
    String resposta90 = "A Lua gira em uma órbita elíptica com a Terra em um dos focos;";
    String alt90_1 = "A Terra atrai a Lua com uma força maior do que a que a Lua atrai a Terra;";
    String alt90_2 = "A Lua gira em torno da Terra em uma órbita circular;";
    String alt90_3 = "A Lua gira em uma órbita elíptica com a Terra em um dos focos;";
    String alt90_4 = "A Lua é uma das responsáveis pelas estações do ano;";

    String pergunta91 = "Sobre os satélites artificiais colocados em orbita ao redor da terra, é <b>CORRETO</b> afirmar que:";
    String resposta91 = "A força gravitacional atua como centrípeta e mantém o satélite em orbita;";
    String alt91_1 = "Não obedecem as Leis de Kepler;";
    String alt91_2 = "Não exerce sobre a Terra nenhuma força gravitacional;";
    String alt91_3 = "Sua velocidade cai gradativamente até ele cair sobre a Terra;";
    String alt91_4 = "A força gravitacional atua como centrípeta e mantém o satélite em orbita;";

    String pergunta92 = "A intensidade da força gravitacional com que a Terra atrai a Lua vale" +
            " F. Se dobrarmos a massa da Terra, triplicarmos a da Lua e reduzirmos a distância" +
            " à metade, qual seria a nova força?";
    String resposta92 = "24F;";
    String alt92_1 = "24F;";
    String alt92_2 = "16F;";
    String alt92_3 = "6F;";
    String alt92_4 = "4F;";

    String pergunta93 = "As marés são fenômenos naturais de subida e descida das águas," +
            " devido à força de atração gravitacional do Sol e da Lua. Assinale a alternativa" +
            " <b>CORRETA</b> sobre as marés.";
    String resposta93 = "Possuem as maiores amplitudes nas luas cheia e nova;";
    String alt93_1 = "Em extremidades opostas ocorrem marés também opostas;";
    String alt93_2 = "A influência do Sol sobre as marés é muito maior que a da Lua;";
    String alt93_3 = "Possuem as maiores amplitudes nas luas cheia e nova;";
    String alt93_4 = "As marés baixas se sucedem em intervalos de aproximadamente 6h;";

    String pergunta94 = "Sobre o movimento dos astros podemos afirmar que:";
    String resposta94 = "As fases da Lua duram aproximadamente 29 dias;";
    String alt94_1 = "O período de rotação da Terra é de aproximadamente 365 dias;";
    String alt94_2 = "As estações do ano duram em média 11 meses;";
    String alt94_3 = "As fases da Lua duram aproximadamente 29 dias;";
    String alt94_4 = "A translação de Mercúrio dura mais que 365 dias;";

    String pergunta95 = "Podemos explicar o motivo pelo qual a Lua não cai sobre a Terra, afirmando que:";
    String resposta95 = "A Lua gira em torno da Terra;";
    String alt95_1 = "A gravidade terrestre não chega até a Lua;";
    String alt95_2 = "A Lua também é atraída pelo Sol;";
    String alt95_3 = "A Terra gira em torno de seu eixo;";
    String alt95_4 = "A Lua gira em torno da Terra;";

    String pergunta95_extra01 = "(UFMG - <b>adaptado</b>) Três satélites – <b>I</b>, <b>II</b> e <b>III</b> – movem-se em órbitas circulares ao redor da Terra.\n" +
            "O satélite I tem massa m e os satélites II e III têm, cada um, massa 2m .\n" +
            "Os satélites I e II estão em uma mesma órbita de raio r e o raio da órbita do satélite III é r/2.\n" +
            "Sejam FI , FII e FIII módulos das forças gravitacionais da Terra sobre, respectivamente, os satélites I, II e III .\n" +
            "Considerando-se essas informações, é <b>CORRETO</b> afirmar que\n";
    String resposta95_extra01 = "FI &lt; FII &lt; FIII;";
    String alt95_1_extra01 = "FI = FII &lt; FIII;";
    String alt95_2_extra01 = "FI = FII &gt; FIII;";
    String alt95_3_extra01 = "FI &lt; FII &lt; FIII;";
    String alt95_4_extra01 = "FI = FII = FIII;";

    String pergunta95_extra02 = "(PUC/SP - <b>adaptado</b>) A intensidade da força gravitacional com que a Terra" +
            " atrai a Lua é F. Se fossem duplicadas a massa da Terra e da Lua e se a distância que" +
            " as separa fosse reduzida à metade, a nova força seria:";
    String resposta95_extra02 = "16F;";
    String alt95_1_extra02 = "16F;";
    String alt95_2_extra02 = "8F;";
    String alt95_3_extra02 = "4F;";
    String alt95_4_extra02 = "2F;";

    String pergunta95_extra03 = "(ITA/SP/<b>adaptado</b>) Sabe-se que a atração gravitacional da Lua " +
            "sobre a camada de água é a principal responsável pelo aparecimento das marés oceânicas" +
            " na Terra.  Considere as seguintes afirmativas:\n" +
            "I. As massas de água próximas e opostas a posição da Lua experimentam marés altas" +
            " simultaneamente.\n" +
            "II. As massas de água próximas e opostas a posição da Lua experimentam marés opostas," +
            " isto é, quando a próximo tem maré alta, a oposta tem maré baixa e vice-versa.\n" +
            "III. Durante o intervalo de tempo de um dia ocorrem duas marés altas e duas marés baixas.\n" +
            "Então, está(rão) <b>CORRETA</b>(s), apenas:";
    String resposta95_extra03 = "as afirmativas I e III;";
    String alt95_1_extra03 = "a afirmativa I;";
    String alt95_2_extra03 = "a afirmativa II;";
    String alt95_3_extra03 = "a afirmativa III;";
    String alt95_4_extra03 = "as afirmativas I e III;";

    String pergunta95_extra04 = "(CFT/SC - <b>adaptado</b>) Sobre a trajetória elíptica realizada pela " +
            "Terra em torno do Sol é <b>CORRETO</b> afirmar que:";
    String resposta95_extra04 = "a força pela qual a Terra atrai o Sol tem o mesmo módulo da força pela qual o Sol atrai a Terra;";
    String alt95_1_extra04 = "a força pela qual a Terra atrai o Sol tem o mesmo módulo da força pela qual o Sol atrai a Terra;";
    String alt95_2_extra04 = "o sistema descrito acima representa o modelo geocêntrico;";
    String alt95_3_extra04 = "o período de evolução da Terra em torno do Sol é de aproximadamente 24 horas;";
    String alt95_4_extra04 = "a velocidade de órbita do planeta Terra independe da sua posição em relação ao Sol;";

    String pergunta95_extra05 = "A lei da gravitação universal de Newton diz que:";
    String resposta95_extra05 = "os corpos se atraem na razão direta de suas massas e na razão inversa do quadrado de suas distâncias;";
    String alt95_1_extra05 = "os corpos se atraem na razão inversa de suas massas e na razão direta do quadrado de suas distâncias;";
    String alt95_2_extra05 = "os corpos se atraem na razão direta de suas massas e na razão inversa do quadrado de suas distâncias;";
    String alt95_3_extra05 = "os corpos se atraem na razão direta de suas massas e na razão inversa de suas distâncias;";
    String alt95_4_extra05 = "os corpos se atraem na razão inversa de suas massas e na razão direta de suas distâncias;";

    String pergunta95_extra06 = "(UEL - <b>adaptado</b>) Sobre as forças gravitacionais envolvidas no sistema composto pela Terra e pela Lua, é <b>CORRETO</b> afirmar:";
    String resposta95_extra06 = "São atrativas e de módulos iguais;";
    String alt95_1_extra06 = "São repulsivas e de módulos diferentes;";
    String alt95_2_extra06 = "São atrativas e de módulos diferentes;";
    String alt95_3_extra06 = "São repulsivas e de módulos iguais;";
    String alt95_4_extra06 = "São atrativas e de módulos iguais;";
    //----------------------------------------------------

    //---------------------HIDROSTATICA---------------------
        //----------Pressão e densidade
    String pergunta96 = "Uma esfera oca de aço possui volume de 30cm<sup>3</sup> e massa de 45g." +
            " Pode-se afirmar que sua densidade é de:";
    String resposta96 = "1,5g/cm<sup>3</sup>;";
    String alt96_1 = "1,5g/cm<sup>3</sup>;";
    String alt96_2 = "0,7g/cm<sup>3</sup>;";
    String alt96_3 = "1,5kg/m<sup>3</sup>;";
    String alt96_4 = "13,5g/cm<sup>3</sup>;";

    String pergunta97 = "Os tanques de combustíveis dos postos de gasolina são subterrâneos," +
            " mas mesmo assim a gasolina ainda sofre os efeitos da dilatação devido à variação " +
            "de temperatura. Para evitar essas variações, podíamos:";
    String resposta97 = "Comprar gasolina por kg ao invés de comprar por l;";
    String alt97_1 = "Abastecer o carro nas horas mais quentes do dia.;";
    String alt97_2 = "Abastecer o carro nas horas mais frias do dia;";
    String alt97_3 = "Comprar gasolina por kg ao invés de comprar por l;";
    String alt97_4 = "Manter sempre o tanque cheio para economizar na gasolina;";

        String pergunta98 = "Durante uma chuva torrencial na cidade de Salvador, uma área " +
            "de 1km<sup>2</sup> recebeu, durante 30min, cerca de 20mm de chuva. Sendo a densidade da água " +
            "1g/cm<sup>3</sup>, qual a massa de água que caiu nesse período. ";
    String resposta98 = "2.10<sup>7</sup> kg;";
    String alt98_1 = "20.10<sup>6</sup> g;";
    String alt98_2 = "1.10<sup>9</sup> kg;";
    String alt98_3 = "2.10<sup>7</sup> kg;";
    String alt98_4 = "2.10<sup>6</sup> kg;";

    String pergunta99 = "Suponha que você precise calcular a massa específica de uma esfera" +
            " oca de alumínio. Para isso você precisa:";
    String resposta99 = "Utilizar apenas o volume ocupado pela massa do corpo;";
    String alt99_1 = "Utilizar o volume total do corpo;";
    String alt99_2 = "Utilizar apenas o volume ocupado pela massa do corpo;";
    String alt99_3 = "Utilizar somente o volume da parte oca da esfera;";
    String alt99_4 = "Calcular a densidade do corpo;";

    String pergunta100 = "A principal razão pela qual não da pra andar na praia de salto alto " +
            "é que os saltos produzem no solo:";
    String resposta100 = "Muita pressão;";
    String alt100_1 = "Muita força;";
    String alt100_2 = "Forte empuxo;";
    String alt100_3 = "Pouca pressão;";
    String alt100_4 = "Muita pressão;";

    String pergunta101 = "Uma faca de cozinha com o passar de tempo se torna “cega”, isso ocorre por que ao longo do tempo:";
    String resposta101 = "Aumenta a área de contato;";
    String alt101_1 = "Diminui sua força;";
    String alt101_2 = "Aumenta a área de contato;";
    String alt101_3 = "Perde-se sua pressão;";
    String alt101_4 = "Sua força se torna maior que a pressão;";

    String pergunta102 = "A principal utilidade das rodas largas do trator são de produzir pouco(a):";
    String resposta102 = "Pressão;";
    String alt102_1 = "Pressão;";
    String alt102_2 = "Força;";
    String alt102_3 = "Atrito;";
    String alt102_4 = "Peso;";

    String pergunta103 = "Se colocarmos um bloco de ferro maciço dentro d’água ele certamente" +
            " afundará. Isso ocorre por que o ferro possui:";
    String resposta103 = "Maior densidade que a água;";
    String alt103_1 = "Menor densidade que a água;";
    String alt103_2 = "Empuxo zero;";
    String alt103_3 = "Menor pressão;";
    String alt103_4 = "Maior densidade que a água;";

    String pergunta104 = "Para fazer com que 1kg de ferro flutue em água precisamos:";
    String resposta104 = "Aumentando seu volume;";
    String alt104_1 = "Diminuir sua densidade;";
    String alt104_2 = "Diminuir seu peso;";
    String alt104_3 = "Aumentando seu volume;";
    String alt104_4 = "Aumentar sua área;";

    String pergunta105 = "Em uma experiência Zezinho percebeu que é muito mais fácil flutuar " +
            "na praia do que em um rio. Isso ocorre por que:";
    String resposta105 = "A densidade da água salgada é maior;";
    String alt105_1 = "A praia tem mais empuxo;";
    String alt105_2 = "O seu peso diminui na praia;";
    String alt105_3 = "A densidade da água doce é maior;";
    String alt105_4 = "A densidade da água salgada é maior;";

    String pergunta106 = " Uma área de 1,5m² está submetido a uma pressão uniforme de 20Pa. Qual a" +
            " força, em Newtons, que age sobre essa área.";
    String resposta106 = "30N;";
    String alt106_1 = "15N ;";
    String alt106_2 = "15N ;";
    String alt106_3 = "25N;";
    String alt106_4 = "30N;";

    String pergunta107 = "Determine a densidade de um bloco de massa 20kg e volume 0,02m<sup>3</sup>";
    String resposta107 = "1,0.10<sup>3</sup> kg/m<sup>3</sup>;";
    String alt107_1 = "1,0.10<sup>3</sup> kg/m<sup>3</sup>;";
    String alt107_2 = "0,4kg/m<sup>3</sup>;";
    String alt107_3 = "1000g/cm<sup>3</sup>;";
    String alt107_4 = "1.10<sup>-3</sup>;";

        //----------Empuxo
    String pergunta108 = "Um submarino fica totalmente submerso, porém em equilíbrio, dentro do" +
                " mar. Sobre isso é <b>CORRETO</b> afirmar que:";
    String resposta108 = "Seu peso é igual ao empuxo;";
    String alt108_1 = "O empuxo é maior que seu peso;";
    String alt108_2 = "Seu peso é maior que o empuxo;";
    String alt108_3 = "Seu peso é igual ao empuxo;";
    String alt108_4 = "Esta situação é fisicamente impossível;";

    String pergunta109 = "Icebergs são grandes blocos de gelo que flutuam em águas salgadas. " +
            "A porcentagem do gelo imerso na água é cerca de:" +
            " (g = 10m/s<sup>2</sup>; dgelo = 0,92g/cm<sup>3</sup>; dágua = 1g/cm<sup>3</sup>)";
    String resposta109 = "92%;";
    String alt109_1 = "92%;";
    String alt109_2 = "8%;";
    String alt109_3 = "10%;";
    String alt109_4 = "90%;";

    String pergunta110 = "De acordo com o princípio de Arquimedes, que define Empuxo, é <b>CORRETO</b> afirmar que:";
    String resposta110 = "Empuxo é igual ao peso do fluido deslocado;";
    String alt110_1 = "Quando um corpo flutua, o empuxo recebido é menor que o peso;";
    String alt110_2 = "O empuxo não é válido para os gases;";
    String alt110_3 = "Empuxo é igual ao peso do fluido deslocado;";
    String alt110_4 = "Se um corpo afunda, o empuxo sobre ele é nulo;";

    String pergunta111 = "Se um objeto afunda em um recipiente com água:";
    String resposta111 = "O peso do objeto é maior que o empuxo;";
    String alt111_1 = "O empuxo sobre o objeto é maior que o peso;";
    String alt111_2 = "O peso do objeto é igual ao empuxo;";
    String alt111_3 = "Não existe empuxo sobre o objeto;";
    String alt111_4 = "O peso do objeto é maior que o empuxo;";

    String pergunta112 = "Um objeto de 25 cm<sup>3</sup> encontra-se totalmente imerso em água. O empuxo" +
            " recebido pelo objeto vale: (g = 10m/s<sup>2</sup>; dágua = 10<sup>3</sup>kg/m<sup>3</sup>)";
    String resposta112 = "0,25N;";
    String alt112_1 = "25N;";
    String alt112_2 = "25000N;";
    String alt112_3 = "0,25N;";
    String alt112_4 = "2500N;";

        //---------- Pressão atmosférica e hidrostática
    String pergunta113 = "Quando tomamos refrigerante através do canudinho conseguimos " +
                "realizar tal façanha, por que ao puxarmos o ar pela boca:";
    String resposta113 = "Reduzimos a pressão no interior do canudo;";
    String alt113_1 = "Aumentamos a pressão externa;";
    String alt113_2 = "Reduzimos a gravidade do interior do canudo;";
    String alt113_3 = "Reduzimos a pressão no interior do canudo;";
    String alt113_4 = "Aumentamos a pressão no interior do canudo;";

    String pergunta114 = "Alguns jogos de futebol da seleção da Bolívia são realizados em La Paz," +
            " a grande altitude. Isso atrapalha outras seleções por que não estão adaptadas a:";
    String resposta114 = "Baixa pressão atmosférica e rarefação do ar;";
    String alt114_1 = "Baixa pressão atmosférica e rarefação do ar;";
    String alt114_2 = "Alta pressão atmosférica e a falta de oxigênio;";
    String alt114_3 = "Baixa pressão atmosférica e o aumento da oxigenação do sangue;";
    String alt114_4 = "Diminuição da resistência do ar e o aumento da temperatura;";

    String pergunta115 = "Um mergulhador que se encontra a 20m de profundidade suporta uma" +
            " pressão sobre seu corpo de (d = 1g/cm<sup>3</sup>; g = 10m/s<sup>2</sup>):";
    String resposta115 = "3 atm;";
    String alt115_1 = "2 atm;";
    String alt115_2 = "3 atm;";
    String alt115_3 = "1 atm;";
    String alt115_4 = "4 atm;";

    String pergunta116 = "O recorde de mergulho em apneia foi atingido por Herbert Nitsch, 210m." +
            " Nessa profundidade o seu corpo suportou uma pressão de aproximadamente" +
            " (d = 1g/cm<sup>3</sup>; g = 10m/s<sup>2</sup>):";
    String resposta116 = "22 atm;";
    String alt116_1 = "22 atm;";
    String alt116_2 = "21 atm;";
    String alt116_3 = "210 atm;";
    String alt116_4 = "220 atm;";

    String pergunta117 = "Na experiência de Torricelli a coluna de mercúrio marcou 76 cm. Se " +
            "essa experiência fosse realizada em uma montanha marcaria:";
    String resposta117 = "Menos que 76 cm;";
    String alt117_1 = "Mais que 76 cm;";
    String alt117_2 = "Menos que 76 cm;";
    String alt117_3 = "Os mesmos 76 cm;";
    String alt117_4 = "Nada se pode concluir;";

    String pergunta118 = "A pressão atmosférica influencia diretamente nos pontos de fusão e" +
            " ebulição. Se tentássemos ferver água no topo de uma montanha, o ponto de ebulição seria:";
    String resposta118 = "Menor que 100&deg;C;";
    String alt118_1 = "Menor que 100&deg;C;";
    String alt118_2 = "Maior que 100&deg;C.;";
    String alt118_3 = "Menor que 0&deg;C;";
    String alt118_4 = "Maior que 0&deg;C;";

    String pergunta119 = "Montanhas muito altas em geral possuem seus topos congelados. " +
            "Isso ocorre devido à baixa pressão atmosférica, que:";
    String resposta119 = "Aumenta o ponto de fusão da água;";
    String alt119_1 = "Aumenta o ponto de fusão da água;";
    String alt119_2 = "Aumenta o ponto de ebulição da água;";
    String alt119_3 = "Aumenta o ponto de fusão da água;";
    String alt119_4 = "Aumenta o ponto de fusão da água;";

    String pergunta120 = "Se levarmos um saco de salgadinhos até o topo de uma montanha, ao" +
            " chegar lá veremos que o saco parece inflado. Isso ocorre por que:";
    String resposta120 = "A pressão no pé da montanha é menor que no topo;";
    String alt120_1 = "A pressão no topo é maior que no pé da montanha;";
    String alt120_2 = "Devido a altitude a pressão no interior dos sacos aumenta;";
    String alt120_3 = "A pressão no pé da montanha é menor que no topo;";
    String alt120_4 = "A pressão no pé da montanha é menor que no topo;";

    String pergunta121 = "Um peixe se encontra a uma profundidade de 50 metros. Sendo a " +
            "pressão atmosférica 1atm, determine a pressão a que o peixe fica submetido, em atm";
    String resposta121 = "6atm;";
    String alt121_1 = "5atm;";
    String alt121_2 = "1atm;";
    String alt121_3 = "4atm;";
    String alt121_4 = "6atm;";

    String pergunta122 = "Assinale a alternativa <b>CORRETA</b>:";
    String resposta122 = "A pressão atmosférica é variável e depende da altitude;";
    String alt122_1 = "O teorema de Arquimedes só é válido para corpos imersos em água;";
    String alt122_2 = "Todos os pontos de um líquido estão sujeitos a uma mesma pressão;";
    String alt122_3 = "A pressão atmosférica é variável e depende da altitude;";
    String alt122_4 = "Quanto maior a profundidade, menor a pressão hidrostática;";

        //----------Princípio de Pascal
    String pergunta123 = "Um mecânico precisa utilizar um macaco hidráulico que aumente a" +
                " força aplicada em 20 vezes. Para isso deve haver uma diferença nas áreas do macaco de:";
    String resposta123 = "20 vezes;";
    String alt123_1 = "10 vezes;";
    String alt123_2 = "5 vezes;";
    String alt123_3 = "20 vezes;";
    String alt123_4 = "40 vezes;";

    String pergunta124 = "Uma prensa hidráulica se utiliza de dois êmbolos, um de área 4cm<sup>2</sup> e o" +
            " outro de área 100cm<sup>2</sup>. Se aplicarmos uma força de 50N no menor êmbolo, responderá no maior:";
    String resposta124 = "1250N;";
    String alt124_1 = "5000N;";
    String alt124_2 = "1250N;";
    String alt124_3 = "100N;";
    String alt124_4 = "400N;";

    String pergunta125 = "O sistema de freio hidráulico de um carro é baseado no princípio de:";
    String resposta125 = "Pascal;";
    String alt125_1 = "Pascal";
    String alt125_2 = "Arquimedes;";
    String alt125_3 = "Da inércia;";
    String alt125_4 = "Stevin;";

    String pergunta126 = "Um macaco hidráulico se utiliza de dois êmbolos de áreas 5cm<sup>2</sup> e 40cm<sup>2</sup>." +
            " Se baixarmos o braço do macaco 1,0m, o êmbolo maior subirá:";
    String resposta126 = "12,5cm;";
    String alt126_1 = "8cm;";
    String alt126_2 = "12,5cm;";
    String alt126_3 = "1,25m;";
    String alt126_4 = "40cm;";

    public BancoDadosPerguntas(Context context)
    {
        //
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase bancoDadosOnCreate)
    {
        bancoDadosFisicaInMaos = bancoDadosOnCreate;

        String dropTable1 = "DROP TABLE IF EXISTS " + DATABASE_NAME + "." + TB_PERGUNTAS;
        String dropTable2 = "DROP TABLE IF EXISTS " + DATABASE_NAME + "." + TB_TEMAS;
        String dropTable3 = "DROP TABLE IF EXISTS " + DATABASE_NAME + "." + TB_ASSUNTOS;

        bancoDadosFisicaInMaos.execSQL(dropTable1);
        bancoDadosFisicaInMaos.execSQL(dropTable2);
        bancoDadosFisicaInMaos.execSQL(dropTable3);

        String tema = "CREATE TABLE " + TB_TEMAS + "(" + CODIGO_TEMA +
                " INTEGER PRIMARY KEY AUTOINCREMENT, " + TEMA + " TEXT);";
        bancoDadosOnCreate.execSQL(tema);

        //tabela dos assuntos
        String assunto = "CREATE TABLE " + TB_ASSUNTOS + "(" + CODIGO_ASSUNTO  +
                " INTEGER PRIMARY KEY AUTOINCREMENT, " + ASSUNTO + " TEXT, " + CODIGO_TEMA + " INTEGER);";

        String tema1 = "INSERT INTO " + TB_TEMAS + " (" + TEMA + ") VALUES('Cinemática');";
        String tema2 = "INSERT INTO " + TB_TEMAS + " (" + TEMA + ") VALUES('Dinâmica');";
        String tema3 = "INSERT INTO " + TB_TEMAS + " (" + TEMA + ") VALUES('Estática');";
        String tema4 = "INSERT INTO " + TB_TEMAS + " (" + TEMA + ") VALUES('Gravitação');";
        String tema5 = "INSERT INTO " + TB_TEMAS + " (" + TEMA + ") VALUES('Hidrostática');";

        bancoDadosFisicaInMaos.execSQL(tema1);
        bancoDadosFisicaInMaos.execSQL(tema2);
        bancoDadosFisicaInMaos.execSQL(tema3);
        bancoDadosFisicaInMaos.execSQL(tema4);
        bancoDadosFisicaInMaos.execSQL(tema5);

        bancoDadosOnCreate.execSQL(assunto);

        //-----cinematica
        String assunto1 = "INSERT INTO " + TB_ASSUNTOS + " (" + ASSUNTO + ", " + CODIGO_TEMA + ")" +
                " VALUES ('Movimento e trajetoria', " + 1 + ")";
        String assunto2 = "INSERT INTO " + TB_ASSUNTOS + " (" + ASSUNTO + ", " + CODIGO_TEMA + ")" +
                " VALUES ('MRU', " + 1 + ")";
        String assunto3 = "INSERT INTO " + TB_ASSUNTOS + " (" + ASSUNTO + ", " + CODIGO_TEMA + ")" +
                " VALUES ('Queda livre e lançamento vertical', " + 1 + ")";
        String assunto4 = "INSERT INTO " + TB_ASSUNTOS + " (" + ASSUNTO + ", " + CODIGO_TEMA + ")" +
                " VALUES ('Lançamento horizontal e oblíquo', " + 1 + ")";
        String assunto5 = "INSERT INTO " + TB_ASSUNTOS + " (" + ASSUNTO + ", " + CODIGO_TEMA + ")" +
                " VALUES ('Cinemática vetorial e composição de movimento', " + 1 + ")";
        String assunto6 = "INSERT INTO " + TB_ASSUNTOS + " (" + ASSUNTO + ", " + CODIGO_TEMA + ")" +
                " VALUES ('MCU', " + 1 + ")";
        String assunto7 = "INSERT INTO " + TB_ASSUNTOS + " (" + ASSUNTO + ", " + CODIGO_TEMA + ")" +
                " VALUES ('MRUV', " + 1 + ")";

        //-----dinamica
        String assunto8 = "INSERT INTO " + TB_ASSUNTOS + " (" + ASSUNTO + ", " + CODIGO_TEMA + ")" +
                " VALUES ('Leis de Newton', " + 2 + ")";
        String assunto9 = "INSERT INTO " + TB_ASSUNTOS + " (" + ASSUNTO + ", " + CODIGO_TEMA + ")" +
                " VALUES ('Tipos de forças', " + 2 + ")";
        String assunto10 = "INSERT INTO " + TB_ASSUNTOS + " (" + ASSUNTO + ", " + CODIGO_TEMA + ")" +
                " VALUES ('Trabalho, potência e energia', " + 2 + ")";
        String assunto11 = "INSERT INTO " + TB_ASSUNTOS + " (" + ASSUNTO + ", " + CODIGO_TEMA + ")" +
                " VALUES ('MHS', " + 2 + ")";
        String assunto12 = "INSERT INTO " + TB_ASSUNTOS + " (" + ASSUNTO + ", " + CODIGO_TEMA + ")" +
                " VALUES ('Impulso, Quantidade de movimento e Colisões', " + 2 + ")";

        //-----estatica
        String assunto13 = "INSERT INTO " + TB_ASSUNTOS + " (" + ASSUNTO + ", " + CODIGO_TEMA + ")" +
                " VALUES ('estática', " + 3 + ")";

        //-----gravitação
        String assunto14 = "INSERT INTO " + TB_ASSUNTOS + " (" + ASSUNTO + ", " + CODIGO_TEMA + ")" +
                " VALUES ('Satélites em órbitas circulares', " + 4 + ")";
        String assunto15 = "INSERT INTO " + TB_ASSUNTOS + " (" + ASSUNTO + ", " + CODIGO_TEMA + ")" +
                " VALUES ('Leis de Kepler', " + 4 + ")";
        String assunto16 = "INSERT INTO " + TB_ASSUNTOS + " (" + ASSUNTO + ", " + CODIGO_TEMA + ")" +
                " VALUES ('Gravidade', " + 4 + ")";
        String assunto17 = "INSERT INTO " + TB_ASSUNTOS + " (" + ASSUNTO + ", " + CODIGO_TEMA + ")" +
                " VALUES ('Lei da gravitação universal', " + 4 + ")";

        //-----hidrostatica
        String assunto19 = "INSERT INTO " + TB_ASSUNTOS + " (" + ASSUNTO + ", " + CODIGO_TEMA + ")" +
                " VALUES ('Pressão e densidade', " + 5 + ")";
        String assunto20 = "INSERT INTO " + TB_ASSUNTOS + " (" + ASSUNTO + ", " + CODIGO_TEMA + ")" +
                " VALUES ('Empuxo', " + 5 + ")";
        String assunto21 = "INSERT INTO " + TB_ASSUNTOS + " (" + ASSUNTO + ", " + CODIGO_TEMA + ")" +
                " VALUES ('Pressão atmosférica e hidrostática', " + 5 + ")";
        String assunto22 = "INSERT INTO " + TB_ASSUNTOS + " (" + ASSUNTO + ", " + CODIGO_TEMA + ")" +
            " VALUES ('Princípio de Pascal', " + 5 + ")";

        bancoDadosFisicaInMaos.execSQL(assunto1);
        bancoDadosFisicaInMaos.execSQL(assunto2);
        bancoDadosFisicaInMaos.execSQL(assunto3);
        bancoDadosFisicaInMaos.execSQL(assunto4);
        bancoDadosFisicaInMaos.execSQL(assunto5);
        bancoDadosFisicaInMaos.execSQL(assunto6);
        bancoDadosFisicaInMaos.execSQL(assunto7);
        bancoDadosFisicaInMaos.execSQL(assunto8);
        bancoDadosFisicaInMaos.execSQL(assunto9);
        bancoDadosFisicaInMaos.execSQL(assunto10);
        bancoDadosFisicaInMaos.execSQL(assunto11);
        bancoDadosFisicaInMaos.execSQL(assunto12);
        bancoDadosFisicaInMaos.execSQL(assunto13);
        bancoDadosFisicaInMaos.execSQL(assunto14);
        bancoDadosFisicaInMaos.execSQL(assunto15);
        bancoDadosFisicaInMaos.execSQL(assunto16);
        bancoDadosFisicaInMaos.execSQL(assunto17);

        bancoDadosFisicaInMaos.execSQL(assunto19);
        bancoDadosFisicaInMaos.execSQL(assunto20);
        bancoDadosFisicaInMaos.execSQL(assunto21);
        bancoDadosFisicaInMaos.execSQL(assunto22);

        //tabela das perguntas
        String sql = "CREATE TABLE IF NOT EXISTS " + TB_PERGUNTAS + "(" + CODIGO_PERGUNTA
                + " INTEGER PRIMARY KEY AUTOINCREMENT, " + PERGUNTA + " TEXT, " + RESPOSTA
                + " TEXT, " + ASSERTIVA_A + " TEXT, " + ASSERTIVA_B + " TEXT, " + ASSERTIVA_C
                + " TEXT, " + ASSERTIVA_D + " TEXT, " + NIVEL_PERGUNTA + " INTEGER, " +
                TEMA_PERGUNTA + " INTEGER, " + ASSUNTO + " INTEGER);";
        bancoDadosFisicaInMaos.execSQL(sql);
        adicionarQuestoes();
    }

    private void adicionarQuestoes()
    {
        //cinematica
        //Movimento e trajetória
        Questao q1 = new Questao(pergunta1, alt1_1 ,alt1_2, alt1_3, alt1_4, resposta1, 9, 1, 1);
        this.addQuestion(q1);
        Questao q2 = new Questao(pergunta2, alt2_1, alt2_2, alt2_3, alt2_4, resposta2, 9, 1, 1);
        this.addQuestion(q2);
        Questao q3 = new Questao(pergunta3, alt3_1, alt3_2, alt3_3, alt3_4, resposta3, 9, 1, 1);
        this.addQuestion(q3);
        Questao q4 = new Questao(pergunta4, alt4_1, alt4_2, alt4_3, alt4_4, resposta4, 9, 1, 1);
        this.addQuestion(q4);
        Questao q5 = new Questao(pergunta5, alt5_1, alt5_2, alt5_3, alt5_4, resposta5, 9, 1, 1);
        this.addQuestion(q5);

        Questao q5_extra01 = new Questao(pergunta5_extra01, alt5_1_extra01, alt5_2_extra01, alt5_3_extra01, alt5_4_extra01, resposta5_extra01, 9, 1, 1);
        this.addQuestion(q5_extra01);
        Questao q5_extra02 = new Questao(pergunta5_extra02, alt5_1_extra02, alt5_2_extra02, alt5_3_extra02, alt5_4_extra02, resposta5_extra02, 9, 1, 1);
        this.addQuestion(q5_extra02);
        Questao q5_extra03 = new Questao(pergunta5_extra03, alt5_1_extra03, alt5_2_extra03, alt5_3_extra03, alt5_4_extra03, resposta5_extra03, 9, 1, 1);
        this.addQuestion(q5_extra03);
        Questao q5_extra04 = new Questao(pergunta5_extra04, alt5_1_extra04, alt5_2_extra04, alt5_3_extra04, alt5_4_extra04, resposta5_extra04, 9, 1, 1);
        this.addQuestion(q5_extra04);
        Questao q5_extra05 = new Questao(pergunta5_extra05, alt5_1_extra05, alt5_2_extra05, alt5_3_extra05, alt5_4_extra05, resposta5_extra05, 9, 1, 1);
        this.addQuestion(q5_extra05);


        //MRU
        Questao q6 = new Questao(pergunta6, alt6_1, alt6_2, alt6_3, alt6_4, resposta6, 9, 1,1 );
        this.addQuestion(q6);
        Questao q7 = new Questao(pergunta7, alt7_1, alt7_2, alt7_3, alt7_4, resposta7, 0, 1, 2);
        this.addQuestion(q7);
        Questao q8 = new Questao(pergunta8, alt8_1, alt8_2, alt8_3, alt8_4, resposta8, 0, 1, 2);
        this.addQuestion(q8);
        Questao q9 = new Questao(pergunta9, alt9_1, alt9_2, alt9_3, alt9_4, resposta9, 0, 1, 2);
        this.addQuestion(q9);
        Questao q10 = new Questao(pergunta10, alt10_1, alt10_2, alt10_3, alt10_4, resposta10, 0, 1, 2);
        this.addQuestion(q10);
        Questao q11 = new Questao(pergunta11, alt11_1, alt11_2, alt11_3, alt11_4, resposta11, 0, 1, 2);
        this.addQuestion(q11);

        Questao q11_exrtra01 = new Questao(pergunta11_exrtra01, alt11_1_exrtra01, alt11_2_exrtra01, alt11_3_exrtra01, alt11_4_exrtra01, resposta11_exrtra01, 0, 1, 2);
        this.addQuestion(q11_exrtra01);
        Questao q11_exrtra02 = new Questao(pergunta11_exrtra02, alt11_1_exrtra02, alt11_2_exrtra02, alt11_3_exrtra02, alt11_4_exrtra02, resposta11_exrtra02, 0, 1, 2);
        this.addQuestion(q11_exrtra02);
        Questao q11_exrtra03 = new Questao(pergunta11_exrtra03, alt11_1_exrtra03, alt11_2_exrtra03, alt11_3_exrtra03, alt11_4_exrtra03, resposta11_exrtra03, 0, 1, 2);
        this.addQuestion(q11_exrtra03);
        Questao q11_exrtra04 = new Questao(pergunta11_exrtra04, alt11_1_exrtra04, alt11_2_exrtra04, alt11_3_exrtra04, alt11_4_exrtra04, resposta11_exrtra04, 0, 1, 2);
        this.addQuestion(q11_exrtra04);

        //Queda livre e lançamento vertical
        Questao q12 = new Questao(pergunta12, alt12_1 ,alt12_2, alt12_3, alt12_4, resposta12, 0, 1, 3);
        this.addQuestion(q12);
        Questao q13 = new Questao(pergunta13, alt13_1, alt13_2, alt13_3, alt13_4, resposta13, 0, 1, 3);
        this.addQuestion(q13);
        Questao q14 = new Questao(pergunta14, alt14_1, alt14_2, alt14_3, alt14_4, resposta14, 0, 1, 3);
        this.addQuestion(q14);
        Questao q15 = new Questao(pergunta15, alt15_1, alt15_2, alt15_3, alt15_4, resposta15, 0, 1, 3);
        this.addQuestion(q15);
        Questao q16 = new Questao(pergunta16, alt16_1, alt16_2, alt16_3, alt16_4, resposta16, 0, 1, 3);
        this.addQuestion(q16);
        Questao q17 = new Questao(pergunta17, alt17_1, alt17_2, alt17_3, alt17_4, resposta17, 0, 1, 3);
        this.addQuestion(q17);

        Questao q17_extra01 = new Questao(pergunta17_extra01, alt17_1_extra01, alt17_2_extra01, alt17_3_extra01, alt17_4_extra01, resposta17_extra01, 0, 1, 3);
        this.addQuestion(q17_extra01);
        Questao q17_extra02 = new Questao(pergunta17_extra02, alt17_1_extra02, alt17_2_extra02, alt17_3_extra02, alt17_4_extra02, resposta17_extra02, 0, 1, 3);
        this.addQuestion(q17_extra02);
        Questao q17_extra03 = new Questao(pergunta17_extra03, alt17_1_extra03, alt17_2_extra03, alt17_3_extra03, alt17_4_extra03, resposta17_extra03, 0, 1, 3);
        this.addQuestion(q17_extra03);
        Questao q17_extra04 = new Questao(pergunta17_extra04, alt17_1_extra04, alt17_2_extra04, alt17_3_extra04, alt17_4_extra04, resposta17_extra04, 0, 1, 3);
        this.addQuestion(q17_extra04);

        //Lançamento horizontal e oblíquo
        Questao q18 = new Questao(pergunta18, alt18_1, alt18_2, alt18_3, alt18_4, resposta18, 0, 1, 4);
        this.addQuestion(q18);
        Questao q19 = new Questao(pergunta19, alt19_1, alt19_2, alt19_3, alt19_4, resposta19, 0, 1, 4);
        this.addQuestion(q19);
        Questao q20 = new Questao(pergunta20, alt20_1, alt20_2, alt20_3, alt20_4, resposta20, 0, 1, 4);
        this.addQuestion(q20);
        Questao q21 = new Questao(pergunta21, alt21_1, alt21_2, alt21_3, alt21_4, resposta21, 0, 1, 4);
        this.addQuestion(q21);
        Questao q22 = new Questao(pergunta22, alt22_1, alt22_2, alt22_3, alt22_4, resposta22, 0, 1, 4);
        this.addQuestion(q22);

        Questao q22_extra01 = new Questao(pergunta22_extra01, alt22_1_extra01, alt22_2_extra01, alt22_3_extra01, alt22_4_extra01, resposta22_extra01, 0, 1, 4);
        this.addQuestion(q22_extra01);
        Questao q22_extra02 = new Questao(pergunta22_extra02, alt22_1_extra02, alt22_2_extra02, alt22_3_extra02, alt22_4_extra02, resposta22_extra02, 0, 1, 4);
        this.addQuestion(q22_extra02);
        Questao q22_extra03 = new Questao(pergunta22_extra03, alt22_1_extra03, alt22_2_extra03, alt22_3_extra03, alt22_4_extra03, resposta22_extra03, 0, 1, 4);
        this.addQuestion(q22_extra03);
        Questao q22_extra04 = new Questao(pergunta22_extra04, alt22_1_extra04, alt22_2_extra04, alt22_3_extra04, alt22_4_extra04, resposta22_extra04, 0, 1, 4);
        this.addQuestion(q22_extra04);
        Questao q22_extra05 = new Questao(pergunta22_extra05, alt22_1_extra05, alt22_2_extra05, alt22_3_extra05, alt22_4_extra05, resposta22_extra05, 0, 1, 4);
        this.addQuestion(q22_extra05);

        //Cinemática vetorial e composição de movimento
        Questao q23 = new Questao(pergunta23, alt23_1, alt23_2, alt23_3, alt23_4, resposta23, 0, 1, 5);
        this.addQuestion(q23);
        Questao q24 = new Questao(pergunta24, alt24_1, alt24_2, alt24_3, alt24_4, resposta24, 0, 1, 5);
        this.addQuestion(q24);
        Questao q25 = new Questao(pergunta25, alt25_1, alt25_2, alt25_3, alt25_4, resposta25, 0, 1, 5);
        this.addQuestion(q25);
        Questao q26 = new Questao(pergunta26, alt26_1, alt26_2, alt26_3, alt26_4, resposta26, 0, 1, 5);
        this.addQuestion(q26);
        Questao q27 = new Questao(pergunta27, alt27_1, alt27_2, alt27_3, alt27_4, resposta27, 0, 1, 5);
        this.addQuestion(q27);

        //MCU
        Questao q28 = new Questao(pergunta28, alt28_1, alt28_2, alt28_3, alt28_4, resposta28, 0, 1, 6);
        this.addQuestion(q28);
        Questao q29 = new Questao(pergunta29, alt29_1 ,alt29_2, alt29_3, alt29_4, resposta29, 0, 1, 6);
        this.addQuestion(q29);
        Questao q30 = new Questao(pergunta30, alt30_1, alt30_2, alt30_3, alt30_4, resposta30, 0, 1, 6);
        this.addQuestion(q30);
        Questao q31 = new Questao(pergunta31, alt31_1, alt31_2, alt31_3, alt31_4, resposta31, 0, 1, 6);
        this.addQuestion(q31);

        //MRUV
        Questao q32 = new Questao(pergunta32, alt32_1, alt32_2, alt32_3, alt32_4, resposta32, 0, 1, 7);
        this.addQuestion(q32);
        Questao q33 = new Questao(pergunta33, alt33_1, alt33_2, alt33_3, alt33_4, resposta33, 0, 1, 7);
        this.addQuestion(q33);
        Questao q34 = new Questao(pergunta34, alt34_1, alt34_2, alt34_3, alt34_4, resposta34, 0, 1, 7);
        this.addQuestion(q34);
        Questao q35 = new Questao(pergunta35, alt35_1, alt35_2, alt35_3, alt35_4, resposta35, 0, 1, 7);
        this.addQuestion(q35);

        Questao q35_extra01 = new Questao(pergunta35_extra01, alt35_1_extra01, alt35_2_extra01, alt35_3_extra01, alt35_4_extra01, resposta35_extra01, 0, 1, 7);
        this.addQuestion(q35_extra01);
        Questao q35_extra02 = new Questao(pergunta35_extra02, alt35_1_extra02, alt35_2_extra02, alt35_3_extra02, alt35_4_extra02, resposta35_extra02, 0, 1, 7);
        this.addQuestion(q35_extra02);
        Questao q35_extra03 = new Questao(pergunta35_extra03, alt35_1_extra03, alt35_2_extra03, alt35_3_extra03, alt35_4_extra03, resposta35_extra03, 0, 1, 7);
        this.addQuestion(q35_extra03);
        Questao q35_extra04 = new Questao(pergunta35_extra04, alt35_1_extra04, alt35_2_extra04, alt35_3_extra04, alt35_4_extra04, resposta35_extra04, 0, 1, 7);
        this.addQuestion(q35_extra04);
        Questao q35_extra05 = new Questao(pergunta35_extra05, alt35_1_extra05, alt35_2_extra05, alt35_3_extra05, alt35_4_extra05, resposta35_extra05, 0, 1, 7);
        this.addQuestion(q35_extra05);
        Questao q35_extra06 = new Questao(pergunta35_extra06, alt35_1_extra06, alt35_2_extra06, alt35_3_extra06, alt35_4_extra06, resposta35_extra06, 0, 1, 7);
        this.addQuestion(q35_extra06);


        //dinamica
        //Leis de Newton
        Questao q36 = new Questao(pergunta36, alt36_1, alt36_2, alt36_3, alt36_4, resposta36, 0, 2, 1);
        this.addQuestion(q36);
        Questao q37 = new Questao(pergunta37, alt37_1, alt37_2, alt37_3, alt37_4, resposta37, 0, 2, 1);
        this.addQuestion(q37);
        Questao q38 = new Questao(pergunta38, alt38_1, alt38_2, alt38_3, alt38_4, resposta38, 0, 2, 1);
        this.addQuestion(q38);
        Questao q39 = new Questao(pergunta39, alt39_1, alt39_2, alt39_3, alt39_4, resposta39, 0, 2, 1);
        this.addQuestion(q39);
        Questao q40 = new Questao(pergunta40, alt40_1, alt40_2, alt40_3, alt40_4, resposta40, 0, 2, 1);
        this.addQuestion(q40);
        Questao q41 = new Questao(pergunta41, alt41_1, alt41_2, alt41_3, alt41_4, resposta41, 0, 2, 1);
        this.addQuestion(q41);
        Questao q42 = new Questao(pergunta42, alt42_1, alt42_2, alt42_3, alt42_4, resposta42, 0, 2, 1);
        this.addQuestion(q42);
        Questao q43 = new Questao(pergunta43, alt43_1, alt43_2, alt43_3, alt43_4, resposta43, 0, 2, 1);
        this.addQuestion(q43);
        Questao q44 = new Questao(pergunta44, alt44_1, alt44_2, alt44_3, alt44_4, resposta44, 0, 2, 1);
        this.addQuestion(q44);
        Questao q45 = new Questao(pergunta45, alt45_1, alt45_2, alt45_3, alt45_4, resposta45, 0, 2, 1);
        this.addQuestion(q45);
        Questao q46 = new Questao(pergunta46, alt46_1, alt46_2, alt46_3, alt46_4, resposta46, 0, 2, 1);
        this.addQuestion(q46);

        //Tipos de forças
        Questao q47 = new Questao(pergunta47, alt47_1, alt47_2, alt47_3, alt47_4, resposta47, 0, 2, 2);
        this.addQuestion(q47);
        Questao q48 = new Questao(pergunta48, alt48_1, alt48_2, alt48_3, alt48_4, resposta48, 0, 2, 2);
        this.addQuestion(q48);
        Questao q49 = new Questao(pergunta49, alt49_1, alt49_2, alt49_3, alt49_4, resposta49, 0, 2, 2);
        this.addQuestion(q49);
        Questao q50 = new Questao(pergunta50, alt50_1, alt50_2, alt50_3, alt50_4, resposta50, 0, 2, 2);
        this.addQuestion(q50);
        Questao q51 = new Questao(pergunta51, alt51_1, alt51_2, alt51_3, alt51_4, resposta51, 0, 2, 2);
        this.addQuestion(q51);
        Questao q52 = new Questao(pergunta52, alt52_1, alt52_2, alt52_3, alt52_4, resposta52, 0, 2, 2);
        this.addQuestion(q52);
        Questao q53 = new Questao(pergunta53, alt53_1, alt53_2, alt53_3, alt53_4, resposta53, 0, 2, 2);
        this.addQuestion(q53);

        //Trabalho, potência e energia
        Questao q54 = new Questao(pergunta54, alt54_1, alt54_2, alt54_3, alt54_4, resposta54, 0, 2, 3);
        this.addQuestion(q54);
        Questao q55 = new Questao(pergunta55, alt55_1, alt55_2, alt55_3, alt55_4, resposta55, 0, 2, 3);
        this.addQuestion(q55);
        Questao q56 = new Questao(pergunta56, alt56_1, alt56_2, alt56_3, alt56_4, resposta56, 0, 2, 3);
        this.addQuestion(q56);
        Questao q57 = new Questao(pergunta57, alt57_1, alt57_2, alt57_3, alt57_4, resposta57, 0, 2, 3);
        this.addQuestion(q57);
        Questao q58 = new Questao(pergunta58, alt58_1, alt58_2, alt58_3, alt58_4, resposta58, 0, 2, 3);
        this.addQuestion(q58);
        Questao q59 = new Questao(pergunta59, alt59_1, alt59_2, alt59_3, alt59_4, resposta59, 0, 2, 3);
        this.addQuestion(q59);
        Questao q60 = new Questao(pergunta60, alt60_1, alt60_2, alt60_3, alt60_4, resposta60, 0, 2, 3);
        this.addQuestion(q60);
        Questao q61= new Questao(pergunta61, alt61_1, alt61_2, alt61_3, alt61_4, resposta61, 0, 2, 3);
        this.addQuestion(q61);
        Questao q62 = new Questao(pergunta62, alt62_1, alt62_2, alt62_3, alt62_4, resposta62, 0, 2, 3);
        this.addQuestion(q62);
        Questao q63 = new Questao(pergunta63, alt63_1, alt63_2, alt63_3, alt63_4, resposta63, 0, 2, 3);
        this.addQuestion(q63);
        Questao q64 = new Questao(pergunta64, alt64_1, alt64_2, alt64_3, alt64_4, resposta64, 0, 2, 3);
        this.addQuestion(q64);

        //MHS
        Questao q65 = new Questao(pergunta65, alt65_1, alt65_2, alt65_3, alt65_4, resposta65, 0, 2, 4);
        this.addQuestion(q65);

        Questao q65_extra01 = new Questao(pergunta65_extra01, alt65_1_extra01, alt65_2_extra01, alt65_3_extra01, alt65_4_extra01, resposta65_extra01, 0, 2, 4);
        this.addQuestion(q65_extra01);
        Questao q65_extra02 = new Questao(pergunta65_extra02, alt65_1_extra02, alt65_2_extra02, alt65_3_extra02, alt65_4_extra02, resposta65_extra02, 0, 2, 4);
        this.addQuestion(q65_extra02);
        Questao q65_extra03 = new Questao(pergunta65_extra03, alt65_1_extra03, alt65_2_extra03, alt65_3_extra03, alt65_4_extra03, resposta65_extra03, 0, 2, 4);
        this.addQuestion(q65_extra03);
        Questao q65_extra04 = new Questao(pergunta65_extra04, alt65_1_extra04, alt65_2_extra04, alt65_3_extra04, alt65_4_extra04, resposta65_extra04, 0, 2, 4);
        this.addQuestion(q65_extra04);
        Questao q65_extra05 = new Questao(pergunta65_extra05, alt65_1_extra05, alt65_2_extra05, alt65_3_extra05, alt65_4_extra05, resposta65_extra05, 0, 2, 4);
        this.addQuestion(q65_extra05);
        Questao q65_extra06 = new Questao(pergunta65_extra06, alt65_1_extra06, alt65_2_extra06, alt65_3_extra06, alt65_4_extra06, resposta65_extra06, 0, 2, 4);
        this.addQuestion(q65_extra06);
        Questao q65_extra07 = new Questao(pergunta65_extra07, alt65_1_extra07, alt65_2_extra07, alt65_3_extra07, alt65_4_extra07, resposta65_extra07, 0, 2, 4);
        this.addQuestion(q65_extra07);
        Questao q65_extra08 = new Questao(pergunta65_extra08, alt65_1_extra08, alt65_2_extra08, alt65_3_extra08, alt65_4_extra08, resposta65_extra08, 0, 2, 4);
        this.addQuestion(q65_extra08);
        Questao q65_extra09 = new Questao(pergunta65_extra09, alt65_1_extra09, alt65_2_extra09, alt65_3_extra09, alt65_4_extra09, resposta65_extra09, 0, 2, 4);
        this.addQuestion(q65_extra09);
        Questao q65_extra10 = new Questao(pergunta65_extra10, alt65_1_extra10, alt65_2_extra10, alt65_3_extra10, alt65_4_extra10, resposta65_extra10, 0, 2, 4);
        this.addQuestion(q65_extra10);
        Questao q65_extra11 = new Questao(pergunta65_extra11, alt65_1_extra11, alt65_2_extra11, alt65_3_extra11, alt65_4_extra11, resposta65_extra11, 0, 2, 4);
        this.addQuestion(q65_extra11);
        Questao q65_extra12 = new Questao(pergunta65_extra12, alt65_1_extra12, alt65_2_extra12, alt65_3_extra12, alt65_4_extra12, resposta65_extra12, 0, 2, 4);
        this.addQuestion(q65_extra12);
        Questao q65_extra13 = new Questao(pergunta65_extra13, alt65_1_extra13, alt65_2_extra13, alt65_3_extra13, alt65_4_extra13, resposta65_extra13, 0, 2, 4);
        this.addQuestion(q65_extra13);
        Questao q65_extra14 = new Questao(pergunta65_extra14, alt65_1_extra14, alt65_2_extra14, alt65_3_extra14, alt65_4_extra14, resposta65_extra14, 0, 2, 4);
        this.addQuestion(q65_extra14);
        Questao q65_extra15 = new Questao(pergunta65_extra15, alt65_1_extra15, alt65_2_extra15, alt65_3_extra15, alt65_4_extra15, resposta65_extra15, 0, 2, 4);
        this.addQuestion(q65_extra15);
        Questao q65_extra16 = new Questao(pergunta65_extra16, alt65_1_extra16, alt65_2_extra16, alt65_3_extra16, alt65_4_extra16, resposta65_extra16, 0, 2, 4);
        this.addQuestion(q65_extra16);

        //Impulso, Quantidade de movimento e Colisões
        Questao q66 = new Questao(pergunta66, alt66_1, alt66_2, alt66_3, alt66_4, resposta66, 0, 2, 5);
        this.addQuestion(q66);
        Questao q67 = new Questao(pergunta67, alt67_1, alt67_2, alt67_3, alt67_4, resposta67, 0, 2, 5);
        this.addQuestion(q67);
        Questao q68 = new Questao(pergunta68, alt68_1, alt68_2, alt68_3, alt68_4, resposta68, 0, 2, 5);
        this.addQuestion(q68);
        Questao q69 = new Questao(pergunta69, alt69_1, alt69_2, alt69_3, alt69_4, resposta69, 0, 2, 5);
        this.addQuestion(q69);
        Questao q70 = new Questao(pergunta70, alt70_1, alt70_2, alt70_3, alt70_4, resposta70, 0, 2, 5);
        this.addQuestion(q70);
        Questao q71 = new Questao(pergunta71, alt71_1, alt71_2, alt71_3, alt71_4, resposta71, 0, 2, 5);
        this.addQuestion(q71);
        Questao q72 = new Questao(pergunta72, alt72_1, alt72_2, alt72_3, alt72_4, resposta72, 0, 2, 5);
        this.addQuestion(q72);

        Questao q72_extra01 = new Questao(pergunta72_extra01, alt72_1_extra01, alt72_2_extra01, alt72_3_extra01, alt72_4_extra01, resposta72_extra01, 0, 2, 5);
        this.addQuestion(q72_extra01);
        Questao q72_extra02 = new Questao(pergunta72_extra02, alt72_1_extra02, alt72_2_extra02, alt72_3_extra02, alt72_4_extra02, resposta72_extra02, 0, 2, 5);
        this.addQuestion(q72_extra02);
        Questao q72_extra03 = new Questao(pergunta72_extra03, alt72_1_extra03, alt72_2_extra03, alt72_3_extra03, alt72_4_extra03, resposta72_extra03, 0, 2, 5);
        this.addQuestion(q72_extra03);
        Questao q72_extra04 = new Questao(pergunta72_extra04, alt72_1_extra04, alt72_2_extra04, alt72_3_extra04, alt72_4_extra04, resposta72_extra04, 0, 2, 5);
        this.addQuestion(q72_extra04);
        Questao q72_extra05 = new Questao(pergunta72_extra05, alt72_1_extra05, alt72_2_extra05, alt72_3_extra05, alt72_4_extra05, resposta72_extra05, 0, 2, 5);
        this.addQuestion(q72_extra05);
        Questao q72_extra06 = new Questao(pergunta72_extra06, alt72_1_extra06, alt72_2_extra06, alt72_3_extra06, alt72_4_extra06, resposta72_extra06, 0, 2, 5);
        this.addQuestion(q72_extra06);
        Questao q72_extra07 = new Questao(pergunta72_extra07, alt72_1_extra07, alt72_2_extra07, alt72_3_extra07, alt72_4_extra07, resposta72_extra07, 0, 2, 5);
        this.addQuestion(q72_extra07);

        //estatica
        Questao q73 = new Questao(pergunta73, alt73_1, alt73_2, alt73_3, alt73_4, resposta73, 0, 3, 1);
        this.addQuestion(q73);
        Questao q74 = new Questao(pergunta74, alt74_1, alt74_2, alt74_3, alt74_4, resposta74, 0, 3, 1);
        this.addQuestion(q74);
        Questao q75 = new Questao(pergunta75, alt75_1, alt75_2, alt75_3, alt75_4, resposta75, 0, 3, 1);
        this.addQuestion(q75);
        Questao q75_extra01 = new Questao(pergunta75_extra01, alt75_1_extra01, alt75_2_extra01, alt75_3_extra01, alt75_4_extra01, resposta75_extra01, 0, 3, 1);
        this.addQuestion(q75_extra01);
        Questao q75_extra02 = new Questao(pergunta75_extra02, alt75_1_extra02, alt75_2_extra02, alt75_3_extra02, alt75_4_extra02, resposta75_extra02, 0, 3, 1);
        this.addQuestion(q75_extra02);
        Questao q75_extra03 = new Questao(pergunta75_extra03, alt75_1_extra03, alt75_2_extra03, alt75_3_extra03, alt75_4_extra03, resposta75_extra03, 0, 3, 1);
        this.addQuestion(q75_extra03);
        Questao q75_extra04 = new Questao(pergunta75_extra04, alt75_1_extra04, alt75_2_extra04, alt75_3_extra04, alt75_4_extra04, resposta75_extra04, 0, 3, 1);
        this.addQuestion(q75_extra04);
        Questao q75_extra05 = new Questao(pergunta75_extra05, alt75_1_extra05, alt75_2_extra05, alt75_3_extra05, alt75_4_extra05, resposta75_extra05, 0, 3, 1);
        this.addQuestion(q75_extra05);
        Questao q75_extra06 = new Questao(pergunta75_extra06, alt75_1_extra06, alt75_2_extra06, alt75_3_extra06, alt75_4_extra06, resposta75_extra06, 0, 3, 1);
        this.addQuestion(q75_extra06);
        Questao q75_extra07 = new Questao(pergunta75_extra07, alt75_1_extra07, alt75_2_extra07, alt75_3_extra07, alt75_4_extra07, resposta75_extra07, 0, 3, 1);
        this.addQuestion(q75_extra07);

        Questao q75_extra08 = new Questao(pergunta75_extra08, alt75_1_extra08, alt75_2_extra08, alt75_3_extra08, alt75_4_extra08, resposta75_extra08, 0, 3, 1);
        this.addQuestion(q75_extra08);
        

        //gravitação
        //Satélites em órbitas circulares
        Questao q76 = new Questao(pergunta76, alt76_1, alt76_2, alt76_3, alt76_4, resposta76, 0, 4, 1);
        this.addQuestion(q76);
        Questao q77 = new Questao(pergunta77, alt77_1, alt77_2, alt77_3, alt77_4, resposta77, 0, 4, 1);
        this.addQuestion(q77);
        Questao q78 = new Questao(pergunta78, alt78_1, alt78_2, alt78_3, alt78_4, resposta78, 0, 4, 1);
        this.addQuestion(q78);
        Questao q78_extra01 = new Questao(pergunta78_extra01, alt78_1_extra01, alt78_2_extra01, alt78_3_extra01, alt78_4_extra01, resposta78_extra01, 0, 4, 1);
        this.addQuestion(q78_extra01);
        Questao q78_extra02 = new Questao(pergunta78_extra02, alt78_1_extra02, alt78_2_extra02, alt78_3_extra02, alt78_4_extra02, resposta78_extra02, 0, 4, 1);
        this.addQuestion(q78_extra02);
        Questao q78_extra03 = new Questao(pergunta78_extra03, alt78_1_extra03, alt78_2_extra03, alt78_3_extra03, alt78_4_extra03, resposta78_extra03, 0, 4, 1);
        this.addQuestion(q78_extra03);
        Questao q78_extra04 = new Questao(pergunta78_extra04, alt78_1_extra04, alt78_2_extra04, alt78_3_extra04, alt78_4_extra04, resposta78_extra04, 0, 4, 1);
        this.addQuestion(q78_extra04);
        Questao q78_extra05 = new Questao(pergunta78_extra05, alt78_1_extra05, alt78_2_extra05, alt78_3_extra05, alt78_4_extra05, resposta78_extra05, 0, 4, 1);
        this.addQuestion(q78_extra05);

        //Leis de Kepler
        Questao q79 = new Questao(pergunta79, alt79_1, alt79_2, alt79_3, alt79_4, resposta79, 0, 4, 2);
        this.addQuestion(q79);
        Questao q80 = new Questao(pergunta80, alt80_1, alt80_2, alt80_3, alt80_4, resposta80, 0, 4, 2);
        this.addQuestion(q80);
        Questao q81 = new Questao(pergunta81, alt81_1, alt81_2, alt81_3, alt81_4, resposta81, 0, 4, 2);
        this.addQuestion(q81);
        Questao q82 = new Questao(pergunta82, alt82_1, alt82_2, alt82_3, alt82_4, resposta82, 0, 4, 2);
        this.addQuestion(q82);
        Questao q83 = new Questao(pergunta83, alt83_1, alt83_2, alt83_3, alt83_4, resposta83, 0, 4, 2);
        this.addQuestion(q83);
        Questao q84 = new Questao(pergunta84, alt84_1, alt84_2, alt84_3, alt84_4, resposta84, 0, 4, 2);
        this.addQuestion(q84);
        Questao q85 = new Questao(pergunta85, alt85_1, alt85_2, alt85_3, alt85_4, resposta85, 0, 4, 2);
        this.addQuestion(q85);
        Questao q86 = new Questao(pergunta86, alt86_1, alt86_2, alt86_3, alt86_4, resposta86, 0, 4, 2);
        this.addQuestion(q86);

        Questao q86_extra01 = new Questao(pergunta86_extra01, alt86_1_extra01, alt86_2_extra01, alt86_3_extra01, alt86_4_extra01, resposta86_extra01, 0, 4, 2);
        this.addQuestion(q86_extra01);
        Questao q86_extra02 = new Questao(pergunta86_extra02, alt86_1_extra02, alt86_2_extra02, alt86_3_extra02, alt86_4_extra02, resposta86_extra02, 0, 4, 2);
        this.addQuestion(q86_extra02);
        Questao q86_extra03 = new Questao(pergunta86_extra03, alt86_1_extra03, alt86_2_extra03, alt86_3_extra03, alt86_4_extra03, resposta86_extra03, 0, 4, 2);
        this.addQuestion(q86_extra03);
        Questao q86_extra04 = new Questao(pergunta86_extra04, alt86_1_extra04, alt86_2_extra04, alt86_3_extra04, alt86_4_extra04, resposta86_extra04, 0, 4, 2);
        this.addQuestion(q86_extra04);
        Questao q86_extra05 = new Questao(pergunta86_extra05, alt86_1_extra05, alt86_2_extra05, alt86_3_extra05, alt86_4_extra05, resposta86_extra05, 0, 4, 2);
        this.addQuestion(q86_extra05);
        Questao q86_extra06 = new Questao(pergunta86_extra06, alt86_1_extra06, alt86_2_extra06, alt86_3_extra06, alt86_4_extra06, resposta86_extra06, 0, 4, 2);
        this.addQuestion(q86_extra06);
        Questao q86_extra07 = new Questao(pergunta86_extra07, alt86_1_extra07, alt86_2_extra07, alt86_3_extra07, alt86_4_extra07, resposta86_extra07, 0, 4, 2);
        this.addQuestion(q86_extra07);

        //Gravidade
        Questao q87 = new Questao(pergunta87, alt87_1, alt87_2, alt87_3, alt87_4, resposta87, 0, 4, 3);
        this.addQuestion(q87);
        Questao q88 = new Questao(pergunta88, alt88_1, alt88_2, alt88_3, alt88_4, resposta88, 0, 4, 3);
        this.addQuestion(q88);

        Questao q88_extra01 = new Questao(pergunta88_extra01, alt88_1_extra01, alt88_2_extra01, alt88_3_extra01, alt88_4_extra01, resposta88_extra01, 0, 4, 3);
        this.addQuestion(q88_extra01);
        Questao q88_extra02 = new Questao(pergunta88_extra02, alt88_1_extra02, alt88_2_extra02, alt88_3_extra02, alt88_4_extra02, resposta88_extra02, 0, 4, 3);
        this.addQuestion(q88_extra02);
        Questao q88_extra03 = new Questao(pergunta88_extra03, alt88_1_extra03, alt88_2_extra03, alt88_3_extra03, alt88_4_extra03, resposta88_extra03, 0, 4, 3);
        this.addQuestion(q88_extra03);
        Questao q88_extra04 = new Questao(pergunta88_extra04, alt88_1_extra04, alt88_2_extra04, alt88_3_extra04, alt88_4_extra04, resposta88_extra04, 0, 4, 3);
        this.addQuestion(q88_extra04);
        Questao q88_extra05 = new Questao(pergunta88_extra05, alt88_1_extra05, alt88_2_extra05, alt88_3_extra05, alt88_4_extra05, resposta88_extra05, 0, 4, 3);
        this.addQuestion(q88_extra05);


        //Lei da gravitação universal:
        Questao q89 = new Questao(pergunta89, alt89_1, alt89_2, alt89_3, alt89_4, resposta89, 0, 4, 4);
        this.addQuestion(q89);
        Questao q90 = new Questao(pergunta90, alt90_1, alt90_2, alt90_3, alt90_4, resposta90, 0, 4, 4);
        this.addQuestion(q90);
        Questao q91 = new Questao(pergunta91, alt91_1, alt91_2, alt91_3, alt91_4, resposta91, 0, 4, 4);
        this.addQuestion(q91);
        Questao q92 = new Questao(pergunta92, alt92_1, alt92_2, alt92_3, alt92_4, resposta92, 0, 4, 4);
        this.addQuestion(q92);
        Questao q93 = new Questao(pergunta93, alt93_1, alt93_2, alt93_3, alt93_4, resposta93, 0, 4, 4);
        this.addQuestion(q93);
        Questao q94 = new Questao(pergunta94, alt94_1, alt94_2, alt94_3, alt94_4, resposta94, 0, 4, 4);
        this.addQuestion(q94);
        Questao q95 = new Questao(pergunta95, alt95_1, alt95_2, alt95_3, alt95_4, resposta95, 0, 4, 4);
        this.addQuestion(q95);

        Questao q95_extra01 = new Questao(pergunta95_extra01, alt95_1_extra01, alt95_2_extra01, alt95_3_extra01, alt95_4_extra01, resposta95_extra01, 0, 4, 4);
        this.addQuestion(q95_extra01);
        Questao q95_extra02 = new Questao(pergunta95_extra02, alt95_1_extra02, alt95_2_extra02, alt95_3_extra02, alt95_4_extra02, resposta95_extra02, 0, 4, 4);
        this.addQuestion(q95_extra02);
        Questao q95_extra03 = new Questao(pergunta95_extra03, alt95_1_extra03, alt95_2_extra03, alt95_3_extra03, alt95_4_extra03, resposta95_extra03, 0, 4, 4);
        this.addQuestion(q95_extra03);
        Questao q95_extra04 = new Questao(pergunta95_extra04, alt95_1_extra04, alt95_2_extra04, alt95_3_extra04, alt95_4_extra04, resposta95_extra04, 0, 4, 4);
        this.addQuestion(q95_extra04);
        Questao q95_extra05 = new Questao(pergunta95_extra05, alt95_1_extra05, alt95_2_extra05, alt95_3_extra05, alt95_4_extra05, resposta95_extra05, 0, 4, 4);
        this.addQuestion(q95_extra05);
        Questao q95_extra06 = new Questao(pergunta95_extra06, alt95_1_extra06, alt95_2_extra06, alt95_3_extra06, alt95_4_extra06, resposta95_extra06, 0, 4, 4);
        this.addQuestion(q95_extra06);

        //hidrostatica
        //Pressão e densidade
        Questao q96 = new Questao(pergunta96, alt96_1, alt96_2, alt96_3, alt96_4, resposta96, 0, 5, 1);
        this.addQuestion(q96);
        Questao q97 = new Questao(pergunta97, alt97_1, alt97_2, alt97_3, alt97_4, resposta97, 0, 5, 1);
        this.addQuestion(q97);
        Questao q98 = new Questao(pergunta98, alt98_1, alt98_2, alt98_3, alt98_4, resposta98, 0, 5, 1);
        this.addQuestion(q98);
        Questao q99 = new Questao(pergunta99, alt99_1, alt99_2, alt99_3, alt99_4, resposta99, 0, 5, 1);
        this.addQuestion(q99);
        Questao q100 = new Questao(pergunta100, alt100_1, alt100_2, alt100_3, alt100_4, resposta100, 0, 5, 1);
        this.addQuestion(q100);
        Questao q101 = new Questao(pergunta101, alt101_1, alt101_2, alt101_3, alt101_4, resposta101, 0, 5, 1);
        this.addQuestion(q101);
        Questao q102 = new Questao(pergunta102, alt102_1, alt102_2, alt102_3, alt102_4, resposta102, 0, 5, 1);
        this.addQuestion(q102);
        Questao q103 = new Questao(pergunta103, alt103_1, alt103_2, alt103_3, alt103_4, resposta103, 0, 5, 1);
        this.addQuestion(q103);
        Questao q104 = new Questao(pergunta104, alt104_1, alt104_2, alt104_3, alt104_4, resposta104, 0, 5, 1);
        this.addQuestion(q104);
        Questao q105 = new Questao(pergunta105, alt105_1, alt105_2, alt105_3, alt105_4, resposta105, 0, 5, 1);
        this.addQuestion(q105);
        Questao q106 = new Questao(pergunta106, alt106_1, alt106_2, alt106_3, alt106_4, resposta106, 0, 5, 1);
        this.addQuestion(q106);
        Questao q107 = new Questao(pergunta107, alt107_1, alt107_2, alt107_3, alt107_4, resposta107, 0, 5, 1);
        this.addQuestion(q107);
        Questao q108 = new Questao(pergunta108, alt108_1, alt108_2, alt108_3, alt108_4, resposta108, 0, 5, 1);
        this.addQuestion(q108);

        //Empuxo
        Questao q109 = new Questao(pergunta109, alt109_1, alt109_2, alt109_3, alt109_4, resposta109, 0, 5, 2);
        this.addQuestion(q109);
        Questao q110 = new Questao(pergunta110, alt110_1, alt110_2, alt110_3, alt110_4, resposta110, 0, 5, 2);
        this.addQuestion(q110);
        Questao q111 = new Questao(pergunta111, alt111_1, alt111_2, alt111_3, alt111_4, resposta111, 0, 5, 2);
        this.addQuestion(q111);
        Questao q112 = new Questao(pergunta112, alt112_1, alt112_2, alt112_3, alt112_4, resposta112, 0, 5, 2);
        this.addQuestion(q112);
        Questao q113 = new Questao(pergunta113, alt113_1, alt113_2, alt113_3, alt113_4, resposta113, 0, 5, 2);
        this.addQuestion(q113);

        //Pressão atmosférica e hidrostática
        Questao q114 = new Questao(pergunta114, alt114_1, alt114_2, alt114_3, alt114_4, resposta114, 0, 5, 3);
        this.addQuestion(q114);
        Questao q115 = new Questao(pergunta115, alt115_1, alt115_2, alt115_3, alt115_4, resposta115, 0, 5, 3);
        this.addQuestion(q115);
        Questao q116 = new Questao(pergunta116, alt116_1, alt116_2, alt116_3, alt116_4, resposta116, 0, 5, 3);
        this.addQuestion(q116);
        Questao q117 = new Questao(pergunta117, alt117_1, alt117_2, alt117_3, alt117_4, resposta117, 0, 5, 3);
        this.addQuestion(q117);
        Questao q118 = new Questao(pergunta118, alt118_1, alt118_2, alt118_3, alt118_4, resposta118, 0, 5, 3);
        this.addQuestion(q118);
        Questao q119 = new Questao(pergunta119, alt119_1, alt119_2, alt119_3, alt119_4, resposta119, 0, 5, 3);
        this.addQuestion(q119);
        Questao q120 = new Questao(pergunta120, alt120_1, alt120_2, alt120_3, alt120_4, resposta120, 0, 5, 3);
        this.addQuestion(q120);
        Questao q121 = new Questao(pergunta121, alt121_1, alt121_2, alt121_3, alt121_4, resposta121, 0, 5, 3);
        this.addQuestion(q121);
        Questao q122 = new Questao(pergunta122, alt122_1, alt122_2, alt122_3, alt122_4, resposta122, 0, 5, 3);
        this.addQuestion(q122);
        Questao q123 = new Questao(pergunta123, alt123_1, alt123_2, alt123_3, alt123_4, resposta123, 0, 5, 3);
        this.addQuestion(q123);

        //Princípio de Pascal
        Questao q124 = new Questao(pergunta124, alt124_1, alt124_2, alt124_3, alt124_4, resposta124, 0, 5, 4);
        this.addQuestion(q124);
        Questao q125 = new Questao(pergunta125, alt125_1, alt125_2, alt125_3, alt125_4, resposta125, 0, 5, 4);
        this.addQuestion(q125);
        Questao q126 = new Questao(pergunta126, alt126_1, alt126_2, alt126_3, alt126_4, resposta126, 0, 5, 4);
        this.addQuestion(q126);
    }

    @Override
    public void onUpgrade(SQLiteDatabase bancoDadosOnUpgrade, int versaoAntiga, int novaVersao)
    {
        bancoDadosOnUpgrade.execSQL("DROP TABLE IF EXISTS " + TB_PERGUNTAS + ";");
        bancoDadosOnUpgrade.execSQL("DROP TABLE IF EXISTS " + TB_TEMAS + ";");
        bancoDadosOnUpgrade.execSQL("DROP TABLE IF EXISTS " + TB_ASSUNTOS + ";");
        onCreate(bancoDadosOnUpgrade);
    }

    public void addQuestion(Questao questao)
    {
        ContentValues values = new ContentValues();
        values.put(PERGUNTA, questao.getQuestao());
        values.put(RESPOSTA, questao.getQuestaoResposta());
        values.put(ASSERTIVA_A, questao.getQuestaoAssertivaA());
        values.put(ASSERTIVA_B, questao.getQuestaoAssertivaB());
        values.put(ASSERTIVA_C, questao.getQuestaoAssertivaC());
        values.put(ASSERTIVA_D, questao.getQuestaoAssertivaD());
        values.put(NIVEL_PERGUNTA, questao.getQuestaoNivelPergunta());
        values.put(TEMA_PERGUNTA, questao.getTema());
        values.put(ASSUNTO, questao.getAssunto());

        bancoDadosFisicaInMaos.insert(TB_PERGUNTAS, null, values);
    }

    public List<Questao> pegarTodasQuestoes(int tema, int assunto)
    {
        List<Questao> listaBancoDadosPerguntasQuestoes = new ArrayList<>();
        String sql = "SELECT * FROM " + TB_PERGUNTAS + " WHERE tema = " + tema + " AND assunto = " + assunto + ";";
        this.bancoDadosFisicaInMaos = this.getReadableDatabase();
        Cursor cursor = bancoDadosFisicaInMaos.rawQuery(sql, null);
        List<Questao> teste = new ArrayList<>();

        if (cursor.moveToFirst())
        {
            do
            {
                Questao questao = new Questao();
                List<String> assertivas = new ArrayList<>();

                questao.setQuestao(cursor.getString(1));
                questao.setQuestaoResposta(cursor.getString(2));

                assertivas.add(cursor.getString(3));
                assertivas.add(cursor.getString(4));
                assertivas.add(cursor.getString(5));
                assertivas.add(cursor.getString(6));
                Collections.shuffle(assertivas);

                questao.setQuestaoAssertivaA(assertivas.get(0));
                questao.setQuestaoAssertivaB(assertivas.get(1));
                questao.setQuestaoAssertivaC(assertivas.get(2));
                questao.setQuestaoAssertivaD(assertivas.get(3));

                questao.setTema(cursor.getInt(8));
                questao.setAssunto(cursor.getInt(9));

                listaBancoDadosPerguntasQuestoes.add(questao);
            }
            while(cursor.moveToNext());

            for(int i = 0; i < listaBancoDadosPerguntasQuestoes.size(); i++)
            {
                teste.add(listaBancoDadosPerguntasQuestoes.get(i));
            }
        }
        Collections.shuffle(teste);
        return  teste;
    }

    public int quantidadePerguntas()
    {
        int row = 0;
        try
        {
            String selectQuery = "SELECT  * FROM tb_perguntas;";
            SQLiteDatabase db = this.getWritableDatabase();
            Cursor cursor = db.rawQuery(selectQuery, null);
            row = cursor.getCount();
            cursor.close();
        }
        catch (Exception e)
        {

        }
        return row;
    }
}