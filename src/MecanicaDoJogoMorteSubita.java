package org.ita;

public class MecanicaDoJogoMorteSubita implements MecanicaDoJogo {
    private BancoDePalavras bancoDePalavras;
    private Embaralhador embaralhador;
    private int tentativas;
    private double pontuacao;
    private String palavraOriginal;
    private String palavraEmbaralhada;

    public MecanicaDoJogoMorteSubita(FabricaEmbaralhadores fabricaEmbaralhadores, BancoDePalavras bancoDePalavras) {
        embaralhador = fabricaEmbaralhadores.obterEmbaralhadorAleatorio();
        this.bancoDePalavras = bancoDePalavras;
        tentativas = 1;
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
            pontuacao = pontuacao + 5;
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
    public int vidasRestantes() {
        return tentativas;
    }

    @Override
    public String pegarPalavraEmbaralhada() {
        palavraOriginal = bancoDePalavras.obterPalavraAleatoaria();
        palavraEmbaralhada = embaralhador.embaralhaPalavra(palavraOriginal);
        return palavraEmbaralhada;
    }
}
