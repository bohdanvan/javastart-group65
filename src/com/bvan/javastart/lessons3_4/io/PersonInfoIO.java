package com.bvan.javastart.lessons3_4.io;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class PersonInfoIO {

    public static void main(String[] args) {
        // Input
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scan.next();

        System.out.print("Enter age: ");
        int age = scan.nextInt();

        scan.close(); // optional

        // BL
        String message = "I'm " + name + ", "
                + age + " years old";

        // Output
        System.out.println(message);
    }
}
