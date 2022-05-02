class ExceptionDemo1 
{
	public static void main(String args[])
	{
		int a[]=new int[10];
		try
		{
			a[10]=10;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
	}
}
