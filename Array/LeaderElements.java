package Array;

public class LeaderElements {

	public static void main(String[] args) {
		int[] a= {11,22,88,44,66,77,33,22};
		
		for(int i=0;i<a.length;i++)
		{  int cnt=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
					continue;
				else
				{
					cnt++;
					break;
				}
			}
			if(cnt==0)
				System.out.println(a[i]);
		}

	}

}
