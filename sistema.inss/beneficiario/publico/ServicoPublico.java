package beneficiario.publico;

public class ServicoPublico extends BeneficiarioPublico{
    private double mediaSalarial;

    public ServicoPublico(String cpf, String nome, double mediaSalarial){
        super(cpf, nome);
        this.mediaSalarial = mediaSalarial;
    }

    @Override
    public double calcularAposentadoria() {
        return 0.8 * this.mediaSalarial;
    }

    @Override
    public double calcularContribuicao() {
        return 0.14 * this.mediaSalarial;
    }

}
