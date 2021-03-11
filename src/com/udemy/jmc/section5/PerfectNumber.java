package com.udemy.jmc.section5;

public class PerfectNumber {
    public static boolean isPerfectNumber(int num){
        if (num < 1){
            return false;
        }
        int total = 0;
        for (int i = 1; i < num; i++){
            if (num % i == 0){
                total += i;
            }
        }
        return num == total;
    }
}
