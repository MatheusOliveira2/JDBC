package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDatabase {
public static void main(String[] args) throws SQLException {
    

    Connection connection = DatabaseConnection.getConnection();

    Statement stmt = connection.createStatement();
    stmt.execute("CREATE DATABASE IF NOT EXISTS java_course");
    connection.close();
    
    }
    
}
