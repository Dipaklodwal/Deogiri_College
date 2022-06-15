package Serializationdata;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialazationfile {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Dipak Lodwal";
        e.address = " Aurangabad";
        e.id = 41223;
        e.age = 21;
        try {
            FileOutputStream fileOut= new FileOutputStream("c:\\java_demo\\output\\Employee.ser");
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
