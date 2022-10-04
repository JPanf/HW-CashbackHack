package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackTest {

    @Test
    void shouldReturn100ifAmount900 (){
        CashbackHackService cashbackHackService = new CashbackHackService();

        int actual = cashbackHackService.remain(190);
        int expected = 810;

        assertEquals (actual, expected);
    }

    @Test
    void shouldReturn0ifAmount1000(){
        CashbackHackService cashbackHackService = new CashbackHackService();

        int actual = cashbackHackService.remain(1000);
        int expected = 0;

        assertEquals (actual, expected);

    }
}
