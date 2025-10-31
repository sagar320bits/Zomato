package models;

public class User {
    private int userID;
    private String name;
    private String address;
    private Cart cart;
    public User(int userID,String name,String address) {
        this.userID=userID;
        this.name=name;
        this.address=address;
        this.cart=new Cart();
    }
    public int getUserID() {
        return userID;
    }
    public void setUserID(String usserID) {
        userID=userID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        name=name;
    }
    public Cart getCart() {
        return cart;
    }
    
}
