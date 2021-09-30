package com.example.task_2_Intro;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TasksTest {

    @Test
    void sumTest() {
        Assertions.assertEquals(1, Tasks.sum(1, 0));
        Assertions.assertEquals(-1, Tasks.sum(-1, 0));
        Assertions.assertEquals(10, Tasks.sum(6, 4));
        Assertions.assertEquals(2, Tasks.sum(1, 1));
        Assertions.assertEquals(100, Tasks.sum(45, 55));
    }

    @Test
    void factorialTest() {
        Assertions.assertEquals(1, Tasks.factorial(1));
        Assertions.assertEquals(24, Tasks.factorial(4));
        Assertions.assertEquals(5040, Tasks.factorial(7));
        Assertions.assertEquals(3628800, Tasks.factorial(10));
    }

    @Test
    void searchTest() {
        Assertions.assertEquals(0, Tasks.search(5, new Integer[]{5, 5, 5, 5, 5, 5}));
        Assertions.assertEquals(5, Tasks.search(6, new Integer[]{1, 2, 3, 4, 5, 6}));
        Assertions.assertEquals(-1, Tasks.search(9, new Integer[]{5, 5, 5, 5, 5, 5}));
        Assertions.assertEquals(3, Tasks.search(1, new Integer[]{5, 5, 5, 1, 5, 5}));
        Assertions.assertEquals(-1, Tasks.search(5, new Integer[]{}));
    }

    @Test
    void reverseTest() {
        Assertions.assertEquals("", Tasks.reverse(""));
        Assertions.assertEquals("si eruliaf ,rehcaet tsetaerg ehT", Tasks.reverse("The greatest teacher, failure is"));
    }

    @Test
    void maximumTest() {
        Assertions.assertEquals(5, Tasks.maximum(new Integer[]{5, 5, 5, 5, 5, 5}));
        Assertions.assertEquals(6, Tasks.maximum(new Integer[]{1, 2, 3, 4, 5, 6}));
        Assertions.assertEquals(15, Tasks.maximum(new Integer[]{6, 5, 0, -5, 15, 5}));
    }

    @Test
    void fizzBuzzTest() {
        Assertions.assertEquals("Fizz", Tasks.fizzBuzz(93));
        Assertions.assertEquals("FizzBuzz", Tasks.fizzBuzz(15));
        Assertions.assertEquals("Buzz", Tasks.fizzBuzz(5));
        Assertions.assertEquals("47", Tasks.fizzBuzz(47));
    }

    @Test
    void isPrimeTest() {
        Assertions.assertEquals(true, Tasks.isPrime(97));
        Assertions.assertEquals(false, Tasks.isPrime(15));
    }

    @Test
    void isPalindromeTest() {
        Assertions.assertEquals(false, Tasks.isPalindrome("qwerty3uiopoiuytrewq"));
        Assertions.assertEquals(true, Tasks.isPalindrome("qwertyytrewq"));
        Assertions.assertEquals(true, Tasks.isPalindrome("qwerty9ytrewq"));
    }

    @Test
    void getDuplicateCharactersTest() {
        Assertions.assertArrayEquals(new char[]{'a'}, Tasks.getDuplicateCharacters("Java"));
        Assertions.assertArrayEquals(new char[]{'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o'}, Tasks.getDuplicateCharacters("qwertyuiopoiuytrewq"));
        Assertions.assertArrayEquals(new char[]{}, Tasks.getDuplicateCharacters(""));
        Assertions.assertArrayEquals(new char[]{}, Tasks.getDuplicateCharacters(null));
    }

    @Test
    void isSubstringTest() {
        Assertions.assertEquals(true, Tasks.isSubstring("Java", "a"));
        Assertions.assertEquals(true, Tasks.isSubstring("qwertyuiopoiuytrewq", "uyt"));
        Assertions.assertEquals(false, Tasks.isSubstring("Talk is cheap. Show me the code.", "edoc"));
        Assertions.assertEquals(false, Tasks.isSubstring("null", "word"));
    }

    @Test
    void searchAlgorithmTest() {
        Assertions.assertEquals(-1, Tasks.search(new int[]{}, 23));
        Assertions.assertEquals(0, Tasks.search(new int[]{23}, 23));
        Assertions.assertEquals(1, Tasks.search(new int[]{1, 2, 33, 56, 24}, 2));
        Assertions.assertEquals(3, Tasks.search(new int[]{8, 0, 2, 5, 7, -451}, 5));

    }

    @Test
    void sortTest() {
        Assertions.assertArrayEquals(new int[]{}, Tasks.sort());
        Assertions.assertArrayEquals(new int[]{-11, -3, 9, 17, 42, 54, 54, 602, 999}, Tasks.sort(42, 9, 17, 54, 602, -3, 54, 999, -11));
    }

}