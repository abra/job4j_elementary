package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void whenMan187Then100() {
        short in = 187;
        float expected = 100;
        float out = Fit.calcManWeight(in);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void whenMan177Then88() {
        short in = 177;
        float expected = 88.5f;
        float out = Fit.calcManWeight(in);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void whenWoman165Then63() {
        short in = 165;
        float expected = 63.2f;
        float out = Fit.calcWomanWeight(in);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void whenWoman162Then59() {
        short in = 162;
        float expected = 59.8f;
        float out = Fit.calcWomanWeight(in);
        Assert.assertEquals(expected, out, 0.1);
    }
}