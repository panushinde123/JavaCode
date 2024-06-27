package OOPS;
//here we have to used super keyword if we want to called the parameterized constructor of parent class
class C{
	int x;
	C(int var)
	{
		x=var;
		System.out.println("Hello "+ x);
		System.out.println("X- one parameter constructor");
	}
}
class D extends C
{
	D(int var){
		super(var);
		System.out.println("Y-one parameter constructor");
	}
}

public class SuperExample1 {

	public static void main(String[] args) {
	
		D d=new D(5);
		

	}

}
