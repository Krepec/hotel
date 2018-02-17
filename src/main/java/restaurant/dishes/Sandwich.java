package restaurant.dishes;
import restaurant.Dish;

public class Sandwich implements Dish {
    @Override
    public Integer price() {
        return 8;
    }

    @Override
    public String dishName() {
        return "Kanapka z szynka";
    }

    @Override
    public String ingredients() {
        return "Bułka grahamka, masło, szynka, ser żółty, sałata lodowa";
    }

    @Override
    public String toString() {
        return dishName() + " - " + "Cena: " +price();
    }
}
