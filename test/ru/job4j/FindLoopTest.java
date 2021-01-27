package ru.job4j;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindLoopTest {
    @Test
    public void whenArrayHas10Then0() {
        int[] input = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int value = 10;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHas5Then() {
        int[] input = {5, 4, 3, 2};
        int value = 7;
        int result = FindLoop.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
}


