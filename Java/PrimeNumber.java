class Test
{
	public static void main(String args[])
	{
		int n = 7, i;
		boolean f = false;
		for(i = 2; i <= (n/2); i++)
		{
			if( n % i == 0)
			{
				f = true;
				break;
			}
		}
		if(f)
		{
			System.out.println("Non prime");
		}
		else
		{
			System.out.println("prime");
		}
	}
}