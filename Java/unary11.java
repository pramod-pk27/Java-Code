class Unary11
{
	public static void main(String args[])
	{
	
		int a=10,b;
		
		b = ++a + a++ + ++a + a++ + ++a;

		System.out.println(a+" "+b);
	}
}