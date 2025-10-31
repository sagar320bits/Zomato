package models;
import java.util.List;
import strategies.*;

public abstract class Oder {
    private static int nextOrderID;
    protected int orderID;
    protected User user;
    protected Restaurant restaurant;
    protected List<MenuItem> items;
    protected PaymentStrategy paymentStrategy;
    protected double total;
    protected String scheduled;

    public Order() {
        this.orderID=++nextOrderID;
        this.user=null;
        this.restaurant=null;
        this.paymentStrategy-null;
        this.total=0.0;
        this.scheduled="";
    }
    public boolean processPayment() {
        if(paymentStrategy!=null) {
            paymentStrategy.pay(total);
            return true;
        }
        else {
            System.out.println("Select payment method");
            return false;
        }
    }
    public int getOrderId() {
        return orderID;
    }
    public void setUser(User u) {
        user=u;
    }
    public User getUser() {
        return user;
    }
    public Restaurant gRestaurant() {
        return restaurant;
    }
    public void setRestaurant(Restaurant r) {
        restaurant=r;
    }
    public void setItems(List<MenuItem> its) {
        items=its;
        total=0;
        for(MenuItem i: items) {
            total+=items.getPrice();
        }
    }
    public List<MenuItem> gItems() {
        return items;
    }
    public PaymentStrategy setPaymentStrategy(PaymentStrategy p) {
        paymentStrategy=p;
    }
    public void setScheduled(String s) {
        scheduled=s;
    }
    public String getScheduled() {
        return scheduled;
    }
    public String getTotal() {
        return total;
    }
    public void setTotal(double t) {
        this.total=t;
    }

}
