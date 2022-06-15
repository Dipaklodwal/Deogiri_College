package list_collection_program;

import java.util.*;

public class LInkhashset_demo {

    public static void main(String[] args) {
        LinkedHashSet<Integer> lhr = new LinkedHashSet<>();

        lhr.add(10);
        lhr.add(01);
        lhr.add(10);
        lhr.add(30);
        lhr.add(30);
        lhr.add(40);
        lhr.add(50);
        lhr.add(60);
        lhr.add(70);
        lhr.add(80);
        Iterator<Integer> tr = lhr.iterator();
        while (tr.hasNext()) {
            System.out.println(tr.next());

        }

    }

}
