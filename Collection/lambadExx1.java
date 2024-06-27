package Collection;

public class lambadExx1 {

	public static void main(String[] args) {
		
		lambdaEx1 obj=(a,b)->
		{
			int result=a+b;
			System.out.println("addition is : "+result);
		};
		obj.add(10, 20);
	}

}
