package com.bvan.javastart.lessons4_6.condition;

import java.util.Scanner;

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
