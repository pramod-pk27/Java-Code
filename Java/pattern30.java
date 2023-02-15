class Test
{
	public static void main(String args[])
	{
		char i,j,k;
		for(i='A';i<='E';i++)  //outer loop
		{
			for(j='D';j>=i;j--)  //space loop
			{
				System.out.print(" ");  //white spce
			}
			for(k='A';k<=i;k++)  //print loop
			{
				System.out.print(i);  //print 
			}
			System.out.println();
		}
	}
}