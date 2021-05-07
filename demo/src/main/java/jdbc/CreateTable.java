package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) throws SQLException {
        String query = "CREATE TABLE IF NOT EXISTS people ("
        + "code INT AUTO_INCREMENT PRIMARY KEY, "
        + "name VARCHAR(255) NOT NULL)";

        Connection connection = DatabaseConnection.getConnection();
        Statement stmt = connection.createStatement();
        stmt.execute(query);
    }
    
}
