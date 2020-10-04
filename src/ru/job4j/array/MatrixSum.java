package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int sumOfArray = 0;
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                sumOfArray += array[row][cell];
            }
        }
        return sumOfArray;
    }
}
