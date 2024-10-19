package arrayLearn;

public class arrayOfMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[5]; //array declaration with size 5
		
		//initialization of array index values
		arr[0]= 97; 
		arr[1]= 95;
		arr[2]= 56;
		arr[3]= 75;
		arr[4]= 44;
		
//		print the index values
		System.out.println("Marks of 1st: "+arr[0]);
		System.out.println("Marks of 2nd: "+arr[1]);
		System.out.println("Marks of 3rd: "+arr[2]);
		System.out.println("Marks of 4th: "+arr[3]);
		System.out.println("Marks of 5th: "+arr[4]);

		System.out.println(); System.out.println();
		
		
	//find minimum value in array
		int minNum=Integer.MAX_VALUE; // assign maximum integer value to variable
		
		for(int i=0; i<arr.length; i++) {
			
			if(minNum>arr[i]) {  //compare "num" with array index value 
				minNum=arr[i];   //if true then assign index value to num variable
			}
			
		}
		System.out.println("Minimum value in array:  "+minNum);
		
		
		
		System.out.println(); System.out.println();
		
	//find maximum value in array
			int maxNum=Integer.MIN_VALUE; // assign maximum integer value to variable
			
			for(int i=0; i<arr.length; i++) {
				
				if(maxNum<arr[i]) {  //compare "num" with array index value 
					maxNum=arr[i];   //if true then assign index value to num variable
				}
				
			}
			System.out.println("Maximum value in array:  "+maxNum);
			
			System.out.println(); System.out.println();
		
	//count length of array
		int count=0;
		String names[]= {"Ram", "Ramesh", "Shanvi",  "Lalit", "Kushal", "Radha"};
		
		for(int i=0; i<names.length; i++) {
			count++;
		}
		
		System.out.println("Total elements in array:  "+count);
		
		System.out.println();
		
		//for-each loop to print elements of array names[]
		for(String name: names) {
			System.out.print(name+" ");
			
		}
		System.out.println();
		System.out.println();
		
		//for loop to print elements of array names[]
		for(int i=0; i<names.length; i++) {
			System.out.println("Names are in array:  "+names[i]);
			
		}
		
		
		
		


	}

}
