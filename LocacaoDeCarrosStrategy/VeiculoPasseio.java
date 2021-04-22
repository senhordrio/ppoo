public class VeiculoPasseio implements CalculaLocacao {
    @Override
    public double calculaLocacao(double diaria, int dias){
        return diaria * dias;
    }
}
