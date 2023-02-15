class Test
{
	public static void main(String args[])
	{
		int a = 2000;
		
		if(a% 400 == 0)
		{
			System.out.println("Leaf year");
		}

		else if (a% 100 == 0)
		{
			System.out.println("None Leaf year");
		}
		
		else if(a% 4 == 0)
		{
			System.out.println("Leaf year");
		}
		
		else
		{
			System.out.println("None Leaf year");
		}
		
	}

}