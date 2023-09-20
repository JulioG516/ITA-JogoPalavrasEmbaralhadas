package org.ita;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BancoDePalavras {
    private List<String> listaPalavras;

    public BancoDePalavras() {
        listaPalavras = new ArrayList<>();

        File arquivo = new File("src/ArquivoPalavras.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(arquivo)))    {
            String linha;
            while((linha = br.readLine()) != null) {
                listaPalavras.add(linha);
            }
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }


    public String obterPalavraAleatoaria() {
        if (listaPalavras.size() == 0) {
            throw new RuntimeException("Não é possivel obter palavra aleatoria, não há nenhuma palavra no banco de dados !");
        }
        Random random = new Random();
        return listaPalavras.get(random.nextInt(listaPalavras.size()));
    }
}
