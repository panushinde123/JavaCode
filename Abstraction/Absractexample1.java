package Abstraction;
abstract class demo{
	abstract void show();
	void m1()
	{
		System.out.println("m1 method..");
	}
}
public class Absractexample1 extends demo {
       @Override
        void show() {
	 System.out.println("Implementing show method..");
	
}
	
	public static void main(String[] args) {
		
    Absractexample1 demo1=new Absractexample1();
      demo1.m1();
     demo1.show();
	}

}
