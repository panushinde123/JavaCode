package String;

public class repeatCharacter {

	public static void main(String[] args) {
		String s="Pranita";
		String v="";
		
		for(int i=0;i<s.length();i++)
		{
		 v=v+s.charAt(i)+s.charAt(i);
			
		}
		System.out.println(v);

	}

}
