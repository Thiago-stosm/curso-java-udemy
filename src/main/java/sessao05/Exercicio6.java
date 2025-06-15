package sessao05;

import javax.swing.JOptionPane;

public class Exercicio6 {
    public static void main (String [] args){

        double num = Double.parseDouble
                (JOptionPane.showInputDialog("Insira um valor"));

        if  (num >= 0 && num <= 25){
            JOptionPane.showMessageDialog
                    (null, "Intervalo (0, 25)");
        }
        else if  (num > 25 && num <= 50){
            JOptionPane.showMessageDialog
                    (null, "Intervalo (25, 50)");
        }
        else if  (num > 50 && num <= 75){
            JOptionPane.showMessageDialog
                    (null, "Intervalo (50, 75)");
        }
        else if  (num > 75 && num <= 100){
            JOptionPane.showMessageDialog
                    (null, "Intervalo (75, 100)");
        }
        else{
            JOptionPane.showMessageDialog
                    (null, "Fora do intervalo");
        }
    }
}