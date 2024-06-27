package String;

public class compareToMethod {

	public static void main(String[] args) {
		String s1="abcde";
		String s2="abcde";
		//int result=s1.compareTo(s2);
		//System.out.println(result);
		
		int result1=MycompareTo(s1,s2);
		System.out.println(result1);
				
	}
 static int MycompareTo(String s1,String s2)
{
	//s1=s1.toLowerCase();       //ignoreCase scenario
	//s2=s2.toLowerCase();
	 
 int min=Math.min(s1.length(),s2.length());

	for(int i=0;i<min;i++)
		if(s1.charAt(i)!=s2.charAt(i))
		
		

		return s1.charAt(i)-s2.charAt(i);
		

	return s1.length()-s2.length();

	
	
}
}
