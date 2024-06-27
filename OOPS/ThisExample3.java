package OOPS;
class Test3{
	int x;
	Test3(){
		System.out.println(x);
	}
	Test3(int x)
	{
		this.x=x;
		System.out.println(x);
	}
	Test3(int x,int m)
	{
		this.x=x;
		System.out.println(x+" "+m);
	}
}
public class ThisExample3 {

	public static void main(String[] args) {
		Test3 t=new Test3();
		Test3 t1=new Test3(20);
		Test3 t2=new Test3(20,40);
		
		
	}

}
