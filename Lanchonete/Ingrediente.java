
public abstract class Ingrediente extends Sanduiche{
    private Sanduiche s;

    public Ingrediente(Sanduiche s){
        this.s = s;
        setNome(s.getNome());
    }

    public Sanduiche getSanduiche(){
        return s;
    }
}
