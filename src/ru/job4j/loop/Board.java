package ru.job4j.loop;

public class Board {
    public static void paintBoard(int width, int height) {
        String even;
        String odd;

        for (int i = 1; i <= height; i++) {
            if (i % 2 == 0) {
                even = "x";
                odd = " ";
            } else {
                even = " ";
                odd = "x";
            }

            for (int j = 1; j <= width; j++) {
                if (j % 2 == 0) {
                    System.out.print(even);
                } else {
                    System.out.print(odd);
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

