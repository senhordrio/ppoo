package beneficiario.publico;

public class ForcasArmadas extends BeneficiarioPublico {
    private double ultimoSalario;

    public ForcasArmadas(String cpf, String nome, double ultimoSalario){
        super(cpf, nome);
        this.ultimoSalario = ultimoSalario;
    }

    @Override
    public final String calcularAposentadoria() {
        return String.format("%.2f", 0.9 * this.ultimoSalario);
    }

    @Override
    public final String calcularContribuicao() {
        return String.format("%.2f", 0.11 * this.ultimoSalario);
    }
}
