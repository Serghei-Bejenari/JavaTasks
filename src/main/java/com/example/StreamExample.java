package com.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StreamExample {
    //return minimal int from collection
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        for (int i = 0; i < 10; i++) {
            list.add(scanner.nextInt());
        }
        Integer min = list.stream().min(Integer::compare).get();
        System.out.println(min);
    }
}