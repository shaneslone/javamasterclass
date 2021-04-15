package com.udemy.jmc.section8;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String name){
        if(findBranch(name) == null){
            branches.add(new Branch(name));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double transaction){
        Branch b = findBranch(branchName);
        if (b != null){
            return b.newCustomer(customerName, transaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction){
        Branch b = findBranch(branchName);
        if (b != null){
            return b.addCustomerTransaction(customerName, transaction);
        }
        return false;
    }

    private Branch findBranch(String name){
        for(Branch b : branches){
            if(b.getName().equals(name)){
                return b;
            }
        }
        return null;
    }

    public boolean listCustomers(String branch, boolean printTransactions){
        Branch b = findBranch(branch);
        if(b != null){
            System.out.println("Customer details for branch " + b.getName());
            for(int i = 0; i < b.getCustomers().size(); i ++){
                Customer c = b.getCustomers().get(i);
                System.out.println("Customer: " + c.getName()  + "[" + (i+1) + "]");
                if(printTransactions) {
                    System.out.println("Transactions");
                    for (int j = 0; j < c.getTransactions().size(); j++){
                        System.out.println("[" + (j+1) + "]  Amount " + c.getTransactions().get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }
}

