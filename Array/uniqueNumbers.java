package Array;
import java.util.Arrays;
public class uniqueNumbers {
	public static void main(String[] args) {
           int[] a= {33,11,55,33,11,44,55,66};
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
		System.out.println(uniquEleCnt);  //unique element count
		
		int[] b=new int[uniquEleCnt];
		//to add elements in b array
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
		}
		System.out.println(Arrays.toString(b));
	}

}
