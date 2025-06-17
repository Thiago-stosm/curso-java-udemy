package sessao06;

import java.util.Scanner;
import javax.swing.JOptionPane;

/*Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).*/

public class Exercicio4 {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos números inteiros serão inseridos"));

        int in = 0;
        int out = 0;

        for(int i = 0; i < n; i++){
            int x = Integer.parseInt(JOptionPane.showInputDialog(String.format("Insira o valor %d", i)));
            if (x >= 10 &&  x<= 20){
                in++;
            }
            else{
                out++;
            }
        }

        JOptionPane.showMessageDialog(null,String.format("%d : in \n %d : out", in, out));
    }
}
