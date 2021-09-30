package com.example.task_8_JUnit;

public class RunCalculator {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        double result1 = calculator.multiply(3, 3);

        int result2 = calculator.subtract(4, 2);

        double result3 = calculator.divide(3, 0);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

}
