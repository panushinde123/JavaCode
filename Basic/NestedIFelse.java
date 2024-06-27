package Basic;

public class NestedIFelse {

	public static void main(String[] args) {
		int a=20;int b=90;
		int c=80;
		
		if(a>b&&a>c)
		{
			System.out.println("A is max");
			{
				if(b<c)
					System.out.println("B is min");
				else
					System.out.println("C is min");
			}
		}
		
		else if(b>a&&b>c)
		{
			System.out.println("B is max");
			{
				if(a<c)
					System.out.println("A is min");
				else
					System.out.println("C is min");
			}
		}
		
		else
		{
			System.out.println("C is max");
			{
				if(b<a)
					System.out.println("B is min");
				else
					System.out.println("A is min");
			}
		}

	}

}
