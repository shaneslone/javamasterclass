package com.udemy.jmc.section7;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
        pagesPrinted = 0;
    }

    public int addToner(int tonerAmount){
       if(tonerAmount < 0 || tonerAmount > 100 || tonerAmount + tonerLevel > 100){
           return -1;
       }
        tonerLevel += tonerAmount;
        return tonerLevel;
    }
    public int printPages(int pages){
        int pagesToPrint = pages;
        if(duplex){
            pagesToPrint = pages / 2 + pages % 2;
            System.out.println("Printing in duplex mode.");
        }
        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
