package March_Assignments_2023.week3.Assignment19.IOClasses;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {
    public static void main(String[] args) {
        FileOutputStream fout= null;
        try {
            fout = new FileOutputStream("abc.txt");
            BufferedOutputStream bfout = new BufferedOutputStream(fout);
            String s="I am in java Team";
            byte[] b=s.getBytes();
            bfout.write(b);
            bfout.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
