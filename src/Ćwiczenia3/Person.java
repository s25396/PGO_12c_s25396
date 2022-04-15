package Ćwiczenia3;

import java.util.*;

public class Person {
    private String name;
    private String surname;
    private double moneyInCash;
    private double moneyOnCard;
    private List<ShoppingCart>purchaseHist;


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
        if(surname==null || surname.isEmpty())
    {
        throw new RuntimeException("Surname cannot be empty.");
    }
        return surname;
    }

    public void setSurname(String surname) {
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

    public void makeOrder(){
            ArrayList<Products> shoplist= new ArrayList<>();
            ShoppingCart my=new ShoppingCart(shoplist);
            purchaseHist.add(my);
        }
}
