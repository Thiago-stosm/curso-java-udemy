package exercicio_sessao14.application;

import exercicio_sessao14.entities.Account;
import sessao14.model.exceptions.DomainException;

import java.util.Scanner;

import static java.lang.IO.print;
import static java.lang.IO.println;

public class Program {
    void main () {

        Scanner sc = new Scanner(System.in);

        println("Enter account data");
        println("Number: ");
        int number = sc.nextInt();
        println("Holder: ");
        String holder = sc.next();
        println("Initial balance: ");
        double initialBalance = sc.nextDouble();
        println("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();

        Account account = new Account(number, holder, initialBalance, withdrawLimit);

        println();
        println("Enter amount for withdraw: ");

        try {
            account.withdraw(sc.nextDouble());
            println("New balance: " + account.getBalance());
            sc.close();
        }catch(DomainException e){
            print(e.getMessage());
        }
    }
}
