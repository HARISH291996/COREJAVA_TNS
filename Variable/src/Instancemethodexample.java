
public class Instancemethodexample  
{  
	public static void main(String [] args)  
	{  

		Instancemethodexample obj = new Instancemethodexample();  //creating object

		System.out.println("The sum is: "+obj.add(50, 45));  // instance method
	}  
	int s;  
	public int add(int a, int b)  
	{  
		s = a+b;  
		return s;  
	}  
}  