package beneficiario.privado;

import beneficiario.Beneficiario;

public final class IniciativaPrivada extends Beneficiario {
    private int percentualINSS;

    public IniciativaPrivada(String cpf, String nome, int porcentagem) {
        super(cpf, nome);
        this.percentualINSS = porcentagem;
    }

    @Override
    public final String calcularAposentadoria() {
        return String.format("%.2f", (double)percentualINSS/100 * 5645.80);
    }

}
