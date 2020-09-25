package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        return n <= 1 ? 1 : n * calc(n - 1);
    }
}
