package com.bvan.javastart.lessons7_8.practice;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class TeenagersFinder {

    public static void main(String[] args) {
        int[] ages = {15, 20, 12, 30, 12, 14};
        int[] teenagerAges = findTeenagers(ages);
        System.out.println(Arrays.toString(teenagerAges)); // [15, 14]
    }

    public static int[] findTeenagers(int[] ages) {
        int teenagers = TeenagersCounter.countTeenagers(ages);

        int[] teenagerAges = new int[teenagers];
        int teenagerI = 0;

        for (int age : ages) {
            if (TeenagersCounter.isTeenager(age)) {
                teenagerAges[teenagerI] = age;
                teenagerI++;
            }
        }

        return teenagerAges;
    }
}
