package sessao08.exercicio3;

import java.util.*;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Student duck = new Student();

        System.out.println("Digite o nome do aluno: ");
        duck.name = sc.nextLine();

        System.out.println("Digite a nota do primeiro trimestre: ");
        duck.grade1 = sc.nextDouble();

        System.out.println("Digite a nota do segundo trimestre: ");
        duck.grade2 = sc.nextDouble();

        System.out.println("Digite a nota do terceiro trimestre: ");
        duck.grade3 = sc.nextDouble();

        double finalGrade = duck.finalGrade(duck.grade1, duck.grade2, duck.grade3);

        if (finalGrade >= 60){
            duck.pass = true;
            System.out.printf("FINAL GRADE: %.2f\nPASS", finalGrade);
        }else{
            System.out.printf("FINAL GRADE: %.2f\nFAILED\nMISSING %.2f", finalGrade, (60 - finalGrade));
        }
    }
}
