package list_collection_program;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;

public class Vector_demo {

    public static void main(String[] args) {
        Vector<String> list = new Vector<>();
        list.add("Dipak lodwal");
        list.add("Umakant Kathar");
        list.add("yogesh jadhav");
        list.add("Vishal bade");

        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }
        list.clear();

        System.out.println("After clearing data:-");

        Iterator Itr = list.iterator();
        while (Itr.hasNext()) {
            System.out.println(Itr.next());

        }
    }

}
