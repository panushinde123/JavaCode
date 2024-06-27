package OOPS;

//this keyword is referred to the instance variable

class Test{
	int x=56;
	String name="Rahul";
	
	void method(int x)
	{
		String name="Pankaj";
		System.out.println(this.x+" "+x);
		System.out.println(this.name+" "+name);
	}
	
}
public class ThisKeyword {

	public static void main(String[] args) {
	Test t=new Test();
	t.method(7);

	}

}
