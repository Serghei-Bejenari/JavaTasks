package com.example.task_8_Junit;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static com.example.task_8_JUnit.Calculator.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestCalculator {

    @Test
    void testMultiplayPositive() {
        double result = multiply(3, 2);
        assertThat("Incorrect num", 6.0, CoreMatchers.is(result));
    }

    @Test
    void testSubtractPositive() {
        int result = subtract(8, 2);
        assertThat("Incorrect num", 6, CoreMatchers.is(result));
    }

    @Test
    void testDividePositive() {
        double result = divide(36, 6);
        assertThat("Incorrect num", 6.0, CoreMatchers.is(result));
    }

    @Test
    void testMultiplayNegative() {
        double result = multiply(101, -5);
        assertThat("Incorrect num", 0.0, CoreMatchers.is(result));
    }

    @Test
    void testSubtractNegative() {
        int result = subtract(2, -5);
        assertThat("Incorrect num", -1, CoreMatchers.is(result));
    }

    @Test
    void testDivideNegative() {
        double result = multiply(-10, -5);
        assertThat("Incorrect num", 0.0, CoreMatchers.is(result));
    }

    @Test
    void testDivideThrows() {
        assertThrows(ArithmeticException.class, () -> divide(22, 0));
    }

    @ParameterizedTest
    @CsvSource(value = {"5,7,35", "5,5,25"})
    void testMultiplytest(String number, String number2, String result) {

        double actualResult = multiply(Double.parseDouble(number), Double.parseDouble(number2));
        assertThat("Incorrect num", Double.parseDouble(result), CoreMatchers.is(actualResult));
    }
    @ParameterizedTest
    @ValueSource(doubles = {12.0, 13.0})
     public void multiplyP(double num) {
        final double actualResult = multiply(num, num);
        final double expectedResult = num * num;
        assertThat("Incorrect num", actualResult, is(expectedResult));
    }

    @RepeatedTest(2)
    public void subtractRepeat() {
        Assertions.assertEquals(15, subtract(30, 15));
        Assertions.assertEquals(35, subtract(45, 10));
    }

}