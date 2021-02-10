package banco;

public class Poupanca extends AplicacaoFinanceira {
    private double taxaSelic;
    private double taxaTr;

    public Poupanca(double valor, int meses, double selic, double tr) {
        super(valor, meses);
        this.taxaSelic = selic;
        this.taxaTr = tr;
    }

    @Override public void simulaInvestimento() {
        double valor = getValor();
        double rendimento = calculaRendimentoPoupanca(getMeses());
        System.out.printf("Valor final para investimento em poupança: R$ %.2f", (valor + (valor * rendimento)));
    }

    public double calculaRendimentoPoupanca(int meses) {
        double rendimento = (0.7 * (taxaSelic / 100)) + (taxaTr / 100);
        return rendimento * meses;
    }
}
