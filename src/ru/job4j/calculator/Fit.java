package ru.job4j.calculator;

public class Fit {
    public static double calcManWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double calcWomanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short manHeight = 187;
        double man = Fit.calcManWeight(manHeight);
        System.out.println("Man " + manHeight + " is " + man);

        short womanHeight = 165;
        double woman = Fit.calcWomanWeight(womanHeight);
        System.out.println("Woman " + womanHeight + " is " + woman);
    }
}
