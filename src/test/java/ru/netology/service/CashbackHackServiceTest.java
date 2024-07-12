package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturn100IfAmountIs900() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn0IfAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int expected = 1000;
//        int amount = 1000;  //if I do this, the test will crash, because in
//        int expected = 0;   //assertEquals "actual" is replaced by "expected"
//                            //according to the terms of the task

        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
}
