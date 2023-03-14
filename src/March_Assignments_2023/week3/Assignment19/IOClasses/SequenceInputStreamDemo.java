package March_Assignments_2023.week3.Assignment19.IOClasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputStreamDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fout1=new FileInputStream("abc.txt");
            FileInputStream fout2=new FileInputStream("createFile.txt");

            SequenceInputStream seqin= new SequenceInputStream(fout1,fout2);
             int i=0;
             while ((i= seqin.read())!= -1){
                 System.out.print((char) i +" ");
             }
             fout1.close();
             fout2.close();
             seqin.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
