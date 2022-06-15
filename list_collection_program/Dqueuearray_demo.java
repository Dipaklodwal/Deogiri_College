package list_collection_program;

import java.util.*;

public class Dqueuearray_demo {

    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<>();

        dq.addLast("Last String ");
        dq.add("aaa");
        dq.add("bbb");
        dq.addFirst("first String ");
        dq.add("ccc");
        dq.add("ddd");
        dq.add("eee");
        dq.add("fff");
        dq.add("Current Added");
        dq.add("ggg");
        
        dq.offer("1");
        dq.offerFirst("2");
        dq.offerLast("3");

        for (String str : dq) {
            System.out.println(str);
        }
        System.out.println(dq);
    }
}
