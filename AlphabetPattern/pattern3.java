//FEDCBA
//FEDCB
//FEDC
//FED
//FE
//F

package AlphabetPattern;
public class pattern3 {

	public static void main(String[] args) {
	int end=6;
	for(int i=1;i<=6;i++)
	{  int cnt=6;
		for(int j=1;j<=end;j++)
		{
			System.out.print((char)(cnt+64));
			cnt--;
		}
		System.out.println();
		end--;
	}
	}

}
