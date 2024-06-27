package OOPS;

class T
{
	int i=1000;
}
class M extends T{
	int i=12;
	void m1()
	{
		int i=34;
		System.out.println(super.i);
	}
}
public class ThisExample8 {

	public static void main(String[] args) {
		M m=new M();
		m.m1();

	}

}
