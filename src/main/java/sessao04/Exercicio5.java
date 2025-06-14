package sessao04;

import java.util.Scanner;

/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago*/

public class Exercicio5 {
    public static void main (String [] args){

        // Entrada de dados
        Scanner sc = new Scanner(System.in);
        int peca1 = sc.nextInt();
        double valorP1 = sc.nextDouble();
        int peca2 = sc.nextInt();
        double valorP2 = sc.nextDouble();

        // Processamento
        double valor = (peca1 * valorP1) + (peca2 + valorP2);

        // Saída de dados
        System.out.printf("Valor a pagar: R$%f", valor);
    }
}
