
class Overloadingcons
{  
    int id;  
    String name;  
    int age;  
   
    Overloadingcons(int i,String n)  //creating two arg constructor  
    {  
    	id = i;  
    	name = n;  
    }  

    Overloadingcons(int i,String n,int a)    //creating three arg constructor  
    {  
    	id = i;  
    	name = n;  
    	age=a;  
    }  
    
    void display()
    {
    	System.out.println(id+" "+name+" "+age);
    }  
   
    public static void main(String args[])
    {  
    	Overloadingcons s1 = new Overloadingcons(111,"Arya",15);  
    	Overloadingcons s2 = new Overloadingcons(222,"Ravi",25);  
    	s1.display();  
    	s2.display();  
    }  
} 
