package Ćwiczenia3;

import java.util.*;

public class Person {
    private String name;
    private String surname;
    private double moneyInCash;
    private double moneyOnCard;
    private List<ShoppingCart>purchaseHist = new ArrayList<>();
    private ShoppingCart current;


    public Person(String name, String surname, double moneyInCash, double moneyOnCard) {
        setName(name);
        setSurname(surname);
        setMoneyInCash(moneyInCash);
        setMoneyOnCard(moneyOnCard);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null || name.isEmpty())
        {
            throw new RuntimeException("Name cannot be empty.");
        }
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if(surname==null || surname.isEmpty())
        {
            throw new RuntimeException("Surname cannot be empty.");
        }
        this.surname = surname;
    }

    public double getMoneyInCash() {
        return moneyInCash;
    }

    public void setMoneyInCash(double moneyInCash) {
        if(moneyInCash<0){
            throw new RuntimeException("Amount of money cannot be negative");
        }
        this.moneyInCash = moneyInCash;
    }

    public double getMoneyOnCard() {
        return moneyOnCard;
    }

    public void setMoneyOnCard(double moneyOnCard) {
        this.moneyOnCard = moneyOnCard;
    }

    public List<ShoppingCart> getPurchaseHist() {
        return purchaseHist;
    }

    public void makeOrder(ArrayList<Products> x){
             current=new ShoppingCart(x);
        System.out.println("Now you must pay to finalized the order");
    }

    public void addToMyCurrentCart(Products x){
        current.addToMyCart(x);
    }

    public void buyByCard(){
        if(moneyOnCard>=current.getTotalPrice())
        {
            current.sell();
            moneyOnCard= moneyOnCard-current.getTotalPrice();
            System.out.println("Your purchases have been successfully paid");
            purchaseHist.add(current);
        }
        else
        {
            throw new RuntimeException("You do not have enough money on your card");
        }
    }

    public void buyInCash(){
        if(moneyInCash>=current.getTotalPrice())
        {
            current.sell();
            moneyInCash= moneyInCash-current.getTotalPrice();
            System.out.println("Your purchases have been successfully paid");
            purchaseHist.add(current);
        }
        else
        {
            throw new RuntimeException("You do not have enough money");
        }

    }

}
