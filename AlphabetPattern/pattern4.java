//A 
//B G 
//C H M 
//D I N S 
//E J O T Y 
//F K P U Z _ 

package AlphabetPattern;
public class pattern4 {

	public static void main(String[] args) {
		int end=1;
		int cnt1=1;
		for(int i=1;i<=6;i++)
		{   int cnt2=cnt1;
			for(int j=1;j<=end;j++)
			{
				System.out.print((char)(cnt2+64)+" ");
				cnt2=cnt2+5;
			}
			System.out.println();
			cnt1++;
			end++;
		}

	}

}
