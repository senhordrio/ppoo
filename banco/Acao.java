package banco;

public class Acao extends AplicacaoFinanceira {
    private double precoAcaoInicioMes;
    private double precoAcaoFimMes;

    public Acao(double v, double inicioMes, double fimMes) {
        super(v);
        this.precoAcaoInicioMes = inicioMes;
        this.precoAcaoFimMes = fimMes;
    }

    public void simulaAcao(int meses){
        double valor = getValor();
        double rendimento = calculaRendimentoAcao(meses);
        System.out.printf("Valor final para investimento em ação: R$ %f", (valor + (valor * rendimento)));
    }

    public double calculaRendimentoAcao(int meses){
        double rendimento = ((precoAcaoFimMes/precoAcaoInicioMes)*100) - 100;
        return rendimento * meses;
    }
}
