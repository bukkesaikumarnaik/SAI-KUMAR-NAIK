package AccessModifiers;

public class Main {
	  private String fname = "BUKKE";
	  private String lname = "SAI KUMAR NAIK";
	  private String email = "saikumar9866@gmail.com";
	  private int age = 22;

	  public static void main(String[] args) {
	    Main myObj = new Main();
	    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
	    System.out.println("Email: " + myObj.email);
	    System.out.println("Age: " + myObj.age);
	  }
	}