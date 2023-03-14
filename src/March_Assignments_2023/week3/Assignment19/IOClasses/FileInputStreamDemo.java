package March_Assignments_2023.week3.Assignment19.IOClasses;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {

        try {
            FileInputStream fin= new FileInputStream("abc.txt");
             int i= 0;
             while((i=fin.read())!= -1){
            System.out.print((char)i);}

            System.out.println("\n Successful Execution ");
        } catch (IOException e) {

        }

    }
}
