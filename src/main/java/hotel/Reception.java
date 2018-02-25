package hotel;


import org.springframework.beans.factory.annotation.Autowired;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Reception {
    @Autowired
    private ConnectionMySql connectionMySql;
    private Scanner scanner = new Scanner(System.in);

    public void checkInAndOut() throws SQLException {
        boolean check = true;

        while (check) {
            System.out.println("1. Zameldowanie\n2. Wymeldowanie\n3. Powrot do menu\n\nWybierz numer");
            Integer selectNumber = scanner.nextInt();

            if (selectNumber == 1) {
                System.out.println("Podaj numer pokoju w ktrym chcesz sie zameldowac");
                checkAvailability("wolny", "zajety");

            } else if (selectNumber == 2) {
                System.out.println("Podaj numer pokoju z ktorego sie wymeldowujesz");
                checkAvailability("zajety", "wolny");

            }
        }
    }

    private void checkAvailability(String availability, String status) throws SQLException {
        Integer roomNumber = scanner.nextInt();
        ResultSet sqlQuery = connectionMySql.getConnection("select available from rooms where room_number='" + roomNumber + "'");
        while (sqlQuery.next()) {
            String roomAvailiable = sqlQuery.getString("available");
            System.out.println(roomAvailiable);
            if (roomAvailiable.equals(availability)) {
                connectionMySql.getConnectionAndExecute("update rooms set available='" + status + "' where room_number='" + roomNumber + "'");
                System.out.println("Zmieniono dostepnosc pokoju " + roomNumber + " na " + status + "");
            } else System.out.println("TEN POKOJ JEST " + status + "!!! \nWybierz inny pokoj :)");
        }
    }
}