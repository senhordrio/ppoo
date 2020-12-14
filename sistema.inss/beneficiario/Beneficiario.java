package beneficiario;

public abstract class Beneficiario {
    private String cpf;
    private String nome;
    private double aposentadoria;

    public Beneficiario(String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
        this.aposentadoria = calcularAposentadoria();
    }

    public abstract double calcularAposentadoria();

    @Override
    public String toString(){
      return "Nome: " + this.nome + "\n" + "Cpf: " + this.cpf + "\n" + "Aposentadoria: " + this.aposentadoria;
    }
}
