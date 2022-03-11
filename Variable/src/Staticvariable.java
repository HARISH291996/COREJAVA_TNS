import java.io.*;

public class Staticvariable
{

   private static double fees;    //salary  variable is a private static variable
   
   public static final String DEPARTMENT = "Development ";   // DEPARTMENT is a constant

   public static void main(String args[]) 
   {
      fees = 15000;
      System.out.println(DEPARTMENT + "average salary:" + fees);
   }
}