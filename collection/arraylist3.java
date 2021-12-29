package collection;
import java.util.ArrayList;
import java.util.Collections;
public class arraylist3 {
      public static void main(String[] args) { 
    ArrayList<String> myNumbers = new ArrayList<String>();
    
    myNumbers.add("4");
    myNumbers.add("3");
    myNumbers.add("6");
    myNumbers.add("1");
    myNumbers.add("5");
    myNumbers.add("2");
    myNumbers.add(0,"8");

    for (String i : myNumbers) {
      System.out.println(i);
    }
    
    System.out.println("\njumlah elemen dalam array   : "+ myNumbers.size());
    
    System.out.println("\nmengsorting nilai");
    Collections.sort(myNumbers);
    System.out.println(myNumbers);      
         
    System.out.println("\nmenghapus nilai");
    myNumbers.remove(3);
    myNumbers.remove("2");
    myNumbers.remove(myNumbers.size()-1);
    System.out.println(myNumbers);
    
    System.out.println("\nMengubah nilai");      
    myNumbers.get(0);
    myNumbers.set(0,"9");
    System.out.println(myNumbers);
          
    System.out.print("\nmenghapus seluruh isi dalam array");
    myNumbers.clear();
    boolean check = myNumbers.isEmpty();
    System.out.println("\nArraylist is empty ? \n " + check);
  } 
}
