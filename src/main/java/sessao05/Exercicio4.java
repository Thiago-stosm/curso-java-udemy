package sessao05;

/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.*/

import javax.swing.*;

public class Exercicio4 {
    public static void main(String [] args){

            int ref;
            int inicio = Integer.parseInt
                    (JOptionPane.showInputDialog("Insira o horário do início do jogo: "));
            int fim = Integer.parseInt
                    (JOptionPane.showInputDialog("Insira o horário do fim do jogo: "));

            if (inicio == fim){
                ref = 24;
            }
            else if (inicio > fim){
                ref = (24 - inicio) + fim;
            }
            else{
                ref = fim - inicio;
        }
        JOptionPane.showMessageDialog
                (null, String.format("DURAÇÃO: %d HRS", ref));
    }
}
