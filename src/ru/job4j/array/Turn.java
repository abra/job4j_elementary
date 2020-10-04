package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int lastIndex = array.length - 1;
        int temp = 0;

        for (int i = 0, j = lastIndex; i < array.length / 2; i++, j = lastIndex - i) {
           temp = array[i];
           array[i] = array[j];
           array[j] = temp;
        }

        return array;
    }
}
