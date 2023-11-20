package ru.lesson1;
import java.time.LocalDate;
//* - Депозитный счет (DepositAccount) *
//   * Особенность: нельзя снимать средства чаще, чем раз в месяц.
//   * То есть, нужно завести поле с датой последнего снятия, и использовать его.
//   * (Для дат лучше использовать LocalDate, пример в классе Dates в проекте урока)
public class DepositAccount extends BankAccount {

    private LocalDate lastWithdrawalDate;

    @Override
    public void take(double amount) {
        if (lastWithdrawalDate == null || LocalDate.now().isAfter(lastWithdrawalDate.plusMonths(1))) {
            super.take(amount);
            lastWithdrawalDate = LocalDate.now();
        } else {
            System.out.println("Только раз в месяц можно снимать средства");
        }
    }
}