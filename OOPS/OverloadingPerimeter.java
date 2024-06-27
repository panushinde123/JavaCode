package OOPS;

public class OverloadingPerimeter {
	void perimeter(int s1) 
	{    
	    System.out.println("Perimeter of Square= "+4*s1);
	}
	void primeter(int l,int b)
	{
		System.out.println("Perimeter of Rectangle= "+2*(l+b));
	}
    void perimeter(int side1,int side2,int side3)
    {
    	System.out.println("Perimeter of Triangle= "+(side1+side2+side3));
    }
	public static void main(String[] args) {
		OverloadingPerimeter p=new OverloadingPerimeter();
		p.perimeter(5);
		p.primeter(5, 5);
		p.perimeter(5, 5, 5);
		
	}

}
