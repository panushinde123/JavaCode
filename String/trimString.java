
package String;

public class trimString {

	public static void main(String[] args) {
		String s="      hiuywik xwihoh nxoiwho   ";
		String ss="";
		int i=0;
		int j=s.length()-1;
	
		while(s.charAt(i)==' ' || s.charAt(j)==' ')
		{
			i++;
			j--;
		}
		for(int k=i;k<=j;k++)
		{

			ss=ss+s.charAt(k);
		}
		System.out.println(ss);

	}

}
