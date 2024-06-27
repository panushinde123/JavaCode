package String;

public class containsDigitorNot {

	public static void main(String[] args) {
		String s="abc123";
		int cnt=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
				cnt++;
		}
		if(cnt==s.length())
			System.out.println("String contains only digits");
		else
			System.out.println("String contains characters and digits");

	}

}
