package sessao05;

import javax.swing.JOptionPane;

/*Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar*/
public class Exercicio2 {
    public static void main (String [] args){
        //Entrada de dados
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        //Condicional --> verifica se é ímpar ou par
        if (a%2 == 0){
            JOptionPane.showMessageDialog(null,"Par");
        }
        else{
            JOptionPane.showMessageDialog(null, "Ímpar");
        }
    }
}
