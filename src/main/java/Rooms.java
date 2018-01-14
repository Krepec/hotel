import java.sql.*;

public class Rooms {
    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","1234");
    PreparedStatement preparedStatement = connection.prepareStatement("select * from rooms");
    ResultSet resultSet = preparedStatement.executeQuery();


    public Rooms() throws SQLException {
        }

    }

