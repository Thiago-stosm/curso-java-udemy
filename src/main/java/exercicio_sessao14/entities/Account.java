package exercicio_sessao14.entities;

import exercicio_sessao14.exceptions.DomainException;

import static java.lang.IO.println;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account (Integer number, String holder, Double balance, Double withdrawLimit){
        this.number = number;
        this.holder = holder;
        this.withdrawLimit = withdrawLimit;
        this.balance = balance;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(Double amount){
        this.balance += amount;
    }
    public void withdraw(Double amount){
        validateWithdraw(amount);
        this.balance-=amount;
    }
    private void validateWithdraw(double amount){
        if (!(getBalance()>amount)){
            throw new DomainException("withdraw error: Not enough balance");
        }
        if (!(getWithdrawLimit()>amount)){
            throw new DomainException("withdraw error: The amount exceeds withdraw limit");
        }
    }
}
