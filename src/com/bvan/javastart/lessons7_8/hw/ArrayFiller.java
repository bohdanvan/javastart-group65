package com.bvan.javastart.lessons7_8.hw;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayFiller {

    public static void main(String[] args) {
        int[] array = new int[5];
        fill(array, 20);
        System.out.println(Arrays.toString(array));
    }

    public static void fill(int[] array, int filler) {
        for (int elem = 0; elem < array.length; elem++) {
            array[elem] = filler;
        }
    }
}
