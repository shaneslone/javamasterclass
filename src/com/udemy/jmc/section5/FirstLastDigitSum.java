package com.udemy.jmc.section5;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int num){
        if(num < 0){
            return -1;
        }
        int lastDigit = num % 10;
        int prevDigit = lastDigit;
        while (num > 0){
            prevDigit = num % 10;
            num = num / 10;
        }
        return lastDigit + prevDigit;
    }
}
