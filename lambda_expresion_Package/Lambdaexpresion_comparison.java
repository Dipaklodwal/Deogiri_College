package lambda_expresion_Package;

import java.util.*;
import java.util.ArrayList;

class Products {

    int id;
    String name;
    float price;
    int warrenty;

    public Products(int id, String name, float price, int warrent) {

        this.id = id;
        this.name = name;
        this.price = price;
        this.warrenty = warrent;
    }

}

public class Lambdaexpresion_comparison {

    public static void main(String[] args) {

        List<Products> list = new ArrayList<Products>();

        list.add(new Products(1, " Dell Laptop", 85000f, 2));
        list.add(new Products(2, " Apple Mobile", 150000f, 4));
        list.add(new Products(3, " Keyboard", 1200f, 10));
        list.add(new Products(4, " Bike      ",250000f, 2));

        System.out.println(" Sorting on the basis Of Name:- ");

        Collections.sort(list, (p1, p2) -> {
            return p1.name.compareTo(p2.name);
        });
        for (Products p : list) {
            System.out.println(p.id + " " + p.name + " " + p.price + " " + p.warrenty);
        }

    }

}
