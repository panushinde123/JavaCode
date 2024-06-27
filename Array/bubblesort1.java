package Array;

public class bubblesort1 {

	public static void main(String[] args) {
		int a[]= {22,55,99,44,66,88,11,77};
		
		for(int j=0;j<a.length;j++)
		{ 
			for(int i=0;i<a.length-1-j;i++)  //a.length-1
			{
				if(a[i]>a[i+1])
				{
					
					int temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
				
			}
			
		}

		for(int k:a)
			System.out.println(k);
	
	}

}
