package Ćwiczenia3;

import java.util.ArrayList;

public class Products {
    private String name;
    private ProductType productType;
    private double price;
    private int quantity;
    private boolean isAvailable;
    public static ArrayList<Products>allProducts= new ArrayList<>();

    public Products(String name, ProductType productType, double price, int quantity) {
        setName(name);
        setProductType(productType);
        setPrice(price);
        allProducts.add(this);
        setQuantity(quantity);
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
        this.quantity = quantity;
    }

    public boolean isAvailable() {
        if(quantity>0){
            isAvailable=true;
        }
        else{
            isAvailable=false;
        }
        return isAvailable;
    }
    public void sell(){
        quantity--;

    }
    public void increaseQuantity(int x){
        quantity= quantity+x;
        for(int i=0;i<x-1;i++){
        Storage.storedProducts.remove(this);}

    }
}
