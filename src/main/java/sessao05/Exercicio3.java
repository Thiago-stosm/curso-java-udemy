package sessao05;

import javax.swing.JOptionPane;

/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.*/

public class Exercicio3 {
    public static void main (String [] args){

        int a = Integer.parseInt(JOptionPane.showInputDialog
                ("Insira o primeiro valor inteiro: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog
                ("Insira o primeiro valor inteiro: "));

        if (a%b == 0 || b%a == 0){
            JOptionPane.showMessageDialog(null, "Múltiplos");
        }
        else{
            JOptionPane.showMessageDialog(null, "Não múltiplos");
        }
    }
}

