
public class ThreadDemo3 implements Runnable
{
	public static void main(String args[])
	{
		Thread t=new Thread(new ThreadDemo3());
		t.start();
		System.out.println(t.getName());
	}

	public void run() 
	{
		// TODO Auto-generated method stub
		System.out.println("Harish");
	}
}
