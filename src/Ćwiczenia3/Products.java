package Ćwiczenia3;

import java.util.ArrayList;
import Ćwiczenia3.*;

public class Products {
    private String name;
    private ProductType productType;
    private double price;
    private int quantity = 0;
    private boolean isAvailable;
    private Storage storage;


    public Products(String name, ProductType productType, double price, int quantity, Storage storage) {
        setName(name);
        setProductType(productType);
        setPrice(price);
        setQuantity(quantity);
        setStorage(storage);
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

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        if(productType==null)
        {
            throw new RuntimeException("Product type must be given.");
        }
        this.productType = productType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price==0)
        {
            throw new RuntimeException("Price cannot be empty.");
        }
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity<0){
            throw new RuntimeException("Quantity cannot be negative");
        }
        this.quantity = quantity;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public boolean isAvailable() {
        if(quantity>0 || storage.getStoredProducts().contains(this)){
            isAvailable=true;
        }
        else{
            isAvailable=false;
        }
        return isAvailable;
    }

    public void sell(){
        if(quantity>0){
        quantity--;}
        else if(quantity==0 && storage.getStoredProducts().contains(this)){
            increaseQuantity(1);
            quantity--;
        }
        else{
            throw new RuntimeException("this product is no longer available");
        }

    }

    public void increaseQuantity(int x){
        int m=0;
        for (Products fromstorage: storage.getStoredProducts()){
            if(fromstorage==this) {
                m++;
            }
            else {
                m=m;
            }
        }
        if(m>=x){
            quantity = quantity+x;
            for(int i=0;i==x-1;i++){
                storage.getStoredProducts().remove(this);}
        }
        else{
            throw new RuntimeException("There are/is only "+x+" left");
        }
    }
}
