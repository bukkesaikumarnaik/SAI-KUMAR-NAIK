package Maps;
import java.util.*;  
public class HasTableExample {
	public static void main(String args[]) {  
	  Hashtable<Integer,String> map=new Hashtable<Integer,String>();        
	     map.put(1,"SATHWIK");    
	     map.put(2,"SAI");   
	     map.put(3,"VIJAY");    
	     map.put(4,"SIVA");    
	     System.out.println("Before remove: "+ map);    
	       // Remove value for key 2  
	       map.remove(2);  
	       System.out.println("After remove: "+ map);  
	   }      
	}  