package folha;

import java.util.ArrayList;
import java.util.List;

import beneficiario.Beneficiario;

public class FolhaPagamento {
    private List<Beneficiario> listaBeneficiarios;

    public FolhaPagamento(){
        this.listaBeneficiarios = new ArrayList<Beneficiario>();
    }

    public void cadastrarBeneficiario(Beneficiario b){
        listaBeneficiarios.add(b);
    }

    public void gerarFolhaPagamento(){
       for(Beneficiario b: listaBeneficiarios){
           System.out.println(b);
       }
    }
}
