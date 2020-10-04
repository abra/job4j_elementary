package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean numberIsPrime = true;

        for (int i = number; i >= 1; i--) {
            if ((number == 1) || ((i != number) && (i != 1) && (number % i == 0))) {
                numberIsPrime = false;
                break;
            }
        }

        return numberIsPrime;
    }
}
