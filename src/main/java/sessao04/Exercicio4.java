package sessao04;

import java.util.Scanner;

/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.*/

public class Exercicio4 {
    public static void main (String [] args){

        // Entrada de dados
        Scanner sc = new Scanner(System.in);
        int numFunc = sc.nextInt();
        int hrsTrabalhadas = sc.nextInt();
        double valorHora = sc.nextDouble();

        // Processamento
        double salario = hrsTrabalhadas * valorHora;

        // Saída de dados (Imprime salário do funcionário)
        System.out.printf("IDfunc: %d Horas trabalhadas: %d Salário: %.2f", numFunc, hrsTrabalhadas, salario  );

    }
}
