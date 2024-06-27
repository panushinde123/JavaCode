package String;

public class sortingString {

	public static void main(String[] args) {
		String s="You al r verry good students.";
		String[] sa=s.split(" ");
		
  for(int i=0;i<sa.length;i++)
  {
	  for(int j=i+1;j<sa.length;j++)
	  {
		  if(sa[i].length()>sa[j].length())  //ascending.. < for descending
		  {
			  String temp=sa[i];
		  sa[i]=sa[j];
		  sa[j]=temp;
		  }
	  }
  }
   for(int i=0;i<sa.length;i++)
   {
	   System.out.print(sa[i]+" ");
   }
	}
}

