package OOPS;
abstract class Area
{
	abstract void calculateArea();
}
class Rectangle extends Area
{
	@Override
	void calculateArea() {
		int l=5;
		int b=5;
		System.out.println("Area of Rectangle= "+l*b);
	}
}
class Square extends Area
{
	void calculateArea() {
		int side=5;
		System.out.println("Area of Square= "+side*side);
	};
}
class Circle extends Area
{
	void calculateArea() {
		double r=5;
		System.out.println("Area of Circle= "+r*3.14*r);
	};
}
public class Mymain {

	public static void main(String[] args) {
		Rectangle r1=new Rectangle();
		Square s=new Square();
		Circle c=new Circle();
		r1.calculateArea();
		s.calculateArea();
		c.calculateArea();

	}

}
