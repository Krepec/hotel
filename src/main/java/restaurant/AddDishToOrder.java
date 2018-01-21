package restaurant;

import java.util.Scanner;

import restaurant.dishes.*;
import restaurant.drinks.Coffe;
import restaurant.drinks.Tea;

public class AddDishToOrder {

    Scanner inputNumber = new Scanner(System.in);

    public void addDishToDishList(OrderList orderList) {


        boolean endAddDish = false;
        while (!endAddDish) {
            System.out.println("Proszę wybrać danie obiadowe:\n1. Jajecznica\n2. Pizza\n3. Kanapka\n4. Kurczak z ziemniakami\n5. Powrót\n");
            Integer selectDishNo = inputNumber.nextInt();
            if (selectDishNo == 1) {
                orderList.addDish(new ScrambledEggs());
                System.out.println("d");
                endAddDish = false;
            } else if (selectDishNo == 2) {
                orderList.addDish(new Pizza());
                endAddDish = false;
            } else if (selectDishNo == 3) {
                orderList.addDish(new Sandwich());
                endAddDish = false;
            } else if (selectDishNo == 4) {
                orderList.addDish(new ChickenWithPotatoes());
                endAddDish = false;
            } else if (selectDishNo == 5) {
                endAddDish = true;
            }

        }
    }

    public void addDrinkToDishList(OrderList orderList) {


        boolean endAddDish = false;
        while (!endAddDish) {
            System.out.println("Proszę wybrać napój:\n1. Herbata\n2. Kawa\n3. Powrót\n");
            Integer selectDishNo = inputNumber.nextInt();
            if (selectDishNo == 1) {
                orderList.addDish(new Tea());
                endAddDish = false;
            } else if (selectDishNo == 2) {
                orderList.addDish(new Coffe());
                endAddDish = false;
            } else if (selectDishNo == 3) {
                endAddDish = true;
            }
        }
    }}




