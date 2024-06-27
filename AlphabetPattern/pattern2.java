//    A
//   BA
//  CBA
// DCBA
//EDCBA
// DCBA
//  CBA
//   BA
//    A
package AlphabetPattern;
public class pattern2 {
	public static void main(String[] args) {
	  int spaceCnt=4;
	  int cnt1=1;
	  for(int i=1;i<=9;i++)
	  {  int cnt2=cnt1;
		  for(int j=1;j<=5;j++)
		  {
			  if(j<=spaceCnt)
				  System.out.print(" ");
			  else
			  {
				  System.out.print((char)(cnt2+64));
				  cnt2--;
			  }
		  }
		  System.out.println();
		  if(i<5)
		  {
			  spaceCnt--;
			  cnt1++;
		  }
		  else
		  {
			  spaceCnt++;
			  cnt1--;
		  }
	  }

	}

}
