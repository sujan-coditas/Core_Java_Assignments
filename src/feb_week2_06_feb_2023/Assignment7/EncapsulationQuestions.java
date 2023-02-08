package feb_week2_06_feb_2023.Assignment7;

class BankSystem{
    private String BankManager,Customer;
    private int accountNumber;
    private float bankBalance;

    public String getBankManager() {
        return BankManager;
    }

    public String getCustomer() {
        return Customer;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public float getBankBalance() {
        return bankBalance;
    }

    public void setBankManager(String bankManager) {
        BankManager = bankManager;
    }

    public void setCustomer(String customer) {
        Customer = customer;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBankBalance(float bankBalance) {
        this.bankBalance = bankBalance;
    }
    public void deposit(double amount) {
        bankBalance += amount;
    }

    public boolean withdraw(double amount) {
        if (bankBalance >= amount) {
            bankBalance -= amount;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "BankSystem{" +
                "BankManager='" + BankManager + '\'' +
                ", Customer='" + Customer + '\'' +
                ", accountNumber=" + accountNumber +
                ", bankBalance=" + bankBalance +
                '}';
    }
}

class AreaOfRectangle{
    private int width;
    private  int height;
    private  int Area;


    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    private  int getArea(){
        return Area;
    }

    private  int setArea(){
        return Area;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "AreaOfRectangle{" +
                "width=" + width +
                ", height=" + height +
                ", Area=" + Area +
                '}';
    }
}


public class EncapsulationQuestions {
    public static void main(String[] args) {
     BankSystem bankSystem=new BankSystem();
     bankSystem.setAccountNumber(1234567895);
     bankSystem.setCustomer("Sujan");
     bankSystem.setBankManager("Pratiksha ");
     bankSystem.setBankBalance(23000);
        System.out.println("Manager Name : "+ bankSystem.getBankManager());
        System.out.println("Customer Name : "+ bankSystem.getCustomer());
        System.out.println("Account Balance is :"+bankSystem.getBankBalance());

        AreaOfRectangle areaOfRectangle= new AreaOfRectangle();
        areaOfRectangle.setHeight(50);
        areaOfRectangle.setWidth(100);
        System.out.println("Area of rectangle is: "+ areaOfRectangle.getHeight()*areaOfRectangle.getWidth());
    }
}


/* =================OUTPUT==================
*
* Manager Name : Pratiksha
Customer Name : Sujan
Account Balance is :23000.0



Area of rectangle is: 5000
*/