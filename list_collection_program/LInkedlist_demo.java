package list_collection_program;

import java.util.*;

public class LInkedlist_demo {

    public static void main(String[] args) {

        LinkedList<String> al = new LinkedList<>();
        al.add("Dipak lodwal");
        al.add("Umakant Kathar");
        al.add("yogesh jadhav");
        al.add("Vishal bade");
        al.add("Pritesh Jadhav");
        al.add("Prashant Chandege");
        al.add("Amir Pathan");
        al.add("Shubham Chilwant");
        al.pop();

        Iterator<String> Itr = al.iterator();
        while (Itr.hasNext()) {
            System.out.println(Itr.next());

        }

    }
}
