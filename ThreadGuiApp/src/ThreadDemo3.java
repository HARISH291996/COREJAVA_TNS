public class ThreadDemo3 implements Runnable
{
	public static void main (String[] args)
	{
		Thread t = new Thread(new ThreadDemo3(), "Thread 3");
		t.start();
		System.out.println(t.getName());
	}
	public void run()
	{
		System.out.println("My Thread");
	}

}