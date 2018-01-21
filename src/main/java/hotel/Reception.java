package hotel;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Reception {
    ConnectionMySql connectionMySql = new ConnectionMySql();
    Scanner scanner = new Scanner(System.in);

    public void changeAvailableRoom() throws SQLException {
        System.out.println("Podaj numer pokoju z ktrego chcesz sie wymeldowac?");
        String roomNumber = scanner.nextLine();
        ResultSet sqlQuery = connectionMySql.getConnection("select available from rooms where room_number='" + roomNumber + "'");
        connectionMySql.getConnectionAndExecute("update rooms set available='zajety' where room_number='" + roomNumber + "'");
        while (sqlQuery.next()) {
            System.out.println("Dostepnosc: " + sqlQuery.getString("available"));

        }

    }
}