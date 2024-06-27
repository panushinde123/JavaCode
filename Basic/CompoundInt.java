package Basic;

public class CompoundInt {
	 public static void main(String[] args){
	  int p=20000;
	  double r=0.10;
	  int t=5;
	  int n=2;
	  
	  double fpart=1+r/n;
	  int spart=n*t;
	  
	  double A=p*Math.pow(fpart,spart);
	  System.out.println(A);
	  
	  }

}

