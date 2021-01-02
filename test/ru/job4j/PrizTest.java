package ru.job4j;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PrizTest {
    @Test
    public void wayIs5() {
        int way = Priz.checkGame(6, 7, 8);
        assertThat(way, is(34));

    }
}