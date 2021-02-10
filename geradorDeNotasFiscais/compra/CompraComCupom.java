package compra;

public class CompraComCupom extends Compra {
	private double cupom;

	public CompraComCupom(String nome, int quantidade, double preco, double cupom) {
		super(nome, quantidade, preco);
		this.cupom = cupom;
	}

	@Override
	public final double calculaValorPago() {
		double total = getQuantidade() * getPreco();
		if (total - this.cupom < 0) {
			return 0;
		} else {
			return total - this.cupom;
		}

	}

	@Override
	public String toString() {
		return super.toString() + "\t" + String.format("%.2f", calculaValorPago());
	}

}
