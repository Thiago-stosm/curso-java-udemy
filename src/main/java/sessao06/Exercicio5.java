package sessao06;

import javax.swing.JOptionPane;
import java.util.*;

/*Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.*/

public class Exercicio5 {

    public static void main(String [] args){

        int n = Integer.parseInt(JOptionPane.showInputDialog("Insira quantos testes serão realizados..."));
        int n2 = n;
        List<Double> medias = new ArrayList<>();

        do{
            double primeiraNota = 0;
            double segundaNota = 0;
            double terceiraNota = 0;
            double media;
            for(int i = 0; i < 3; i++){
                double x = Double.parseDouble(JOptionPane.showInputDialog(String.format("Insira o valor da prova %d...", i+1)));
                    switch(i){
                        case 0:
                            x *= 2;
                            primeiraNota = x;
                            break;
                        case 1:
                            x *= 3;
                            segundaNota = x;
                            break;
                        case 2:
                            x *= 5;
                            terceiraNota = x;
                            break;
                    }
            }
            media = (primeiraNota + segundaNota + terceiraNota)/10;
            medias.add(media);
            n--;

        }while(n != 0);
        for (int y = 0; y < n2; y++){
            JOptionPane.showMessageDialog(null, String.format("Teste %d\n Média: %.2f", y + 1, medias.get(y)));
        }
    }
}
