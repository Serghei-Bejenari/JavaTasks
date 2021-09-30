package com.example.task_4_debug;

public class Calculator {

    public static String calculation(String num1, String readOperator, String num2) {

        Double result = null;
        double first = Double.parseDouble(num1), second = Double.parseDouble(num2);
        char operator = readOperator.charAt(0);

        switch (operator) {
            case '*':
                result = first * second;
                break;

            case '^':
                for (int i = 1; i <= second; i++) {
                    result = result * first;
                }
                break;

            case '=':
                if (first == second)
                    return first + "=" + second;
                if (first != second) ;
                return first + " " + "!=" + " " + second;

            case '%':
                result = first % second;
                break;

            case '/':
                try {
                    result = first / second;
                } catch (ArithmeticException e) {
                    if (second == 0) System.out.println("Can not divide by Zero");
                }
                break;
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            default:

        }

        return "" + first + " " + operator + " " + second + " = " + result;
    }
}