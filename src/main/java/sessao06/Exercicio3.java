package sessao06;

import java.util.*;

/*Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
X, se for o caso.*/ 
public class Exercicio3 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro...");
        int x = sc.nextInt();

        for(int i = 1; i <= x; i+=2){
            if (i%2 != 0){
                System.out.println(i);
            }
        }
    }
}
