package sessao05;

import javax.swing.JOptionPane;

/*Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.*/

public class Exercicio1 {
    public static void main(String [] args){

        boolean negativo;
        // Entrada
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));

        // Condicional
        if (a < 0){
            negativo = true;
            JOptionPane.showMessageDialog(null, "Negativo");
        }else{
            negativo = false;
            JOptionPane.showMessageDialog(null, "Positivo");
        }
    }
}
