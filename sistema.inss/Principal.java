import beneficiario.Beneficiario;
import beneficiario.privado.*;
import beneficiario.publico.*;
import folha.FolhaPagamento;


public class Principal {

    public static void main(String[] args) {
        FolhaPagamento fp = new FolhaPagamento();
        Beneficiario ben;
        //Cadastro de beneficiários
        ben = new IniciativaPrivada("123.456.789-0","Tamara",90);
        fp.cadastrarBeneficiario(ben);
        ben = new ServicoPublico("987.654.321-0","Chico",12000.0);
        fp.cadastrarBeneficiario(ben);
        ben = new ForcasArmadas("234.567.890-1","Bento",15000.0);
        fp.cadastrarBeneficiario(ben);   
        //TESTES: adicionando mais outros beneficiarios
        ben = new IniciativaPrivada("133.452.789-7","Seu Jorge",50);
        fp.cadastrarBeneficiario(ben); 
        ben = new ServicoPublico("987.123.321-0","Jorge Benjor",22000.0);
        fp.cadastrarBeneficiario(ben);
        ben = new ForcasArmadas("994.567.890-1","Benedito Ruy Barbosa",1000.0);
        fp.cadastrarBeneficiario(ben);
        //Geração da folha de pagamentos
        fp.gerarFolhaPagamento();  
    }   
}
