package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {
    @Test
    public void when2to2then2() {
        int expected = 37;
        int x1 = 5;
        int x2 = 9;
        int y1 = 45;
        int y2 = 8;
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void when3to2then2() {
        double expected = 18.02;
        int x1 = 13;
        int x2 = 7;
        int y1 = 12;
        int y2 = 29;
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}