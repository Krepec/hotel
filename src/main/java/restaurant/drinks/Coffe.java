package restaurant.drinks;
import restaurant.Dish;

public class Coffe implements Dish {
    @Override
    public Integer price() {
        return 8;
    }

    @Override
    public String dishName() {
        return "Kawa";
    }

    @Override
    public String ingredients() {
        return "Jacobs czarna";
    }

    @Override
    public String toString() {
        return dishName() + " - " + "Cena: " +price();
    }
}
