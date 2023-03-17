package jdbcPracticeProjects.StudentManagementSystem;

public class Address {
    int pincode,studentId;
    String city,State;

    public Address( int studentId, String city, String state,int pincode) {
        this.pincode = pincode;
        this.studentId = studentId;
        this.city = city;
        State = state;
    }
}

