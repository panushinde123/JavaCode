//000111222333444555666777888999
//000111222333444555666777888999
//000111222333444555666777888999
//000111222333444555666777888999
//000111222333444555666777888999
//000111222333444555666777888999
//000111222333444555666777888999

package NumberPattern;
public class numberPattern14 {
	public static void main(String[] args) {
		
    for(int i=1;i<=7;i++)
   {
	   int start=0;
	   for(int j=1;j<=10;j++)
	   {
		   System.out.print(start+""+start+""+start);
		 if(j<=9)
			 start++;
	  }
	   System.out.println();
   }
	
	}

}
