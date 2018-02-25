package hotel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;
import java.util.*;

@RestController
@EnableAutoConfiguration
public class Room {
    //Utworzenie uchwytu(referencjii) do klasy hotel.ConnectionMySql
    @Autowired
    private ConnectionMySql connectionMySql;

    // metoda zwraca informace o wszystkich pokojach
    @RequestMapping("/allrooms")
    public List<String> getInfoAllRooms() throws SQLException {
        List<String> roomList = new ArrayList<>();
        ResultSet sqlQuery = connectionMySql.getConnection("select * from rooms");
        while (sqlQuery.next()) {
            System.out.println("Numer pokoju: " + sqlQuery.getInt("room_number") + "\n" + "Cena za pokoj: " + sqlQuery.getDouble("price") + " pln brutto" + "\nDostepnosc: " + sqlQuery.getString("available") + "\nLiczba osob: " + sqlQuery.getInt("persons") + "\nLazienka w pokoju: " + sqlQuery.getBoolean("bathroom") + "\n");
            roomList.add("Numer pokoju: " + sqlQuery.getString("room_number"));
            roomList.add("Cena za pokoj: " + sqlQuery.getString("price"));
            roomList.add("Dostepnosc: " + sqlQuery.getString("available"));
        }
        return roomList;
    }

    // metoda zwraca wszyskie wolne lub zajete pokoje
    public void showAllFreeOrBusyRooms(String availableRoom) throws SQLException {
        String statement = "select * from rooms where available='" + availableRoom + "'";
        ResultSet sqlQuery = connectionMySql.getConnection(statement);
        while (sqlQuery.next()) {
            System.out.println("Numer pokoju: " + sqlQuery.getInt("room_number") + "\n" + "Cena za pokoj: " + sqlQuery.getDouble("price") + " pln brutto" + "\nDostepnosc: " + sqlQuery.getString("available") + "\nLiczba osob: " + sqlQuery.getInt("persons") + "\nLazienka w pokoju: " + sqlQuery.getBoolean("bathroom") + "\n");

        }

    }

    public void getInfoAboutRoomByRoomNumber(String roomNumberFromKeyboard) throws SQLException {

        String statement = "select * from rooms where room_number='" + roomNumberFromKeyboard + "'";
        ResultSet sqlQuery = connectionMySql.getConnection(statement);
        while (sqlQuery.next()) {

            System.out.println("Numer pokoju: " + sqlQuery.getInt("room_number") + "\n" + "Cena za pokoj: " + sqlQuery.getDouble("price") + " pln brutto" + "\nDostepnosc: " + sqlQuery.getString("available") + "\nLiczba osob: " + sqlQuery.getInt("persons") + "\nLazienka w pokoju: " + sqlQuery.getBoolean("bathroom") + "\n");
        }

    }

    //konstruktor bezparametrowy
    public Room() throws SQLException {
    }

    //konstruktor z parametrami pokoju
    public Room(Integer priceForRoom, String availableRoom, Integer numberOfPersonsInRoom, Boolean bathroom) throws SQLException {
        this.numberOfPersonsInRoom = numberOfPersonsInRoom;
        this.availableRoom = availableRoom;
        this.priceForRoom = priceForRoom;
        this.bathroom = bathroom;

    }

    private Integer priceForRoom;
    private String availableRoom;
    private Integer numberOfPersonsInRoom;
    private Boolean bathroom;

  /*  // nadpisanie metody toString wg. mojej potrzeby
    @Override
    public String toString() {
        return "Cena za pokoj: " + priceForRoom;

    }*/
}

