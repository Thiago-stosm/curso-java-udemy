package sessao06;

import javax.swing.JOptionPane;

/*Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.*/
public class Exercicio7 {
    public static void main (String [] args){
        int x = Integer.parseInt(JOptionPane.showInputDialog("Insira o número inteiro que resultará no fatorial..."));
        long sum = 1;

        for(int y = (x); y != 1; y--){
            sum = sum*y;
        }
        System.out.println(sum);
    }
}
