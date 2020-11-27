package exercicios;
import java.util.Scanner;

public class Investimento {
    public static void main(String[] args) {
        int cont = 0;
        double invJoao, invPedro;
        Scanner entrada = new Scanner(System.in);

        invJoao = entrada.nextFloat();
        invPedro = entrada.nextFloat();

        while (invJoao < invPedro) {
            invJoao *= 1.025;
            invPedro *= 1.005;
            cont += 1;
        }
        System.out.println(cont);
        entrada.close();
    }
}