package sessao04;

import java.util.Scanner;

/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).*/

public class Exercicio3 {
    public static void main (String [] args){

        // Instanciação do Scanner
        Scanner sc = new Scanner(System.in);

        // Entrada dos dados
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        // Processamento
        int resultado = (a * b) - (c * d);

        // Saída de dados
        System.out.printf("Diferença = %d", resultado);
    }
}
