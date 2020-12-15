package beneficiario.publico;

public class ServicoPublico extends BeneficiarioPublico{
    private double mediaSalarial;

    public ServicoPublico(String cpf, String nome, double mediaSalarial){
        super(cpf, nome);
        this.mediaSalarial = mediaSalarial;
    }

    @Override
    public String calcularAposentadoria() {
        return String.format("%.2f", 0.8 * this.mediaSalarial);
    }

    @Override
    public String calcularContribuicao() {
        return String.format("%.2f", 0.14 * this.mediaSalarial);
    }
}
