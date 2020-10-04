package ru.job4j.loop;

public class Slash {
    public static void draw(int size) {
        boolean numberIsOdd = size % 2 != 0;

        if (numberIsOdd) {
            System.out.println("Draw by " + size);

            int index = size - 1;

            for (int row = 0; row < size; row++) {
                for (int column = 0, right = index - row; column  < size; column++) {
                    if (column == row || column == right) {
                        System.out.print("o");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("Only an odd number!");
        }
    }

    public static void main(String[] args) {
        draw(3);
        draw(5);
    }
}
