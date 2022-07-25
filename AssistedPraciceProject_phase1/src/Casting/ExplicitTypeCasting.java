package Casting;

public class ExplicitTypeCasting 
{
		double d = 500.45;
		void conversion() 
		{
			long l = (long)d;
			int i = (int)l;
			System.out.println("Double value"+d);
			System.out.println("long value"+l);
			System.out.println("int value"+i);
		}
		public static void main(String[] args) 
		{
			ExplicitTypeCasting obj = new ExplicitTypeCasting();
			obj.conversion();
		}

}
