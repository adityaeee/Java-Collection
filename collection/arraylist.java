package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylist {
    public static void main(String[] args) {
 
       /* ARRAY LIST */
       // create an array list
       ArrayList <String> culinary = new ArrayList <String>();
       System.out.println("Initial size of culinary list \t\t : " + culinary.size());
 
       // add elements to the array list
       culinary.add("PINDANG TULANG");
       culinary.add("RUJAK CINGUR");
       culinary.add("KETOPRAK");
       culinary.add("MODEL IWAK");
       culinary.add("SOTO AYAM");
       culinary.add("RENDANG BALADO");
 
       // display the array list
       System.out.println("Contents of culinary list \t\t : " + culinary);
 
       // Add an element into index=1
       culinary.add(3, "GOMAK");
       System.out.println("\"GOMAK\" was inserted \t\t\t : " + culinary);
       System.out.println("Size of culinary list now \t\t : " + culinary.size());
       culinary.add("SERABI");
       culinary.add("PECEL LELE");
       culinary.add("RAGIT");
       culinary.add("BATAGOR");
 
       // IndexOf
       System.out.println("The index of \"E\" \t\t\t : " + culinary.indexOf("E"));
       // Checking if an element is included to the list
       boolean item = culinary.contains("MODEL IWAK");
       System.out.println("ArrayList contains MODEL IWAK ? \t : " + item);
 
       // Getting the element in a specific position
       String getItem = (String) culinary.get(4);
       System.out.println("The item in index 4 is \t\t\t : " + getItem);
       // Checking if array list is empty
       boolean check = culinary.isEmpty();
       System.out.println("Arraylist is empty ? \t\t\t : " + check);
 
       // Remove elements from the array list
       culinary.remove("GOMAK");
       System.out.println("Delete element of \"GOMAK\"\t\t : " + culinary);
       System.out.println("Size of culinary list now \t\t : " + culinary.size());
       culinary.remove(6); // index
       System.out.println("Delete the 7th item \t\t\t : " + culinary);
       System.out.println("Size of culinary list now \t\t : " + culinary.size());
       culinary.remove(culinary.size()-1); // remove the last element
       System.out.println("Delete the last item \t\t\t : " + culinary);
       System.out.println("Size of culinary list now \t\t : " + culinary.size());
 
       // display ArrayList vertically
       System.out.println("------------------oOo--------------------");
       System.out.println("Display ArrayList Vertically by using For");
          for(int i=0; i<culinary.size(); i++){
              System.out.println(culinary.get(i));
       }
 
       // display ArrayList vertically by using Iterator
       System.out.println("\nDisplay ArrayList Vertically by using Iterator");
          Iterator<String> iterator = culinary.iterator();
             while(iterator.hasNext()){
                String element = (String) iterator.next();
                     System.out.println(element);
       } 
 
       // clear
       culinary.clear();
       System.out.println("\nContents of culinary list \t\t : " + culinary);
 
       } //main
}//class