package exercicios;

import java.util.Scanner;

public class Vogais {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int qtd;
        int j;
        int tamanho = 0;
        int numVogais;
        String frase;
        String maiorPalavra = "";
        String[] palavras;
        String[] vogais = { "a", "e", "i", "o", "u" };
        // Entrada de dados
        qtd = entrada.nextInt();
        entrada.nextLine();// Limpar buffer
        frase = entrada.nextLine();
        palavras = new String[qtd];
        palavras = frase.split(" ");// separa a frase de acordo com os espaços em branco
        // Obtendo a palavra com mais vogais
        for (int i = 0; i < qtd; i++) {
            numVogais = 0;
            for (int k = 0; k < palavras[i].length(); k++) {
                j = 0;
                while (j < vogais.length && !palavras[i].substring(k, k + 1).equals(vogais[j]))
                    j++;
                if (j != vogais.length)
                    numVogais++;
            }
            if (numVogais > tamanho) {
                tamanho = numVogais;
                maiorPalavra = palavras[i];
            }
        }
        System.out.println(maiorPalavra + " " + tamanho);
        entrada.close();
    }
}
