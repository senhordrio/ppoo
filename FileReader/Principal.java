import arquivo.*;
import compra.HistoricoDeCompras;

import java.util.Scanner;
import java.io.File;

public class Principal {

  public static void main(String[] args) {

    int opcao = 0;
    Scanner entrada = new Scanner(System.in);
    String cpf = null;
    HistoricoDeCompras hc = new HistoricoDeCompras();
    ManipuladoraArquivos ma = new ManipuladoraArquivos();
    System.out.println("Digite uma opção:");
    System.out.println("1 - Carregar dados de arquivo texto;");
    System.out.println("2 - Carregar dados de arquivo binario;");
    opcao = entrada.nextInt();
    if (opcao == 1) {
      System.out.println("Lendo arquivo texto...");
      hc = ma.lerAquivoTexto("dadosTexto.txt");
    } else if (opcao == 2) {
      File f = new File("dadosBinarios.dat");
      if (f.exists()) {
        System.out.println("Lendo arquivo binário...");
        hc = ma.lerArquivoBinario("dadosBinarios.dat");
      } else {
        System.out.println("Arquivo não existe! Encerraremos o programa.");
        opcao = 6;
      }
    } else {
      System.out.println("Opção inexistente. Encerraremos o programa.");
      opcao = 6;
    }
    while (opcao != 6 && hc != null) {
      System.out.println("Digite uma opção:");
      System.out.println("1 - Carregar dados de arquivo texto;");
      System.out.println("2 - Carregar dados de arquivo binario;");
      System.out.println("3 - Gerar relatorio na tela;");
      System.out.println("4 - Salvar relatorio em arquivo de texto;");
      System.out.println("5 - Gerar arquivo binario a partir do arquivo texto;");
      System.out.println("6 - Sair;");
      opcao = entrada.nextInt();
      switch (opcao) {
        case 1:
          System.out.println("Lendo arquivo texto...");
          hc = ma.lerAquivoTexto("dadosTexto.txt");
          break;
        case 2:
          System.out.println("Lendo arquivo binário...");
          hc = ma.lerArquivoBinario("dadosBinarios.dat");
          break;
        case 3:
          System.out.println("Digite o cpf do cliente: ");
          entrada = new Scanner(System.in);
          cpf = entrada.nextLine();
          hc.imprimeComprasPorCPF(cpf);
          break;
        case 4:
          System.out.println("Digite o cpf do cliente para gerar o relatório: ");
          entrada = new Scanner(System.in);
          cpf = entrada.nextLine();
          ma.GeraRelatorioArquivoTexto(hc, cpf);
          break;
        case 5:
          System.out.println("Gerando arquivo binário...");
          ma.GeraArquivoBinario(hc, "dadosBinarios.dat");
          break;
        case 6:
          System.out.println("Encerrando...");
          break;
        default:
          System.out.println("Opção não encontrada!");
          break;
      }
    }
    entrada.close();
  }
}