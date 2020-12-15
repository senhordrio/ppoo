package beneficiario;

public abstract class Beneficiario {
    private String cpf;
    private String nome;

    public Beneficiario(String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
    }

    public abstract String calcularAposentadoria();

    @Override
    public String toString(){
      return "Nome: " + this.nome + "\n" + "Cpf: " + this.cpf + "\n" + "Aposentadoria: " + calcularAposentadoria();
    }
}
