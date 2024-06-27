package String;

public class ContainsMethod {
	

	public static void main(String[] args) {
		String s="ankljowoabcjswiousjsabcdisj";
		String s2="abcd";
		boolean result=MyContainsMethod(s,s2);
		System.out.println(result);
	}
		static boolean MyContainsMethod(String s,String s2){
		for(int i=0;i<s.length();i++)
		{   
			
			if(s.charAt(i)==s2.charAt(0))
			{
			int j=i;
			int k=0;
			int count=0;
			
			 while(j<i+s2.length() && k<s2.length())
			   {
				if(s.charAt(j)==s2.charAt(k))
					    count++;
				        k++;
				        j++;
			    }
			if(count==s2.length())
				return true;
		
			}
		
		}
		return false;
	 
	}
		
		

}


