package Factories.java;
import java.util.List;
import models.*;
import strategies.*;
import utils.*;
import models.DeliveryOrder;
import models.PickupOrder;

public class NewOrderFactory implements OrderFactory {
    @Override
    public Order createOrder(User user,Cart cart,Restaurant restaurant,List<MenuItem> menuItems,PaymentStrategy paymentStrategy,double totalCost,String orderType) {
        Order order=null;
        if(orderType.equals("Delivery")) {
            DeliveryOrder deliveryOrder=new DeliveryOrder();
            deliveryOrder.setUserAddress(user.getUser());
            order=deliveryOrder;
        }
        else {
            PickUpOrder pickUpOrder=new PickupOrder();
            pickUpOrder.setUserAddress(user.getUser());
            order=pickUpOrder;
        }
        order.setUser(user);
        order.setRestaurant(restaurant);
        order.setItems(menuItems);
        order.setPaymentStrategy(paymentStrategy);
        order.setScheduled(TimeUtils.getCurrentTime());
        order.setTotal(totalCost);
        return order;
    }
    
}
