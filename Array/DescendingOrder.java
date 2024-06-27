package Array;

import java.util.Arrays;

public class DescendingOrder {

	public static void main(String[] args) {
		int[] a= {44,55,-11,55,-77,88,33};
		for(int i=0;i<a.length;i++)
		{
			int maxindex=i;
			for(int j=i;j<a.length;j++)
			{
				if(a[j]>a[maxindex])
				{
					maxindex=j;
				}
			}
			int temp=a[i];
			a[i]=a[maxindex];
			a[maxindex]=temp;
		}
		System.out.println(Arrays.toString(a));
	}

}
