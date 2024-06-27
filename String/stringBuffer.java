package String;

public class stringBuffer {

	public static void main(String[] args) {
StringBuffer s=new StringBuffer();
System.out.println(s.capacity()); //16

System.out.println(s.append("java is object oriented language"));
System.out.println(s.capacity());   //(oldcapacity*2)+2=34

System.out.println(s.append("java is object oriented language java is object"));
System.out.println(s.capacity());  //(oldcapacity*2)+2=79

System.out.println(s.delete(0, 40));
System.out.println(s.reverse());
StringBuffer s1=new StringBuffer("Hello");
StringBuffer s2=new StringBuffer("Hello");
System.out.println(s1.equals(s2));
System.out.println(s1.compareTo(s2));
	}

}
