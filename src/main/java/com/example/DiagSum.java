package com.example;

import java.util.Random;

public class DiagSum {

    static public void sum() {
        Random r = new Random();
        int n = 3;
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = r.nextInt(100);

                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        int s = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    s += a[i][j];
                }
            }

        }
        System.out.println("Сумма главной диагонали равна: " + s);
    }

    public static void main(String[] args) {
        sum();
    }
}