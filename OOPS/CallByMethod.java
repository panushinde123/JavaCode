package OOPS;
class Test2{
	void displayNum(int x)
	{
		System.out.println(x);
	}
	void displayNum(int x,int y)
	{
		displayNum(x);
		System.out.println(x+" "+y);
	}
	void displayNum(int x,int y,int z)
	{
		displayNum(x,y);
		System.out.println(x+" "+y+" "+z);
	}
}
public class CallByMethod {

	public static void main(String[] args) {
		Test2 t=new Test2();
		t.displayNum(2, 4, 6);

	}

}
