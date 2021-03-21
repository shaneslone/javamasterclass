package com.udemy.jmc.section5;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int totalNumbers = 0;
        int sum = 0;
        while(true){
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                sum += scanner.nextInt();
                totalNumbers++;
            } else {
                System.out.println("SUM = " + sum + " AVG = " + Math.round((double)sum / totalNumbers));
                break;
            }


        }
    }
}
