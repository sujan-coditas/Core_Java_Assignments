package jdbcPracticeProjects.BankManagementSystem;

public class UserDoesntExistException extends Exception{
    UserDoesntExistException(){
        System.out.println("user does not exists ");
    }
}
