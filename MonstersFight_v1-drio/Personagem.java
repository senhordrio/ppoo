import java.util.HashMap;

/**
 * Esta classe representa um personagem do jogo, o qual poderá participar de
 * lutas. Cada personagem eh conectado a outros indicando as possiveis
 * transformacoes. A principio as transformacoes sao lobisomen, mumia, vampiro e
 * zumbi. Para cada transformacao possivel, o personagem guarda uma referencia
 * para o outro personagem ou null se nao for possivel aquela transformacao.
 * 
 * @author Luiz Merschmann
 * @version 29/11/2020
 */
public class Personagem {
    private String identificacao;
    private int forcaAtaque;
    private int forcaDefesa;
    private HashMap<String, Personagem> transformacoes;

    /**
     * Cria um personagem com a "descricao" e habilidades (forca de ataque e defesa)
     * passadas. Inicialmente ele não pode sofrer transformacoes.
     * 
     * @param descricao   A descricao do personagem.
     * @param forcaAtaque A forca de ataque daquele personagem.
     * @param forcaDefesa A forca de defesa daquele personagem.
     */
    public Personagem(String descricao, int forcaAtaque, int forcaDefesa) {
        this.identificacao = descricao;
        this.forcaAtaque = forcaAtaque;
        this.forcaDefesa = forcaDefesa;
        this.transformacoes = new HashMap<String, Personagem>();
    }

    /**
     * Define as transformacoes possiveis. Cada transformacao leva a um outro
     * personagem ou eh null (transformacao impossivel).
     * 
     */
    public void adicionaTransformacao(String nome, Personagem personagem) {
        transformacoes.put(nome, personagem);
    }

    public String imprimirTransformacoes() {
        String strTransformacoes = "\nTransformacões possíveis:\n";
        for (Personagem personagem : transformacoes.values()) {
            strTransformacoes += personagem.getDescricao() + "\n";
        }
        return strTransformacoes;
    }

    /**
     * @return A descricao do personagem.
     */
    public String getDescricao() {
        return identificacao + "\t--> Força de ataque = " + forcaAtaque + " Força de defesa = " + forcaDefesa;
    }

    public String getDescricaoLonga() {
        return "\nVoce eh um(a) " + getDescricao() + imprimirTransformacoes();
    }

    public Personagem getPersonagem(String personagem) {
        if (transformacoes.containsKey(personagem)) {
            return transformacoes.get(personagem);
        } else {
            return null;
        }
    }

    public int getForcaAtaque() {
        return this.forcaAtaque;
    }

    public int getForcaDefesa() {
        return this.forcaDefesa;
    }
}
