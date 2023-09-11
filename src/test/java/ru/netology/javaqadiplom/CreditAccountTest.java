package ru.netology.javaqadiplom;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreditAccountTest {

    @Test
    public void shouldAddToPositiveBalance() {
        CreditAccount account = new CreditAccount(
                0,
                5_000,
                15
        );

        account.add(3_000);

        Assertions.assertEquals(3_000, account.getBalance());
    }

    @Test
    public void shouldTestExceptionsRate() {


        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            CreditAccount account = new CreditAccount(1000, 500, -5);
        });
    }



    @Test
    public void shouldTestRatePositive() {
        CreditAccount account = new CreditAccount(1000, 500, 10);

        Assertions.assertEquals(10, account.getRate());
    }

    @Test
    public void shouldTestRateZero() {
        CreditAccount account = new CreditAccount(1000, 500, 0);

        Assertions.assertEquals(0, account.getRate());
    }

    @Test
    public void shouldTestExceptionsForCreditLimitNegative() {


        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            CreditAccount account = new CreditAccount(1000, -10, 3);
        });
    }

    @Test
    public void shouldTestCreditLimitPositive() {
        CreditAccount account = new CreditAccount(0, 500, 3);

        Assertions.assertEquals(500, account.getCreditLimit());
    }

    @Test
    public void shouldTestCreditLimitZero() {
        CreditAccount account = new CreditAccount(0, 0, 3);

        Assertions.assertEquals(0, account.getCreditLimit());
    }

    @Test
    public void shouldTestBalanceNegative() {


        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            CreditAccount account = new CreditAccount(-100, 500, 3);
        });
    }


    @Test
    public void shouldTestBalanceZero() {
        CreditAccount account = new CreditAccount(0, 500, 3);
        int expected = 0;
        int actual = account.getBalance();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldTestBalancePositive() {
        CreditAccount account = new CreditAccount(100, 500, 3);
        int expected = 100;
        int actual = account.getBalance();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldTestPayPositive() {
        CreditAccount account = new CreditAccount(100, 200, 10);
        account.pay(200);
        int expected = -100;
        int actual = account.getBalance();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestPayPositiveLimitMin() {
        CreditAccount account = new CreditAccount(100, 200, 10);
        account.pay(299);
        int expected = -199;
        int actual = account.getBalance();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestPayPositiveLimitZero() {
        CreditAccount account = new CreditAccount(100, 200, 10);
        account.pay(300);
        int expected = -200;
        int actual = account.getBalance();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestPayNegativeBalance() {
        CreditAccount account = new CreditAccount(100, 200, 10);
        account.pay(301);
        int expected = 100;
        int actual = account.getBalance();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestPayNegativeAnswer() {
        CreditAccount account = new CreditAccount(100, 200, 10);
        boolean expected = false;
        boolean actual = account.pay(301);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldTestPayWrongParam() {
        CreditAccount account = new CreditAccount(100, 200, 10);

        boolean expected = false;
        boolean actual = account.pay(-100);
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldTestPayWrongParamZero() {
        CreditAccount account = new CreditAccount(100, 200, 10);

        boolean expected = false;
        boolean actual = account.pay(0);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldTestAmountPositive() {
        CreditAccount account = new CreditAccount(100, 200, 10);
        account.add(200);
        int expected = 300;
        int actual = account.getBalance();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestAmountZero() {
        CreditAccount account = new CreditAccount(100, 200, 10);

        boolean expected = false;
        boolean actual = account.add(0);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestAmountNegative() {
        CreditAccount account = new CreditAccount(100, 200, 10);

        boolean expected = false;
        boolean actual = account.add(-10);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestYearChange() {
        CreditAccount account = new CreditAccount(100, 200, 10);
        int expected = 0;
        int actual = account.yearChange();
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldTestYearChangeZero() {
        CreditAccount account = new CreditAccount(0, 200, 10);
        int expected = 0;
        int actual = account.yearChange();
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldTestYearChangeNegative() {
        CreditAccount account = new CreditAccount(0, 200, 10);
        account.pay(100);
        int expected = -10;
        int actual = account.yearChange();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldTestYearChangeDouble() {
        CreditAccount account = new CreditAccount(0, 200, 3);
        account.pay(75);
        int expected = -2;
        int actual = account.yearChange();
        Assertions.assertEquals(expected, actual);
    }
}