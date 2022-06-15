package lambda_expresion_Package;

import java.util.*;
import java.util.ArrayList;
import java.util.stream.Stream;

class products {

    int id;
    String name;
    float price;

    public products(int id, float price, String name) {
        this.id = id;
        this.name = name;
        this.price = price;

    }
}

public class Lambdaexpresion_filter_collect {

    public static void main(String[] args) {
        List<products> list = new ArrayList<>();
        list.add(new products(1,15815,"samsung f41 "));
        list.add(new products(2,18200,"samsung j7"));
        list.add(new products(3,150000,"iphone"));
        list.add(new products(4,15815,"samsung"));
        list.add(new products(5,15815,"samsung"));
        list.add(new products(6,15815,"samsung"));
        

    }
}
