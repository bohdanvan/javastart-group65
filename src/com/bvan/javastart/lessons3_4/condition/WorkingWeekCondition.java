package com.bvan.javastart.lessons3_4.condition;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class WorkingWeekCondition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day: ");
        int day = scanner.nextInt();

        // BL
        if (day <= 5) {
            System.out.println("Work");
        } else {
            System.out.println("Friends");
        }

        System.out.println("Java courses");
    }
}
