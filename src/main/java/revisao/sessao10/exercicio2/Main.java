package revisao.sessao10.exercicio2;

/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int n ;

        // Enter validation
        while(true){
            try{
                System.out.print("Enter the quantity of numbers that will be entered: ");
                n = sc.nextInt();
                break;
            }catch(InputMismatchException e){
                System.out.print("Enter a valid number...\n");
                sc.nextLine();
            }
        }
        double[] vector = new double[n];

        for(int i=0; i<n; i++){
            System.out.printf("Enter the value number %d:", i+1);
            double x = sc.nextDouble();
            vector[i] = x;
         }
        // Now we have the length of our list, the next step is finish the logic
        System.out.print("Values:");
        for (double e: vector){
            System.out.print(e);
        }

        System.out.print("Sum: ");
        double x = 0;
        for (int i = 0; i < vector.length; i++){
            x += vector[i];
        }
        System.out.print(x);

        System.out.print("\nAverage: ");
        System.out.printf("%.2f", (x/vector.length));

    }
}
