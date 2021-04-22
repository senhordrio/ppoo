public class PaoDeHamburguer extends Sanduiche{
    public PaoDeHamburguer(String nome){
        setNome(nome);
    }

    @Override
    public double preco(){
        return 2.50;
    }
}
