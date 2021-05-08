package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class InsertPeople {
    public static void main(String[] args) throws SQLException { 
        String sql = "INSERT INTO people (name) VALUES (?)";

        Connection connection = DatabaseConnection.getConnection();
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, "José");
        stmt.execute();

        connection.close();
    }
}
