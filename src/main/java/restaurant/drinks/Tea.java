package restaurant.drinks;
import restaurant.Dish;

public class Tea implements Dish {
    @Override
    public Integer price() {
        return 6;
    }

    @Override
    public String dishName() {
        return "Herbata";
    }

    @Override
    public String ingredients() {
        return "Herbata zielona, cukier, cytryna";
    }
}
