package com.udemy.jmc.section5;

public class NumberPalindrome {
    public static boolean isPalindrome(int num){
        num = Math.abs(num);
        int original = num;
        int reversed = 0;
        if(num < 10){
            return true;
        }
        while(num > 0){
            reversed *= 10;
            reversed += num % 10;
            num = num / 10;
        }
        return reversed == original;
    }
}
