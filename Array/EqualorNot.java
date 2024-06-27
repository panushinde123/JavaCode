package Array;

public class EqualorNot {

	public static void main(String[] args) {
		int a[]= {11,22,33,44};
		int b[]= {11,22,33,55};
		
		if(a.length==b.length)
		{
			int cnt=0;
			for(int i=0;i<a.length;i++)
			{ 
				if(a[i]!=b[i])
		     	{
				    cnt++;
			
				  System.out.println("Array a and b is not equal");
			       break;
			     }
			}
			if(cnt==0)
				System.out.println("Array a and b is equal");
				
		}
		else
		{
			System.out.println("Array length is not equal");
		}
	}

}
