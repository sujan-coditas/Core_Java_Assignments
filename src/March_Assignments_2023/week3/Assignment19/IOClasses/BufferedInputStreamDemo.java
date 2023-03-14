package March_Assignments_2023.week3.Assignment19.IOClasses;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fin=new FileInputStream("abc.txt");
            BufferedInputStream bfin= new BufferedInputStream(fin);
                int i=0;
                while((i=bfin.read())!= -1){
                    System.out.println((char) i);
                }
                bfin.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
