class Binary1
{
	public static void main(String args[])
	{
		int a = 10, b = 20, c;

		System.out.println("Before swap a="+a+"and b="+b);

		c = b;
		b = a;
		a = c;

		System.out.println("After swap a="+a+"and b="+b);
	}
}