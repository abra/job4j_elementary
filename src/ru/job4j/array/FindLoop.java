package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int i : data) {
            if (i == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }
}
