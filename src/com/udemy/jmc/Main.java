package com.udemy.jmc;

import com.udemy.jmc.section5.FlourPacker;

public class Main {

    public static void main(String[] args) {
        FlourPacker fp = new FlourPacker();
        System.out.println(fp.canPack(-1, 8, 8));
    }

}
