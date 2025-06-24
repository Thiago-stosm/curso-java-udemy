package sessao08.membros_estaticos.entities;

import java.util.*;

/*Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser
comprado por uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares,
considerando ainda que a pessoa terá de pagar 6% de IOF sobre o valor do dólar.
Criar uma classe CurrencyConverter para ser responsável pelos cálculos*/

public class CurrencyConverter {

    public double quotePrice;
    public double purchaseValue;
    public static final double IOF = 0.06;

    public static double amountPaid(double purchaseValue, double quotePrice){
        return purchaseValue * quotePrice + (1 + IOF);
    }

    public static void showResults(double purchaseValue, double quotePrice){
        System.out.printf("Amount to be paid in reais:" + amountPaid(purchaseValue, quotePrice));
    }
}
