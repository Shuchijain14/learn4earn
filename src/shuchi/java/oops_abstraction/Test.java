package oops_abstraction;

public class Test extends Student
{
	public static void main(String[] args)
	{
		Test test = new Test();
		test.studentElection();
		test.studentExam();
		test.studentLibrary();
		test.name = "Shuchi";
		
		Student stud = new Test();
		stud.name = "Rahul";
	}
	
	@Override
	public void studentElection()
	{
		System.out.println("This is the Student Election method which has been overridden from the abstract class ");
		
	}

	@Override
	public void studentExam()
	{
		System.out.println("This is the Student Exam method which has been overridden from the abstract class ");

	}
	

}
