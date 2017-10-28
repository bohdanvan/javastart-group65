package com.bvan.javastart.lessons3_4;

/**
 * @author bvanchuhov
 */
public class BooleanExample {

    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;

        int x = 10;
        boolean b3 = x < 20; // T

        System.out.println(b3);
        System.out.println();

        System.out.println(x < 5); // F
        System.out.println(x <= 10); // T
        System.out.println(x > 1); // T
        System.out.println(x >= 11); // F
        System.out.println(x == 5); // F
        System.out.println(x != 5); // T
    }
}
