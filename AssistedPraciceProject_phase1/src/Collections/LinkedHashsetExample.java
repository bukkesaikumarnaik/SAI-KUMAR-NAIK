package Collections;
import java.util.*; 
public class LinkedHashsetExample {
	public static void main(String args[]){  
	LinkedHashSet<String> set=new LinkedHashSet<String>();  
	set.add("SATHWIK");  
	set.add("SAI");  
	set.add("VIJAY");  
	set.add("SAI");  
	Iterator<String> itr=set.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	}  
	}  