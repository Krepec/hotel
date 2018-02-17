package restaurant.dishes;

import restaurant.Dish;

public class ScrambledEggs implements Dish {
    @Override
    public Integer price() {
        return 12;
    }

    @Override
    public String dishName() {
        return "Jajecznica z boczkiem";
    }

    @Override
    public String ingredients() {
        return "2 jajka, szczypiorek, boczek"; }

    @Override
    public String toString() {
        return dishName() + " - " + "Cena: " + price();
    }
}
