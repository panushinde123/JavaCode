
//*        *
//**      **
//***    ***
//****  ****
//**********
//****  ****
//***    ***
//**      **
//*        *
package StarPattern;

public class StarPattern22 {

	public static void main(String[] args) {
		int firstendpoint=1;
		int secondstartpoint=10;
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=10;j++)
			{
				if(j<=firstendpoint || j>=secondstartpoint)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			if(i<5)
			{
				firstendpoint++;
				secondstartpoint--;
			}
			else
			{
				firstendpoint--;
				secondstartpoint++;
			}
			
		}
	}

}
