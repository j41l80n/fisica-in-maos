package raoni.ifrn.mestrado.fisicainmaos.helpers;

public class Questao
{
    private int questaoCodigoPergunta;
    private int questaoNivelPergunta;
    private int tema;
    private int assunto;

    private String questao;
    private String questaoAssertivaA;
    private String questaoAssertivaB;
    private String questaoAssertivaC;
    private String questaoAssertivaD;
    private String questaoResposta;

    Questao()
    {
        questaoCodigoPergunta = 0;
        questao = "";
        questaoResposta = "";
        questaoAssertivaA = "";
        questaoAssertivaB = "";
        questaoAssertivaC = "";
        questaoAssertivaD = "";
        questaoNivelPergunta = 0;
        tema = 0;
        assunto = 0;
    }

    public Questao(String questao,
                   String questaoAssertivaA,
                   String questaoAssertivaB,
                   String questaoAssertivaC,
                   String questaoAssertivaD,
                   String questaoResposta,
                   int questaoNivelPergunta,
                   int tema,
                   int assunto)
    {
        this.questao = questao;
        this.questaoAssertivaA = questaoAssertivaA;
        this.questaoAssertivaB = questaoAssertivaB;
        this.questaoAssertivaC = questaoAssertivaC;
        this.questaoAssertivaD = questaoAssertivaD;
        this.questaoResposta = questaoResposta;
        this.questaoNivelPergunta = questaoNivelPergunta;
        this.tema = tema;
        this.assunto = assunto;
    }

    public int getQuestaoCodigoPergunta()
    {
        //
        return questaoCodigoPergunta;
    }

    public int getAssunto()
    {
        //
        return assunto;
    }

    public String getQuestao()
    {
        //
        return questao;
    }

    public int getTema()
    {
        //
        return tema;
    }

    public String getQuestaoAssertivaA()
    {
        //
        return questaoAssertivaA;
    }

    public String getQuestaoAssertivaB()
    {
        //
        return questaoAssertivaB;
    }

    public String getQuestaoAssertivaC()
    {
        //
        return questaoAssertivaC;
    }

    public String getQuestaoAssertivaD()
    {
        //
        return questaoAssertivaD;
    }

    public String getQuestaoResposta()
    {
        //
        return questaoResposta;
    }

    public int getQuestaoNivelPergunta()
    {
        //
        return questaoNivelPergunta;
    }

    public void setQuestaoCodigoPergunta(int questaoCodigoPergunta)
    {
        //
        this.questaoCodigoPergunta = questaoCodigoPergunta;
    }

    public void setQuestao(String questao)
    {
        //
        this.questao = questao;
    }

    public void setQuestaoAssertivaA(String questaoAssertivaA)
    {
        //
        this.questaoAssertivaA = questaoAssertivaA;
    }

    public void setQuestaoAssertivaB(String questaoAssertivaB)
    {
        //
        this.questaoAssertivaB = questaoAssertivaB;
    }

    public void setQuestaoAssertivaC(String questaoAssertivaC)
    {
        //
        this.questaoAssertivaC = questaoAssertivaC;
    }

    public void setQuestaoAssertivaD(String questaoAssertivaD)
    {
        //
        this.questaoAssertivaD = questaoAssertivaD;
    }

    public void setQuestaoResposta(String questaoResposta)
    {
        //
        this.questaoResposta = questaoResposta;
    }

    public void setTema(int tema)
    {
        //
        this.tema = tema;
    }

    public void setAssunto(int assunto)
    {
        //
        this.assunto = assunto;
    }

    public void setQuestaoNivelPergunta(int questaoNivelPergunta)
    {
        this.questaoNivelPergunta = questaoNivelPergunta;
    }
}
