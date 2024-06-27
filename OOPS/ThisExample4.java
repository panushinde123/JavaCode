package OOPS;
class Test4
{
	int x;
	Test4()
	{
		System.out.println(x);
	}
	Test4(int x)
	{
		this();
		this.x=x;
		System.out.println(x);
	}
	Test4(int x,int m)
	{
		this(x);
		this.x=x;
		System.out.println(x+" "+m);
	}
}
public class ThisExample4 {

	public static void main(String[] args) {
		Test4 t=new Test4(20,30);

	}

}
