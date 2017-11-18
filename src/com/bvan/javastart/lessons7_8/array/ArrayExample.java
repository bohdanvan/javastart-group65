package com.bvan.javastart.lessons7_8.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayExample {

    public static void main(String[] args) {
        int[] array = new int[5];

        // i = 0...4
        for (int i = 0; i < array.length; i++) {
            array[i] = (i + 1) * 10;
        }

        int sum = 0;
        for (int elem : array) { // for-each
            sum += elem;
        }
        System.out.println("sum = " + sum);

        System.out.println(Arrays.toString(array));
    }
}
