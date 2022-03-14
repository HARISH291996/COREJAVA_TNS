


class defaultcons
{  
	int id;  
	String name;  

	void display()
	{
		System.out.println(id+" "+name);
	}  
  
	public static void main(String args[])
	{  
		defaultcons s1=new defaultcons();  //creating objects
		defaultcons s2=new defaultcons();  

		s1.display();  // for displaying
		s2.display();  
	}  
} 
