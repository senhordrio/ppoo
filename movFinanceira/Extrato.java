package movFinanceira;

import java.util.ArrayList;

public class Extrato {
    private ArrayList<MovimentacaoFinanceira> movFinanceira;

    public Extrato() {
        this.movFinanceira = new ArrayList<MovimentacaoFinanceira>();
    }

    public void registraEmExtrato(MovimentacaoFinanceira mf){
        movFinanceira.add(mf);
    }
}
