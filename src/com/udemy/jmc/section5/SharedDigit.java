package com.udemy.jmc.section5;

public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2){
        if( num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99 ){
            return false;
        }
        int num2original = num2;
        while(num1 > 0){
            int num1cur = num1 % 10;
            while(num2 > 0){
                int num2cur = num2 % 10;
                if (num1cur == num2cur){
                    return true;
                }
                num2 = num2 / 10;
            }
            num2 = num2original;
            num1 = num1 / 10;
        }
        return false;
    }
}
