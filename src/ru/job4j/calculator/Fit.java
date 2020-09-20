package ru.job4j.calculator;

public class Fit {
    public static float calcManWeight(short height) {
        return (height - 100) * 1.15f;
    }

    public static float calcWomanWeight(short height) {
        return (height - 110) * 1.15f;
    }

    public static void main(String[] args) {
        short manHeight = 177;
        float man = Fit.calcManWeight(manHeight);
        System.out.println("Man " + manHeight + " is " + man);

        short womanHeight = 162;
        float woman = Fit.calcWomanWeight(womanHeight);
        System.out.println("Woman " + womanHeight + " is " + woman);
    }
}
