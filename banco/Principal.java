package banco;

import java.util.Scanner;

public class Principal {
    private static Scanner entrada = new Scanner(System.in);
    private static AplicacaoFinanceira ap = new AplicacaoFinanceira(0);

    public static void main(String[] args) {
        System.out.println("###### SIMULACÃO ######");
        System.out.print("Entre com o valor a ser investido: ");
        double valor = entrada.nextDouble();
        System.out.print("Entre com a duração da aplicação em meses: ");
        int meses = entrada.nextInt();
        investimentoEmPoupanca(valor, meses);
        System.out.println();
        investimentoEmCDB(valor, meses);
        System.out.println();
        investimentoEmAcao(valor, meses);
    }

    public static void investimentoEmPoupanca(double valor, int meses) {
        System.out.println("1 - Investimento em poupança");
        System.out.print("Entre com o valor da taxa Selic em %: ");
        double selic = entrada.nextDouble();
        System.out.print("Entre com o valor da taxa referencial (TR) em %: ");
        double tr = entrada.nextDouble();
        Poupanca poupanca = new Poupanca(valor, selic, tr);
        poupanca.simulaPoupanca(meses);
    }

    public static void investimentoEmCDB(double valor, int meses) {
        System.out.println("2 - Investimento em CDB");
        System.out.print("Entre com o valor da taxa CDI em %: ");
        double cdi = entrada.nextDouble();
        CDB cdb = new CDB(valor, cdi);
        cdb.simulaCDB(meses);
    }

    public static void investimentoEmAcao(double valor, int meses) {
        System.out.println("3 - Investimento em ação");
        System.out.print("Entre com o preço inicial da ação: ");
        double pInicial = entrada.nextDouble();
        System.out.print("Entre com o preço final da ação: ");
        double pFinal = entrada.nextDouble();
        Acao acao = new Acao(valor, pInicial, pFinal);
        acao.simulaAcao(meses);
    }
}
