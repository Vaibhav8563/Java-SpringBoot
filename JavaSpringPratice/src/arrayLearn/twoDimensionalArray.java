package arrayLearn;

public class twoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks[][]= {
				{75,54,67},
				{95,58,77},
				{45,65,83},
				{55,98,79},
			};
		for(int i=0;i<marks.length; i++) {
			for(int j=0; j<marks.length-1; j++) {
				System.out.print("Array list are: "+marks[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println(); System.out.println();
		
		int marks2[][]= {
				{75,54,67,44},
				{95,58,77,65},
				{45,65,83,79},
//				{55,98,79},
			};
		for(int i=0;i<marks2.length; i++) {
			for(int j=0; j<marks2.length; j++) {
				System.out.print("Array list are: "+marks2[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println(); System.out.println();
		
		int marks3[][]= {
				{75,54,67,99},
				{95,58,77,100},
				{45,65,83,49},
				{55,98,79,43},
			};
		for(int i=0;i<marks3.length; i++) {
			for(int j=0; j<marks3.length; j++) {
				System.out.print("Array list are: "+marks3[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
