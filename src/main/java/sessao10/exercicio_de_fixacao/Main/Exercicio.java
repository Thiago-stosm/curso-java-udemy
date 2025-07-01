package sessao10.exercicio_de_fixacao.Main;

import sessao10.exercicio_de_fixacao.Entities.Quarto;

import java.util.Scanner;

public class Exercicio{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rooms = 0;
        while(true){
            System.out.println("How many rooms will be ranted? ");
            rooms = sc.nextInt();
            if (rooms >= 1 && rooms < 10){
                break;
            }
            System.out.println("Is just possible enter a digit between 1 and 10 ");
            sc.nextLine();
        }

        Quarto[] quartos = new Quarto[10];

        for(int i = 0; i < rooms; i++){

            Quarto quarto = new Quarto();

            System.out.println("Name: ");
            quarto.setName(sc.nextLine());

            System.out.println("Email: ");
            quarto.setEmail(sc.nextLine());

            while(true){
                System.out.println("Rooms digit: ");
                int x = sc.nextInt();
                x-=1;
                if (x >= 0 && x <= 10 && quartos[x] == null){
                        quarto.setIndex(x);
                        break;
                }
                else{
                    System.out.println("Invalid input");
                }
            }
            quartos[quarto.getIndex()] = quarto;
        }
        int counter = 1;
        for(int i = 0; i < quartos.length; i++){
            if (quartos[i] != null){
                System.out.printf("Rent #%d: ", counter);
                System.out.println(quartos[i].getName());
                System.out.println(quartos[i].getEmail());
                System.out.println(quartos[i].getIndex()+1);
                counter++;
            }
        }
    }
}
