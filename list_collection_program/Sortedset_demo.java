package list_collection_program;

import java.util.*;

public class Sortedset_demo {

    public static void main(String[] args) {
        SortedSet<Integer> lhr = new TreeSet<>();
        lhr.add(10);
        lhr.add(01);
        lhr.add(10);
        lhr.add(50);
        lhr.add(30);
        lhr.add(40);
        lhr.add(50);
        lhr.add(60);
        lhr.add(70);
        lhr.add(90);
        lhr.add(5);

        Iterator<Integer> tr = lhr.iterator();
        while (tr.hasNext()) {
            System.out.println(tr.next());

        }

        System.out.println(lhr);

        SortedSet<String> ts = new TreeSet<>();

        ts.add(" ");
        ts.add(" Amol");
        ts.add(" amol");
        ts.add(" Kunal");
        ts.add(" Amit");
        ts.add(" Vishal ");
        ts.add("Dipali");
        ts.add(" 1");
        ts.add(" 2");
        ts.add(" 3 ");
        System.out.println(ts);

        Iterator<String> tr1 = ts.iterator();
        while (tr1.hasNext()) {
            System.out.println(tr1.next());

        }
    }
}
