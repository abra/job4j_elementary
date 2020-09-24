package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SwitchWeekTest {

    @Test
    public void whenDay1() {
        SwitchWeek weekDay = new SwitchWeek();
        String dayName = weekDay.nameOfDay(1);
        assertThat(dayName, is("Понедельник"));
    }
}