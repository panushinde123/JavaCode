//    1 
//   2 2 
//  3 3 3 
// 4 4 4 4 
//5 5 5 5 5 

package NumberPattern;
public class numberPattern12 {

	public static void main(String[] args) {
	int spaceCnt=4;
	int cnt=1;
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			if(j<=spaceCnt)
				System.out.print(" ");
			else
				System.out.print(cnt+" ");
			
		}System.out.println();
		spaceCnt--;
		cnt++;
	}

	}

}
