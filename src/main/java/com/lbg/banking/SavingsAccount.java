package com.lbg.banking;

public class SavingsAccount {
    private long balance;
    private long minimumBalance;
    private String accountHolderName;

    public SavingsAccount(long balance, long minimumBalance, String accountHolderName){
        this.balance = balance;
        this.minimumBalance = minimumBalance;
        this.accountHolderName = accountHolderName;
    }

    public SavingsAccount(){};

    @Override
    public String toString() {
        return super.toString();
    }
}
