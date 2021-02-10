package compra;

public class CompraNormal extends Compra {
	private int desconto;

	public CompraNormal(String nome, int quantidade, double preco, int desconto) {
		super(nome, quantidade, preco);
		this.desconto = desconto;
	}

	@Override
	public final double calculaValorPago() {
		double total = getQuantidade() * getPreco();
		double valorPago = total - (total * this.desconto / 100);
		return valorPago;
	}

}
