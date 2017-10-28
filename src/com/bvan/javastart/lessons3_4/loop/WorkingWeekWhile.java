package com.bvan.javastart.lessons3_4.loop;

/**
 * @author bvanchuhov
 */
public class WorkingWeekWhile {

    public static void main(String[] args) {
        int day = 1;

        while (day <= 5) { // 9 %
            System.out.println(day + ": Work");
            day++;
        }
        System.out.println("Weekend");
    }
}
