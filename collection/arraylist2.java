package collection;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class arraylist2 {
    public static void main(String[] args)
    {
        //  Buat Objek dari ArrayList
        ArrayList<String> arr_data = new ArrayList<String>();
         
        System.out.print("Input jumlah Data : ");
        int jlh_data = new Scanner(System.in).nextInt();
         
        for(int a = 0; a < jlh_data; a++)
        {
            System.out.print("Masukkan Data ke-"+(a+1)+": ");
            arr_data.add(new Scanner(System.in).next());
        }
        
        Collections.sort(arr_data);
        
        System.out.println("\nData : ");
        for(String o : arr_data){
            System.out.println(o);
        }
         
        System.out.print("\nInput Data yang akan dihapus : ");
        int data_hapus = new Scanner(System.in).nextInt();
        arr_data.remove(data_hapus);
         
        System.out.println("\nData :");
        for(String o : arr_data){
            System.out.println(o);  
        }
    }

}
