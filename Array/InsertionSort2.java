package Array;

public class InsertionSort2 {

	public static void main(String[] args) {
		int a[]= {11,99,55,33,66,22,88,77};
		
		for(int num:a)
			System.out.print(num+" ");
		System.out.println();
		
		for(int i=1;i<a.length;i++)
		{
			int j=i-1;
			while((a[j]>a[i]) && j>=0)
				j--;
			
			int start=j+1;
			int end=i;
			int temp=a[end];
			
			for(int k=end;k>start;k--)
				a[k]=a[k-1];
			
			a[start]=temp;
		}
		
//		for(int i=1;i<a.length;i++)
//		{  
//			
//			
//			for(int j=i;j>0;j--)
//			{
//				if(a[j]<a[j-1])
//				{
//					int temp=a[j];
//					a[j]=a[j-1];
//				    a[j-1]=temp;
//				}
//				else
//					break;
//			}
//		
//			
//		}
		
		for(int num:a)
			System.out.print(num+" ");

	}

}
