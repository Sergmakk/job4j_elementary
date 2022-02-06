package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subAnddiv(double first, double second) {
        return sub(first, second)
                + div(first, second);
    }

    public static double subdivsumMultiply(double first, double second) {
        return sub(first, second)
                + div(first, second)
                + multiply(first, second)
                + sum(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + subAnddiv(10, 20));
        System.out.println("Результат расчета равен: " + subdivsumMultiply(10, 20));
    }
}
