package restaurant.dishes;
import restaurant.Dish;
public class Pizza implements Dish {
    @Override
    public Integer price() {
        return 18;
    }

    @Override
    public String dishName() {
        return "Pizza";
    }

    @Override
    public String ingredients() {
        return "Grube ciasto, ser chedar, sos pomidorowy, salami, oliwki";
    }
}
