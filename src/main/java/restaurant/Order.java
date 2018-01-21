package restaurant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {

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
                System.out.println(dishesList.getDishesMenu());
                endOrder = true;
            }
        }























        /*while (!startOrder) {
            if (1 == selectNumber) {
                System.out.println("Proszę wybrać danie obiadowe:\n1. Jajecznica\n2. Pizza\n3. Kanapka\n4. Kurczak z ziemniakami\n5. Powrót\n");


                while (!selectOrder) {
                    Integer selectDishNo = scanner.nextInt();
                    if (selectDishNo == 1) {
                        dishesList.addDish(new ScrambledEggs());
                        selectOrder = false;
                    } else if (selectDishNo == 2) {
                        dishesList.addDish(new Pizza());
                        selectOrder = false;
                    } else if (selectDishNo == 3) {
                        dishesList.addDish(new Sandwich());
                        selectOrder = false;
                    } else if (selectDishNo == 4) {
                        dishesList.addDish(new ChickenWithPotatoes());
                        selectOrder = false;
                    } else if (selectDishNo == 5) {
                        selectOrder = true;

                    }
                }

            } else if (2 == selectNumber) {


                while (!selectOrder) {
                    System.out.println("Proszę wybrać napój:\n1. Herbata\n2. Kawa\n3. Powrót\n");
                    Integer selectDishNo = scanner.nextInt();
                    if (1 == selectDishNo) {
                        dishesList.addDish(new Tea());
                        selectOrder = false;
                    } else if (2 == selectDishNo) {
                        dishesList.addDish(new Coffe());
                        selectOrder = false;
                    }
                    else   {
                        selectOrder = true;
                        break;
                        }
                }

            } else if (3 == selectNumber) {
                System.out.println(dishesList);
            }

        */
    }

}

