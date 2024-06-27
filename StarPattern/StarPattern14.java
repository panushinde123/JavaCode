//* * * * * 
// * * * * 
//  * * * 
//   * * 
//    * 

package StarPattern;

public class StarPattern14 {

	public static void main(String[] args) {
		int spaceCnt=0;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j<=spaceCnt)
				
					     System.out.print(" ");
					else
						//{if(i+j)%2!=0
						//System.out.println(" ");
						//else
						//System.out.println("*");}
						System.out.print("* ");
				}
			System.out.println();
			spaceCnt++;
			}
		}

	}

