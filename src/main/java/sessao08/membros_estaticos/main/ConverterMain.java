package sessao08.membros_estaticos.main;

import sessao08.membros_estaticos.entities.CurrencyConverter;
import java.util.*;

public class ConverterMain {

    public static void main (String [] args){

        CurrencyConverter converter = new CurrencyConverter();
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price?");
        converter.quotePrice = sc.nextDouble();

        System.out.println("How many dollars will be bought?");
        converter.purchaseValue = sc.nextDouble();

        converter.showResults(converter.purchaseValue, converter.quotePrice);

    }
}
