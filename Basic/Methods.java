package Basic;

public class Methods {

	public void displaymsg()
	{
		System.out.println("I am the non-static method");
	}
	
	public static void showmsg()
	{
		System.out.println("I am the static method");
	}
	
	public static void main(String[] args)
	{
		
		 Methods m1=new Methods();
		 
		 System.out.println("Hi");
		 m1.displaymsg();
		 showmsg();
		 System.out.println("Bye");
		
		

	}

}
