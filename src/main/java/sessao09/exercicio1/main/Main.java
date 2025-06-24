package sessao09.exercicio1.main;

import sessao09.exercicio1.entities.Account;

import java.util.*;

public class Main {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        Account account;
        final int ACCOUNT_NUMBER;
        String accountHolder;
        String initialDeposit;
        double balance;

        // Fase 1: Criação da Conta
        System.out.println("Enter Account Number: ");
        ACCOUNT_NUMBER = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Account Holder:");
        accountHolder = sc.nextLine();

        System.out.println("Is there a Initial Deposit?(y/n)");
        initialDeposit = sc.nextLine();

        if (initialDeposit.equalsIgnoreCase("y")){
            System.out.println("Enter initial Deposit Value: ");
            balance = sc.nextDouble();
            account = new Account(ACCOUNT_NUMBER, accountHolder, balance);
            System.out.print(account);
        }
        else {
            account = new Account(ACCOUNT_NUMBER, accountHolder);
            System.out.print(account);
        }

        // Fase 2: Saques e depósitos
        System.out.println("\nEnter a Deposit Value: ");
        balance = sc.nextDouble();
        account.deposit(balance);
        System.out.println("Updated Account Data: ");
        System.out.print(account);

        System.out.println("\nEnter a Withdraw Value: ");
        balance = sc.nextDouble();
        account.withdrawal(balance);
        System.out.println("Updated Account Data: ");
        System.out.print(account);

        sc.close();

        //Correções: comparações de STRING sem o equalsIgnoreCase, limpeza do buffer do Scanner, escopo do objeto
    }
}
