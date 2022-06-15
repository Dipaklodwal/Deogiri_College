package student;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialazationstudent {

    public static void main(String[] args) {
        Student e = new Student();
        e.first_name = "Dipak";
        e.last_name=" lodwal";
        e.address = "Hivra Kabli Tq.jafrabad Dist Jalna";
        e.roll_no = 41223;
        e.mobile_no =9075661245l;
        try {
            FileOutputStream fileOut = new FileOutputStream("c:\\java_demo\\output\\Student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.println("Serialazation Successfull compile");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

}
