public class Veiculo {
    protected CalculaLocacao calculo;

    public Veiculo(CalculaLocacao calculo){
        this.calculo = calculo;
    }

    public double calcularValorLocacao(double diaria, int dias){
        return calculo.calculaLocacao(diaria, dias);
    }
}
