package com.udemy.jmc.section7;

public class DeluxeBurger extends Hamburger{
    public DeluxeBurger() {
        super("Deluxe", "Angus Beef", 19.10, "King's Hawaiian");
        super.addHamburgerAddition1("Chips", 0);
        super.addHamburgerAddition2("Coke", 0);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Can't add items to the Deluxe");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Can't add items to the Deluxe");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Can't add items to the Deluxe");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Can't add items to the Deluxe");
    }
}
