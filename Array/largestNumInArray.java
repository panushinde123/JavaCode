package Array;

public class largestNumInArray {

	public static void main(String[] args) {
		int[] a= {10,20,40,30,50};
 int max=a[0];
 
 for(int i=1;i<a.length;i++)
 {
	 if(a[i]>max)
	 {
		 max=a[i];
	 }
 }
 System.out.println("Largest number is: "+max);
	}

}
