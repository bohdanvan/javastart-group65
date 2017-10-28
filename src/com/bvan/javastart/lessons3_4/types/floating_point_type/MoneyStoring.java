package com.bvan.javastart.lessons3_4.types.floating_point_type;

/**
 * @author bvanchuhov
 */
public class MoneyStoring {

    public static void main(String[] args) {
        long money = 268528464;
        double moneyForOutput = (double) money / 10000000;
        System.out.println(moneyForOutput);
    }
}
