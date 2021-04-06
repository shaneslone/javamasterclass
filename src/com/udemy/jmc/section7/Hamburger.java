package com.udemy.jmc.section7;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, double price){
        addition1Name = name;
        addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price){
        addition2Name = name;
        addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price){
        addition3Name = name;
        addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price){
        addition4Name = name;
        addition4Price = price;
    }

    public double itemizeHamburger(){
        double total = price;
        if(addition1Name != null){
            total += addition1Price;
        }
        if(addition2Name != null){
            total += addition2Price;
        }
        if(addition3Name != null){
            total += addition3Price;
        }
        if(addition4Name != null){
            total += addition4Price;
        }
        return total;
    }

}
