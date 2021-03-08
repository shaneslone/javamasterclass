package com.udemy.jmc;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        long n1 = (long)(num1 * 1000.00);
        long n2 = (long)(num2 * 1000.00);
        return n1 == n2;
    }
}
