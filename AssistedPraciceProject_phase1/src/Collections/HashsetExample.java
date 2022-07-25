package Collections;
import java.util.*;  
public class HashsetExample{  
public static void main(String args[]){  
//Creating HashSet and adding elements  
HashSet<String> set=new HashSet<String>();  
set.add("SATHWIK");  
set.add("SAI");  
set.add("SATHWIK");  
set.add("SAI");  
//Traversing elements  
Iterator<String> itr=set.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  