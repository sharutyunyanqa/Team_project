package ru.netology.javaqadiplom;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SavingAccountTest {

    @Test
    public void shouldAddLessThanMaxBalance() {
        SavingAccount account = new SavingAccount(
                2_000,
                1_000,
                10_000,
                5
        );

        account.add(3_000);

        Assertions.assertEquals(2_000 + 3_000, account.getBalance());
    }

    @Test
    public void shouldAddMoreThanMaxBalance() {
        SavingAccount account = new SavingAccount(
                7_000,
                1_000,
                10_000,
                5
        );

        account.add(3_000);

        Assertions.assertEquals(7_000, account.getBalance());
    }

    @Test
    public void reduceBalanceAfterPay() {
        SavingAccount account = new SavingAccount(
                2_000,
                1_000,
                10_000,
                5
        );

        account.pay(1_000);

        Assertions.assertEquals(2_000 - 1_000, account.getBalance());
    }

    @Test
    public void reduceBalanceAfterPayMoreBalance() {
        SavingAccount account = new SavingAccount(
                2_000,
                1_000,
                10_000,
                5
        );

        account.pay(3_000);

        Assertions.assertEquals(2_000, account.getBalance());
    }

    @Test
    public void percentBalanceRemaining() {
        SavingAccount account = new SavingAccount(
                200,
                1_000,
                10_000,
                15
        );
        account.yearChange();

        Assertions.assertEquals(30, account.yearChange());
    }

    @Test
    public void shouldTestExceptionsForSavingAccount() {
        SavingAccount account = new SavingAccount(500, -100, 1000, 3);

        Assertions.assertEquals(0, account.getMaxBalance());
    }
}
