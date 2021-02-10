package movFinanceira;

public class Despesa extends MovimentacaoFinanceira {
    private String cnpj;
    private int numParcelas;

    public Despesa(int dia, int mes, int ano, String horario, double valor, String cnpj, int numParcelas) {
        super(dia, mes, ano, horario, valor);
        this.cnpj = cnpj;
        this.numParcelas = numParcelas;
    }

    @Override
    public double calculoImposto(double valor) {
        return getTaxaMes() + ((getValor()*0.01) * this.numParcelas);
    }

    @Override
    public String toString(){
        return "\n" + "Despesa realizada em: " + super.toString() + "CNPJ: " + cnpj + "\n" + "Numero de parcelas: " + numParcelas
        + "\n" + "Imposto a pagar: " + calculoImposto(getValor()) + "\n";
    }
}
