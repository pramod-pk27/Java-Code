class Test
{
	public static void main(String args[])
	{
		int n = 153, r;
		
		while( n!=0 )
		{
			r = n % 10;
			System.out.print(r);
			n = n / 10;
		}
	}
}