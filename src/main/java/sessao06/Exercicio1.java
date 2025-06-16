package sessao06;

import java.util.Scanner;

public class Exercicio1 {
    public static void main (String [] args){
        
        Scanner sc = new Scanner(System.in);
        // Validação de senha
        int senha = 2002;
        int num = 0;
        while (num != senha){
            num = sc.nextInt();
            if (senha != num){
                System.out.println("Senha incorreta!");
            }
            }
        }
    }

