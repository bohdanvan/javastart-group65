package com.bvan.javastart.lessons3_4.condition;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class IPhoneTask {

    public static void main(String[] args) {
        long iPhonePrice = 1000;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter money: ");
        long money = scanner.nextLong();

        System.out.print("Are you feeling good? (yes/no): ");
        boolean feelingGood = scanner.next().equals("yes");

        System.out.print("Does your girlfriend want it? (yes/no): ");
        boolean girlfriendWants = scanner.next().equals("yes");

        if ((feelingGood || girlfriendWants) && money >= iPhonePrice) {
            System.out.println("You will buy iPhone");
            money -= iPhonePrice;
        } else {
            System.out.println("You will not buy iPhone");
        }

        System.out.println("$ " + money + " left");
    }
}
