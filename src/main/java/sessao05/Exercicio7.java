package sessao05;

import javax.swing.JOptionPane;

// Verificar o quadrante de dois pontos

public class Exercicio7 {
    public static void main (String [] args){
        // Entrada dos dados (ponto x e y)
        double x = Double.parseDouble
                (JOptionPane.showInputDialog("Insira do valor de 'x':"));
        double y = Double.parseDouble
                (JOptionPane.showInputDialog("Insira do valor de 'y':"));
        // Definição dos quadrantes
        if (x>0 && y>0){
            JOptionPane.showMessageDialog(null, "primeiro quadrante");
        }
        else if (x < 0 && y > 0){
            JOptionPane.showMessageDialog(null, "segundo quadrante");
        }
        else if (x < 0 && y < 0){
            JOptionPane.showMessageDialog(null, "terceiro quadrante");
        }
        else if (x > 0 && y < 0){
            JOptionPane.showMessageDialog(null, "quarto quadrante");
        }
        else if (x == 0 && y == 0){
            JOptionPane.showMessageDialog(null, "origem");
        }
    }
}
