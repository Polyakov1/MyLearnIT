package ru.lesson1;
//* 2. Создать несколько наследников.
//   * - Кредитный счет (CreditAccount)
//   * Особенность: на каждое снятие нужно наложить комиссию в размере 1% от суммы снятия.
//   * То есть, если снимаем 100 у.е., то снять нужно 101.
public class CreditAccount extends BankAccount{

    @Override
    public void take(double amount) {
        double commission = amount * 0.01;
        super.take(amount + commission);
        System.out.println("Комиссия составила " + commission + ".");
    }
}

