package collection;

import java.util.TreeSet;

public class treeset1 {
    public static void main(String[] args)
    {
        TreeSet<String> ts1 = new TreeSet<String>();
  
        // Elements are added using add() method
        ts1.add("Z");
        ts1.add("B");
        ts1.add("C");
        ts1.add("A");
        ts1.add("muhammad");
        ts1.add("rifky");
        ts1.add("aditya");
  
        // Duplicates will not get insert
        ts1.add("C");
  
        // Elements get stored in default natural
        // Sorting Order(Ascending)
        System.out.println(ts1);
        
        System.out.println("Initial TreeSet " + ts1);
  
        // Removing the element b
        ts1.remove("B");
  
        System.out.println("After removing element " + ts1);
  
        // Removing the first element
        ts1.pollFirst();
  
        System.out.println("After removing first " + ts1);
  
        // Removing the last element
        ts1.pollLast();
  
        System.out.println("After removing last " + ts1);
    }
}
