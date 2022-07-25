package Maps;
import java.util.*;
//generic
public class MapExample { 
	public static void main(String args[]){  
	Map<Integer,String> map=new HashMap<Integer,String>();  
	map.put(2,"SATHWIK");  
	map.put(1,"SAI");  
	map.put(3,"SIVA");  
	  //Elements can traverse in any order  
	for(Map.Entry m:map.entrySet()){  
		System.out.println(m.getKey()+" "+m.getValue());  
	  }  
	 }  
	}  
