package beneficiario.privado;

import beneficiario.Beneficiario;

public class IniciativaPrivada extends Beneficiario {
    private int percentualINSS;

    public IniciativaPrivada(String cpf, String nome, int porcentagem) {
        super(cpf, nome);
        this.percentualINSS = porcentagem;
    }

    @Override
    public double calcularAposentadoria() {
        return percentualINSS * 5645.80;
    }
}
