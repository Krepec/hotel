import hotel.ConnectionMySql;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class EmployerTest {
    ConnectionMySql connectionMySql = new ConnectionMySql();

    @org.junit.Test
    //checking the values are correct and sql connection
    public void shoudShowAllEmployers() throws SQLException {

        List<String> expectedEmployerList = new ArrayList<>();
        List<String> employerList = new ArrayList<>();




        ResultSet sqlQuery = connectionMySql.getConnection("select * from employers");
        while (sqlQuery.next()) {
            employerList.add(sqlQuery.getString("name")+" "+ sqlQuery.getString("surname"));
        }
        System.out.println(employerList);

        expectedEmployerList.add("Anna Kowalska");
        expectedEmployerList.add("Tomasz Nowak");
        expectedEmployerList.add("Bartosz Frycz");
        expectedEmployerList.add("Dariusz Anasiewicz");
        expectedEmployerList.add("Magda Gesler");
        expectedEmployerList.add("Robert Maklowicz");
        expectedEmployerList.add("Magdalena Kot");
        expectedEmployerList.add("Stefan Dadej");
        expectedEmployerList.add("Krzysztof Wrona");
        expectedEmployerList.add("Dorota Wrona");

        assertEquals(expectedEmployerList,employerList);


    }
    @org.junit.Test
    //checking adding to list (list size) and sql connection
    public void shouldAddEmplyersToList() throws SQLException {

        List<String> employerList = new ArrayList<>();

        ResultSet sqlQuery = connectionMySql.getConnection("select * from employers");
        while (sqlQuery.next()){
            employerList.add(sqlQuery.getString("name") + sqlQuery.getString("surname") + sqlQuery.getInt("salary"));
        }

        assertEquals(10,employerList.size());

    }

}
