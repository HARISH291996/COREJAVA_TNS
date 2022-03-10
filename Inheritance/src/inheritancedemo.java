
class x{
	String name = "Harish";
}

public class inheritancedemo extends x {
	String Lname = "A";

	public static void main(String[] args) {
		inheritancedemo id = new inheritancedemo();
		System.out.println("Student name is:" +id.name + id.Lname);
	}

}