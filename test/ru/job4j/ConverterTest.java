package ru.job4j;

import org.junit.Assert;

import static org.junit.Assert.*;

public class ConverterTest {

    @org.junit.Test
    public void whenConvert140rubleThen2Eur() {
      int in = 140;
      int expected = 2;
      int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @org.junit.Test
    public void whenConvert120Then2Dlr() {
        int in = 120;
        int expected = 2;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }
}