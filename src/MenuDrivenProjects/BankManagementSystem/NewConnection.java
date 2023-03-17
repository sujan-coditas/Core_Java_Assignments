package MenuDrivenProjects.BankManagementSystem;


import java.util.Scanner;

class Employee{
String name,email,simtype;
Address address;

long mobileNumber;

    public Employee(String name, String email, String simtype, Address address, long mobileNumber) {
        this.name = name;
        this.email = email;
        this.simtype = simtype;
        this.address = address;
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", simtype='" + simtype + '\'' +
                ", address=" + address +
                ", mobileNumber=" + mobileNumber +
                '}';
    }
}
public class NewConnection {

Scanner sc=new Scanner(System.in);


}
