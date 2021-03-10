package com.udemy.jmc.section5;

public class LastDigitChecker {
    public static boolean isValid(int num){
        return num >= 10 && num <= 1000;
    }
    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        if(!isValid(num1) || !isValid(num2) || !isValid(num3)){
            return false;
        }
        int num1last = num1 % 10;
        int num2last = num2 % 10;
        int num3last = num3 % 10;

        return num1last == num2last || num1last == num3last || num2last == num3last;
    }
}
