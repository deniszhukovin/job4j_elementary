package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {
    @Test
    public void whenP6K2() {
        int expected = 2;
        int p = 6;
        int k = 2;
        double out = SqArea.sqarea(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP24K3() {
        int expected = 27;
        int p = 24;
        int k = 3;
        double out = SqArea.sqarea(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP28K6() {
        int expected = 24;
        int p = 28;
        int k = 6;
        double out = SqArea.sqarea(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}