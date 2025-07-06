package sessao10.exercicio_proposto_matrizes;

import java.util.*;

public class Main {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the matrix length of columns and rows: ");
        int columns = sc.nextInt();
        int rows = sc.nextInt();
        int[][] matrix = new int[rows][columns];

        // In this scenario im entering the values of each line in the matrix
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.printf("Enter the integer of the column %d, line %d", i, j);
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the digit that u wanna now the numbers around him: ");
        int number =  sc.nextInt();

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if (matrix[i][j] == number){
                    System.out.println("Position: " + i + ", " + j);

                    System.out.println("Up: " + matrix[i-1][j]);

                    System.out.println("Down: " + matrix[i+1][j]);

                    System.out.println("Right: " + matrix[i][j+1]);

                    System.out.println("Left: " + matrix[i][j-1]);
                }
            }
        }
    }
}
