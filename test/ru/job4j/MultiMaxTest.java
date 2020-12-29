package ru.job4j;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MultiMaxTest {

    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }
    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(14, 4, 2);
        assertThat(result, is(14));
    }
    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(1, 4, 52);
        assertThat(result, is(52));
    }

}