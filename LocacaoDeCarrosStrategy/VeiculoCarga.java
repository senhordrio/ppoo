public class VeiculoCarga implements CalculaLocacao {

    private boolean cabineSimples;
    public VeiculoCarga(boolean cabineSimples){
        this.cabineSimples = cabineSimples;
    }

    @Override
    public double calculaLocacao(double diaria, int dias){
        if(this.cabineSimples) return diaria * dias;
        else return 1.5 * diaria * dias;
    }
}
