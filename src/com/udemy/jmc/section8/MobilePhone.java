package com.udemy.jmc.section8;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts = new ArrayList<Contact>();

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
    }

    public boolean addNewContact(Contact contact){
        if(findContact(contact) > -1){
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int contactIndex = findContact(oldContact);
        if(contactIndex < 0){
            return false;
        }
        myContacts.set(contactIndex, newContact);
        return true;
    }

    public boolean removeContact(Contact contact){
        int contactIndex = findContact(contact);
        if(contactIndex < 0){
            return false;
        }
        myContacts.remove(contactIndex);
        return true;
    }

    private int findContact(Contact contact){
        return findContact(contact.getName());
    }

    private int findContact(String name){
        for(int i = 0; i < myContacts.size(); i++){
            Contact c = myContacts.get(i);
            if(c.getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name){
        int contactIndex = findContact(name);
        if(contactIndex < 0) {
            return null;
        }
        return myContacts.get(contactIndex);
    }

    public void printContacts(){
        System.out.println("Contact List:");
        for(int i = 0; i < myContacts.size(); i++){
            Contact c = myContacts.get(i);
            System.out.println((i+1) + ". " + c.getName() + " -> " + c.getPhoneNumber());
        }
    }

}
