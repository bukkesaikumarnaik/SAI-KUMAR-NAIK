package Casting;

import java.util.Scanner;

public class TypeCasting {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an Amount in double format: ");
		double amount = input.nextDouble();
		
		int remainingAmount = (int)(amount * 100);
		
		
		int dollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
		
		System.out.println("Remaining Amount is: " + remainingAmount);
		System.out.println("Number of Dollors is: " + dollars);
	}

}
