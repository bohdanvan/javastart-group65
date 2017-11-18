package com.bvan.javastart.lessons7_8;

import java.util.Random;
import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class RandomGame {

    public static void main(String[] args) {
        startRandomGame(100);
    }

    public static void startRandomGame(int maxNumber) {
        int min = 1;
        int max = maxNumber;

        int computerNumber = random(min, max);
        System.out.println(computerNumber);

        int userNumber = readIntInRange(min, max);
        while (userNumber != computerNumber) {
            if (userNumber < computerNumber) {
                min = userNumber + 1;
            } else {
                max = userNumber - 1;
            }

            userNumber = readIntInRange(min, max);
        }

        System.out.println("You win!");
    }

    private static int readIntInRange(int min, int max) {
        String inputText = min + "..." + max + ": ";

        int n = readInt(inputText);
        while (n < min || n > max) {
            System.out.println("Illegal range: "
                    + n + " is not in " + min + "..." + max);

            n = readInt(inputText);
        }
        return n;
    }

    private static int readInt(String inputText) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(inputText);

        while (!scanner.hasNextInt()) {
            System.out.println("Illegal input");
            scanner.next(); // skip

            System.out.print(inputText);
        }
        return scanner.nextInt();
    }

    private static int random(int min, int max) {
        return min + new Random().nextInt(max - min + 1);
    }
}
