package Abstraction;

public class AbstractClass1 extends AbstractClass {
@Override
void show() {
	System.out.println("Hello child class");
	
}
@Override
	void m1() {
	System.out.println("redefining");
	}

	public static void main(String[] args) {
		AbstractClass1 demo=new AbstractClass1();
		demo.show();
		demo.m1();

	}

}