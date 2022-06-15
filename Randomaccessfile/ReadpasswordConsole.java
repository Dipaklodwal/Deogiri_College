package Randomaccessfile;

import java.io.Console;
public class ReadpasswordConsole {

    public static void main(String[] args) {
        Console cn = System.console();
        System.out.println("Please Enter your password:-");
        char[] ch = cn.readPassword();
        
        System.out.println("please Enter your user Id:-");
        String username = cn.readLine();
        
        String pass = String.valueOf(ch);
        System.out.println("password is :- " + pass);
        
        String userid = String.valueOf(username);
        System.out.println("User id is :-"+userid);
    }

}
