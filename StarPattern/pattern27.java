package StarPattern;

public class pattern27 {

	public static void main(String[] args) {
		int end=4;
		int cnt=1;
		int space=3;
		for(int i=1;i<=3;i++)
		{ 
			for(int j=1;j<=end;j++)
			{   	
				if(j<=space)
					System.out.print(" ");
				else if(j<=space && j==cnt)
					System.out.println(cnt);
				else
					System.out.print("*");
			}
			System.out.println();
			space--;
			cnt++;
			end++;;
		}
	}


}