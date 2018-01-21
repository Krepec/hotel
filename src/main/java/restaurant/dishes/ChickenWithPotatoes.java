package restaurant.dishes;
import restaurant.Dish;

public class ChickenWithPotatoes implements Dish {
    @Override
    public Integer price() {
        return 25;
    }

    @Override
    public String dishName() {
        return "Pierś kurczaka z ziemniakami";
    }

    @Override
    public String ingredients() {
        return "Smażona pierś kurczaka, ziemniaki, surowka z białej kapusty";
    }
}
