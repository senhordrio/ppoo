public class Principal{

    public static void main(String[] args) {
        Sanduiche sanduba = new PaoDeHamburguer("X-Burguer");
        sanduba = new Hamburguer(sanduba);
        sanduba = new Queijo(sanduba);
        sanduba = new Queijo(sanduba);
        System.out.println("Nome do sanduíche: " + sanduba.getNome() + " -" + " Preço do sanduíche: R$" + String.format("%.2f", sanduba.preco()));
    }
}