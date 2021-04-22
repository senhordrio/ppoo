public class VeiculoPassageiros implements CalculaLocacao {
    private int capacidade;
    public VeiculoPassageiros(int capacidade){
        this.capacidade = capacidade;
    }
    @Override
    public double calculaLocacao(double diaria, int dias){
        double division = (double)this.capacidade/(double)100;
        double valor = 1 + division;
        return diaria * dias * valor;
    }
}
