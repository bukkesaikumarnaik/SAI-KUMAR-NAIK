package Maps;
import java.util.*;  
//remove method example
public class LinkedHashMapExample {
	public static void main(String args[]) {  
	    Map<Integer,String> map=new LinkedHashMap<Integer,String>();        
	     map.put(1,"SATHWIK");    
	     map.put(2,"VIJAY");    
	     map.put(3,"SAI");    
	     System.out.println("Before invoking remove() method: "+map);     
	    map.remove(3);  
	    System.out.println("After invoking remove() method: "+map);    
	   }      
	}  