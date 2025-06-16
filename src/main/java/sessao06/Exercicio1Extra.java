package sessao06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio1Extra {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        int senha = 2002;
        int num = 0;

        while(num != senha){
            System.out.println("Digite uma senha!");
            
            try{
                num = sc.nextInt();

                if (num != senha){
                    System.out.println("Senha digitada = incorreta");
                }
            }
            catch (InputMismatchException error){
                System.out.println("Digite apenas números inteiros");
            }
        }
        System.out.println("Senha digitada = correta");
        sc.close();
    }
}
