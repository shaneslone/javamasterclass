package com.udemy.jmc.section7;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthyAddition1(String name, double price){
        healthyExtra1Name = name;
        healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price){
        healthyExtra2Name = name;
        healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double total = super.itemizeHamburger();
        if(healthyExtra1Name != null){
            total += healthyExtra1Price;
        }
        if(healthyExtra2Name != null){
            total += healthyExtra2Price;
        }
        return total;
    }
}
