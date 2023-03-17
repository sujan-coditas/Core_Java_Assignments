package jdbcPracticeProjects.StudentManagementSystem;

public class DuplicateEntryException extends Exception {
    DuplicateEntryException(){
        System.out.println("Duplicate id values cant be inserted ");
    }
}
