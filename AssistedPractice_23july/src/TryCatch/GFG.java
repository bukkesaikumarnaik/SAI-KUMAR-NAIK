package TryCatch;
import java.io.*;
import java.lang.Thread;

public class GFG {

	public static void main(String[] args) 
	{
		try 
		{
			for(int i = 2 ; i <= 10 ;i++) 
			{
				Thread.sleep(500);
				System.out.println(i);
			}
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
		
	}

}
