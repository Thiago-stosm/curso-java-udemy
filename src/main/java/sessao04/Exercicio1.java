package sessao04;


import java.util.Scanner;
// Exercícios básicos para treino de lógica

public class Exercicio1 {

    public static void main(String [] args) {
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       int y = sc.nextInt();
       int resultado = x + y;
       System.out.printf("SOMA: %d", resultado);
    }
}