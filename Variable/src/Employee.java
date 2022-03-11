public class Employee {

   public String name; //this is accessed for any child class
  
   private double salary; // this variable access only in Employee Class

   public Employee (String empName) 
   {
      name = empName; //name is assigned in constructor
   }

   public void setSalary(double empSal) 
   {
      salary = empSal; // salary is assigned to value
   }

   public void printEmp() {    // it prints the employee details.

      System.out.println("Name   : "+name );
      System.out.println("Salary :" +salary);
   }

   public static void main(String args[]) {
      Employee empOne = new Employee("Employee Name ****** ");
      empOne.setSalary(15000);
      empOne.printEmp();
   }
}
