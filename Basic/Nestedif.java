package Basic;

public class Nestedif {

	public static void main(String[] args) {
		int x=150; int y=50; int z=890;
		
		if(x>y)
		{
			if(x>z)
			{
				System.out.println("x is greater than y and z");
			}
		}
		if(y>x)
		{
			if(y>z)
			{
				System.out.println("y is greater than x and z");
			}
		}
		if(z>x)
		{
			if(z>y)
			{
				System.out.println("z is greater than x and y");
			}
		}

	}

}
