package AccessModifiers;
class defAccessSpecifier
{ 
  void display() 
     { 
         System.out.println("You are using defalut access specifier"); 
     } 
} 

public class Default {

	public static void main(String[] args) {
		//default
		System.out.println("Dafault Access Specifier");
		defAccessSpecifier obj = new defAccessSpecifier(); 		  
        obj.display(); 

	}
}

