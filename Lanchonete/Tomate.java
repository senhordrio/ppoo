public class Tomate extends Ingrediente {
    public Tomate(Sanduiche s){
        super(s);
    }

    @Override
    public double preco(){
        return 0.50 + getSanduiche().preco();
    }
}
