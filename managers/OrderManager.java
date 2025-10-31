package managers;
import java.util.ArrayList;
import java.util.List;
import models.*;

public class OrderManager {
    private List<Order> orders=new ArrayList<>();
    private static OrderManager instance=null;
    private OrderManager() {

    }

}
private static OrderManager getInstance() {
    if(instance==null) {
        instance=new OrderManager();
    }
    return instance;
}
public void addOrder(Order order) {
    orders.add(order);
}
public void listorder() {
    System.out.println("List of Order");
    for(Order order: orders) {
        system.out.println(order.getType+"order for"+order.getUser().getName()+"Total: "+order.getTotal()+"at: "+order.getScheduled());
    }
}