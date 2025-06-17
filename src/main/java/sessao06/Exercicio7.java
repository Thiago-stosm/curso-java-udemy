package sessao06;

import javax.swing.JOptionPane;
import java.util.*;

/*Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".*/

public class Exercicio7 {
    public static void main (String [] args){

        int n = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de repetições..."));
        int n2 = n;
        List <Double> divisoes = new ArrayList<>();
        do{
            double a;
            double b;
            double divisao;

            for(int i = 0; i<n; i++){
                a = Double.parseDouble(JOptionPane.showInputDialog
                        (String.format("Iteração %d \n Insira o primeiro valor: ", i+1)));
                b = Double.parseDouble(JOptionPane.showInputDialog
                        (String.format("Iteração %d \n Insira o segundo valor: ", i+1)));

                if(b == 0){

                    while(b==0){
                        JOptionPane.showMessageDialog(null, "Divisão impossível!");
                        b = Double.parseDouble(JOptionPane.showInputDialog
                                (String.format("Iteração %d \n Insira o segundo valor: ", i+1)));
                    }
                }

              divisao = a/b;
                divisoes.add(divisao);
                JOptionPane.showMessageDialog(null,String.format("Valor da divisão: %.2f", divisao));
            }

            n--;

        }while (n > 0);
        for (int y = 0; y < n2; y++){
            JOptionPane.showMessageDialog(null, String.format("Divisão %d\n Valor: %.2f", y+1, divisoes.get(y)));
        }
    }
}
