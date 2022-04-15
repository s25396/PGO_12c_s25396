package Ćwiczenia3;
import Ćwiczenia3.*;

import java.util.ArrayList;
import java.util.*;

public class ShoppingCart {
    final private int id = hashCode();
    private double totalPrice;
    private double totalDeliveryTime=0;
    private Products product;
    private ArrayList<Products> shoplist = new ArrayList<>();


    public ShoppingCart(ArrayList<Products> shoplist) {
        setShoplist(shoplist);
    }

    public double getTotalPrice() {
        for(int i=0;i<shoplist.size();i++){
            totalPrice=+shoplist.get(i).getPrice();}

        return totalPrice;
    }


    public double getTotalDeliveryTime() {
        return totalDeliveryTime;
    }


    public int getId() {
        return id;
    }

    public void setShoplist(ArrayList<Products> shoplist) {
        this.shoplist = shoplist;
    }

    public void sell(){
        for(Products o: shoplist){
            o.sell();
        }
    }

    public void showmycart(){
        for(Products o: shoplist){
            System.out.println(o.getName()+" - "+o.getPrice());
        }
        System.out.println(totalPrice);

    }
}
