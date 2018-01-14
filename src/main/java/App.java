



import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class App {

    public static void main(String[] args) throws SQLException {
        //get hired data persons
        List<Integer> roomNumpers = new ArrayList<>();
        Employers employers = new Employers();
        Rooms rooms = new Rooms();

        while (employers.resultSet.next()){

            System.out.println("Imie: "+employers.resultSet.getString("name")+"\nNazwisko: "+employers.resultSet.getString("surname")+"\nWynagrodzenie: "+employers.resultSet.getFloat("salary")+" pln brutto"+"\nStanowisko: "+employers.resultSet.getString("position")+"\nData zatrudnienia: "+employers.resultSet.getString("hire_date")+"\n\n");

        }

        while (rooms.resultSet.next()){
          //  System.out.println(rooms.resultSet.getString(1));
            roomNumpers.add(rooms.resultSet.getInt(1));
        }


        System.out.println(roomNumpers);
       }


}



