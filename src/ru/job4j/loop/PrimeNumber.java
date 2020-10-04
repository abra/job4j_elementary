package ru.job4j.loop;

public class PrimeNumber {
    public static int countPrimeNumbers(int number) {
        int count = 0;

        for (int i = 2; i <= number; i++) {
            if (CheckPrimeNumber.check(i)) {
                count++;
            }
        }

        return count;
    }
}
