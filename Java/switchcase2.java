class Test
{
	public static void main(String args[])
	{
		char ch = 'A';
		switch(ch)
		{
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':System.out.println("Vowel");break;
			
			default:System.out.println("Consonant");
		}
	}
}