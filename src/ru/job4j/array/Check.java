package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean ref = data[0];

        for (int i = 0; i < data.length; i++) {
            if (data[i] != ref) {
                result = false;
                break;
            }
        }

        return result;
    }
}
