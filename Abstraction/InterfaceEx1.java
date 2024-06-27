package Abstraction;
interface I1
{
	void m1();
	void m2();
}
public class InterfaceEx1 implements I1 {
	@Override
	public void m1() {
		System.out.println("Method m1()..");
		
	}
	@Override
	public void m2() {
		System.out.println("Method m2()..");
		
	}
	public static void main()
	{ 
		InterfaceEx1 i=new InterfaceEx1();
		i.m1();
		i.m2();
	}

}
