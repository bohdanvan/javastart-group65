package com.bvan.javastart.lessons5_6.condition;

/**
 * @author bvanchuhov
 */
public class Min3Calculator {

    public static void main(String[] args) {
        int a = 40;
        int b = 100;
        int c = 30;

        int min = (a < b) ? a : b;
        min = (min < c) ? min : c;

        System.out.println("min = " + min);
    }
}
