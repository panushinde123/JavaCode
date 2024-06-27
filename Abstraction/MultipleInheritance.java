package Abstraction;

interface II1
{
	void m1();
}
interface I2
{
	void m2();
}
interface I3 extends II1,I2
{
	void m3();
}
class Test1 implements I3
{
	@Override
	public void m1() {
	System.out.println("Method 1");
	}
	@Override
	public void m2() {
	System.out.println("Method 2");	
	}
	@Override
	public void m3() {
	System.out.println("Method 3");
	}	
}
public class MultipleInheritance {
	public static void main(String[] args) {
	Test1 t =new Test1();
	t.m1();
	t.m2();
	t.m3();
	}

}
