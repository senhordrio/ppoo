public class Queijo extends Ingrediente {
    public Queijo(Sanduiche s){
        super(s);
    }

    @Override
    public double preco(){
        return 2.30 + getSanduiche().preco();
    }
}
