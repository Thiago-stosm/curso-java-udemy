package sessao06;
import java.util.InputMismatchException;
import java.util.Scanner;

// Álcool = 1, Gasolina = 2, Diesel = 3, Fim = 4 
/*Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo. */
public class Exercicio2 {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        int num = 0;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        while(num != 4){
            try{
                System.out.println("\nDigite o número do combustível ou 4 para encerrar");
                num = sc.nextInt();
                switch(num){
                    case 1:
                        alcool += 1;
                        break;
                    case 2:
                        gasolina += 1;
                        break;
                    case 3:
                        diesel += 1;
                        break;  
                    default:
                        System.out.println("\"Digite um valor válido (inteiro entre 1 e 4");
                }
    
            }catch(InputMismatchException e){
                System.out.println("Digite um valor válido (inteiro entre 1 e 4)");
                sc.nextLine();
            }
        }
        System.out.println("MUITO OBRIGADO!");
        System.out.printf("Álcool: %d", alcool);
        System.out.printf("\nGasolina: %d", gasolina);
        System.out.printf("\nDiesel: %d", diesel);
    }
}
