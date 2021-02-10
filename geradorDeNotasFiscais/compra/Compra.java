package compra;

public abstract class Compra implements Comparable<Compra> {
	private String nome;
	private int quantidade;
	double preco;

	public Compra(String nome, int quantidade, double preco) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public abstract double calculaValorPago();

	public String getNome() {
		return this.nome;
	}

	public int getQuantidade() {
		return this.quantidade;
	}

	public double getPreco() {
		return this.preco;
	}

	@Override
	public int compareTo(Compra c) {
		if (this.preco > c.preco) {
			return 1;
		} else if (this.preco < c.preco) {
			return -1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return getNome() + "\t" + getQuantidade() + "\t" + String.format("%-8.2f", getPreco()) + "\t"
				+ String.format("%.2f", calculaValorPago());
	}
}
