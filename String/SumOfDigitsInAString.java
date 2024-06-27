//program to return sum of the digits in a string.if there is no any digits then print sum as 0.

package String;

public class SumOfDigitsInAString {

	public static void main(String[] args) {
		String s="abc12";
	char[] c=s.toCharArray();
	int sum=0;
	int cnt=0;
for(int i=0;i<c.length;i++)
{
	if(Character.isDigit(c[i]))
	{   
		cnt++;
		int value=Character.getNumericValue(c[i]);
		sum=sum+value;
	}
}
if(cnt==0)
	System.out.println("Does not have digits");
else
    System.out.println(sum);
	


	}

}
