package arrayLearn;
import java.util.Scanner;

public class deletePositionElement {
	

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
			
			System.out.println();
			
			//Position to delete from array
			System.out.print("Enter the position you want to delete: ");
			int pos=sc.nextInt();
			
			if(pos<1 || pos>size) {
				System.out.println("Out of size");
				
			}else {
				//delete from array element
				for(int i=pos-1; i<size-1; i++) {
					arr[i] = arr[i+1];
			}
			
			size--; //after deleting element size of array decrease by 1
			
			System.out.println("Array after delete: ");
			//display array
			for(int i=0; i<size; i++) {
				System.out.println("Element at "+i+" position: "+arr[i]);
				}
			}
			sc.close();
			
		}

}
