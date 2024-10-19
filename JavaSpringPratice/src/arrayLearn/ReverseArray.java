package arrayLearn;
import java.util.Iterator;
import java.util.Scanner;

public class ReverseArray {
	
		public static void main(String[] args) {
			// TODO Auto-generaed method stub
			int arr[] = {12,48,10,43,65,94};

			
			//reverse of array
			
			for(int i = arr.length-1; i >= 0;  i--) {
					System.out.print(" "+arr[i]+" ");
				
			}

		}

	}

/*
 
Reverse: 94 Reverse: 65 Reverse: 43 Reverse: 10 Reverse: 10 Reverse: 12 
Reverse: 94 Reverse: 65 Reverse: 43 Reverse: 43 Reverse: 12 Reverse: 12 
Reverse: 94 Reverse: 65 Reverse: 65 Reverse: 12 Reverse: 12 Reverse: 12 
Reverse: 94 Reverse: 94 Reverse: 12 Reverse: 12 Reverse: 12 Reverse: 12 
Reverse: 94 Reverse: 12 Reverse: 12 Reverse: 12 Reverse: 12 Reverse: 12 


*/