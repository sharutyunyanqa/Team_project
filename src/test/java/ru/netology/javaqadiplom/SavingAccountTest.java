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

<<<<<<< HEAD

    @Test
    public void shouldTestYearChange() {
        SavingAccount account = new SavingAccount(200, 100, 1000, 15);
        int expected = 30;
        int actual = account.yearChange();
        Assertions.assertEquals(expected, actual);
=======
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
>>>>>>> ac77dedc4153df3583c8d4fe20cc06bab6e2cad2
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
<<<<<<< HEAD
=======


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
    public void percentBalanceRemainingTwo() {
        SavingAccount account = new SavingAccount(
                11_000,
                1_000,
                10_000,
                15
        );
        account.yearChange();

        Assertions.assertEquals(0, account.yearChange());
    }

    @Test
    public void shouldTestExceptionsForSavingAccountMinBalance() {
        SavingAccount account = new SavingAccount(500, -100, 10000, 3);

        Assertions.assertThrows(IllegalArgumentException.class, () ->account.getMinBalance());{
        };
    }
    @Test
    public void shouldTestExceptionsForSavingAccountMaxBalance() {
        SavingAccount account = new SavingAccount(1000, 1000, 100, 3);

        Assertions.assertThrows(IllegalArgumentException.class, () -> account.getMaxBalance());{
        };
    }
    @Test
    public void shouldTestExceptionsForSavingAccountInitialBalanceLessMin() {
        SavingAccount account = new SavingAccount(500, 1000, 11000, 3);

        Assertions.assertThrows(IllegalArgumentException.class, () -> account.getBalance ()); {
        };
    }
    @Test
    public void shouldTestExceptionsForSavingAccountInitialBalanceMoreMax() {
        SavingAccount account = new SavingAccount(50000, 1000, 11000, 3);

        Assertions.assertThrows(IllegalArgumentException.class, () -> account.getBalance ()); {
        };
    }
    @Test
    public void shouldTestExceptionsForSavingAccountRate() {
        SavingAccount account = new SavingAccount(1500, 1000, 11000, -1);

        Assertions.assertThrows(IllegalArgumentException.class, () -> account.getRate ()); {
        };
    }
>>>>>>> ac77dedc4153df3583c8d4fe20cc06bab6e2cad2
}




