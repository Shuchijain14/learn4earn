package oops_encapsulation;

public class Student
{
	private String student_name;   //data hiding
	private int student_id;	       //data hiding
	
	public void setData(String name, int id)
	{
		student_name = name;
		student_id = id;
		
	}
	
	public String getData()
	{
		return student_name;
	}
	public int getData1()
	{
		return student_id;
		
	}
}
