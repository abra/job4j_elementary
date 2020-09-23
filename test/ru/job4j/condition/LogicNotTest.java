package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class LogicNotTest {

    @Test
    public void isEven() {
        LogicNot l = new LogicNot();
        assertThat(l.isEven(2), is(true));
        assertThat(l.isEven(7), is(false));
    }

    @Test
    public void isPositive() {
        LogicNot l = new LogicNot();
        assertThat(l.isPositive(-1), is(false));
        assertThat(l.isPositive(8), is(true));
    }

    @Test
    public void notEven() {
        LogicNot l = new LogicNot();
        assertThat(l.notEven(1), is(true));
        assertThat(l.notEven(7), is(true));
        assertThat(l.notEven(4), is(false));
    }

    @Test
    public void notPositive() {
        LogicNot l = new LogicNot();
        assertThat(l.notPositive(2), is(false));
        assertThat(l.notPositive(-1), is(true));
        assertThat(l.notPositive(-9), is(true));
    }

    @Test
    public void notEvenAndPositive() {
        LogicNot l = new LogicNot();
        assertThat(l.notEvenAndPositive(2), is(false));
        assertThat(l.notEvenAndPositive(7), is(true));
        assertThat(l.notEvenAndPositive(-4), is(false));
    }

    @Test
    public void evenOrNotPositive() {
        LogicNot l = new LogicNot();
        assertThat(l.evenOrNotPositive(2), is(true));
        assertThat(l.evenOrNotPositive(-3), is(true));
        assertThat(l.evenOrNotPositive(1), is(false));
    }
}