package org.ita;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FabricaEmbaralhadores {
    private List<Embaralhador> embaralhadores;

    public FabricaEmbaralhadores() {
        embaralhadores = new ArrayList<>();
        embaralhadores.add(new EmbaralhaFacil());
        embaralhadores.add(new EmbaralhaFisher());
        // Adicionar mais embaralhadores conforme for criado
    }

    public Embaralhador obterEmbaralhadorAleatorio() {
        Random random = new Random();
        int indice = random.nextInt(embaralhadores.size());
        return embaralhadores.get(indice);
    }
}
