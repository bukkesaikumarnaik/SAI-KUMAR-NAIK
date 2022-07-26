package Ranges;

import java.util.Scanner;

public class Rangenumbers{
	public static void main(String[] args){
		System.out.print("Enter Range (Ex: 11-25): ");
		Scanner sc=new Scanner(System.in);
		String strRange = sc.nextLine();
		String[] strRangeValues = strRange.split("-");
		int min=0,max=0;
		if(strRangeValues.length==2){
			min = Integer.parseInt(strRangeValues[0].trim());
			max = Integer.parseInt(strRangeValues[1].trim());
			if(min<=max){
				System.out.println("Range Numbers");
				int i=min;
				while(i<=max){
					System.out.print(i+ " ");
					i++;
				}
				System.out.println();
			}
			else {
				System.out.println("Invalid range!");
			}
		}
		else {
			System.out.println("Invalid range!");
		}
		
	}
}