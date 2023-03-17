package MenuDrivenProjects.BankManagementSystem;

public class Address {
    String city,State;
    int pincode;

    public Address(String city, String state, int pincode) {
        this.city = city;
        State = state;
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", State='" + State + '\'' +
                ", pincode=" + pincode +
                '}';
    }
}
