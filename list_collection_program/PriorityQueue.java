package list_collection_program;

//import java.util.PriorityQueue;
import java.util.*;
//import java.util.PriorityQueue;

public class PriorityQueue {
    
    public static void main(String[] args) {

       //PriorityQueue<String> pq = new PriorityQueue<>();
        java.util.PriorityQueue<String> pq=new java.util.PriorityQueue<>();
       
        pq.add("Dipak lodwal");
        pq.add("Umakant Kathar");
        pq.add("yogesh jadhav");
        pq.add("Vishal bade");
        pq.add("Pritesh Jadhav");
        pq.add("Prashant Chandege");
        pq.add("Amir Pathan");
        pq.add("Shubham Chilwant");
        
        System.out.println("Head"+ " " +pq.element());
        
        System.out.println("CEO"+ "  "+pq.peek());
        
        System.out.println("Itareting the queue of Element:-");
        
        
        Iterator<String> Itr = pq.iterator();
        while (Itr.hasNext()) {
            System.out.println(Itr.next());

        }
        pq.remove();
        pq.poll();
        System.out.println("After Removing two Elements :-");
        Iterator<String> Itr1=pq.iterator();
        while (Itr1.hasNext()) {
            System.out.println(Itr1.next());
            
        }

    }
}



   