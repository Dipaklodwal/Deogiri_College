package Serializationdata;

import java.util.Scanner;

public class Project extends Department implements java.io.Serializable {

    public String project_name;
    public String duration;

    public void project1() {
        Scanner scr =new Scanner(System.in);
          
        System.out.println("Enter Project Name:-");
        project_name= scr.next();
        System.out.println("Enter project Duration:-");
        duration = scr.next();
    }
}
