package hotel;

import java.sql.*;

public class ConnectionMySql {

    // metoda tworzy polaczenie do lokalnej bazy mySql oraz
    public ResultSet getConnection(String statement) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","1234");
        PreparedStatement preparedStatement = connection.prepareStatement(statement);
        ResultSet resultSet = preparedStatement.executeQuery();

        return resultSet;

    }
    //
    public boolean getConnectionAndExecute(String statement) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","1234");
        PreparedStatement preparedStatement = connection.prepareStatement(statement);
        boolean resultSet = preparedStatement.execute();


        return resultSet;
    }


}
