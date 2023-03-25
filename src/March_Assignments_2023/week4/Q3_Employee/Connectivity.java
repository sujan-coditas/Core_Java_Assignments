package March_Assignments_2023.week4.Q3_Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectivity {
    public static Connection getConnection() throws SQLException  {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Q3employee", "root", "Sujan@123");
            System.out.println("Connection Established......");
        } catch (SQLException e) {
            System.out.println("Unable to connect to database");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return conn;
    }
}
