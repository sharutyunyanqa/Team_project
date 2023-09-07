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

    //    @Test
//    public void shouldTestYearChange(){
//        SavingAccount account= new SavingAccount(200,100,1000,15);
//        int expected= 30;
//        int actual= account.yearChange();
//        Assertions.assertEquals(expected,actual);
//    }
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
}
