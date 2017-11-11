package com.bvan.javastart.lessons4_6.triangle;

/**
 * @author bvanchuhov
 */
public class TrianglePrinter {

    public static void main(String[] args) {
        int size = 5;

        // Print triangle
        for (int count = 1; count <= size; count++) {
            // Print line
            for (int n = 1; n <= count; n++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
