package lambda_expresion_Package;
import java.util.*;
interface Sayble{
    public String say(String name,String working); 
}
public class SingleArgument_demo {
    public static void main(String[] args) {
        Sayble s1 =(name,working)->{
            
            return " Hello ,"+name + " It is "+ working+ " College";  
        };
        System.out.println(s1.say(" Deogiri, Aurngabad","  Java Training"));
        
        Sayble s2 = (name,working)->{
            return "  Hello , " + name+ " It is Offered " + working; 
        };
        System.out.println(s2.say(" Deogiri College ","  Mechanical, B-TECH"));
    }
}
