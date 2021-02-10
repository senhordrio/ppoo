package beneficiario.publico;

import beneficiario.Beneficiario;

public final class ServicoPublico extends Beneficiario implements BeneficiarioPublico{
    private double mediaSalarial;

    public ServicoPublico(String cpf, String nome, double mediaSalarial){
        super(cpf, nome);
        this.mediaSalarial = mediaSalarial;
    }

    @Override
    public final double calcularAposentadoria() {
        return 0.8 * this.mediaSalarial;
    }

    @Override
    public final double calcularContribuicao() {
        return 0.14 * this.mediaSalarial;
    }

    @Override
    public String toString(){
        return super.toString() + "\n" + "Contribuicao INSS: " + String.format("%.2f", calcularContribuicao());
    }
}
