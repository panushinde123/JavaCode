package StarPattern;

public class StarPattern10 {

	public static void main(String[] args) {
		int spaceCnt=0;
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j<=spaceCnt)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
			if(i<5)
				spaceCnt++;
			else 
				spaceCnt--;
		}

	}

}
