package models;
import java.util.ArrayList;
import java.util.List;

public class Cart {
    private Restaurant restaurant;
    List<MenuItem> items=new ArrayList<>();
    Cart() {
        restaurant=null;
    }
    public void addMenuItem(MenuItem item) {
        if(restaurant==null) {
            System.out.println("Select restaurant");
        }
        items.add(item);
    }
    public void getTotalCost() {
        double sum=0;
        for(MenuItem it: items) {
            sum+=it.getPrice();
        }
    }
    public boolean isEmpty() {
        return restaurant==null || items.isEmpty();
    }
    public void clear() {
        items.clear();
        restaurant=null;
    }
    public void setRestaurant(Restaurant r) {
        restaurant=r;
    }
    public void getRestaurant() {
        return restaurant;
    }
    public List<MenuItem> getItems(){
        return items;
    }
}
