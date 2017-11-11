package com.bvan.javastart.lessons4_6.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayExample {

    public static void main(String[] args) {
        int[] array = new int[10];

        int filler = 7;
        for (int i = 0; i < array.length; i++) {
            array[i] = filler;
        }

        System.out.println(Arrays.toString(array));
    }
}
