package beneficiario.publico;

import beneficiario.Beneficiario;

public final class ForcasArmadas extends Beneficiario implements BeneficiarioPublico{
    private double ultimoSalario;

    public ForcasArmadas(String cpf, String nome, double ultimoSalario){
        super(cpf, nome);
        this.ultimoSalario = ultimoSalario;
    }

    @Override
    public final double calcularAposentadoria() {
        return 0.9 * this.ultimoSalario;
    }

    @Override
    public final double calcularContribuicao() {
        return 0.11 * this.ultimoSalario;
    }

    @Override
    public String toString(){
        return super.toString() + "\n" + "Contribuicao INSS: " + String.format("%.2f", calcularContribuicao());
    }
}
