package Collections;
import java.util.*; 

public class TreeSetExample
{  
public static void main(String args[]){  
//Creating and adding elements  
TreeSet<String> set=new TreeSet<String>();  
set.add("Sai");  
set.add("Vijay");  
set.add("Ravi");  
set.add("Sathwik");  
//traversing elements  
Iterator<String> itr=set.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  
