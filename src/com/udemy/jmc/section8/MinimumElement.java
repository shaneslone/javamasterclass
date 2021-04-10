package com.udemy.jmc.section8;

import java.util.Scanner;

public class MinimumElement {
    public static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of the array");
        int length = scanner.nextInt();
        return length;
    }

    public static int[] readElements(int length){
        int[] array = new int[length];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < length; i++){
            System.out.println("Enter element " + (i+1));
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
