package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {

    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public int depositMoney(int amount) {
        return balance += amount;
    }

    public int withdrawMoney(int amount) {
        if (balance - amount < 0) {
            return balance;
        }

        return balance -= amount;
    }
}
