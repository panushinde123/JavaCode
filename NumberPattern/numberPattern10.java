/*1 2 3 4 5
  2 3 4 5
   3 4 5
    4 5
     5
    4 5
   3 4 5
  2 3 4 5
 1 2 3 4 5
*/
package NumberPattern;

public class numberPattern10 {

	public static void main(String[] args) {
	
 int spaceCnt=0;
 int end=5;
 int cnt1=1;
 for(int i=1;i<=9;i++)
 {     int cnt2=cnt1;
	 for(int j=1;j<=end;j++)
	 {
		 if(j<=spaceCnt)
		      System.out.print(" ");
		 else {
			 System.out.print(" "+cnt2);
		 cnt2++;}
	}
	 System.out.println();
	 if(i<5)
	 {
		 spaceCnt++;
		cnt1++;
	      }
	 else
	 {
		 spaceCnt--;
		 cnt1--;
		
	 }
 }

	}

}
