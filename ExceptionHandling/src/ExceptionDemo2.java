class ExceptionDemo2 
{
	public static void main(String args[])
	{
		int a=args.length;
		try
		{
			int b =5/a;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error");
		}
		finally
		{
			System.out.println("This is executed whether or not an exception occurs");
		}
		
	}
}
