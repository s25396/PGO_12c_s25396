package Ćwiczenia3;
import java.util.*;
public class Storage {
    private int deliveryTime;
    private Products product;
    public static List<Products> storedProducts=new ArrayList<>();


    public Storage(int deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public int getDeliveryTime(Products x) {
        if(storedProducts.contains(x)){
            deliveryTime=10;
        }
        else {
            deliveryTime=0;
        }
        return deliveryTime;
    }

    public void setDeliveryTime(int deliveryTime) {
        this.deliveryTime = deliveryTime;
    }
}
