package ru.job4j.ru.job4j.calculator;

public class ArgMethod {
    public static void hello(String name, int age) {
        System.out.println("Hello, " + name);
        System.out.println("Your age is " + age);
    }

    public static void main(String[] args) {
        String name = "Aydar Khabibullin";
        int age = 33;

        ArgMethod.hello(name, age);
    }
}
