package org.ita;

public class MecanicaDoJogoFacil implements MecanicaDoJogo{

//    private FabricaEmbaralhadores fabricaEmbaralhadores;
    private BancoDePalavras bancoDePalavras;
    private Embaralhador embaralhador;
    private int tentativas;
    private double pontuacao;
    private String palavraOriginal;
    private String palavraEmbaralhada;


    public MecanicaDoJogoFacil(FabricaEmbaralhadores fabricaEmbaralhadores, BancoDePalavras bancoDePalavras) {
        embaralhador = fabricaEmbaralhadores.obterEmbaralhadorAleatorio();
        this.bancoDePalavras = bancoDePalavras;
        tentativas = 10;
        pontuacao = 0;
    }

    @Override
    public Boolean isGameOver() {
       if (tentativas <= 0 ) {
           return true;
       }
       return false;
    }

    @Override
    public Boolean isPalavraCorreta(String palavraDigitada) {
        if (palavraDigitada.equalsIgnoreCase(palavraOriginal)) {
            pontuacao = pontuacao + 10;
            return true;
        } else{
            --tentativas;
            return false;
        }
    }

    @Override
    public double pontuacaoFinal() {
        return pontuacao;
    }

    @Override
    public String pegarPalavraEmbaralhada() {
        palavraOriginal = bancoDePalavras.obterPalavraAleatoaria();
        palavraEmbaralhada = embaralhador.embaralhaPalavra(palavraOriginal);
        return palavraEmbaralhada;
    }

    @Override
    public int vidasRestantes() {
        return tentativas;
    }
}
