package restaurant;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {

    List<Integer> summaryToPaid = new ArrayList<>();

    public void takeOrder() {
        AddDishToOrder addDishToOrder = new AddDishToOrder();
        OrderList dishesList = new OrderList();
        Scanner inputNumber = new Scanner(System.in);
        boolean endOrder = false;
        while (!endOrder){
        System.out.println("Dzień dobry co chcą Państwo zamówić:\n");
        System.out.println("1. Danie obiadowe\n2. Napoje\n3. Sprawdź zamówienie\n4. Zapłać\n");
            int selectedNumber = inputNumber.nextInt();

            if (selectedNumber == 1) {
                addDishToOrder.addDishToDishList(dishesList);
                endOrder = false;

            } else if (selectedNumber == 2) {
                addDishToOrder.addDrinkToDishList(dishesList);
                endOrder = false;
            } else if (selectedNumber == 3) {
                System.out.println("Zamówiono: "+ dishesList.getDishesMenu());
                endOrder = false;
            }
            else if (selectedNumber == 4) {
                for (Dish dishPrice : dishesList.getDishesMenu()){
                    summaryToPaid.add(dishPrice.price());

                }
                Integer sum = 0;
                for (Integer paidPrice : summaryToPaid)
                    sum = sum + paidPrice;

                System.out.println("Całkowita suma zapłaty wynosi: " + sum + " zł");

            }

        }



    }


}

