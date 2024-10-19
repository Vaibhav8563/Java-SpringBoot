package arrayLearn;
import java.util.Scanner;

public class deleteElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Size of Array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		//take use input of array elements
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Array element are: ");
		//display array
		for(int i=0; i<arr.length; i++) {
			System.out.println("Element at "+i+" position: "+arr[i]);
		}
		
		//Element to delete from array
		System.out.print("Enter the element you want to delete: ");
		int ele=sc.nextInt();
		
		//delete from array
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]==ele) {
				arr[i] = arr[i+1];
			}
			
		}size--;
		
//		for(int i=0; i<size; i++) {
//			for(int j=0; j<size-1; j++) {
//				if(ele==arr[j]) {
//					arr[j] = arr[j+1];
//					}
//				else {
//					System.out.println("Not found");	
//				}	
//				
//			}	
//		}
//		size--;
		
		for(int i=0; i<size; i++) {
			System.out.println("Element at "+i+" position: "+arr[i]);
		}
		
		sc.close();
		
	}

}
