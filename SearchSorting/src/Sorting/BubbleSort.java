package Sorting;
public class BubbleSort {
	public static void sort(int arr[]) {
		int temp;
			for(int i=0;i<arr.length;i++){
				for(int j=0;j<arr.length-i-1;j++){
					if(arr[j]>arr[j+1]){
						temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
	}

	public static void main(String[] args) {
		int arr[] = { 4, 45, 65, 25, 9 };
		sort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}

}