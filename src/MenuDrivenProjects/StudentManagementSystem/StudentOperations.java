package MenuDrivenProjects.StudentManagementSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static MenuDrivenProjects.StudentManagementSystem.AddStudentDetails.studentData;

public class StudentOperations {
Scanner sc=new Scanner(System.in);
    public void search(){
        System.out.print("Enter id of Person : ");
        int searchId=sc.nextInt();
       Student student=studentData.get(searchId);
        if (student == null) {
            System.out.println("Student with ID " + searchId + " does not exist.");
        } else {
            System.out.println("Student details:");
            System.out.println(student.toString());
        }

    }

    public void update() throws IOException {
        System.out.print("Enter id of Person : ");
        int searchId=sc.nextInt();
        Student student=studentData.get(searchId);
        if (student == null) {
            System.out.println("Student with ID " + searchId + " does not exist.");
        } else{
            int id,age;
            String name,email;
            Date dob;
            Address address;
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter name: ");
            name=bf.readLine();
            System.out.print("Enter id: ");
            id= Integer.parseInt(bf.readLine());
            System.out.print("Enter Email :");
            email=bf.readLine();
            System.out.print("Enter Date Of Birth (dd/mm/yyyy) :");
            String dateStr = null;
            try {
                dateStr = bf.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            try {
                dob = df.parse(dateStr);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }

            System.out.print("Enter age: ");
            age= Integer.parseInt(bf.readLine());

            System.out.println("Enter Address:");
            System.out.print("Street: ");
            String street = bf.readLine();
            System.out.print("City: ");
            String city = bf.readLine();
            System.out.print("Pincode: ");
            int pincode = Integer.parseInt(bf.readLine());
            address = new Address(street, city, pincode);

            studentData.put(id,student);

        }
    }

    public void delete()throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter ID of student to delete: ");
        int id = Integer.parseInt(bf.readLine());

        Student student = studentData.get(id);
        if (student == null) {
            System.out.println("Student with ID " + id + " does not exist.");
        } else {
            studentData.remove(id);
            System.out.println("Student with ID " + id + " deleted successfully.");
        }
    }

    public void display(){
        System.out.println(studentData);
    }
}
