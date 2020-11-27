package banco;

public class CDB extends AplicacaoFinanceira {
    private double taxaCdi;

    public CDB(double v, double cdi) {
        super(v);
        this.taxaCdi = cdi;
    }

    public void simulaCDB(int meses){
        double valor = getValor();
        double rendimento = calculaRendimentoCDB(meses);
        System.out.printf("Valor final para investimento em CDB: R$ %f", (valor + (valor * rendimento)));
    }

    public double calculaRendimentoCDB(int meses){
        double rendimento = 1.2 * (taxaCdi/100);
        return rendimento * meses;
    }
}
