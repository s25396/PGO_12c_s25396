package Ćwiczenia3;
import java.util.*;
public class Storage {
    private int deliveryTime;
    private Products product;
    private List<Products> all=new ArrayList<>();

    public Storage(int deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(int deliveryTime) {
        this.deliveryTime = deliveryTime;
    }
}
