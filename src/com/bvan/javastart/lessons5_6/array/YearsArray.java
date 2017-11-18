package com.bvan.javastart.lessons5_6.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class YearsArray {

    public static void main(String[] args) {
        int minYear = 1960;
        int maxYear = 1968;

        int size = maxYear - minYear + 1;
        int[] years = new int[size];

        for (int i = 0; i < years.length; i++) {
            years[i] = minYear + i;
        }

        System.out.println(Arrays.toString(years));
    }
}
