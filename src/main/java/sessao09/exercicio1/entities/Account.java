package sessao09.exercicio1.entities;

import java.util.*;

public class Account {

    // Atributos da classe com modificadores privados
    private final int ACCOUNT_NUMBER;
    private String accountHolder;
    private double balance;

    public Account(int ACCOUNT_NUMBER, String accountHolder){ //Construtor caso o usuário não deposite nenhum valor
        this.ACCOUNT_NUMBER = ACCOUNT_NUMBER;
        this.accountHolder = accountHolder;
    }

    public Account(int ACCOUNT_NUMBER, String accountHolder, double balance){ //Construtor com saldo inicial
        this.ACCOUNT_NUMBER = ACCOUNT_NUMBER;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    //Getters e Setters
    public int getACCOUNT_NUMBER(){
        return this.ACCOUNT_NUMBER;
    }
    public void setAccountHolder(String accountHolder){
        this.accountHolder = accountHolder;
    }
    public String getAccountHolder(){
        return accountHolder;
    }
    public double getBalance(){
        return balance;
    }

    //Métodos especiais
    public void withdrawal(double amount){//Saque
        this.balance = this.balance - amount - 5;
    }
    public void deposit(double amount){
        this.balance = this.balance + amount;
    }
    public String toString(){
        return "Account Number: " + getACCOUNT_NUMBER() + "\n" +
                "Account Holder: " + accountHolder + "\n" +
                "Account Balance: $" + String.format("%.2f", getBalance());
    }

}
