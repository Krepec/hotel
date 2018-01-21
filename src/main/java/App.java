import hotel.Employer;
import hotel.Reception;
import hotel.Room;
import restaurant.Order;

import java.sql.*;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws SQLException {


        //ustworzenie uchwytow(refenecjii) do klas
//        Reception reception = new Reception();
//        Room getInfoAboutRooms = new Room();
//        Employer employers = new Employer();
//        Scanner scanner = new Scanner(System.in);
//        reception.checkInAndOut();

   /*  //wywolanie metody ktora zwraca informacje o wszystkich pracownikach
        employers.showAllEmployers();

       //wywolanie metody ktora pobiera dane na podstawie nr pokoju
        System.out.println("Podaj nr pojou: ");
        String inputRoomNumber = scanner.nextLine();
        getInfoAboutRooms.getInfoAboutRoomByRoomNumber(inputRoomNumber);

        //wywolanie metody ktora pobiera dane o wszystkich pokojach
        getInfoAboutRooms.getInfoAllRooms();

        //wywolanie metody ktora pokaze wszystkie wolne pokoje
        getInfoAboutRooms.showAllFreeOrBusyRooms("wolny");

        //wywolanie metody ktora pokaze wszystkie zajete pokoje
        getInfoAboutRooms.showAllFreeOrBusyRooms("zajety");*/

        Order order = new Order();
        order.takeOrder();
    }
}



