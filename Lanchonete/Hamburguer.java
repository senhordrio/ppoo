public class Hamburguer extends Ingrediente {
    public Hamburguer(Sanduiche s){
        super(s);
    }

    @Override
    public double preco(){
        return 4.00 + getSanduiche().preco();
    }
}
