package Array;
public class BinarySearch {

	public static void main(String[] args) {
		int[] a= {11,22,33,44,55};
		int data=22;
		int start=0;
		int end=a.length-1;
		int cnt=0;
		
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(a[mid]==data)
			{ 
				cnt++;
				System.out.println("Element Found at Index "+mid);
				break;
			}
		  if(data>a[mid])
			    start=mid+1;
		  else
			  end=mid-1;  
	} 
		if(cnt==0)
		System.out.println("Not Found");
		
	}
}


