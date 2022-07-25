package AccessModifiers;
import java.util.*;

class Person {
	  protected String fname = "BUKKE";
	  protected String lname = "SAI KUMAR NAIK";
	  protected String email = "saikumar9866@gmail.com";
	  protected int age = 22;
	}

	class Student extends Person {
	  private int graduationYear = 2022;
	  public static void main(String[] args) {
	    Student myObj = new Student();
	    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
	    System.out.println("Email: " + myObj.email);
	    System.out.println("Age: " + myObj.age);
	    System.out.println("Graduation Year: " + myObj.graduationYear);
	  }
	}