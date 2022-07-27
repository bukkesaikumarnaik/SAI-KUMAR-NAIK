package Sorting;
import java.util.Scanner;
public class LinearSearch 
{
	public static void main(String[] args) 
	{
		int i, size, res;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of numbers : ");
		size = sc.nextInt();
		int array[] = new int[size];
 		
		System.out.println("Enter " + size + " numbers");
		
		for(i = 0; i<size;i++)
			array[i] = sc.nextInt();
		
		System.out.println("Enter the search element");
		res = sc.nextInt();
		
		for(i = 0; i < size; i++) 
		{
			if(array[i] == res) 
			{
				System.out.println("The search element " + res + " is found at location " + (i+1));
				break;
			}
		}
		if(i == size)
			System.out.println("The search element " + res + " is not found");
	}
	

}
