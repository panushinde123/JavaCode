//A
//ABA
//ABCBA
//ABCDCBA
//ABCDEDCBA

package AlphabetPattern;
public class pattern5 {

	public static void main(String[] args) {
		int end=1;
		for(int i=1;i<=5;i++)
		{
			int cnt=1;
			for(int j=1;j<=end;j++)
			{
				System.out.print((char)(cnt+64));
				if(j<i)
					cnt++;
				else
					cnt--;
			}
			System.out.println();
			end=end+2;
		}

	}

}
