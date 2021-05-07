package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    public static Connection getConnection(){
        try {
            final String connectionString = "jdbc:mysql://localhost:3306/java_course";
            final String user = "root";
            final String password = "admin";
            return DriverManager.getConnection(connectionString, user, password);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
