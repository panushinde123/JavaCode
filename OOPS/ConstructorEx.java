package OOPS;
//without super default constructor automatically called the parent class zero argument constructor
//we can also inherit static method of parent class through child class object
class A{
	int x=10;
	int y=20;
	A()
	{
		System.out.println("X- Zero parameter constructor");
	}
	static void display() {
		System.out.println("Hello World");
	}
	
}
class B extends A
{
	int z=80;
	B()
	{ 
		System.out.println("Y- Zero parameter constructor");
	}	
}
public class ConstructorEx {

	public static void main(String[] args) {
		
		B b=new B();
		B.display();	
		System.out.println(b.x);
		System.out.println(b.y);
		System.out.println(b.z);
	}

}
