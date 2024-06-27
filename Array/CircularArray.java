package Array;

import java.util.Arrays;

public class CircularArray {

	public static void main(String[] args) {
		int[] a= {11,22,33,44,55};
		for (int j = 0; j < a.length; j++) 
		{
			int temp=a[0];
			for (int i = 1; i < a.length; i++)
			{
				a[i-1]=a[i];
			}
			a[a.length-1]=temp;
			System.out.println(Arrays.toString(a));
		}


	}

}
