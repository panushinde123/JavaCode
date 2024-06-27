/*  5 
   4 5 
  3 4 5 
 2 3 4 5 
1 2 3 4 5 
*/
package NumberPattern;

public class numberPattern11 {

	public static void main(String[] args) {
		int spaceCnt=4;
		int cnt1=5;
		
	 for(int i=1;i<=5;i++)
	 {    		
		 int cnt2=cnt1;
		 for(int j=1;j<=5;j++)
		 {
			 if(j<=spaceCnt)
				 System.out.print(" ");
			 else
			 {
				 System.out.print(cnt2+" ");
			 cnt2++;
			 }
		 }
		 System.out.println();
		 spaceCnt--;
		 cnt1--;
	 }

	}

}
