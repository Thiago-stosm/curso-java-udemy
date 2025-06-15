package sessao05;

import javax.swing.JOptionPane;

public class Exercicio5 {
    public static void main (String [] args){

        double valor = 0;
        double total;

        int id = Integer.parseInt
                (JOptionPane.showInputDialog("Insira o código do produto: "));

        int qtd = Integer.parseInt
                (JOptionPane.showInputDialog("Insira o quantidade do produto: "));

        switch (id){
            case 1:
                valor = 4.00;
                break;
            case 2:
                valor = 4.50;
                break;
            case 3:
                valor = 5.00;
                break;
            case 4:
                valor = 2.00;
                break;
            case 5:
                valor = 1.50;
                break;
            default:
                JOptionPane.showMessageDialog
                        (null, "Id inválido");
                return;
        }

        total = valor * qtd;

        JOptionPane.showMessageDialog
                (null, String.format("Total: R$%.2f", total));
    }
}
