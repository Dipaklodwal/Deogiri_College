package student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserilazationstudent {

    public static void main(String[] args) {
        Student e = null;
        try {
            FileInputStream fileIn = new FileInputStream("c:\\java_demo\\output\\Student.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e = (Student) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException a) {
            a.getStackTrace();
            return;

        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not fount ");
            c.getStackTrace();
            return;
        }
        System.out.println("Deserilazation Employee:-");
        System.out.println("Name:-" + e.first_name);
        System.out.println("last name:-" + e.last_name);
        System.out.println("address:-" + e.address);
        System.out.println("Roll no:-" + e.roll_no);
        System.out.println("mobile no :-" + e.mobile_no);
    }

}
