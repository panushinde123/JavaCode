package Array;

public class FindAnElement {

	public static void main(String[] args) {
		int[] a= {10,20,30,40,50,30};
		int count=0;
		int data=30;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==data)
			{
				count++;
			}
		}
		if(count==0)
		   System.out.println("False");
		else
			System.out.println("True");

	}

}
