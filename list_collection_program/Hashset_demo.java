package list_collection_program;

import java.util.*;

public class Hashset_demo {

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Amol");
        hs.add("Amol");
        hs.add("Amit");
        hs.add("Kunal");
        hs.add("kunal");
        hs.add("Dipak ");
        hs.add("Prashant");
        hs.add(" ");
        hs.add("Devanand ");

        Iterator<String> Itr = hs.iterator();
         while (Itr.hasNext()) {
            System.out.println(Itr.next());
        }
        System.out.println(hs);
        HashSet<String> hs1 = new HashSet<>();
        hs1.addAll(hs);
        hs1.add(" ");
        hs1.add(" Amol");
        hs1.add(" amol");
        hs1.add(" Kunal");
        hs1.add(" Amit");
        hs1.add(" 1");
        hs1.add(" 2");
        hs1.add(" ");
        System.out.println(hs1);

        boolean value1 = hs1.remove(" 2 ");
        System.out.println(" 2 Is  remove Value  " + value1);
        System.out.println(hs1);

        boolean value2 = hs.removeAll(hs);
        System.out.println("Is has Remove :-" + value2);
        System.out.println(hs);

    }
}
