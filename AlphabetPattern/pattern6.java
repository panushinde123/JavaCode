//        A 
//      A B C 
//    A B C D E 
//  A B C D E F G 
//A B C D E F G H I 
//  A B C D E F G 
//    A B C D E 
//      A B C 
//        A 

package AlphabetPattern;

public class pattern6 {

	public static void main(String[] args) {
		int spaceCnt=8;
		
	for(int i=1;i<=9;i++)
		{
		int cnt=1;
	       int cnt2=cnt;
		for(int j=1;j<=9;j++)
		{
			if(j<=spaceCnt)
				System.out.print(" ");
			else
			{
				System.out.print((char)(cnt2+64)+" ");
				cnt2++;
			}
		
		}
		System.out.println();
		if(i<5)
			spaceCnt=spaceCnt-2;
		else
			spaceCnt=spaceCnt+2;

	    }

	}

}
