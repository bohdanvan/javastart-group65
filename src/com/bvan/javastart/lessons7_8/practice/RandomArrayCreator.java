package com.bvan.javastart.lessons7_8.practice;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class RandomArrayCreator {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                createRandomArray(10, 1, 10)
        ));
        System.out.println(Arrays.toString(
                createRandomArray(20, 100, 200)
        ));
        System.out.println(Arrays.toString(
                createRandomArray(100, 1, 2)
        ));
    }

    public static int[] createRandomArray(
            int size, int min, int max) {

        int[] array = new int[size];
        fillWithRandom(array, min, max);
        return array;
    }

    public static void fillWithRandom(
            int[] array, int min, int max) {

        for (int i = 0; i < array.length; i++) {
            array[i] = RandomGenerator.random(min, max);
        }
    }
}
