package com.udemy.jmc.section5;

public class EvenDigitSum {
    public static int getEvenDigitSum(int num)
    {
        if (num < 0){
            return -1;
        }
        int sum = 0;
        while(num > 0){
            int current = num % 10;
            if(current % 2 == 0){
                sum += current;
            }
            num = num / 10;
        }
        return sum;
    }
}
