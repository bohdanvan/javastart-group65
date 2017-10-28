package com.bvan.javastart.lessons3_4.loop;

/**
 * @author bvanchuhov
 */
public class ForExample {

    public static void main(String[] args) {
        for (int n = 5; n <= 10; n++) {
            System.out.print(n + " ");
        }
        System.out.println();

        for (int n = 20; n >= 15; n--) {
            System.out.print(n + " ");
        }
        System.out.println();

        for (int n = 100; n <= 120; n += 2) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
