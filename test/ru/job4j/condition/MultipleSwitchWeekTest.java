package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MultipleSwitchWeekTest {

    @Test
    public void whenFridayInEnglishThen5() {
        MultipleSwitchWeek msw = new MultipleSwitchWeek();
        int weekDayNumber = msw.numberOfDay("Пятница");
        assertThat(weekDayNumber, is(5));
    }

    @Test
    public void whenTuesdayInRussianThen2() {
        MultipleSwitchWeek msw = new MultipleSwitchWeek();
        int weekDayNumber = msw.numberOfDay("Вторник");
        assertThat(weekDayNumber, is(2));
    }

    @Test
    public void whenUnknownDayThen0() {
        MultipleSwitchWeek msw = new MultipleSwitchWeek();
        int weekDayNumber = msw.numberOfDay("abc");
        assertThat(weekDayNumber, is(0));
    }
}