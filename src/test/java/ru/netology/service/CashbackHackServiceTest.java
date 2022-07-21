package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void calculateCashback1() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int amount = 900;
        int remain = service.remain(amount);

        assertEquals(expected, remain);
    }

    @Test
    public void calculateCashback2() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int amount = 1000;
        int remain = service.remain(amount);

        assertEquals(expected, remain);
    }

}