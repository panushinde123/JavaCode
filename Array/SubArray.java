package Array;

public class SubArray {

	public static void main(String[] args) {
		int[] a= {33,7,90,20,5,50,40};
		int sizeOfSubarray=4;
		int min=Integer.MAX_VALUE;
		int startIndex=-1;
		for(int i=0;i<=a.length-sizeOfSubarray;i++)
		{
			int sum=0;
			for(int k=i;k<=i+sizeOfSubarray-1;k++)
			{
				sum=sum+a[k];
			}
			int avg=sum/sizeOfSubarray;
			if(avg<min)
			{
			   min=avg;
			   startIndex=i;
			}
		}
		System.out.println(min+" "+startIndex);
	}

}
