package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
    public static void main(String[] args) throws SQLException {
        
        
        final String connectionString = "jdbc:mysql://localhost:3306/Java";
        final String user = "root";
        final String password = "admin";

        Connection connection = DriverManager.getConnection(connectionString, user, password);

        System.out.println("Connected");
        connection.close();
    }

}
