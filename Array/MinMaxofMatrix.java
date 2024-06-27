package Array;

public class MinMaxofMatrix {

	public static void main(String[] args) {
	int[][]a= {
			{10,20,90},{60,80,70},{30,70,50}
	};
	
	int max=a[0][0];
	int min=a[0][0];
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			if(a[i][j]>max)
			{
				max=a[i][j];
			}
		}
	}
	System.out.println("Maximum= "+max);
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			if(a[i][j]<min)
			{
				min=a[i][j];
			}
		}
	}
	System.out.println("Minimum= "+min);

	}

}
