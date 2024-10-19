package arrayLearn;
import java.util.Scanner;

public class userInputArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.print("Enter the size of Array: ");
		
		
		size=sc.nextInt();  //size of array
		System.out.println();
		
		int arr[] = new int[size]; //array of user size
		
		
		//array input from user
		for(int i=0; i<=size-1; i++) {
			System.out.print("Enter the element at "+i+" poisition: ");
			arr[i] = sc.nextInt();
//			System.out.print(arr[i]);
		}
		
		
		System.out.println();
		System.out.print("Array is: ");
		
		//print array
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		//Reverse of array
		System.out.println();
		System.out.print("Reverse of array:  ");
		for(int i = arr.length-1; i >= 0;  i--) {
			System.out.print(" "+arr[i]+" ");
		
	}

	}

}

//OUTPUT
/*

		Enter the size of Array: 
		5
		Enter the element at 0 poisition: 
		1
		Enter the element at 1 poisition: 
		2
		Enter the element at 2 poisition: 
		3
		Enter the element at 3 poisition: 
		4
		Enter the element at 4 poisition: 
		5
		
		Array is:1 2 3 4 5 

*/
