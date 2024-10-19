package arrayLearn;

import java.util.Iterator;
import java.util.Scanner;

public class shortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int arr[] = {45,78,97,13,47,15,66};

		boolean asc = true; //to check ascending or not
		int temp = 0;
		
		
		//print array
		System.out.print("Array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		//to check ascending or not
		for (int i = 0; i < arr.length - 1; i++) { 
			if (arr[i] > arr[i + 1]) {
				asc = false;
			}

		}
		if (asc) {
			System.out.println("Ascending Order.");// if  asc = true
		} else {
			System.out.println("Not Ascending.");// if   asc = false
		}
		
		//sort array
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
				
			}
			
		}
		System.out.println();
		
		//print sorted array
		System.out.print("Sorted Array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
		
		//to check ascending or not
		System.out.println();
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				asc = false;
			}else {
				asc=true;
			}

		}
		if (!asc) {
			System.out.println("Ascending Order.");// if  asc = true
		} else {
			System.out.println("Not Ascending.");// if   asc = false
		}

	}
}
