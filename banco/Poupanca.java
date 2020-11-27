package banco;

public class Poupanca extends AplicacaoFinanceira {
    private double taxaSelic;
    private double taxaTr;

    public Poupanca(double v, double selic, double tr) {
        super(v);
        this.taxaSelic = selic;
        this.taxaTr = tr;
    }

    public void simulaPoupanca(int meses){
        double valor = getValor();
        double rendimento = calculaRendimentoPoupanca(meses);
        System.out.printf("Valor final para investimento em poupança: R$ %f",  (valor + (valor * rendimento)));
    }

    public double calculaRendimentoPoupanca(double meses){
        double rendimento = (0.7 * (taxaSelic/100)) + (taxaTr/100);
        return rendimento * meses;
    }
}
