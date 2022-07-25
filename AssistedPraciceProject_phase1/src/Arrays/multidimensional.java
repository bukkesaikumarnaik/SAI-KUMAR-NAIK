package Arrays;

public class multidimensional {

	public static void main(String[] args) {
		int arr[][] = { { 2, 5, 6},  
		                { 9, 6, 1}, 
		                { 7, 4, 2} };
		
		for(int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++)
				System.out.println(arr[i][j] + " ");
			System.out.println(" ");
		}

	}

}
