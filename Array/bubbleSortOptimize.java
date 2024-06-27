package Array;

import java.util.Arrays;

public class bubbleSortOptimize {

	public static void main(String[] args) {
         int[] a= {33,11,55,66,44,22,77,88,99};
		int iterationCnt=0;
		for(int i=0;i<a.length;i++)
		{ 
			int SwappingDone=0;
		     iterationCnt++;
		     
			for(int j=0;j<a.length-1-i;j++)
			{ iterationCnt++;
				if(a[j]<a[j+1])
					continue;
				else 
				{
				    SwappingDone++;
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			if(SwappingDone==0)
				break;
		}
		System.out.println(iterationCnt);
		System.out.println(Arrays.toString(a));
	}

}
