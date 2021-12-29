
package collection;

import java.util.TreeSet;

public class treeset2 {
    public static void main(String[] args)
    {
        TreeSet<String> ts
            = new TreeSet<String>();
  
        // Elements are added using add() method
        ts.add("Geek");
        ts.add("For");
        ts.add("Geeks");
  
        System.out.println(ts);
        
        String check = "Geeks";
  
        // Check if the above string exists in
        // the treeset or not
        System.out.println("Contains " + check
                           + " " + ts.contains(check));
  
        // Print the first element in
        // the TreeSet
        System.out.println("First Value " + ts.first());
  
        // Print the last element in
        // the TreeSet
        System.out.println("Last Value " + ts.last());
  
        String val = "Geek";
  
        // Find the values just greater
        // and smaller than the above string
        System.out.println("Higher " + ts.higher(val));
        System.out.println("Lower " + ts.lower(val));
    }
}
