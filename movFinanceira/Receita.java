package movFinanceira;

public class Receita extends MovimentacaoFinanceira {
    private String cpf;
    private String formaDePagamento;

    public Receita(int dia, int mes, int ano, String horario, double valor, String cpf, String formaDePagamento) {
        super(dia, mes, ano, horario, valor);
        this.cpf = cpf;
        this.formaDePagamento = formaDePagamento;
    }

    @Override
    public double calculoImposto(double valor) {
        if (this.formaDePagamento == "Dinheiro") {
            return getTaxaMes() + (getValor() * 0.015);
        } else if (this.formaDePagamento == "Debito") {
            return getTaxaMes() + (getValor() * 0.03);
        } else {
            return getTaxaMes() + (getValor() * 0.04);
        }
    }

    @Override
    public String toString(){
        return "\n" + "Receita realizada em: " + super.toString() + "CPF: " + cpf + "\n" + "Forma de pagamento: " + formaDePagamento
        + "\n" + "Imposto a pagar: " + calculoImposto(getValor()) + "\n";
    }
}
