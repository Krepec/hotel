import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Employers {

    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","1234");
    PreparedStatement preparedStatement = connection.prepareStatement("select * from employers");
    ResultSet resultSet = preparedStatement.executeQuery();


    public void showAllEmployers() throws SQLException {


        while (resultSet.next()) {

            System.out.println("Imie: " + resultSet.getString("name") + "\nNazwisko: " + resultSet.getString("surname") + "\nWynagrodzenie: " + resultSet.getFloat("salary") + " pln brutto" + "\nStanowisko: " + resultSet.getString("position") + "\nData zatrudnienia: " + resultSet.getString("hire_date") + "\n\n");

        }


    }

    public Employers() throws SQLException {
    }

}