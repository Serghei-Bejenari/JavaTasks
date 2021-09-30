package com.example.task_2_Intro;

public class Tasks {


    /**
     * Sum two numbers
     */
    public static Integer sum(Integer a, Integer b) {
        return a + b;
    }

    /**
     * Write a method that calculates the factorial of a given number.
     * Factorial is the product of all positive integers less than or equal to n. For example, factorial(4) = 4x3x2x1 = 24.
     * TIP: To make it more interesting, try to do it recursively.
     */
    public static int factorial(int number) {
        return (number == 1) ? 1 : factorial(number - 1) * number;
    }

    /**
     * Write a method that returns the index of the first occurrence of given integer in a list.
     * Assume that the index of the first element in the list is zero.
     * If the number does not exist return -1.
     */
    public static Integer search(Integer n, Integer[] list) {
        for (int i = 0; i < list.length; i++)
            if (list[i].equals(n))
                return i;
        return -1;
    }

    /**
     * Write a method that reverses a string.
     * For example, 'java interview' becomes 'weivretni avaj'.
     */
    public static String reverse(String s) {
        String rev = "";
        for (int i = 0; i < s.length(); i++) {
            rev = s.charAt(i) + rev;
        }
        return rev;
    }

    /**
     * Write a method that returns the largest integer in the list.
     * You can assume that the list has at least one element.
     */
    public static Integer maximum(Integer[] list) {
        int max = 0;

        for (int i = 1; i < list.length; i++) {
            if (list[i] > max) {
                max = list[i];
            }
        }
        return max;
    }

    /**
     * Write a method that returns 'Fizz' for multiples of three and 'Buzz' for the multiples of five.
     * For numbers which are multiples of both three and five return 'FizzBuzz'.
     * For numbers that are neither, return the input number.
     */
    public static String fizzBuzz(Integer i) {
        if (i % 5 == 0 && i % 3 == 0) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if (i % 5 == 0) {
            return "Buzz";
        } else
            return (Integer.toString(i));
    }

    /**
     * A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.
     * Write a method that checks if a number is a prime number.
     */
    public static Boolean isPrime(Integer n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * A palindrome is a word which reads the same backward or forward. 'abcba' is a palindrome.
     * Write a method that detects if a string is a palindrome.
     * Tip: Use word.charAt(i) to get the character at position i.
     */
    public static Boolean isPalindrome(String word) {
        String rev = "";

        for (int i = word.length() - 1; i >= 0; i--)
            rev += word.charAt(i);
        return word.equals(rev);
    }


    /**
     * Return duplicate characters from String.
     * For example, if String is "Java" then the program should print "a". Bonus points if your program is robust and
     * handles different kinds of input e.g. String without duplicate, null or empty String etc.
     */

    public static char[] getDuplicateCharacters(String string) {
        if (string == null) {
            return new char[]{};
        } else {
            String str = "";

            for (int i = 0; i < string.length() - 1; i++) {
                for (int j = i + 1; j < string.length(); j++) {
                    if (string.charAt(i) == string.charAt(j)) {
                        if (str.contains(string.charAt(i) + "")) {
                            break;
                        }
                        str += string.charAt(j);
                    }
                }
            }
            return str.toCharArray();
        }
    }

    /**
     * Check if a String contains another String
     * You need to write a function to search for the existence of a string (target) in another string (source).
     * The function takes two strings as the input and returns true if substring was found and false if the target string cannot be found.
     * Tip: U can use word.charAt(i) and/or word.toCharArray() to get the character at position i.
     */

    public static boolean isSubstring(String source, String target) {
        for (int i = 0; i < source.length(); i++) {
            int counter = 0;
            for (int j = 0; j < target.length(); j++) {
                if (target.charAt(j) == source.charAt(i + j)) {
                    counter++;
                    if (counter == target.length()) {
                        return true;
                    }
                } else {
                    break;
                }
            }
        }
        return false;
    }

    /**
     * Implement Binary Search Algorithm or if you like Linear search Algorithm.
     * Method will return index of searched element.
     * If element does not appear in input return -1
     */
    public static int search(int[] input, int number) {
        int indexOf = -1;
        for (int i = 0; i < input.length; i++) {
            indexOf = (input[i] == number) ? i : indexOf;
        }
        return indexOf;
    }


    /**
     * Implement any sorting algorithm u like: Insertion sort, Selection sort, Bubble sort, Heap sort, Merge sort, Quick sort
     */
    public static int[] sort(int... d) {
        boolean bubbleSort = false;
        while (!bubbleSort) {
            bubbleSort = true;

            for (int i = 0; i < d.length; i++) {
                for (int j = 0; j < d.length - 1; j++) {
                    if (d[j] > d[j + 1]) {
                        int tempInt = d[j];
                        d[j] = d[j + 1];
                        d[j + 1] = tempInt;
                        bubbleSort = false;
                    }
                }
            }
        }
        return d;
    }
}