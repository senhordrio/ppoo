import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner entrada = new Scanner(System.in);
        double entradaDiaria = 0;
        int entradaDias = 0;
        Veiculo veiculo;
        while(opcao != 4){
            System.out.println("#### LOCADORA DE VEICULOS ####");
            System.out.println("1 - Gerar nota para veículo de passeio");
            System.out.println("2 - Gerar nota para veículo de carga");
            System.out.println("3 - Gerar nota para veículo de passageiros");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();
            switch(opcao){
                case 1:
                    System.out.println("Entre com o valor da diaria: ");
                    entradaDiaria = entrada.nextDouble();
                    System.out.println("Entre com a quantidade de dias: ");
                    entradaDias = entrada.nextInt();
                    veiculo = new Veiculo(new VeiculoPasseio());
                    System.out.println("===================== Nota Fiscal =============================");
                    System.out.println("Valor a ser pago: R$"+ String.format("%,.2f", veiculo.calcularValorLocacao(entradaDiaria, entradaDias)));
                    System.out.println("===============================================================");
                    break;
                case 2:
                    int opcaoCabine;
                    boolean isCabineSimples = true;
                    do{
                        System.out.println("Qual a cabine deseja? Digite 1 para simples ou 2 para dupla: ");
                        opcaoCabine = entrada.nextInt();
                        if(opcaoCabine == 1) isCabineSimples = true;
                        else if(opcaoCabine == 2) isCabineSimples = false;
                        else System.out.println("Esta opção não existe! Verifique e digite novamente.");
                    }while(opcaoCabine > 2);
                    System.out.println("Entre com o valor da diaria: ");
                    entradaDiaria = entrada.nextDouble();
                    System.out.println("Entre com a quantidade de dias: ");
                    entradaDias = entrada.nextInt();
                    veiculo = new Veiculo(new VeiculoCarga(isCabineSimples));
                    System.out.println("===================== Nota Fiscal =============================");
                    System.out.println("Valor a ser pago: R$"+ String.format("%,.2f", veiculo.calcularValorLocacao(entradaDiaria, entradaDias)));
                    System.out.println("===============================================================");
                    break;
                case 3:
                    int capacidade;
                    System.out.println("Digite um número que conrresponda a capacidade do veículo:");
                    capacidade = entrada.nextInt();
                    System.out.println("Entre com o valor da diaria: ");
                    entradaDiaria = entrada.nextDouble();
                    System.out.println("Entre com a quantidade de dias: ");
                    entradaDias = entrada.nextInt();
                    veiculo = new Veiculo(new VeiculoPassageiros(capacidade));
                    System.out.println("===================== Nota Fiscal =============================");
                    System.out.println("Valor a ser pago: R$"+ String.format("%,.2f", veiculo.calcularValorLocacao(entradaDiaria, entradaDias)));
                    System.out.println("===============================================================");
                    break;
                case 4:
                    System.out.println("Obrigado por utilizar nossos serviços!");
                    break;
                default:
                    System.out.println("Esta opção não existe! Verifique e digite novamente.");
                    break;
            }
        }
        entrada.close();
    }
}