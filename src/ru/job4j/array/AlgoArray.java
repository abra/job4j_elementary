package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int temp = 0;

        for (int i = 1; i < array.length; i++) {
            int x = i;

            for (int j = i - 1; (i != array.length) && (array[j] > array[i]); i++) {
                temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
            i = x;
        }
    }
}
