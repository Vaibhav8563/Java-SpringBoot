package SortingAlgorithms;
import java.util.Scanner;

public class bubble {

	void sort() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of Array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.print("Enter the elements of Array: ");
		//taking user input of array
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		
		//bubble sort ascending order
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println("Ascending order of array: ");
		//print array elements
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		//bubble sort descending order
				for(int i=0; i<arr.length; i++) {
					for(int j=0; j<arr.length-1-i; j++) {
						if(arr[j]<arr[j+1]) {
							int temp = arr[j];
							arr[j] = arr[j+1];
							arr[j+1] = temp;
						}
					}
				}
				System.out.println();
				System.out.println("Descending order of array: ");
				//print array elements
				for(int i=0; i<arr.length; i++) {
					System.out.print(arr[i]+" ");
				}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bubble obj = new bubble();
		obj.sort();

	}

}
