package Basic;

public class methodType {

	void sum()
	{
		int num1=8;
		int num2=2;
		int res=num1+num2;
		System.out.println("Addition is :");
		System.out.println(res);
	}
	void minus()
	{
		int num1=8;
		int num2=2;
		int res=num1-num2;
		System.out.println("Substraction is :");
		System.out.println(res);
	}
	void display()
	{
		System.out.println("Hello World..\n");
	}
	public static void main(String[] args) {
		
		methodType m=new methodType();
		m.display();
		m.sum();
		m.minus();
	}

}
