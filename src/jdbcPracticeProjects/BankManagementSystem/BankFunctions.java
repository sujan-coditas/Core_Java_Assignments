package jdbcPracticeProjects.BankManagementSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.Random;
import java.util.Scanner;

public class BankFunctions {
    Connection connection;
    PreparedStatement ps;
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader bf = new BufferedReader(isr);
    int balance=0;

    public void addUser() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankManagementSystem", "root", "Sujan@123");

            System.out.println("Enter name :");
            String name = bf.readLine();
            System.out.println("Enter user id :");
            int uid = Integer.parseInt(bf.readLine());
            System.out.println("Enter Address :");
            String address = bf.readLine();
            System.out.println("Enter Phone number :");
            String phoneNo = bf.readLine();
            System.out.println("Enter email :");
            String email = bf.readLine();
            System.out.println("Enter Account Type (savings/current)");
            String accountType = bf.readLine();
            String companyName = null;
            if (accountType.equalsIgnoreCase("current")) {
                System.out.println("Enter Company name : ");
                companyName = bf.readLine();
            }
            Random rand = new Random();
            long number = (long) (rand.nextDouble() * 900000000000L) + 100000000000L;
            String accountNumber = String.valueOf(number);

            ps = connection.prepareStatement("INSERT INTO bankAccounts (uname, uid, address, phoneNo, email, accountType, companyName, accountNumber) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, name);
            ps.setInt(2, uid);
            ps.setString(3, address);
            ps.setString(4, phoneNo);
            ps.setString(5, email);
            ps.setString(6, accountType);
            ps.setString(7, companyName);
            ps.setString(8, accountNumber);
            ps.executeUpdate();

            System.out.println("Congratulation your Account has been created ");
            System.out.println("Account number is : " + accountNumber);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



    public void cashDeposit(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankManagementSystem", "root", "Sujan@123");

            System.out.println("Enter account Number :");
            String accountNumber=bf.readLine();

            ps=connection.prepareStatement("select accountNumber from bankAccounts where accountNumber = ?");
            ps.setString(1,accountNumber);
            ResultSet rs=ps.executeQuery();
             if(!rs.next()){
                 throw new UserDoesntExistException();
             }
             else{
                 System.out.println("Enter Deposit :");
                 int Deposit= Integer.parseInt(bf.readLine());
                 balance+=Deposit;
                 ps= connection.prepareStatement("INSERT INTO transaction (accountNumber, deposit, balance) VALUES (?, ?, ?) ON DUPLICATE KEY UPDATE deposit = deposit + VALUES(deposit), balance = balance + VALUES(balance)");
                 ps.setString(1, accountNumber);
                 ps.setInt(2, Deposit);
                 ps.setInt(3, balance);
                 ps.executeUpdate();



                 System.out.println("your amount has been Deposited ");
             }


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (UserDoesntExistException e) {
            System.out.println();        }

    }
    public void cashWithdraw() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankManagementSystem", "root", "Sujan@123");

            System.out.println("Enter account Number :");
            String accountNumber = bf.readLine();

            ps = connection.prepareStatement("select accountNumber from bankAccounts where accountNumber = ?");
            ps.setString(1, accountNumber);
            ResultSet rs = ps.executeQuery();
            if (!rs.next()) {
                throw new UserDoesntExistException();
            } else {
                System.out.println("Enter Deposit :");
                int withdraw = Integer.parseInt(bf.readLine());
                balance -= withdraw;
                ps = connection.prepareStatement("INSERT INTO transaction (accountNumber, withdraw, balance) VALUES (?, ?, ?) ON DUPLICATE KEY UPDATE withdraw = deposit + VALUES(deposit), balance = balance + VALUES(balance)");
                ps.setString(1, accountNumber);
                ps.setInt(2,withdraw );
                ps.setInt(3, balance);
                ps.executeUpdate();


                System.out.println("your amount has been withdrawn ");
            }


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (UserDoesntExistException e) {
            System.out.println();
        }
    }

    }

