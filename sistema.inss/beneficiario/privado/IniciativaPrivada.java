package beneficiario.privado;

import beneficiario.Beneficiario;

public final class IniciativaPrivada extends Beneficiario {
    private int percentualINSS;
    private static final double TETOINSS = 5645.80;

    public IniciativaPrivada(String cpf, String nome, int porcentagem) {
        super(cpf, nome);
        this.percentualINSS = porcentagem;
    }

    @Override
    public final double calcularAposentadoria() {
        return (double)percentualINSS/100 * TETOINSS;
    }

}
