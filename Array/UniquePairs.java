package Array;
import java.util.Arrays;
public class UniquePairs {
	public static void main(String[] args) {
		int[] a= {1,2,3,2,3};
		int uniquEleCnt=0;
		//to find unique numbers in array
		for(int i=0;i<a.length;i++)
		{   int cnt=0;
			for(int j=0;j<i;j++)
			{
				if(a[i]==a[j])
				cnt++;
			}
			if(cnt==0)
				uniquEleCnt++;
		}
		int[] b=new int[uniquEleCnt];      //to add elements in b array
		int index=0;
		for(int i=0;i<a.length;i++)
		{   int cnt=0;
			for(int j=0;j<i;j++)
			{
				if(a[i]==a[j])
				cnt++;
			}
			if(cnt==0)
			{
				b[index]=a[i];
			    index++;
			}
		}//calculate pairs of new array
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				System.out.println(b[i]+" "+b[j]);
			}
		}

	}

}
