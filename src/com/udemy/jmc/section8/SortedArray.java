package com.udemy.jmc.section8;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    public static int[] getIntegers(int size){
        Scanner scanner = new Scanner(System.in);
        int[] result = new int[size];
        for(int i = 0; i < size; i++){
            System.out.println("Enter a number");
            result[i] = scanner.nextInt();
        }
        return result;
    }
    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }
    public static int[] sortIntegers(int[] array){
        int[] sorted = Arrays.copyOf(array, array.length);
        boolean sort = true;
        while(sort){
            sort = false;
            for(int i = 0; i < sorted.length - 1; i++){
                if(sorted[i] < sorted[i+1]){
                    int temp = sorted[i];
                    sorted[i] = sorted[i+1];
                    sorted[i+1] = temp;
                    sort = true;
                }
            }
        }
        return sorted;
    }
}
