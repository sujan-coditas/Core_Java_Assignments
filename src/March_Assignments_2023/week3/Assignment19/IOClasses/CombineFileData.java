package March_Assignments_2023.week3.Assignment19.IOClasses;

import java.io.*;

public class CombineFileData {
    public static void main(String[] args) {
        try {
            FileInputStream fin1=new FileInputStream("abc.txt");
            FileInputStream fin2=new FileInputStream("createFile.txt");

            FileOutputStream fout=new FileOutputStream("testOutput.txt");
            SequenceInputStream seqin= new SequenceInputStream(fin1,fin2);
            int i=0;;

            while((i=seqin.read())!= -1){
                fout.write(i);
            }
            System.out.println("Executed...");
            fout.close();
            seqin.close();
            fin2.close();
            fin1.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
