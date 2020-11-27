package banco;

public class AplicacaoFinanceira {
    private double valor;
    private int meses;

    public AplicacaoFinanceira(double valor, int meses) {
        this.valor = valor;
        this.meses = meses;
    }

    public double getValor() {
        return valor;
    }

    public int getMeses() {
        return meses;
    }

    public void simulaInvestimento() {
    }
}
