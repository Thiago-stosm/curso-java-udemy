package revisao.sessao10.exercicio1;

//Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
//e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        do{
            System.out.print("Enter the quantity of values that will be entered: ");
            n = sc.nextInt();
        }while(n<0 || n>10);

        //vector declaration
        int[] vector = new int[n];

        for(int i = 0; i<n; i++){
            System.out.printf("Enter the value number %d: ", i+1);
            vector[i] = sc.nextInt();
        }

        System.out.print("Negative values Print\n");
        for(int i = 0; i<n; i++){
            if (vector[i] < 0){
               System.out.println(vector[i]);
            }
        }
    }
}
