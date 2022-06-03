package oops_polymorphism;

public class Automatic_Promotion {

	public static void main(String[] args) 
	{
		Automatic_Promotion ap = new Automatic_Promotion();
		ap.display(231);
		ap.display(10);
		ap.display("Hello");
		ap.display('a');  // sp Character is automatically converting to integer
	}
	
	public void display(int i)
	{
		System.out.println("This is the int data type single parameter method");
	}
	
	public void display(String S)
	{
		System.out.println("This is a String Data type single parameter method");
	}
	public void display(double d)
	{
		System.out.println("This is a double data type single parameter method");
	}
}