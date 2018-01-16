import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Rooms {
    // utworzenie polaczenia z lokalna baza danych mysql


    // metoda zwraca informace o wszystkich pokojach
    public void getInfoAllRooms() throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "1234");
        PreparedStatement preparedStatement = connection.prepareStatement("select * from rooms");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println("Numer pokoju: " + resultSet.getInt("room_number") + "\n" + "Cena za pokoj: " + resultSet.getDouble("price")+" pln brutto" + "\nDostepnosc: " + resultSet.getString("available") + "\nLiczba osob: " + resultSet.getInt("persons") + "\nLazienka w pokoju: " + resultSet.getBoolean("bathroom") + "\n");

        }
        connection.close();


    }



    // metoda zwraca wszyskie wolne pokoje
    public void showAllFreeRooms(String personsInRoom) throws SQLException {
        String statement ="select * from rooms where available='" + personsInRoom + "'";
        System.out.println(statement);
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "1234");
        PreparedStatement preparedStatement = connection.prepareStatement(statement);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println("Numer pokoju: " + resultSet.getInt("room_number") + "\n" + "Cena za pokoj: " + resultSet.getDouble("price")+" pln brutto" + "\nDostepnosc: " + resultSet.getString("available") + "\nLiczba osob: " + resultSet.getInt("persons") + "\nLazienka w pokoju: " + resultSet.getBoolean("bathroom") + "\n");

        }
        connection.close();
    }
    //konstruktor bezparametrowy
    public Rooms() throws SQLException {
    }

    //konstruktor z parametrami pokoju
    public Rooms(Integer priceForRoom, String availableRoom, Integer numberOfPersonsInRoom, Boolean bathroom) throws SQLException {
        this.numberOfPersonsInRoom = numberOfPersonsInRoom;
        this.availableRoom = availableRoom;
        this.priceForRoom = priceForRoom;
        this.bathroom = bathroom;

    }

    private Integer priceForRoom;
    private String availableRoom;
    private Integer numberOfPersonsInRoom;
    private Boolean bathroom;



    public void getInfoAboutRoomByRoomNumber(String roomNumberFromKeyboard) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "1234");
        String statement = "select * from rooms where room_number='"+roomNumberFromKeyboard+"'";
        System.out.println(statement);
        PreparedStatement preparedStatement = connection.prepareStatement(statement);

        ResultSet resultSet = preparedStatement.executeQuery();
//        Map<Integer,Rooms> lol = new HashMap<>();
        while (resultSet.next()){

            System.out.println("Numer pokoju: " + resultSet.getInt("room_number") + "\n" + "Cena za pokoj: " + resultSet.getDouble("price")+" pln brutto" + "\nDostepnosc: " + resultSet.getString("available") + "\nLiczba osob: " + resultSet.getInt("persons") + "\nLazienka w pokoju: " + resultSet.getBoolean("bathroom") + "\n");
//            Integer roomNumber = resultSet.getInt(1);
//            Integer priceForRoom = resultSet.getInt("price");
//            String availableRoom = resultSet.getString("available");
//            Integer numberOfPersonsInRoom = resultSet.getInt("persons");
//            Boolean bathroom = resultSet.getBoolean("bathroom");
//            Rooms rooms = new Rooms(priceForRoom,availableRoom,numberOfPersonsInRoom,bathroom);
//            lol.put(roomNumber,rooms);

        }
        connection.close();


    }
    // nadpisanie metody toString wg. mojej potrzeby
    @Override
    public String toString() {
        return "Cena za pokoj: " + priceForRoom;

    }
}

