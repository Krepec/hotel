package hotel;

import java.sql.*;

public class Employer {
    ConnectionMySql connectionMySql = new ConnectionMySql();


    public void showAllEmployers() throws SQLException {

        ResultSet sqlQuery = connectionMySql.getConnection("select * from employers where name='Krzysztof'");

        while (sqlQuery.next()) {
            System.out.println("Numer pokoju: " + sqlQuery.getInt("room_number") + "\n" + "Cena za pokoj: " + sqlQuery.getDouble("price") + " pln brutto" + "\nDostepnosc: " + sqlQuery.getString("available") + "\nLiczba osob: " + sqlQuery.getInt("persons") + "\nLazienka w pokoju: " + sqlQuery.getBoolean("bathroom") + "\n");

        }

    }

    public Employer() throws SQLException {
    }

}