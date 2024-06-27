package Abstraction;

interface InterfaceDemo{
	void m1();
	default void m2()
	{
		System.out.println("Default Method()..");
	}
	static void m3()
	{
		System.out.println("Static Method()..");
	}
}
class AAA implements InterfaceDemo
{
	@Override
	public void m1() {
		System.out.println("Class A--in m1() method..");
	}
	@Override
	public void m2() {
		System.out.println("Class A--in m2() method..");
	}
}
class BBB implements InterfaceDemo
{
	@Override
	public void m1() {
		System.out.println("Class B--in m1() method");
	}	
}
public class DefaultMethods {
	public static void main(String[] args) {
   AAA a=new AAA();
   a.m1();
   BBB b=new BBB();
   b.m1();
   b.m2();
   InterfaceDemo.m3();
	}

}
