package jdbcPracticeProjects.StudentManagementSystem;

public class StudentDoesnotExistsException extends Exception {
    StudentDoesnotExistsException(){
        System.out.println("Student doesnt exists enter details first ");
    }
}
