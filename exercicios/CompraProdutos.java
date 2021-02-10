package exercicios;

import java.util.Scanner;

public class CompraProdutos {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int cod;
		int qtd;
		float preco;
		float valorBruto;
		float desc;
		float valorFinal;
		// Entrada de dados
		cod = entrada.nextInt();
		qtd = entrada.nextInt();
		// Definindo o preço
		if (cod <= 10) {
			preco = 10;
		} else if (cod <= 20) {
			preco = 15;
		} else if (cod <= 30) {
			preco = 20;
		} else {
			preco = 30;
		}
		// Calculando o valor total sem o desconto
		valorBruto = qtd * preco;
		// Aplicando o desconto
		if (valorBruto < 250) {
			desc = valorBruto * 0.05f;
		} else if (valorBruto <= 500) {
			desc = valorBruto * 0.1f;
		} else {
			desc = valorBruto * 0.15f;
		}
		valorFinal = valorBruto - desc;
		// Imprimindo o relatório final
		System.out.printf("%.2f%n", preco);
		System.out.printf("%.2f%n", valorBruto);
		System.out.printf("%.2f%n", desc);
		System.out.printf("%.2f%n", valorFinal);
		entrada.close();
	}
}
