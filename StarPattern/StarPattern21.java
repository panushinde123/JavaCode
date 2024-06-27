//**********
//****  ****
//***    ***
//**      **
//*        *
//**      **
//***    ***
//****  ****
//**********

package StarPattern;

public class StarPattern21 {

	public static void main(String[] args) {
		int firstTriangleEndpoint=5;
		int secondTriangleStartpoint=6;
		
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=10;j++)
			{
				
			if(j<=firstTriangleEndpoint || j>=secondTriangleStartpoint)
				System.out.print("*");
			else
				System.out.print(" ");
			
			}
			System.out.println();
			if(i<5)
			{
				firstTriangleEndpoint--;
				secondTriangleStartpoint++;
			}
			else
			{
				firstTriangleEndpoint++;
				secondTriangleStartpoint--;
			}
			
		}
	}

}
