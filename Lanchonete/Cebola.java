public class Cebola extends Ingrediente{
    public Cebola(Sanduiche s){
        super(s);
    }

    @Override
    public double preco(){
        return 1.30 + getSanduiche().preco();
    }
}
