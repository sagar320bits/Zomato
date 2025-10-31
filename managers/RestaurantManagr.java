package managers;
import models.*;
import java.util.List;
import java.util.ArrayList;
public class RestaurantManagr {
    List<Restaurant> restaurants=new ArrayList<>();
    private RestaurantManagar instance=null;
    private RestaurantManagr() {

    }
    public static RestaurantManager getInstance() {
        if(instance==null) {
            instance=new RestaurantManagr();
        }
        return instance;
    }
    public void getRestaurant(Restaurant r) {
        restaurants.add(r);
    }
    public List<Restaurant> searchByLocation(String loc) {
        List<Restaurant> result=new ArrayList<>();
        loc=loc.toLowerCase();
        for(Restaurant r: restaurants) {
            String rl=r.getLocation().toLowerCase();
            if(rl.equals(loc)) {
                result.add(r);
            }
        }
            return result;
        }
}
