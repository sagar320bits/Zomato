package models;

public class DeliveryOrder extends Order {
    private String userAddress;
    public DeliveryOrder() {
        userAddress="";
    }
    @Override
    public String getType() {
        return "Deliver";
    }
    public void setUserAddress(userAddress adr) {
        userAddress=adr;
    }
    public String getUserAddress() {
        return userAddress;
    }
}
