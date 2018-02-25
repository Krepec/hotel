package restaurant;

import java.util.ArrayList;
import java.util.List;

public class OrderList {

    private List<Dish> dishesMenu = new ArrayList<>();

    public void addDish(Dish dish) {
        dishesMenu.add(dish);
    }

    public List<Dish> getDishesMenu() {
        return dishesMenu;
    }


}



