package Streamdemo;

import java.io.FileInputStream;

public class Streaminputdisplay {

    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("C:\\java_demo\\Output\\testdemo.txt  ");
            String s = "Data in the file  ";
            System.out.println(s);
            int i = input.read();
            System.out.println(i);
            while (i != -1) {
                System.out.print((char) i);
                i = input.read();
            }
            input.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
