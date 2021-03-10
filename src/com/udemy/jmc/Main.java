package com.udemy.jmc;

import com.udemy.jmc.section5.NumberPalindrome;

public class Main {

    public static void main(String[] args) {
        NumberPalindrome np = new NumberPalindrome();
        boolean isPal = np.isPalindrome(-5456);
        System.out.println(isPal);
    }

}
