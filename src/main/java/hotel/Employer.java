package hotel;

import java.sql.*;

public class Employer {
    ConnectionMySql connectionMySql = new ConnectionMySql();


    public void showAllEmployers() throws SQLException {

        ResultSet sqlQuery = connectionMySql.getConnection("select * from employers where name='Krzysztof'");

        while (sqlQuery.next()) {
            System.out.println("Imię: " + sqlQuery.getString("name") + "\n" + "Nazwisko:" + sqlQuery.getString("surname")  + "\nWynagrodzenie: " + sqlQuery.getInt("salary") + "\nStanowisko: " + sqlQuery.getString("position") + "\nData zatrudnienia: " + sqlQuery.getString("hire_date") + "\n");

        }

    }

    public Employer() throws SQLException {
    }

}