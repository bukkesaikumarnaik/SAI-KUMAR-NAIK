package Strings;

public class StringConversinExample {
public static void concat1(String s1)
{

	s1 = s1 ; ;
}


public static void concat2(StringBuilder s2)
{
    s2.append("SAI KUMAR Welcome to the JAVA World");
}
public static void concat3(StringBuffer s3)
{
    s3.append("SAI KUMAR Welcome to JAVA");
}

public static void main(String[] args)
{
	String s1 = "SAI KUMAR";
	concat1(s1);
	System.out.println("String: " + s1);
	StringBuilder s2 = new StringBuilder("Hello!");
	concat2(s2);
	System.out.println("StringBuilder: " + s2);
	StringBuffer s3 = new StringBuffer("HELLO!");
    concat3(s3);
    System.out.println("StringBuffer: " + s3);
}
}

 