package Array;
import java.util.Arrays;
public class evenAndoddArray {
	public static void main(String[] args) {
		int[] a= {11,22,33,44,66,77,88,22};
		int evenCnt=0;
		int oddCnt=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				evenCnt++;
			else
				oddCnt++;
		}
		int[] evenArr=new int[evenCnt];
		int[] oddArr=new int[oddCnt];
		int evenIndex=0;
		int oddIndex=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				evenArr[evenIndex]=a[i];
				evenIndex++;
			}
			else
			{
				oddArr[oddIndex]=a[i];
				oddIndex++;
			}
		}
		System.out.println(Arrays.toString(evenArr));
//		for(int i=0;i<evenArr.length;i++)
//		{
//			System.out.print(evenArr[i]+" ");
//		}
		System.out.println(Arrays.toString(oddArr));
		
	}

}
