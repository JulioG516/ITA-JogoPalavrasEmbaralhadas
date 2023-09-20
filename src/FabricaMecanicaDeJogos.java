package org.ita;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FabricaMecanicaDeJogos {
    List<MecanicaDoJogo> mecanicaDoJogos;

    public FabricaMecanicaDeJogos() {
        mecanicaDoJogos = new ArrayList<>();
        mecanicaDoJogos.add(new MecanicaDoJogoFacil(new FabricaEmbaralhadores(), new BancoDePalavras()));
        mecanicaDoJogos.add(new MecanicaDoJogoMorteSubita(new FabricaEmbaralhadores(), new BancoDePalavras()));
        // Adicionar mais menica de jogos conforme for criado
    }

    public MecanicaDoJogo obterMecanicaDoJogo() {
        Random random = new Random();
        int indice = random.nextInt(mecanicaDoJogos.size());
        return mecanicaDoJogos.get(indice);
    }
}
