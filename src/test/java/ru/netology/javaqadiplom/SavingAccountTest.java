package ru.netology.javaqadiplom;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SavingAccountTest {

    @Test
    public void shouldAddThanMoreMaxBalance() {
        SavingAccount account = new SavingAccount(
                8_000,
                1_000,
                10_000,
                5
        );

        account.add(3_000);

        Assertions.assertEquals(8_000, account.getBalance());
    }

    @Test
    public void shouldAddThanMaxBalance() {
        SavingAccount account = new SavingAccount(
                1_000,
                1_000,
                10_000,
                5
        );

        account.add(9_000);

        Assertions.assertEquals(9_000 + 1_000, account.getBalance());
    }

    @Test
    public void shouldAddLessThanMaxBalance() {
        SavingAccount account = new SavingAccount(
                1_000,
                1_000,
                10_000,
                5
        );

        account.add(1_000);

        Assertions.assertEquals(1_000 + 1_000, account.getBalance());
    }

    @Test
    public void shouldAddLessThanMaxBalanceTwo() {
        SavingAccount account = new SavingAccount(
                8_000,
                1_000,
                10_000,
                5
        );

        account.add(1_000);

        Assertions.assertEquals(8_000 + 1_000, account.getBalance());
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
    public void reduceBalanceAfterPayTwo() {
        SavingAccount account = new SavingAccount(
                10_000,
                1_000,
                10_000,
                5
        );

        account.pay(1_000);

        Assertions.assertEquals(9_000, account.getBalance());
    }

    @Test
    public void reduceBalanceAfterPayThree() {
        SavingAccount account = new SavingAccount(
                9_000,
                1_000,
                10_000,
                5
        );

        account.pay(1_000);

        Assertions.assertEquals(8_000, account.getBalance());
    }


    @Test
    public void percentBalanceRemaining() {
        SavingAccount account = new SavingAccount(
                200,
                200,
                10_000,
                15
        );
        account.yearChange();

        Assertions.assertEquals(30, account.yearChange());
    }

    @Test
    public void percentBalanceRemainingTwo() {
        SavingAccount account = new SavingAccount(
                9_999,
                200,
                10_000,
                15
        );
        account.yearChange();

        Assertions.assertEquals(1499, account.yearChange());
    }

    @Test
    public void percentBalanceRemainingThree() {
        SavingAccount account = new SavingAccount(
                201,
                200,
                10_000,
                11
        );
        account.yearChange();

        Assertions.assertEquals(22, account.yearChange());
    }

    @Test
    public void shouldTestExceptionsForSavingAccountMinBalance() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            SavingAccount account = new SavingAccount(500, -100, 10000, 3);
        });
    }

    @Test
    public void shouldTestExceptionsForSavingAccountMaxBalance() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            SavingAccount account = new SavingAccount(10001, 100, 10000, 3);
        });
    }

    @Test
    public void shouldTestExceptionsForSavingAccountInitialBalanceLessMin() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            SavingAccount account = new SavingAccount(50, 100, 15000, 5);
        });
    }

    @Test
    public void shouldTestExceptionsForSavingAccountInitialBalanceMoreMax() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            SavingAccount account = new SavingAccount(16000, 100, 15000, 5);
        });
    }

    @Test
    public void shouldTestExceptionsForSavingAccountRate() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            SavingAccount account = new SavingAccount(16000, 100, 15000, -1);
        });
    }
}





