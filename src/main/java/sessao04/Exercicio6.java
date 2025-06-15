package sessao04;

import java.util.Scanner;

/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.*/

public class Exercicio6 {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double pi =  3.14159;

        // Triângulo retângulo A(base) e C(altura)
        double triangulo = (a * c)/2;

        // Círculo
        double circulo = pi*(Math.pow(c,2));

        // Trapézio
        double trapezio = ((a + b)*c)/2;

        // Quadrado
        double quadrado = Math.pow(b,2);

        // Retângulo
        double retangulo = a * b;

        System.out.printf("TRIANGULO: %.3f\n", triangulo);
        System.out.printf("CIRCULO: %.3f\n", circulo);
        System.out.printf("TRAPEZIO: %.3f\n", trapezio);
        System.out.printf("QUADRADO: %.3f\n", quadrado);
        System.out.printf("RETANGULO: %.3f\n", retangulo);
    }
}
