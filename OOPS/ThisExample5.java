package OOPS;
class thismethod
{
	void displayNum(int x)
	{
		System.out.println(x);
	}
	void displayNum(int x,int y)
	{
		this.displayNum(x);
		System.out.println(x+" "+y);
	}
	void displayNum(int x,int y,int z)
	{
		this.displayNum(x,y);
		System.out.println(x+" "+y+" "+z);
	}
	
}
public class ThisExample5 {
	
	public static void main(String[] args) {
		
  thismethod t=new thismethod();
  t.displayNum(10, 20, 30);
	}

}
