package sessao10.exercicio3.Main;

import sessao10.exercicio3.entities.Pessoa;

import java.util.*;

public class Main {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Quantas pessoas serão digitadas?");
            int N  = sc.nextInt();
            sc.nextLine();

            int idadeMenores16 = 0;
            double alturaSum = 0;
            Pessoa[] p = new Pessoa[N];

            for (int i = 0; i < N; i+=1){

                System.out.printf("Dados da pessoa %d:\n", i+1);

                System.out.println("Nome:");
                String nome = sc.next();

                System.out.println("Idade:");
                int idade = sc.nextInt();
                if (idade < 16){
                    idadeMenores16+=1;
                }

                System.out.println("Altura:");
                double altura = sc.nextDouble();
                alturaSum+=altura;

                Pessoa pN = new Pessoa(nome, idade, altura);

                p[i] = pN;
            }

            System.out.printf("Altura média: %.2f \n", (alturaSum/N));
            System.out.printf("Pessoas com menos de 16 anos: %.2f\n",((((double)idadeMenores16)*100)/N));
            for (int i = 0; i < N; i+=1){
                if (p[i].getIdade() < 16){
                    System.out.println(p[i].getNome());
                }
            }
    }
}
