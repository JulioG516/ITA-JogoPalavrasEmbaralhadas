package org.ita;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MecanicaDoJogo mecanicaDoJogo = new FabricaMecanicaDeJogos().obterMecanicaDoJogo();


        System.out.println("Bem-vindo ao ITA - Jogo de Palavras!");
        System.out.println("Adivinhe a palavra correta. Voce tem " + mecanicaDoJogo.vidasRestantes() + " tentativas");

        while (!mecanicaDoJogo.isGameOver()) {
            String palavraEmbaralhada = mecanicaDoJogo.pegarPalavraEmbaralhada();
            System.out.println("A Palavra embaralhada é: " + palavraEmbaralhada);

            System.out.print("Digite a palavra correta: ");
            String palavraDigitada = scanner.nextLine();

            if (mecanicaDoJogo.isPalavraCorreta(palavraDigitada)) {
                System.out.println("Parabéns! Você acertou.");
            } else {
                System.out.println("Palavra incorreta.");
                System.out.println("Tentativas restantes: " + mecanicaDoJogo.vidasRestantes());
            }
        }
        System.out.println("=====================================");

        System.out.println("Fim do jogo!");
        if (mecanicaDoJogo.pontuacaoFinal() > 50) {
            System.out.println("Parabéns sua pontuação final foi de " + mecanicaDoJogo.pontuacaoFinal() + " Impressionante!");
        }else{
            System.out.println("Voce obteve " + mecanicaDoJogo.pontuacaoFinal() + " Pontos, Vamos tentar mais ?");
        }

    }
}
