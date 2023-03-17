package jdbcPracticeProjects.StudentManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectivity {
 public static Connection getconnection() {
     Connection connection;

     try {
         Class.forName("com.mysql.jdbc:Driver");
         connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentManagementSystem", "root", "Sujan@123");

     } catch (ClassNotFoundException e) {
         throw new RuntimeException(e);
     } catch (SQLException e) {
         throw new RuntimeException(e);
     }
     return connection;
 }
}
