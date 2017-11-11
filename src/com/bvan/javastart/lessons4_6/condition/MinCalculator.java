package com.bvan.javastart.lessons4_6.condition;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class MinCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Input
        System.out.println("Ведите число a");
        int a = scan.nextInt();

        System.out.println("Ведите число b");
        int b = scan.nextInt();

        // Business Logic
        int min = a < b ? a : b;

        // Output
        System.out.println("min = " + min);
    }
}
