package Basic;
public class miniNum {

	public static void main(String[] args) {
		int num1=20;
		int num2=30;
		int num3=15;
		
		if(num1<num2 && num1<num3)
		{
			System.out.println("Num1 is Minimum");
		}
		else if(num2<num1 && num2<num3)
		{
			System.out.println("Num2 is Minimum");
		}
		else
		{
			System.out.println("Num3 is Minimum");
		}

	}

}