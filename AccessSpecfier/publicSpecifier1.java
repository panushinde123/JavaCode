package AccessSpecfier;
//Default--same class,same package different class
//public--same class,same package different class
//Public -- is accessible into different packages
//default-- is not accessible in other packages. 
//private-- Accessible in same class only.not accessible in same package different class.
//protected--accessible in same class,different class of same package and different package through its child class
public class publicSpecifier1 {

	public static void main(String[] args) {
		
		publicSpecifier t=new publicSpecifier();
		System.out.println("Instance Variable: "+t.x);
		System.out.println("Static Variable: "+publicSpecifier.y);
		t.show();
		publicSpecifier.display();

	}

}
