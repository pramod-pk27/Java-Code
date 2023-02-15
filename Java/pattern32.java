class Test
{
	public static void main(String args[])
	{
		int i,j,k;
		for(i=1;i<=5;i++)  //outer loop
		{
			for(j=4;j>=i;j--)  //space loop
			{
				System.out.print(" ");  //white spce
			}
			for(k=1;k<=i;k++)  //print loop
			{
				System.out.print(i+" ");  //print
				
			}
			System.out.println();
		}
	}
}