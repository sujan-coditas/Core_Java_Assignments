package jdbcPracticeProjects.StudentManagementSystem;

import com.mysql.cj.jdbc.PreparedStatementWrapper;

import java.sql.*;
import java.util.Arrays;
import java.util.Scanner;
public class AddStudent {
    Scanner sc=new Scanner(System.in);
    int id,age;
    String name,division;

    Connection connection;
    PreparedStatement ps;
    Statement st;
    ResultSet rs;
    public void addStudentDetails(){

        try {
            Class.forName("com.mysql.jdbc.Driver");
             connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagementsystem","root","Sujan@123");
             st= connection.createStatement();
            System.out.print("Enter name");
            name=sc.next();
            System.out.print("Enter id: ");
            id=sc.nextInt();
            st=connection.createStatement();

            rs= st.executeQuery("Select * from student where id="+id);
            if(rs.next()){
                try{
                    throw new DuplicateEntryException();
                } catch (DuplicateEntryException e) {
                    System.out.println();                }
            }
            else {
                System.out.print("Enter division ");
                division=sc.next();
                System.out.print("Enter age ");
                age=sc.nextInt();

                ps=connection.prepareStatement("insert into Student(id,name,division,age) values(?,?,?,?)");

                ps.setObject(1,id);
                ps.setObject(2,name);
                ps.setObject(3,division);
                ps.setObject(4,age);
                ps.executeUpdate();

                System.out.println("Details Added");
            }
        } catch (SQLException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }

    public  void displayStudent(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagementsystem","root","Sujan@123");
            st=connection.createStatement();

            System.out.println("Enter Student id :");
            int studentId=sc.nextInt();


            rs = st.executeQuery("select * from Student where id="+studentId);

            if (rs.next()){
                System.out.println("Student Details are : ");
                System.out.println("Name : "+ rs.getString(2));
                System.out.println("Student ID : "+ rs.getInt(1));
                System.out.println("Division : "+ rs.getString(3));
                System.out.println("Age : "+ rs.getString(4));
                System.out.println("----------------------");
                System.out.println();

            }
            else{
                try{
                    throw new StudentDoesnotExistsException();
                } catch (StudentDoesnotExistsException e) {
                    System.out.println();                }
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void addMarks(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagementsystem","root","Sujan@123");
            st=connection.createStatement();



            System.out.println("Enter id: ");
            int studentId=sc.nextInt();
            rs = st.executeQuery("select * from student where id = "+studentId);

            if(rs.next()){
                boolean result=true;
                System.out.println("Enter marksheet ID");
                int msheetId=sc.nextInt();
                System.out.println("Hindi marks : ");
                int hindi=sc.nextInt();
                System.out.println("English marks : ");
                int English=sc.nextInt();
                System.out.println("Math marks : ");
                int math=sc.nextInt();
                System.out.println("physics marks : ");
                int physics=sc.nextInt();
                System.out.println("chemistry marks : ");
                int chemistry=sc.nextInt();


                ps= connection.prepareStatement("insert into studentmarks (studentId,marksheetId,Hindi,English,Math,physics,chemistry) values(?,?,?,?,?,?,?)");

                ps.setInt(1,studentId);
                ps.setInt(2,msheetId);
                ps.setInt(3,hindi);
                ps.setInt(4,English);
                ps.setInt(5,math);
                ps.setInt(6,physics);
                ps.setInt(7,chemistry);
                ps.execute();

               if(rs.getInt(3)<35 || rs.getInt(4)<35 || rs.getInt(5)<35|| rs.getInt(6)<35||rs.getInt(7)<35){
                   result=false;                }

                if(result){
                    int sum=rs.getInt(3)+rs.getInt(4)+rs.getInt(5)+rs.getInt(6)+rs.getInt(7);
                    double Percentage=((sum/5)*100);
                    System.out.println(Percentage);
                    System.out.println("Passed");
                }
                else{
                    System.out.println("Fail");}
            }


                try{
                    throw new StudentDoesnotExistsException();
                } catch (StudentDoesnotExistsException e) {
                    System.out.println();                }



        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
