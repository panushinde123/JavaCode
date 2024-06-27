package AccessSpecfier;

public class defaultSpecifier1 {

	public static void main(String[] args) {
		defaultSpecifier t=new defaultSpecifier();
		System.out.println("Instance Variable: "+t.x);
		System.out.println("Static Variable: "+defaultSpecifier.y);
		t.show();
		defaultSpecifier.display();

	}

}
