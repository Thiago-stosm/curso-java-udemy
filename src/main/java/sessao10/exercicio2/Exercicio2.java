package sessao10.exercicio2;

import javax.swing.JOptionPane;
import java.util.*;
/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor*/

public class Exercicio2 {
    public static void main (String [] args){

        int N;
        double sum = 0;
        double avg = 0;

        while(true){
            N = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro maior do que 0:"));
            if(N > 0){
                break;
            }

            else{
                JOptionPane.showMessageDialog(null, "Digite um número inteiro maior do que 0");
            }
        }

        double[] vector = new double[N]; //Por que usar esse "int"?

        for(int i = 0; i < N; i+=1){
            double x = Double.parseDouble(JOptionPane.showInputDialog("Digite um número real"));
            vector[i] = x;
            sum += x;
        }

        avg = sum/N;

        JOptionPane.showMessageDialog(null, ("Valores: "));
        for (int i = 0; i < N; i+=1){
            JOptionPane.showMessageDialog(null, vector[i]);
        }
        JOptionPane.showMessageDialog(null, String.format("Soma dos valores: %f \n " +
                "Média dos Valores: %f", sum, avg));
    }
}
