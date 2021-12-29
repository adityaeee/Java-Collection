package collection;
import java.util.LinkedList;
public class linkedlist {
    public static void main(String[] args) {
 
             System.out.println("LINKED LIST\n");
 
             LinkedList<String> culinary = new LinkedList<String>();
             //add elements to LinkedList
             culinary.add("GUDEG");
             culinary.add("PINDANG TULANG");
             culinary.add("RENDANG BALADO");
             culinary.add("MIE CELOR");
             culinary.add("SOTO BABAT");
             culinary.add("RAGIT");

             //Check list empty or not
              if (culinary.size()==0){
              System.out.println("Linked list is empty");
           }
             else{
                 System.out.println("Linked list size: " + culinary.size());
             }
 
            // print LinkedList
            System.out.println("LinkedList contains : " + culinary);
            //delete element list
            System.out.println("Delete the element!");
            System.out.println("Choose Delete of the element : " + culinary.remove(4));
            System.out.println("The contents of array are " + culinary);
            System.out.println("The size of linkedlist is "+ culinary.size()); 
 
            culinary.add(2, "SIOMAY");
            System.out.println("After inserting \"SIOMAY\", LinkedList contains : " + culinary);
            // To get first element from Java LinkedList, use
            System.out.println("The First element of LinkedList is : " +culinary.getFirst());
            // To get last element from Java LinkedList, use
            System.out.println("The Last element of LinkedList is : " +culinary.getLast());
            System.out.println(); System.out.println();
 
      } //main
}//class
