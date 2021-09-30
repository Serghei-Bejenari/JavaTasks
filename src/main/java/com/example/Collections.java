package com.example;

import java.util.*;

public class Collections {

    static List<String> createArray() {
        List<String> set = new ArrayList<>();
        set.add("2");
        set.add("1");
        set.add("7");
        set.add("5");
        return set;
    }

    static void printArray(List<String> array) {
        for (String arr : array) {
            System.out.print(arr + " ");
        }
        System.out.println();
    }

    static void print(List<String> array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(createArray());
        print(createArray());
    }
}