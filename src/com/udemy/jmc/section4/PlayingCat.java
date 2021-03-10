package com.udemy.jmc.section4;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temp){
        if (summer){
            return temp >= 25 && temp <= 45;
        }
        return temp >= 25 && temp <= 35;
    }
}
