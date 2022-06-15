package Serializationdata;

import java.util.Scanner;

public class Employee1 extends Person {

    int id;
    double salary;
    String company_name;

    public void Person() {
        Scanner scr = new Scanner(System.in);

        System.out.println("Enter your Id:-");
        id = scr.nextInt();

        System.out.println("Enter the Salay:-");
        salary = scr.nextLong();

        System.out.println("Company Name:-");
        company_name = scr.next();
    }

}
