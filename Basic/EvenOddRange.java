package Basic;

public class EvenOddRange {

	public static void main(String[] args) {
		System.out.println("Even Numbers:");
		
		for(int i=1;i<=100;i++)
		{
			
			if(i%2==0)
			System.out.println(i);
		}
		
		System.out.println("\nOdd Numbers:");
		for(int i=1;i<=100;i++)
		{
			
			if(i%2!=0)
			System.out.println(i);
		}
	}

}
