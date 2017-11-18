package com.bvan.javastart.lessons7_8.practice;

import java.util.Random;

/**
 * @author bvanchuhov
 */
public class RandomGenerator {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            int n = random(10, 20);
            System.out.println(n);
        }
    }

    public static int random(int min, int max) {
        return min + new Random().nextInt(max - min + 1);
    }
}
