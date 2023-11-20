package ru.lesson1;

public class Homework {
    public static void main(String[] args) {


        BankAccount accountAlexey = new BankAccount(); // 1. Создать Account.
        accountAlexey.put(1000); // Пополнить его на X рублей.
        accountAlexey.getAmount();//Проверить, что на счету X рублей.
        System.out.println();
        accountAlexey.take(500); //Снять с него Y рублей
        accountAlexey.getAmount();//Проверить, что на счету X-Y рублей.

        System.out.println();
        System.out.println();

        CreditAccount creditAlexey = new CreditAccount();//Создать CreditAccount.
        creditAlexey.put(100);//Пополнить его на X рублей.
        creditAlexey.take(90);// Снять с него Y рублей.
        creditAlexey.getAmount();//Проверить, что на счету X - 1.01*Y рублей.
        System.out.println();
        System.out.println();


        DepositAccount depAlexey = new DepositAccount(); //4. ** Протестировать DepositAccount. Тест-кейсы придумать самостоятельно.
        depAlexey.put(1000);
        depAlexey.take(333);
        depAlexey.take(333);
        depAlexey.getAmount();


    }
}
