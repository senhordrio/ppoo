package banco;

public class Acao extends AplicacaoFinanceira {
    private double precoAcaoInicioMes;
    private double precoAcaoFimMes;

    public Acao(double valor, int meses, double inicioMes, double fimMes) {
        super(valor, meses);
        this.precoAcaoInicioMes = inicioMes;
        this.precoAcaoFimMes = fimMes;
    }

    @Override public void simulaInvestimento() {
        double valor = getValor();
        double rendimento = calculaRendimentoAcao(getMeses());
        System.out.printf("Valor final para investimento em ação: R$ %.2f", (valor + (valor * rendimento)));
    }

    public double calculaRendimentoAcao(int meses) {
        double rendimento = ((precoAcaoFimMes / precoAcaoInicioMes) * 100) - 100;
        return rendimento/100 * meses;
    }
}
