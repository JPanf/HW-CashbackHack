package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldShow500remainIfAmount500() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(500);
        int expected = 500;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldShow0remainIfAmount1000() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldShow15remainIfAmount50985() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(50985);
        int expected = 15;
        assertEquals(expected, actual);
    }
}