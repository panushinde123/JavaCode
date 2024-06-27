package String;

public class comparingHashcode {

	public static void main(String[] args) {
		String s1=new String("hefshine");  
		String s2="hefshine"; 
		String s3=s1.intern();
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));
        
	}

}
