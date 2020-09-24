package ru.job4j.condition;

import java.lang.*;

public class MultipleSwitchWeek {
    public int numberOfDay(String dayName) {
        return switch (dayName) {
            case "Понедельник", "Monday" -> 1;
            case "Вторник", "Tuesday" -> 2;
            case "Среда", "Wednesday" -> 3;
            case "Четверг", "Thursday" -> 4;
            case "Пятница", "Friday" -> 5;
            case "Суббота", "Saturday" -> 6;
            case "Воскресенье", "Sunday" -> 7;
            default -> 0;
        };
    }
}
