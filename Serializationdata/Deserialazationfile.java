package Serializationdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialazationfile {

    public static void main(String[] args) {
        Employee e = null;
        try {
            FileInputStream fileIn = new FileInputStream("c:\\java_demo\\output\\Employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e = (Employee) in.readObject();
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
        System.out.println("Name:-" + e.name);
        System.out.println("address:-" + e.address);
        System.out.println("Id :-" + e.id);
        System.out.println("Age:-" + e.age);

    }

}
