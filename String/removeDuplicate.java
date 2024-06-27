package String;

public class removeDuplicate {

	public static void main(String[] args) {
		String s="abbbacdhhhdccceee";
		String s2="";
		for(int i=0;i<s.length();i++)
		{
			int cnt=0;

		//for(int j=i+1;j<s.length();j++) 
			for(int j=i-1;j>=0;j--)
			{
				if(s.charAt(i)==s.charAt(j))
					cnt++;
			}
			if(cnt==0)
				s2=s2+s.charAt(i);
		}
		System.out.println(s2);
	}

}
