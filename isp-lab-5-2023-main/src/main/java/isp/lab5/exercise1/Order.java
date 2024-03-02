package isp.lab5.exercise1;

import java.time.LocalDateTime;

public class Order {
    private String orderID;
    private LocalDateTime date;
    private double totalPrice;
    private Product[] products=new Product[10];

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }
    public double getTotalPrice(Product[] products){
        for(int i=0;i< products.length;i++){
            totalPrice+=products[i].getPrice();
        }
        return totalPrice;
    }
}
