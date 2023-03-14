package March_Assignments_2023.week3.Assignment19.IOClasses;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fout= new FileOutputStream("abc.txt");
            ObjectOutputStream oout=new ObjectOutputStream(fout);

            String s="Hello this is Sujan ";
            byte[] b=s.getBytes();
            fout.write(b);
            fout.close();
            oout.close();
            System.out.println("Successfully executed  ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
