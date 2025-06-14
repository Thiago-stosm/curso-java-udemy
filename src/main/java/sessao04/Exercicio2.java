package sessao04;

import java.util.Scanner;
/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.*/

public class Exercicio2 {
    public static void main(String [] args){

    // Declaração da variável para uso de Pi
    double pi =  3.14159;

    // Entrada de dados e processamento
    Scanner sc = new Scanner(System.in);
    double raio = sc.nextDouble();
    double area = (pi * (Math.pow(raio, 2)));

    // Saída de dados
    System.out.printf("A área do círculo em questão é igual a: A = %.4f", area);
    }
}
