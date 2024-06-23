package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int z) {
        return z - x;
    }

    public int divide(int a) {
        return a / x;
    }

    public int sumAllOperation(int a) {
        return sum(a) + minus(a) + divide(a);
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        System.out.println(result);

        int minus = Calculator.minus(1);
        System.out.println(minus);

        Calculator calculator = new Calculator();

        int divide = calculator.divide(10);
        System.out.println(divide);

        int sumAllOperation = calculator.sumAllOperation(5);
        System.out.println(sumAllOperation);
    }
}