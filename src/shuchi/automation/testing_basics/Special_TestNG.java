package testing_basics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Special_TestNG 
{
	@BeforeMethod
	public void init()
	{
		System.out.println(" This is the before method annotation");
	}
	
	@Test
	public void test1()
	{
		System.out.println(" This is the First Test Case");
	}
	
	@Test
	public void test2()
	{
		System.out.println(" This is the Second Test Case");
	}
	
	@Test
	public void test3()
	{
		System.out.println(" This is the Third Test Case");
	}

	@AfterMethod
	public void end()
	{
		System.out.println(" This is the after method annotation");
	}
		
	

}
