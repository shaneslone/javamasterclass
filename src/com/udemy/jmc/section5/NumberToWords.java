package com.udemy.jmc.section5;

public class NumberToWords {
    public static int reverse(int num){
        int reversed = 0;
        boolean negate = false;
        if(num < 0){
            num = Math.abs(num);
            negate = true;
        }
        while(num > 0){
            reversed *= 10;
            reversed += num % 10;
            num = num / 10;
        }
        if (negate){
            reversed = 0 - reversed;
        }
        return reversed;
    }
    public static int getDigitCount(int num){
        if(num < 0){
            return -1;
        }
        if(num == 0){
            return 1;
        }
        int digitcount = 0;
        while(num > 0){
            num = num / 10;
            digitcount += 1;
        }
        return digitcount;
    }
    public static void numberToWords(int number){
        if(number < 0){
            System.out.println("Invalid Value");
        } else {
        String result = "";
        int odc = getDigitCount(number);
        number = reverse(number);
        int rdc = getDigitCount(number);
        while(number >= 10){
            int cur = number % 10;
            number = number / 10;
            switch(cur){
                case 0:
                    result += "Zero ";
                    break;
                case 1:
                    result += "One ";
                    break;
                case 2:
                    result += "Two ";
                    break;
                case 3:
                    result += "Three ";
                    break;
                case 4:
                    result += "Four ";
                    break;
                case 5:
                    result += "Five ";
                    break;
                case 6:
                    result += "Six ";
                    break;
                case 7:
                    result += "Seven ";
                    break;
                case 8:
                    result += "Eight ";
                    break;
                case 9:
                    result += "Nine ";
                    break;
                default:
                    break;
            }
        }
        switch(number){
            case 0:
                result += "Zero";
                break;
            case 1:
                result += "One";
                break;
            case 2:
                result += "Two";
                break;
            case 3:
                result += "Three";
                break;
            case 4:
                result += "Four";
                break;
            case 5:
                result += "Five";
                break;
            case 6:
                result += "Six";
                break;
            case 7:
                result += "Seven";
                break;
            case 8:
                result += "Eight";
                break;
            case 9:
                result += "Nine";
                break;
            default:
                break;
        }
        if (odc > rdc){
            int addzeros = odc - rdc;
            for(int i = 0; i < addzeros; i++){
                result += " Zero";
            }
        }
        System.out.println(result);}
    }
}
