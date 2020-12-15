package beneficiario.publico;

import beneficiario.Beneficiario;

public abstract class BeneficiarioPublico extends Beneficiario{

    public BeneficiarioPublico(String cpf, String nome){
        super(cpf, nome);
    }

    public abstract String calcularContribuicao();

    public abstract String calcularAposentadoria();

    @Override
    public String toString(){
      return super.toString() + "\n" + "Contribuicao INSS: " + calcularContribuicao();
    }
}
