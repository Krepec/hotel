

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) throws SQLException {
        //get hired data persons
        Employers employers = new Employers();


        while (employers.resultSet.next()){

            System.out.println("Imie: "+employers.resultSet.getString("name")+"\nNazwisko: "+employers.resultSet.getString("surname")+"\nWynagrodzenie: "+employers.resultSet.getFloat("salary")+" pln brutto"+"\nStanowisko: "+employers.resultSet.getString("position")+"\nData zatrudnienia: "+employers.resultSet.getString("hire_date")+"\n\n");

        }

       }


}



