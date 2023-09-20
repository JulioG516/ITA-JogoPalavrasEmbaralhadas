package org.ita;

public class EmbaralhaFacil implements Embaralhador{

    @Override
    public String embaralhaPalavra(String palavra) {
        String metadeInicial = palavra.substring(0, palavra.length() / 2);
        String metadeFinal = palavra.substring((palavra.length() / 2));

        String palavraEmbaralhada = metadeFinal + metadeInicial;

        if (palavraEmbaralhada.length() >= 2) {
            char primeiraLetra = palavraEmbaralhada.charAt(0);
            char ultimaLetra = palavraEmbaralhada.charAt(palavraEmbaralhada.length() - 1);
            palavraEmbaralhada = ultimaLetra + palavraEmbaralhada.substring(1, palavraEmbaralhada.length() - 1) + primeiraLetra;
        }

        return palavraEmbaralhada;
    }
}
