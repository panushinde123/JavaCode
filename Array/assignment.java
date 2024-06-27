package Array;

public class assignment {

	public static void main(String[] args) {
	int[] a= {1,1,1,1,1,1,2,2,2,2,3,3,3,3,3,3,3,4,4,4,4,4,4,4,4,4};
	int b[]= {1,2,3,4};
	
	for(int i=0;i<b.length;i++)
	{
		int count=0;
		for(int j=0;j<a.length;j++)
		{
			if(a[i]==a[j])
				count++;
		}
		System.out.println(b[i]+" "+count);
	}

	}

}
