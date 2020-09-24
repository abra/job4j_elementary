package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int max = first > second ? first : second;
        max = max > third ? max : third;
        return max;
    }
}
