package ru.lesson1;

public class BankAccount implements Account {
    private double balance;

    public void put(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Счет пополнен " + amount + ".");
        } else {
            System.out.println("Ошибка");
        }
    }
    public void take(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Снято средств - " + amount + ".");
        } else {
            System.out.println("Ошибка");
        }
    }
    @Override
    public double getAmount()
    {
        System.out.println("На счету средств - " + balance + ".");
        return balance;
    }

}
