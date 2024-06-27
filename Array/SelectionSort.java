package Array;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
	int a[]= {22,55,44,77,11,90,23};
	for (int i = 0; i < a.length; i++) {
		int min=a[i];
		int minIndex=i;
		for(int j=i;j<a.length;j++)
		{
			if(a[j]<min)
			{
				min=a[j];
				minIndex=j;
			}
		}
		int temp=a[i];
		a[i]=a[minIndex];
		a[minIndex]=temp;
	}
System.out.println(Arrays.toString(a));
	}

}
