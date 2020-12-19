package beneficiario;

public abstract class Beneficiario {
    private String cpf;
    private String nome;

    protected Beneficiario(String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
    }

    public abstract double calcularAposentadoria();

    public String getCpf(){
      return this.cpf;
    }

    public String getNome(){
      return this.nome;
    }

    @Override
    public String toString(){
      return "Nome: " + getNome() + "\n" + "Cpf: " + getCpf() + "\n" + "Aposentadoria: " + String.format("%.2f", calcularAposentadoria());
    }
}
