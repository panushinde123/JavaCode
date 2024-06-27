package String;

public class RepeatEveryCharacter {

	public static void main(String[] args) {
		String str="hefshine";
		String newStr="";
		
//		for(int i=0;i<str.length();i++)
//		{
//			newStr=newStr+str.substring(i, i+1)+str.substring(i, i+1);
//		}
//		System.out.println(newStr);
		
		for(int i=0;i<str.length();i++)
		{
			newStr=str.substring(i, i+1)+str.substring(i, i+1);
		          System.out.print(newStr);
		}
		

	}

}
