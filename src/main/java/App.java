



import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws SQLException {


        //get hired data persons
        Rooms getInfoAboutRooms = new Rooms();
        Employers employers = new Employers();
        employers.showAllEmployers();

        //wywolanie metody ktoar pobiera dane na podstawie nr pokoju
        System.out.println("Podaj nr pojou: ");
        Scanner scanner = new Scanner(System.in);
        String inputRoomNumber = scanner.nextLine();
        getInfoAboutRooms.getInfoAboutRoomByRoomNumber(inputRoomNumber);

        //wywolanie metody ktora pobiera dane o wszystkich pokojach
        getInfoAboutRooms.getInfoAllRooms();

        //wywolanie metody ktora pokaze wszystkie wolne lub zajete pokoje
        System.out.println("Podaj zajety lub wolny");
        getInfoAboutRooms.showAllFreeRooms(scanner.nextLine());


    }
}



