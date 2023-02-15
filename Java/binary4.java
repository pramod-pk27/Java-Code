class Binary4
{
	public static void main(String args[])
	{
		int a = 10, b = 20;

		System.out.println("Before swap a="+a+"and b="+b);

		a = a + b;
		a = b - a;
		b = b - a;

		System.out.println("After swap a="+a+"and b="+b);
	}
}