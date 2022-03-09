public class geometryshape {

    void calculateArea(float x)
    {
        System.out.println("Area of the square: "+x*x+" sq units");
    }
    
    void calculateArea(float x, float y)
    {
        System.out.println("Area of the rectangle: "+x*y+" sq units");
    }
    
    void calculateArea(double r)
    {
        double area = 3.14*r*r;
        System.out.println("Area of the circle: "+area+" sq units");
    }
    
    public static void main(String args[]){
     geometryshape obj = new geometryshape(); // This will call 1st, we are passing only 1 argument
       
	 obj.calculateArea(6.1f); // This will call 2nd, we are passing 2 arguments 
	   
	 obj.calculateArea(10,22);  // This will call 2nd method
	   
	 obj.calculateArea(6.1);
    }
}

