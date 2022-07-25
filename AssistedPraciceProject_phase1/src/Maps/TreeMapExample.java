package Maps;
import java.util.*;
public class TreeMapExample {
	public static void main(String args[]) {  
	    TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(1,"SATHWIK");    
	      map.put(2,"SAI");    
	      map.put(3,"VIJAY");    
	      map.put(4,"SIVA");    
	      System.out.println("Before invoking remove() method");  
	      for(Map.Entry m:map.entrySet())  
	      {  
	          System.out.println(m.getKey()+" "+m.getValue());      
	      }  
	      map.remove(2);      
	      System.out.println("After invoking remove() method");  
	      for(Map.Entry m:map.entrySet())  
	      {  
	          System.out.println(m.getKey()+" "+m.getValue());      
	      }  
	      }  
	}  