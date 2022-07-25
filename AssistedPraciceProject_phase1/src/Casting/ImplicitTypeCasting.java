package Casting;

public class ImplicitTypeCasting {

	public static void main(String[] args) {
		int a = 20;
		double d = 100;
		long l = a;
		//implicit type conversion
		float f = l;
		double d1 = f;
		System.out.println("int value"+a);
		System.out.println("long value"+l);
		System.out.println("float value"+f);
		System.out.println("double value"+d1);
		
		
		

	}

}
