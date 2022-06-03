package oops_polymorphism;

public class CT_StaticPoly {

	public static void main(String[] args)
	{
		CT_StaticPoly obj = new CT_StaticPoly();
		obj.show();
		obj.show(1);
		obj.show(2);
		obj.show(3);
		obj.show("Automation");
		obj.show("Automation", "Selenium");
		obj.show("Automation", "Selenium", "Python");
		obj.show(new StringBuffer("C++"));
		obj.show(new StringBuilder("JAVA"));
		obj.show(obj);

	}
	public void show()
	{
		System.out.println("This is a simple method with no parameters");
	}
	
	public void show(int i)
	{
		System.out.println("This is a method with one int type parameter");
	}
	public void show(int i, int j)
	{
		System.out.println("This is a method with two int type parameter");

	}
	public void show(int i, int j, int k)
	{
		System.out.println("This is a method with three int type parameter");
	}
	public void show(String S)
	{
		System.out.println("This is a method with one String type parameter");
	}
	public void show(String S, String S1)
	{
		System.out.println("This is a method with two String type parameter");
	}
	public void show(String S, String S1, String S2)
	{
		System.out.println("This is a method with three String type parameter");
	}
	public void show(StringBuffer S3)
	{
		System.out.println("This is a StringBuffer Method");
	}
	public void show(StringBuilder S4)
	{
		System.out.println("This is a StringBuilder Method");
	}
	public Object show(Object obj)
	{
		System.out.println("This is Object Class");
		return null;
	}
}
