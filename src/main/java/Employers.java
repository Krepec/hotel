import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Employers {

    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","1234");
    PreparedStatement preparedStatement = connection.prepareStatement("select * from employers");
  //  PreparedStatement preparedStatement1 = connection.prepareStatement("describe employers");
    ResultSet resultSet = preparedStatement.executeQuery();
   // ResultSet resultSet1 = preparedStatement.executeQuery();





    public Employers() throws SQLException {
    }
}