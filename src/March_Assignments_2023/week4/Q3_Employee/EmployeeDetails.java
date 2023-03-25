package March_Assignments_2023.week4.Q3_Employee;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EmployeeDetails
{
    Scanner sc=new Scanner(System.in);
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    public void addEmployee(){
        try {
            conn=Connectivity.getConnection();

            System.out.print("Enter name :");
            String name=sc.next();
            System.out.print("Enter designation :");
            String designation=sc.next();
            System.out.print("Enter date of joining yyyy-mm-dd : ");
            String userDate=sc.next();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date userInputDate = dateFormat.parse(userDate);
            System.out.print("Enter Experience :");
            int experience=sc.nextInt();
            System.out.println("Enter salary :");
            int salary= sc.nextInt();
            System.out.println("Enter Status (working/left)");
            String status= sc.next();


            ps=conn.prepareStatement(" INSERT INTO employee (ename, designation, dateOfJoining, experience, salary, status) VALUES(?,?,?,?,?,?)");
           ps.setString(1,name);
           ps.setString(2,designation);
           ps.setString(3,userDate);
           ps.setInt(4,experience);
           ps.setInt(5,salary);
           ps.setString(6,status);
            ps.execute();


            System.out.println("Data Added successfully ");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }



    public void showData(){
        try{
            conn=Connectivity.getConnection();
            Statement stmt= conn.createStatement();
            rs=stmt.executeQuery("select * from employee");

            while(rs.next()){
                int id=rs.getInt("eid");
                String name=rs.getString("ename");
                String designation=rs.getString("designation");
                Date date=rs.getDate("dateOfJoining");
                int experience=rs.getInt("experience");
                int salary=rs.getInt("salary");
                String status=rs.getString("status");
                System.out.println(id + " | "+name +" | "+designation+" | "+date +" | "+ experience +" | "+salary +" | "+status );
                System.out.println();

            }
            System.out.println("-------------------------------------");


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
