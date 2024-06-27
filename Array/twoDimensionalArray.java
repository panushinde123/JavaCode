package Array;
import java.util.Arrays;
public class twoDimensionalArray {

	public static void main(String[] args) {
		
		int[][]arr= {
				{10,20,30},{40,50,60},{70,80,90}
		};
		//to print all elements of 2D array
		 for(int i=0;i<arr.length;i++)  //rows
		 {
			 for(int j=0;j<arr[i].length;j++) //columns
			 {
				 System.out.print(arr[i][j]+" ");
			 }
			 System.out.println();
		 }
		 System.out.println();
		 
		 //to print one element
		 for(int i=0;i<arr[1].length;i++)
		 {
			 System.out.print(arr[1][i]+" ");
		 }
		 
		 
		 
		
	}

}
