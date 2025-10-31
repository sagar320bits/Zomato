package models;

public class PickupOrder extends Order {
    private String restaurantAddress;
    public PickupOrder() {
        restaurantAddress="";
    }
    @Override
    public String getType() {
        return "PickUp Order";
    }
    public void setRestaurantAddress(String addr) {
        restaurantAddress=addr;
    }
    public String getRestaurantAddress() {
        return restaurantAddress;
    }
}
