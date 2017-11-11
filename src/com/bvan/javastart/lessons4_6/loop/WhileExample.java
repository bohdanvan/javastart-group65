package com.bvan.javastart.lessons4_6.loop;

/**
 * @author bvanchuhov
 */
public class WhileExample {

    public static void main(String[] args) {
        int x = 10; // (1)

        while (x <= 20) { // (2)
            System.out.print(x + " ");
            x++; // (3)
        }
        System.out.println();
    }
}
