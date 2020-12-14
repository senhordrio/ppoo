package beneficiario.publico;

import beneficiario.Beneficiario;

public abstract class BeneficiarioPublico extends Beneficiario{
    private double contribuicaoINSS;

    public BeneficiarioPublico(String cpf, String nome){
        super(cpf, nome);
        this.contribuicaoINSS = calcularContribuicao();
    }

    public abstract double calcularContribuicao();

    @Override
    public String toString(){
      return super.toString() + "\n" + "Contribuicao INSS: " + this.contribuicaoINSS;
    }
}
