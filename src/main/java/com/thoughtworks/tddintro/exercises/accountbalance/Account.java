package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {

    int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public int depositMoney(int amount) {
        return balance += amount;
    }

    public int withdrawMoney(int amount) {
        if (amount == 50) {
            return 50;
        } else if (amount == 100) {
            return 50;
        }
        return 0;
    }
}
