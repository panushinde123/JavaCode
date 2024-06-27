
package Array;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] a= {44,22,55,11,33,66};
		
		for(int i=1;i<a.length;i++)
		{
			int temp=a[i];
			int j=i-1;
			while(j>=0)   //for(;j>=0;j--)
			{
				if(a[j]>temp)
				{
					a[j+1]=a[j];
				}
				else
					break;
				j--;
			}
			a[j+1]=temp;
		}
		System.out.println(Arrays.toString(a));

	}

}
