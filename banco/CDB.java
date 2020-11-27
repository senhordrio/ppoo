package banco;

public class CDB extends AplicacaoFinanceira {
    private double taxaCdi;

    public CDB(double valor, int meses, double cdi) {
        super(valor, meses);
        this.taxaCdi = cdi;
    }

    @Override public void simulaInvestimento() {
        double valor = getValor();
        double rendimento = calculaRendimentoCDB(getMeses());
        System.out.printf("Valor final para investimento em CDB: R$ %.2f", (valor + (valor * rendimento)));
    }

    public double calculaRendimentoCDB(int meses) {
        double rendimento = 1.2 * (taxaCdi / 100);
        return rendimento * meses;
    }
}
