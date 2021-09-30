package com.example.task_8_JUnit;

public class Calculator {

    public static double multiply(double firstNumber, double secondNumber) {
        if (firstNumber > 0 && firstNumber <= 100 && secondNumber > 0 && secondNumber <= 100) {
            return firstNumber * secondNumber;
        }

        return 0.0;
    }

    public static int subtract(int firstNumber, int secondNumber) {
        if (firstNumber > 0 && secondNumber > 0 && firstNumber > secondNumber) {
            return firstNumber - secondNumber;
        }

        return -1;
    }

    public static double divide(double numberToBeDivided, double divisor) throws ArithmeticException {
        double result = numberToBeDivided / divisor;


        if (numberToBeDivided < 0 && numberToBeDivided <= divisor && divisor < 0) {
            return 0;
        } else if (divisor == 0) throw new ArithmeticException("you can't divide by zero!");

        return result;
    }

}