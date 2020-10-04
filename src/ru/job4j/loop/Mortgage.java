package ru.job4j.loop;

public class Mortgage {
    public static int numberOfYears(double amount, double salary, double percent) {
        int years = 0;

        while (amount > 0) {
            amount = amount * ((percent + 100) / 100) - salary;
            years++;
        }

        return years;
    }
}
