package Streamdemo;

import java.io.FileOutputStream;

public class Streamoutputwrite{

    public static void main(String[] args) {
        try {
            FileOutputStream fd= new FileOutputStream("C:\\java_demo\\Output\\testdemo.txt");
            String rd= "Welcome to Deogori college Aurangabad ";
            byte b[] = rd.getBytes();
            fd.write(b);
            fd.close();
            System.out.println("Success......");

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

}
