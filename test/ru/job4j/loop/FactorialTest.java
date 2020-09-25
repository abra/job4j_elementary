package ru.job4j.loop;

import org.junit.Test;
import ru.job4j.Calculator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int result = Factorial.calc(5);
        int expected = 120;
        assertThat(result, is(expected));
    }

    @Test
    public void whenCalculateFactorialForEightThen40320() {
        int result = Factorial.calc(8);
        int expected = 40320;
        assertThat(result, is(expected));
    }
}