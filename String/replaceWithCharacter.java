package String;

public class replaceWithCharacter {

	public static void main(String[] args) {
		String s="Pranita";
		char oldChar='a';
		char newChar='@';
		String s2="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==oldChar)
			
				s2=s2+newChar;
			
			else
				s2=s2+s.charAt(i);
		}
		System.out.println(s2);

	}

}
