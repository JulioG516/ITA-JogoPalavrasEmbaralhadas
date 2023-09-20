package org.ita;

public interface MecanicaDoJogo {

//    void obterEmbaralhadorAleatorio();
    Boolean isGameOver();
    Boolean isPalavraCorreta(String palavraDigita);
    double pontuacaoFinal();

    int vidasRestantes();

    String pegarPalavraEmbaralhada();

}
