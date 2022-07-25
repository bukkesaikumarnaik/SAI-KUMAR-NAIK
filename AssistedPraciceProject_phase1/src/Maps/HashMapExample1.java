package Maps;
import java.util.*; 
public class HashMapExample1 {   //example of removing element
	public static void main(String args[]) {  
	    HashMap<Integer,String> map=new HashMap<Integer,String>();          
	      map.put(1,"SATHWIK");    
	      map.put(2,"VIJAY");    
	      map.put(3,"SAI");  
	      map.put(4, "SIVA");  
	    System.out.println("Initial list of elements: "+map);  
	    //key-based removal  
	    map.remove(3);  
	    System.out.println("Updated list of elements: "+map);  
	    //value-based removal  
	    map.remove(2);  
	    System.out.println("Updated list of elements: "+map);  
	    //key-value pair based removal  
	    map.remove(4, "SIVA");  
	    System.out.println("Updated list of elements: "+map);  
	   }      
	}  