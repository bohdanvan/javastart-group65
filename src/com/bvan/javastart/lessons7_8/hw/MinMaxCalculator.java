package com.bvan.javastart.lessons7_8.hw;

/**
 * @author bvanchuhov
 */
public class MinMaxCalculator {

    public static void main(String[] args) {
        System.out.println(min(10, 20) == 10);
        System.out.println(min(40, 30) == 30);
        System.out.println(min(30, 30) == 30);
    }

    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }
}

