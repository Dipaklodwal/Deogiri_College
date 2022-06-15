package Serializationdata;

import java.util.Scanner;

public class Department extends Employee1 {

    public String department_name;
    public int no_of_Employee;

    public void Department() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter Depaartment name:-");
        department_name = scr.next();
        System.out.println("Enter the No of Employee:-");
        no_of_Employee = scr.nextInt();
    }
}
