//A
//AB
//ABC
//ABCD
//ABCDE

package AlphabetPattern;
public class pattern1 {

	public static void main(String[] args) {
		int end=1;
			for(int i=1;i<=5;i++)
		{     	int cnt1=1;
			for(int j=1;j<=end;j++)
			{
				System.out.print((char)(cnt1+64));
				cnt1++;
			}
			System.out.println();
			end++;
		}
	}

}
