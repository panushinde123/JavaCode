package Basic;

public class Trianglecheck {

	public static void main(String[] args) {
		int x=5; int y=6;int z=6;
		
		
		if(x==y && y==z)
		{
		System.out.println("Traingle Is Equilateral");
		}
		else if(x==y||y==z||z==x)
		{
			System.out.println("Trianle is Isosceles");
		}
		else
		{
			System.out.println("Scalene Triangle");
		}

	}

}
