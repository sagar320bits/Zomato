package models;
public class MenuItem {
    private String code;
    private String name;
    private int price;
    public MenuItem(String code,String name,int price) {
        this.code=code;
        this.name=name;
        this.price=price;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        code=code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        name=name;
    }
    public int getPrice() {
        return price;
    }
    public void setprice(int price) {
        price=price;
    }

}