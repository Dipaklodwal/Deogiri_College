package Serializationdata;

import java.util.Scanner;

public class Person {

    String first_name;
    String last_name;
    int age;
    String address;

    public void personinfo() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter your First name:-");
        first_name = scr.next();
        System.out.println("Enter your Lsatname:-");
        last_name = scr.next();
        System.out.println("Enter your Age:-");
        age = scr.nextInt();
        System.out.println("Enter your Address:-");
        address = scr.next();

    }

}
