package Ćwiczenia3;
import java.util.*;
public class Storage {
    private int deliveryTime;
    private List<Products> storedProducts=new ArrayList<>();


    public Storage(int deliveryTime,ArrayList<Products> storedProducts) {
        setDeliveryTime(deliveryTime);
        setStoredProducts(storedProducts);
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(int deliveryTime) {
        if(deliveryTime<0){
            throw new RuntimeException("Delivery time cannot be negative");
        }
        this.deliveryTime = deliveryTime;
    }

    public List<Products> getStoredProducts() {
        return storedProducts;
    }

    public void setStoredProducts(List<Products> storedProducts) {
        this.storedProducts = storedProducts;
    }

    public void addToStorage(Products x){
        storedProducts.add(x);
    }
}

