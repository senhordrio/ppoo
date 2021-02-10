package exercicios;

import java.util.Scanner;

public class Carrinho {
    private String cliente;
    private String[] carrinho;
    private int dia;
    private int mes;
    private int ano;
    private int contadorItens;

    public Carrinho(String cliente, int dia, int mes, int ano) {
        this.cliente = cliente;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        carrinho = new String[5];
        contadorItens = 0;
    }

    public Carrinho(String cliente, int dia, int mes, int ano, int qtdProdutos) {
        this.cliente = cliente;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        carrinho = new String[qtdProdutos];
        contadorItens = 0;
    }

    public String getCliente() {
        return cliente;
    }

    public void inserirItem(String produto) {
        carrinho[contadorItens] = produto;
        contadorItens++;
    }

    public void exibir() {
        System.out.println("Cliente: "+ this.cliente);
        System.out.print("Data da compra: ");
        System.out.printf("%d/%d/%d", this.dia, this.mes, this.ano);
        System.out.println();
        System.out.print("Itens do carrinho: ");
        int i = 0;
        while(i < carrinho.length){
            System.out.print(carrinho[i]);
            System.out.print(" ");
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nomeCliente = entrada.next();
        int dia = entrada.nextInt();
        int mes = entrada.nextInt();
        int ano = entrada.nextInt();
        Carrinho carrinho = new Carrinho(nomeCliente, dia, mes, ano);
        int i = 0;
        while (i < 5){
            carrinho.carrinho[i] = entrada.next();
            i++;
        }
        carrinho.exibir();
        System.out.println();
        nomeCliente = entrada.next();
        dia = entrada.nextInt();
        mes = entrada.nextInt();
        ano = entrada.nextInt();
        int qtdProdutos = entrada.nextInt();
        Carrinho carrinho2 = new Carrinho(nomeCliente, dia, mes, ano, qtdProdutos);
        i = 0;
        while (i < qtdProdutos){
            carrinho2.carrinho[i] = entrada.next();
            i++;
        }
        carrinho2.exibir();
        entrada.close();
    }
}