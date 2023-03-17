package MenuDrivenProjects.StudentManagementSystem;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;



class Student{
 int id,age;
 String name,email;
 Date dob;
 Address address;

    public Student(int id, int age, String name, String email, Date dob, Address address) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", \nage=" + age +
                ", \nname='" + name + '\'' +
                ", \nemail='" + email + '\'' +
                ", \ndob=" + dob +
                ", \naddress=" + address +
                '}';
    }

}
public class AddStudentDetails {

    public static HashMap<Integer,Student> studentData=new HashMap<>();

    public void AddStudent() throws IOException, ParseException {
        int id,age;
        String name,email;
        Date dob;
        Address address;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter name: ");
        name=bf.readLine();
        bf.readLine();
        System.out.print("Enter id: ");
        id= Integer.parseInt(bf.readLine());
        System.out.print("Enter Email :");
        email=bf.readLine();
        System.out.print("Enter Date Of Birth (dd/mm/yyyy) :");
        String dateStr = bf.readLine();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
         dob = df.parse(dateStr);

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

        Student student=new Student(id,age,name,email,dob,address);
        studentData.put(id,student);


    }
}
