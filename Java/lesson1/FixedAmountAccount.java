package ru.gb.lesson1;

public class FixedAmountAccount extends AbstractAccount {
    public FixedAmountAccount(double balance) {
        super(balance);
    }

    @Override
    public void put(double amount) {
        // Не изменяем баланс
    }

    @Override
    public void take(double amount) {
        // Не изменяем баланс
    }
}