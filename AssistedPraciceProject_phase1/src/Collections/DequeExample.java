package Collections;
import java.util.*;
public class DequeExample 
{
	public static void main(String[] args) {  
	//Creating Deque and adding elements  
	Deque<String> deque = new ArrayDeque<String>();  
	deque.add("SATHWIK");  
	deque.add("SAI KUMAR");  
	deque.add("SIVA");  
	//Traversing elements  
	for (String str : deque) {  
	System.out.println(str);  
	}  
	}  
	}  