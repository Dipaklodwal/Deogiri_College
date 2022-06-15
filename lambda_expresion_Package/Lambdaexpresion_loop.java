package lambda_expresion_Package;

import java.util.*;

public class Lambdaexpresion_loop {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Manoj");
        list.add("Vijay");
        list.add("Dipeeka");
        list.add("Prashant");
        list.add("Rucha");
        list.add("Vishal");
        list.add("Dipak lodwal");
        list.add("Prashmesh");

        list.forEach((n) -> System.out.println(n));

    }

}
