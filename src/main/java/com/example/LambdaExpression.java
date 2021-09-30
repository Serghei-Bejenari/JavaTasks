package com.example;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaExpression {

    void test() {

        Predicate<Integer> isNull = s -> s == 0;
        isNull.test(2);

        Consumer<String> str = s -> s.contains("a");
        str.accept("Hello");

        Function<Integer, String> toString = Object::toString;
        System.out.println(toString.apply(123));

        Predicate<Integer> isPositive = x -> x > 0;

        System.out.println(isPositive.test(5));
        System.out.println(isPositive.test(-7));
    }

    public static void main(String[] args) {
        LambdaExpression lambdaExpression = new LambdaExpression();
        lambdaExpression.test();
    }
}