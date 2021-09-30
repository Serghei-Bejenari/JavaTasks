package com.example;

//    This method of sorting named as bubble sort

public class Sort {
    static int[] array = new int[]{55, 66, 23, 41, 2, 35, 13, 34, 65, 756, 324, 11, 32, 43, 54, 12};

    static int[] sort(int[] array) {
        print(array);
        boolean isSorted = false;
        int temp = 0;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
            }
            for (int i : array) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        return array;
    }

    static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        sort(array);
    }

}