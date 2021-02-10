package notaFiscal;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import compra.Compra;

public class NotaFiscal {
	private List<Compra> listaCompras;
	private int dia;
	private int mes;
	private int ano;

	public NotaFiscal(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.listaCompras = new ArrayList<Compra>();
	}

	public int getDia() {
		return this.dia;
	}

	public int getMes() {
		return this.mes;
	}

	public int getAno() {
		return this.ano;
	}

	public void comprar(Compra c) {
		listaCompras.add(c);
	}

	public void imprimirNotaFiscal() {
		System.out.println("Data: " + this.dia + "/" + this.mes + "/" + this.ano);
		System.out.printf("%-20s\t%s\t%-10s\t%s%n%n", "Produto", "Qtd", "Preço", "Valor Pago");
		double total = 0;
		Collections.sort(listaCompras);
		for (Compra c : listaCompras) {
			total += c.calculaValorPago();
			System.out.printf("%-20s\t%s\t%-10s\t%s%n", c.getNome(), c.getQuantidade(), c.getPreco(),
					c.calculaValorPago());
		}
		System.out.println("\nTotal R$ " + String.format("%.2f", total));
	}

}
