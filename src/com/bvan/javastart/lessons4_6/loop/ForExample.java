package com.bvan.javastart.lessons4_6.loop;

/**
 * @author bvanchuhov
 */
public class ForExample {

    public static void main(String[] args) {
        // 10 ... 20
        for (int n = 10; n <= 20; n++) {
            System.out.print(n + " ");
        }
        System.out.println();

        // 20 ... 10
        for (int n = 20; n >= 10; n--) {
            System.out.print(n + " ");
        }
        System.out.println();

        // 50 ... 100, evens
        for (int n = 50; n <= 100; n += 2) {
            System.out.print(n + " ");
        }
        System.out.println();

        // (0, 10), (1, 9), ... (5, 5)
        for (int x = 0, y = 10; x <= y; x++, y--) {
            System.out.println("(" + x + ", " + y + ")");
        }
    }
}
