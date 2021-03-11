package com.udemy.jmc.section5;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if( bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }
        while(goal >= 5 && bigCount > 0){
            goal -= 5;
            bigCount -= 1;
        }
        while(goal > 0 && smallCount > 0){
            goal -= 1;
            smallCount -=1;
        }
        return goal == 0;
    }
}
