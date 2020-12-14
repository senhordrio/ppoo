package beneficiario.publico;

public class ForcasArmadas extends BeneficiarioPublico {
    private double ultimoSalario;

    public ForcasArmadas(String cpf, String nome, double ultimoSalario){
        super(cpf, nome);
        this.ultimoSalario = ultimoSalario;
    }

    @Override
    public double calcularAposentadoria() {
        return 0.9 * this.ultimoSalario;
    }

    @Override
    public double calcularContribuicao() {
        return 0.11 * this.ultimoSalario;
    }
}
