package sessao10.exercicio1;

import java.util.*;
import javax.swing.JOptionPane;

/*Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. */
public class Exercicio1 {
    public static void main (String [] args){

        int N;
        while(true){
            N = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro entre 1 e 10..."));
            if (N >= 1 && N <=10){
                break;
            }
            else{
                JOptionPane.showMessageDialog(null, "O número precisa ser um inteiro entre 1 e 10");
            }
        }

        int[] vector = new int[N];
        for(int i=0; i < N; i+=1){
            int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
            vector[i] = x;
        }

        JOptionPane.showMessageDialog(null, "Números Negativos");
        for(int i=0; i < N; i+=1){
            if(vector[i] < 0){
                JOptionPane.showMessageDialog(null, vector[i]);
            }
        }
    }
}
