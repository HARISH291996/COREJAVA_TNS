
class parameterisedcons
{  
    int id;  
    String name;  
    
    parameterisedcons(int i,String n) //creating parameterized constructor  
    {  
    id = i;  
    name = n;  
    }  

    void display()
    {
    	System.out.println(id+" "+name);
    }  
   
    public static void main(String args[])
    {  
    
    	parameterisedcons s1 = new parameterisedcons(111,"Arya");  //creating objects and passing values  
    	parameterisedcons s2 = new parameterisedcons(222,"Ravi");  //creating objects and passing values  
    
    	s1.display();  //call method to display val of object  
    	s2.display();  
   }  
}  
