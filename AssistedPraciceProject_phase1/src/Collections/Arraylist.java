package Collections;

import java.io.*;
import java.util.*;
  
public class Arraylist  {
    
      // Main Method
    public static void main(String[] args)
    {
  
        // Declaring the ArrayList with
        // initial size n
        ArrayList<Integer> al = new ArrayList<Integer>();
  
        // Appending new elements at
        // the end of the list
        for (int i = 0; i <= 10; i++)
            al.add(i);
  
        // Printing elements
        System.out.println(al);
  
        // Remove element at index 3
        al.remove(5);
  
        // Displaying the ArrayList
        // after deletion
        System.out.println(al);
  
        // Printing elements one by one
        for (int i = 0; i < al.size(); i++)
            System.out.print(al.get(i) + " ");
    }
}