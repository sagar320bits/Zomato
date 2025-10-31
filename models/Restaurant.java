package models;
import java.util.ArrayList;
import java.util.List;
public class Restaurant {
    private static int nextRestaurantId;
    private String name;
    private String location;
    private List<MenuItem> menu=new ArrayList<>();
    public Restaurant(int nextRestaurantId,String name,String location) {
        this.nextRestaurantId=++nextRestaurantId;
        this.name=name;
        this.location=location;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        name=name;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        location=location;
    }
    public void addMenuItem(MenuItem item) {
        menu.add(item);
    }
    public List<MenuItem> getMenu() {
        return menu;
    }

}
