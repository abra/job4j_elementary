package ru.job4j.loop;

public class Board {
    public static void paintBoard(int width, int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paintBoard(3, 3);
        System.out.println();
        paintBoard(4, 4);
    }
}

