package Ćwiczenia3;
import Ćwiczenia3.*;

import java.util.ArrayList;
import java.util.*;

public class ShoppingCart {
    final private int id = hashCode();
    private double totalPrice;
    private double totalDeliveryTime=0;
    private ArrayList<Products> shoplist = new ArrayList<>();


    public ShoppingCart(ArrayList<Products> shoplist) {
        setShoplist(shoplist);
    }

    public double getTotalPrice() {
        totalPrice =0;
        for(int i=0;i<shoplist.size();i++){
            totalPrice= totalPrice+shoplist.get(i).getPrice();}

        return totalPrice;
    }

    public double getTotalDeliveryTime() {
        for(Products prodFromList: shoplist){
            if (prodFromList.getQuantity()>0)
            {
                    totalDeliveryTime= totalDeliveryTime;
            }
            else
            {
                totalDeliveryTime= totalDeliveryTime + prodFromList.getStorage().getDeliveryTime();
            }
        }
        return totalDeliveryTime;
    }

    public int getId() {
        return id;
    }

    public void setShoplist(ArrayList<Products> shoplist) {
        for(Products prodFromList: shoplist){
            if(!prodFromList.isAvailable()){
                throw new RuntimeException(prodFromList.getName()+" is out of stock");
            }
        }
        this.shoplist = shoplist;
    }

    public void sell(){
        for(Products o: shoplist){
            o.sell();
        }
    }

    public void showMyCart(){
        for(Products o: shoplist){
            System.out.println(o.getName()+" - "+o.getPrice());
        }
        System.out.println("Totalprice - "+totalPrice);

    }
}
