package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFrom1To10Then30() {
        int result = Counter.sumByEven(1,10);
        int expected = 30;
        assertThat(result, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFrom5To8Then14() {
        int result = Counter.sumByEven(5,8);
        int expected = 14;
        assertThat(result, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFrom11To13Then12() {
        int result = Counter.sumByEven(11,13);
        int expected = 12;
        assertThat(result, is(expected));
    }
}